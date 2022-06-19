package zaifi.springframework.sfdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreetings() {
        return "Bye!!! - Property";
    }
}
