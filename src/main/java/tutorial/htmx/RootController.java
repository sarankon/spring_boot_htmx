package tutorial.htmx;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {

	@GetMapping
	public String index(Model model) {

		var list = List.of("Albert Einstein", "Niels Bohr", "James Clerk Maxwell");
		model.addAttribute("scientists", list);
		return "index";
	}

}
