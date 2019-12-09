package de.telekom.Spring03Thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SpringBootApplication
public class Spring03ThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring03ThymeleafApplication.class, args);
	}

	@GetMapping("/")
	public String home(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);

		return "home";
	}
}
