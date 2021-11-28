package com.example.springboot;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class HelloController {

	@RequestMapping("/")
	public String index(Model model) {
		String message = "CS1660 Course Project";
        model.addAttribute("message", message);
        return "index";
	}

}
