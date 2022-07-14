package zaifi.springframework.sfdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hi!!! - EN";
    }
}
