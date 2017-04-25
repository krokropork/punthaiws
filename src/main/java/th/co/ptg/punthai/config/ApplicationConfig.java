package th.co.ptg.punthai.config;


import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;


/**
 * Created by user on 18/4/2560.
 */

@Configuration
@EnableAsync
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan(basePackages = {"th.co.ptg.punthai"})
@EnableJpaRepositories(basePackages ={"th.co.ptg.punthai.repository"} )
@EntityScan(basePackages = "th.co.ptg.punthai.entities")
@EnableMBeanExport
@PropertySources(
        {
                @PropertySource("classpath:application.properties"),
        }
)
public class ApplicationConfig {


        @Bean
        @Primary
        @ConfigurationProperties(prefix = "app.datasource")
        public DataSourceProperties dataSourceProperties() {
                return new DataSourceProperties();
        }

        @Bean
        @Primary
        @ConfigurationProperties(prefix = "app.datasource")
        public DataSource dataSource()  throws UnsupportedEncodingException {
                return dataSourceProperties().initializeDataSourceBuilder().build();
        }

        @Bean
        public HttpMessageConverters customConverters() {
                Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
                GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
                messageConverters.add(gsonHttpMessageConverter);
                return new HttpMessageConverters(true, messageConverters);
        }


        @Bean
        public LocalSessionFactoryBean sessionFactory(DataSource ds) throws ClassNotFoundException, UnsupportedEncodingException {
                LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
                localSessionFactoryBean.setDataSource(dataSource());
                return localSessionFactoryBean;
        }

        @Bean
        public HibernateTransactionManager transactionManager(SessionFactory sf) {
                return new HibernateTransactionManager(sf);
        }




}
