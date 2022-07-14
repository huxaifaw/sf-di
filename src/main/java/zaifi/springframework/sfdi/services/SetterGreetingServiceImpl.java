package zaifi.springframework.sfdi.services;

public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Bye!!! - Setter";
    }
}
