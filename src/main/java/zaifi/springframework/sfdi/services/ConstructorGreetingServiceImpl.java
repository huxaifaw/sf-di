package zaifi.springframework.sfdi.services;

public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Bye!!! - Constructor";
    }
}
