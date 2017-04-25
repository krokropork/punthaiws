package th.co.ptg.punthai.standalone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import th.co.ptg.punthai.config.ApplicationConfig;

/**
 * Created by user on 18/4/2560.
 */

@Configuration
@Import(value = ApplicationConfig.class)
@EnableAutoConfiguration
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
