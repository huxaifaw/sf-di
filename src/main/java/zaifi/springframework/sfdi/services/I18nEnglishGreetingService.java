package zaifi.springframework.sfdi.services;

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hi!!! - EN";
    }
}
