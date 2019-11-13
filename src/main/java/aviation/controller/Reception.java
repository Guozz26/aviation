package aviation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aviation.service.prototype.IAviationFlightService;

@Controller
public class Reception {
	
	
	@Autowired
	private IAviationFlightService flightService;
	
	@RequestMapping("reception/index")
	public ModelAndView getIndex() {
		
		return new ModelAndView("Reception/index");
	}
}
