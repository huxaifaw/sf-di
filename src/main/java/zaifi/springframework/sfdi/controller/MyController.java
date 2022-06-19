package zaifi.springframework.sfdi.controller;

import org.springframework.stereotype.Controller;
import zaifi.springframework.sfdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreetings(){
        System.out.println("Hello World!!!");
        return greetingService.sayGreetings();
    }
}
