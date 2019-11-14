package aviation.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;
import aviation.service.prototype.IAviationRootService;
import aviation.service.prototype.IAviationUserService;
import aviation.util.DateUtil;

@Controller
public class Reception {
	
	
	@Autowired
	private IAviationFlightService flightService;
	@Autowired
	private IAviationUserService userService;
	@Autowired
	private IAviationRootService rootService;

	
	
	@RequestMapping("reception/sgin")
	public ModelAndView getSgin() {
		
		return new ModelAndView("Reception/sgin");
	}
	
	@PostMapping( "reception/index")
	public ModelAndView getIndexSuccer(HttpServletRequest request) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		int role = (Integer.parseInt(request.getParameter("role")));
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
			 session.setAttribute("userId", userId);
			 session.setAttribute("role", 1);
			 System.out.println(session.getAttribute("accessedCount"));
			 return new ModelAndView("Reception/index");
		}
		if(role==3) {
			int rootId =0;
			try {
				rootId = rootService.find(name, password).getRootId();
			}catch (Exception e) {	
			}
			if(rootId==0) {
				return new ModelAndView("Reception/sgin");
			}
			HttpSession session = request.getSession();
			 session.setAttribute("role", 3);
			 System.out.println(session.getAttribute("accessedCount"));
			 return new ModelAndView("Administrators/index");
		}
		
	
		return new ModelAndView("Reception/index");
	}
	
	@RequestMapping("reception/reg")
	public ModelAndView getReg() {
		
		return new ModelAndView("Reception/reg");
	}
	
	
	@RequestMapping(value = "/reception/selectFlight", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public ModelAndView getGoInfo(String from,String to, String time ,int pageNo,int pageSize) throws UnsupportedEncodingException {
		List<FlightInfo> lists = flightService.findFlightGo(pageNo, pageSize, from, to,DateUtil.toDate("yyyy-MM-dd", time) );
		System.out.println(lists.size());
		for (FlightInfo flightInfo : lists) {
			System.out.println(flightInfo);
		}
		ModelAndView mv = new ModelAndView("Reception/airfare");
		mv.addObject("lists", lists);
		return mv;
	}
}
