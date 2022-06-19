package zaifi.springframework.sfdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zaifi.springframework.sfdi.controller.ConstructorInjectedController;
import zaifi.springframework.sfdi.controller.MyController;
import zaifi.springframework.sfdi.controller.PropertyInjectedController;
import zaifi.springframework.sfdi.controller.SetterInjectedController;

import java.util.Optional;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);
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

	}

}
