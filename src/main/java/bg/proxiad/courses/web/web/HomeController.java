package bg.proxiad.courses.web.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/home/**")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/profile/**")
	public String profile() {
		return "index";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
}
