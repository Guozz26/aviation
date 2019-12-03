package aviation.controller;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationFlight;
import aviation.entity.po.AviationMoney;
import aviation.entity.po.AviationOrder;
import aviation.entity.po.AviationUser;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;
import aviation.service.prototype.IAviationOrderService;
import aviation.service.prototype.IAviationUserService;
import aviation.util.DateUtil;

@Controller
public class FlightController {
	
	
	@Autowired
	private IAviationFlightService atFlightService;
	
	@Autowired
	private IAviationOrderService  orderService;
	
	@Autowired
	private IAviationUserService  userService;
	

	// - 所有航班信息的页面
	@RequestMapping("/administrators/lists")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("Administrators/list");
		List<AviationFlight> lists = atFlightService.findFlightAll(1, 10);
		mv.addObject("lists",lists);
		return mv;
	}
	
	// - 后台主页面     administrators
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
	
	public ModelAndView getGoInfo( String from,String to, String time ,int pageNo,int pageSize) throws UnsupportedEncodingException {
		String fromA = from;
		String toA = to;
		System.out.println(fromA);
		System.out.println(toA);
		List<FlightInfo> lists = atFlightService.findFlightGo(pageNo, pageSize, fromA, toA,DateUtil.toDate("yyyy-MM-dd", time) );
		System.out.println(lists.size());
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
			ModelAndView mv = new ModelAndView("Administrators/Succer");
			return mv;
	}
	/*
	  int flightId,String from,String fromTime,String to,
				String toTime,int modelId,double moneyHeadPrice,double moneyBodyPrice
	 
	 insertOrUpdateFlight(
						new AviationFlight(flightId,from, to, DateUtil.toDate("yyyy-MM-dd hh:mm:ss", fromTime),
								DateUtil.toDate("yyyy-MM-dd hh:mm:ss", toTime), 0, 0, modelId) ,
						new AviationMoney(modelId,500, 200, 0));
	 
	 
	 
	 
	 */
	// -返回修改某个航班的航班信息
		@RequestMapping("/administrators/lists/listInfo/updateFlight/{id}")
		@ResponseBody
		public ModelAndView getUpdateFlight(@PathVariable("id") int id) {
				FlightInfo fi =	atFlightService.findFlightInfoAll(id);
				ModelAndView mv = new ModelAndView("Administrators/updateFlight");
				mv.addObject("FlightInfo", fi);
				return mv;
		}
		
	// -修改提交的返回
	// -返回修改某个航班的航班信息
		@RequestMapping("/administrators/lists/listInfo/updateFlight/updSuccer")
		@ResponseBody
		// http://localhost:8888/aviation/administrators/lists/listInfo/updateFlight/updSuccer?flightId=2&from=%E5%8C%97%E4%BA%AC&fromTime=&to=%E4%B8%8A%E6%B5%B7&toTime=&modelId=1&moneyHeadPrice=1900.0&moneyBodyPrice=880.25
		public ModelAndView getUpdateFlightSuccer( int flightId,String from,String fromTime,String to,
				String toTime,int modelId,double moneyHeadPrice,double moneyBodyPrice) {
				atFlightService.insertOrUpdateFlight(
					new AviationFlight(flightId,from, to, DateUtil.toDate("yyyy-MM-dd hh:mm:ss", fromTime),
							DateUtil.toDate("yyyy-MM-dd hh:mm:ss", toTime), 0, 0, modelId) ,
					new AviationMoney(modelId,moneyHeadPrice, moneyBodyPrice, flightId));
				ModelAndView mv = new ModelAndView("Administrators/Succer");
				return mv;
		}
	
	// -进入后台展示页面
	
	@RequestMapping("/administrators/huan/index")
	@ResponseBody
	public ModelAndView getHuanView() {
		ModelAndView mv = new ModelAndView("Administrators/huan/index");
		return mv;
	}
	
	// -插入航班信息页面返回
	@RequestMapping("/administrators/insSuccer")
	@ResponseBody
	public ModelAndView  getInsertView(String from,String fromTime,String to,
			String toTime,int modelId,double moneyHeadPrice,double moneyBodyPrice) {
		
		 try {
			from = new String(from .getBytes("iso8859-1"),"utf-8");
			to = new String(to .getBytes("iso8859-1"),"utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		 
		fromTime = FlightController.newString(fromTime);
		toTime = FlightController.newString(toTime);
		System.out.println(fromTime);
		// -2019-11-20T01:57
	
		char[] fromToChar = toTime.toCharArray();
		int a = atFlightService.insertOrUpdateFlight(
				new AviationFlight(from, to, DateUtil.toDate("yyyy-MM-dd hh:mm:ss", fromTime), DateUtil.toDate("yyyy-MM-dd hh:mm:ss", toTime), 0, 0, modelId),
				new AviationMoney(500, 200, 0));
		if(a>0) {
			ModelAndView mv = new ModelAndView("Administrators/Succer");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView("Administrators/fail");
			return mv;
		}
		
	}
	
	@RequestMapping("1231231")
	@ResponseBody
	public String   insertFlight() {
	
		return "1";
	}
	
	// -页面传过来的日期类型的格式转化
	private static String newString(String oldString) {
		String newString = null;
		// -2019-11-20T01:57
		newString = oldString.substring(0, 10) +" "+ oldString.substring(11) + ":00";
		System.out.println(newString);
		return newString;
	}
	
	
	
	
	//跳转页面用户
		@RequestMapping("/administrators/selectFlight/lists/aaa")
		public ModelAndView getPayMents(HttpServletRequest request,HttpSession session ) {
		
			 int id = Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			FlightInfo fw =	atFlightService.findFlightInfoAll(id);
			session.setAttribute("fw",fw);
			ModelAndView mv = new ModelAndView("order/jse");
			return mv;	
			
			
			
			
			
			
			
		}
		
	
		
		//跳转页面 存数据库  
				@RequestMapping("/administrators/selectFlight/lists/bbb")
				public ModelAndView getPayMentsw(HttpServletRequest request ,HttpSession  session) {
			
					String name = request.getParameter("name");
					String idcard = request.getParameter("idcard");
					FlightInfo fe = (FlightInfo)session.getAttribute("fw");
					String flightFrom = fe.getFlightFrom();
					String flightTo = fe.getFlightTo();
					Date flightFromTime = fe.getFlightFromTime();
					Date flightToTime = fe.getFlightToTime();
					double money = 0.0;
					int zuo = Integer.parseInt(request.getParameter("Fruit"));
					String zuos = Integer.toString(zuo);
					   if(zuo==1){
						 money = fe.getMoneyHeadPrice();
							  System.out.println("头等舱");
	                   }
					   if(zuo==2){
						money = fe.getMoneyBodyPrice();
	                	System.out.println("经济舱");
	                   }  
			   
					   
					   /*AviationUser namea = new  AviationUser();
					   namea.setUserName(name);*/
					   AviationUser aa =userService.name(name);
					   int bb=aa.getUserId();
				   System.out.println(name);
				   System.out.println(idcard);	 
				   System.out.println(flightFrom);	 
				   System.out.println(flightTo);	 
				   System.out.println(flightFromTime);	 
				   System.out.println(flightToTime);	
				   System.out.println(money);
				   System.out.println(zuos);
				   System.out.println(bb);
				   
				   AviationOrder  OrderId = new AviationOrder();
				   	
				   OrderId.setUserId(bb);
				   OrderId.setOrderUserName(name);
				   OrderId.setOrderIdcard(idcard);
				   OrderId.setOrderTimes(flightFrom);
				   OrderId.setOrderTo(flightTo);
				   OrderId.setOrderFromTime(flightFromTime);
				   OrderId.setOrderFromTo(flightToTime);
				   OrderId.setOrderPrice(zuos);
				   OrderId.setOrderMoney(money);
				   
		
				   
				   
				   orderService.ChageOrder(OrderId);
				   
				   
				   
					return new ModelAndView("order/dongtu");
					
				}
				//跳转页面
				@RequestMapping("/administrators/selectFlight/lists/ccc")
				public ModelAndView getPayMentswe(HttpServletRequest request) {
					System.out.println(123);
				
					return new ModelAndView("order/Succcg");
					
				}
				//跳转页面
				@RequestMapping("/administrators/selectFlight/lists/sss")
				public ModelAndView getPayMentswer(HttpServletRequest request) {
					System.out.println(123);
				
					return new ModelAndView("Administrators/selectFlight");
					
				}
		
}









