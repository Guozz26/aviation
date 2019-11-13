package aviation.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aviation.service.prototype.IAviationFlightService;
import aviation.service.prototype.IAviationUserService;

@Controller
public class Reception {
	
	
	@Autowired
	private IAviationFlightService flightService;
	@Autowired
	private IAviationUserService userService;
	
	
	
	@RequestMapping("reception/sgin")
	public ModelAndView getSgin() {
		
		return new ModelAndView("Reception/sgin");
	}
	
	@RequestMapping(value = "reception/index")
	public ModelAndView getIndexSuccer(String name,String password,int role ,HttpServletRequest request) {
		if(role ==1) {
			int userId = 0;
			try {
				userId = userService.findUser(name, password).getUserId();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(userId==0) {
				return new ModelAndView("Reception/sgin");
			}
			HttpSession session = request.getSession();
			 session.setAttribute("accessedCount", userId);
			 System.out.println(session.getAttribute("accessedCount"));
			 return new ModelAndView("Reception/index");
		}
		if(role==3) {
			 return new ModelAndView("Administrators/index");
		}
		
	
		return new ModelAndView("Reception/index");
	}
	
/*	@RequestMapping("reception/index")
	public ModelAndView getIndex() {
		
		return new ModelAndView("Reception/index");
	}*/

	
	@RequestMapping("reception/reg")
	public ModelAndView getReg() {
		
		return new ModelAndView("Reception/reg");
	}
}
