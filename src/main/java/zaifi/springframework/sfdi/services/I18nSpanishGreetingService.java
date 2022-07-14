package zaifi.springframework.sfdi.services;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Hola!!! - ES";
    }
}
