package aviation.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.xml.ws.Service.Mode;

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
	

	// - 所有航班信息的页面
	@RequestMapping("/administrators/lists")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("Administrators/list");
		List<AviationFlight> lists = atFlightService.findFlightAll(1, 10);
		mv.addObject("lists",lists);
		return mv;
	}
	
	// - 后台主页面
	@RequestMapping("/administrators")
	public ModelAndView getIndex() {
		ModelAndView mv = new ModelAndView("Administrators/index");
		return mv;
	}
	
	// 某个航班的详细信息
	@RequestMapping("/administrators/lists/listInfo/{id}")
	public ModelAndView getUserInfo(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("Administrators/info");
		FlightInfo lists = atFlightService.findFlightInfoAll(id);
		mv.addObject("lists",lists);
		return mv;
	}
	
	// - 查询航班的页面
	@RequestMapping("/administrators/selectFlight")
	@ResponseBody
	public ModelAndView getSelectFlight() {
		
		ModelAndView mv = new ModelAndView("Administrators/selectFlight");
		return mv;
	}
	
	
	
	// -	新增航班的页面
		@RequestMapping("/administrators/insertFlight")
		@ResponseBody
		public ModelAndView getInsertFlight() {
			
			ModelAndView mv = new ModelAndView("Administrators/insertFlight");
			return mv;
		}
	
	// - 根据出发地和目的地时间查出来的所有的航班
	@RequestMapping(value = "/administrators/selectFlight/goinfo", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public ModelAndView getGoInfo(String from,String to, String time ,int pageNo,int pageSize) throws UnsupportedEncodingException {
		String fromA = new String(from .getBytes("iso8859-1"),"utf-8");
		String toA = new String(to .getBytes("iso8859-1"),"utf-8");
		List<FlightInfo> lists = atFlightService.findFlightGo(pageNo, pageSize, fromA, toA,DateUtil.toDate("yyyy-MM-dd", time) );
		for (FlightInfo flightInfo : lists) {
			System.out.println(flightInfo);
		}
		ModelAndView mv = new ModelAndView("Administrators/goinfo");
		mv.addObject("lists", lists);
		return mv;
	}
	
	// -删除某个航班的页面
	@RequestMapping("/administrators/lists/listInfo/delFlight/{id}")
	@ResponseBody
	public ModelAndView getDelFlight(@PathVariable("id") int id) {
			atFlightService.delFlight(id);
			ModelAndView mv = new ModelAndView("Administrators/selectFlight");
			return mv;
	}
	
	// -进入后台展示页面
	
	@RequestMapping("/administrators/huan/index")
	@ResponseBody
	public ModelAndView getHuanView() {
		ModelAndView mv = new ModelAndView("Administrators/huan/index");
		return mv;
	}
	
	// -插入航班信息页面
	@RequestMapping("123123123")
	@ResponseBody
	public ModelAndView  getInsertView() {
		
		ModelAndView mv = new ModelAndView("Administrators/inertFlight");
		return mv;
	}
	
	@RequestMapping("1231231")
	@ResponseBody
	public String   insertFlight() {
	
		return "1";
	}
}
