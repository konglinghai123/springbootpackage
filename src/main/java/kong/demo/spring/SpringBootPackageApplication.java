package kong.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootPackageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPackageApplication.class, args);
	}

	@RequestMapping("/")
	public String test(){
		return "Demo project for use spring boot build a custom package";
	}
}
