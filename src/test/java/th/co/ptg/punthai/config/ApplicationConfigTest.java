package th.co.ptg.punthai.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 19/4/2560.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ApplicationConfigTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    public void testLogger() throws Exception {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
    }

    @Test
    public void primaryDataSource() throws Exception {
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        Connection connection =  dataSource.getConnection();
        logger.info("URL :" + connection.getMetaData().getURL());
        List l = new ArrayList<>();
    }

}