package springbootexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/hello")
	public String hello() {
		return "This is Nikhil's spring boot demo..";
	}

}
