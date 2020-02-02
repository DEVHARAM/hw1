package haram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class hwController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView hw() {
		People p = new People();
		ModelAndView modelAndView=new ModelAndView("hw");
		modelAndView.addObject("name",p.name);
		modelAndView.addObject("age",p.age);
		modelAndView.addObject("address",p.address);
		modelAndView.addObject("intro",p.intro);
		return modelAndView;
	}
	@RequestMapping(value = "/xml", method = RequestMethod.GET, produces="application/xml")
	public People hwXml() {
		People p = new People();
		return p;
	}
	
	@RequestMapping(value = "/json", method = RequestMethod.GET, produces="application/json")
	public People hwJson() {
		People p = new People();
		return p;
	}

}

