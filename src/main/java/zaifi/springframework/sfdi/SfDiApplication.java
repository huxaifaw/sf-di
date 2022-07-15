package zaifi.springframework.sfdi;

import com.springframework.pets.controller.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import zaifi.springframework.sfdi.config.FgConfigurations;
import zaifi.springframework.sfdi.controller.*;
import zaifi.springframework.sfdi.datasource.FakeDataSource;
import zaifi.springframework.sfdi.services.PrototypeBean;
import zaifi.springframework.sfdi.services.SingletonBean;

import java.util.Optional;

@ComponentScan(basePackages = {"zaifi.springframework.sfdi", "com.springframework.pets"})
@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		String greetings = myController.sayGreetings();
		System.out.println(greetings);

		System.out.println("---Property---");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---Setter---");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---Constructor---");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		Optional<String> optionalString = Optional.empty();
		System.out.println(optionalString.isPresent());

		System.out.println("---Bean Scope---");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("---Fake Data Source---");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUsername() + "\n" + fakeDataSource.getPasswd() + "\n" + fakeDataSource.getJdbcUrl());

		System.out.println("---Properties Binding---");
		FgConfigurations fgConfigurations = ctx.getBean(FgConfigurations.class);
		System.out.println(fgConfigurations.getUsername() + "\n" + fgConfigurations.getPasswd() + "\n" + fgConfigurations.getJdbcUrl());

	}

}
