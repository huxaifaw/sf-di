package zaifi.springframework.sfdi.services;

import zaifi.springframework.sfdi.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return englishGreetingRepository.getGreeting();
    }
}
