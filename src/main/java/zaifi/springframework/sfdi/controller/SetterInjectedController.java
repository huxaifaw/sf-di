package zaifi.springframework.sfdi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import zaifi.springframework.sfdi.services.GreetingService;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public SetterInjectedController() {
    }


    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreetings();
    }
}
