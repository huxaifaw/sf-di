package zaifi.springframework.sfdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zaifi.springframework.sfdi.services.ConstructorGreetingServiceImpl;
import zaifi.springframework.sfdi.services.PropertyGreetingServiceImpl;
import zaifi.springframework.sfdi.services.SetterGreetingServiceImpl;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingServiceImpl constructorGreetingServiceImpl() {
        return new ConstructorGreetingServiceImpl();
    }

    @Bean
    PropertyGreetingServiceImpl propertyGreetingServiceImpl() {
         return new PropertyGreetingServiceImpl();
    }

    @Bean
    SetterGreetingServiceImpl setterGreetingServiceImpl() {
        return new SetterGreetingServiceImpl();
    }

}
