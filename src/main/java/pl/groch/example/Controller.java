package pl.groch.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class Controller {

	@GetMapping
	String example() {

		return "java 17, spring web mvc 6.1, embedded tomcat 10.1";
	}
}
