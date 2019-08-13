package co.grandcircus.donutAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.donutAPI.entities.DetailResponse;
import co.grandcircus.donutAPI.entities.ResultsResponse;

@Controller
public class DonutController {

	@Autowired
	private DonutAPIService apiService;

	@RequestMapping("/")
	public ModelAndView showHome() {

		return new ModelAndView("redirect:/home");
	}

	@RequestMapping("/home")
	public ModelAndView displayHome() {

		ResultsResponse response = apiService.getResults();
		System.out.println(response);
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("results", response.getResults());
		return mv;
	}

	@RequestMapping("/details")
	public ModelAndView displayDetails(@RequestParam("id") Integer id, @RequestParam("name") String name) {

		DetailResponse detailResponse = apiService.getDetails(id);
		System.out.println(detailResponse);
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("name", name);
		mv.addObject("detailResponse", detailResponse);
		return mv;
	}
}
