package itonics.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tbeauvais on 11/9/16.
 */
@Configuration
public class HelloConfiguration {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
