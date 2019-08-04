package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import demo.model.User;
import demo.service.UserServiceImpl;


@Controller
public class MyController {

@Autowired
private UserServiceImpl userService;



	@GetMapping("/")
	public String index(Model model) {

		User user = new User();

		model.addAttribute("message", "Hello Spring MVC 5!");
		model.addAttribute("user", user);
		return "index";
	}


	@PostMapping("/save")
	public String save(String name) {
		System.out.println(name);
		userService.saveUser(name);
		return "redirect:/";
	}
}