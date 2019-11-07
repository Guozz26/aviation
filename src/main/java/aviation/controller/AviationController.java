package aviation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;

@Controller
public class AviationController {
	
	
	@Autowired
	private IAviationFlightService atFlightService;
	

	
	@RequestMapping("/lists")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("list");
		List<AviationFlight> lists = atFlightService.findFlightAll(1, 10);
		mv.addObject("lists",lists);
		return mv;
	}
	
	@RequestMapping("/lists/{id}")
	public ModelAndView getUserInfo(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("info");
		FlightInfo lists = atFlightService.findFlightInfoAll(id);
		mv.addObject("lists",lists);
		return mv;
	}

}
