package aviation.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;
import aviation.util.DateUtil;

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
	@RequestMapping("/goinfo")
	@ResponseBody
	public String getGoInfo(String from,String to, String time ,int pageNo,int pageSize) throws UnsupportedEncodingException {
		String fromA = new String(from .getBytes("iso8859-1"),"utf-8");
		String toA = new String(to .getBytes("iso8859-1"),"utf-8");
		System.out.println(fromA);
		System.out.println(toA);
		System.out.println(time);
		System.out.println(pageNo);
		System.out.println(pageSize);
		List<FlightInfo> lists = atFlightService.findFlightGo(pageNo, pageSize, fromA, toA,DateUtil.toDate("yyyy-MM-dd", time) );
		for (FlightInfo flightInfo : lists) {
			System.out.println(flightInfo);
		}
		 return JSON.toJSONString(lists);
	}
	
	
	@RequestMapping("/lists/delFlight/{id}")
	@ResponseBody
	public String getDelFlight(@PathVariable("id") int id) {
		if(atFlightService.delFlight(id)>0) {
			return "susscer";
		}
		return "shibai ";
	}

}
