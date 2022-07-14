package zaifi.springframework.sfdi.services;

public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Bye!!! - Property";
    }
}
