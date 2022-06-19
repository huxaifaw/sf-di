package zaifi.springframework.sfdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zaifi.springframework.sfdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public PropertyInjectedController() {
    }

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
