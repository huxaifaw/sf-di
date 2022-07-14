package zaifi.springframework.sfdi.services;

public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Bye!!! - Primary Bean";
    }
}
