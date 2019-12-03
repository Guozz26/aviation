package aviation.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationOrder;
import aviation.entity.po.AviationUser;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationBossService;
import aviation.service.prototype.IAviationFlightService;
import aviation.service.prototype.IAviationOrderService;
import aviation.service.prototype.IAviationRootService;
import aviation.service.prototype.IAviationSalesmanService;
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
	@Autowired
	private IAviationOrderService orderService;
	@Autowired
	private IAviationSalesmanService  salesmanService;
	@Autowired
	private IAviationBossService bossService;

	//前台的
	
	@RequestMapping("reception/sgin")
	public ModelAndView getSgin() {
		
		return new ModelAndView("Reception/sgin");
	}
	
	
	//前台主页面
	@RequestMapping( "reception/index")
	public ModelAndView getIndexSuccer(HttpServletRequest request) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		 int role = 0;
		try {
			role = (Integer.parseInt(request.getParameter("role")));
			System.out.println(role);
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}
		
		//登录权限设置    1是前台  2是营业员  3是管理员  4是boss
		
		
		if(role ==1) {
			int userId = 0;
			String userName=null;
			try {
					userId = userService.findUser(name, password).getUserId();
					userName = userService.findUser(name, password).getUserName();
				
				} catch (Exception e) {
				return new ModelAndView("Reception/sgin");
			}
			HttpSession session = request.getSession();
			 session.setAttribute("userId", userId);
			 session.setAttribute("role", 1);
			 session.setAttribute("login", "yes");
			 session.setAttribute("userName", userName);
			ModelAndView mv =  new ModelAndView("Reception/index");
			mv.addObject("userName",userName);
			mv.addObject("Id",userId);
			 return mv;
		}
	if(role==2) {
			int rootId =0;
			try {
				rootId = salesmanService.fingsaesman(name, password).getSalesmanId();
				System.out.println(rootId);
			}catch (Exception e) {	
			}
			if(rootId==0) {
				return new ModelAndView("Reception/sgin");
			}
			HttpSession session = request.getSession();
			ModelAndView mv=new ModelAndView("Administrators/index");
			session.setAttribute("role", 2);
			 session.setAttribute("login", "yes");
			 return mv;
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
			 session.setAttribute("login", "yes");
			 return new ModelAndView("Administrators/index");
		}
	if(role==4) {
			int rootId =0;
			try {
				rootId = bossService.fingBoss(name, password).getBossId();
				System.out.println(rootId);
			}catch (Exception e) {	
			}
			if(rootId==0) {
				return new ModelAndView("Reception/sgin");
			}
			HttpSession session = request.getSession();
			ModelAndView mv=new ModelAndView("Administrators/index");
			mv.addObject("role",4);
			session.setAttribute("role", 4);
			session.setAttribute("login", "yes");
			 return mv;
		}
		return new ModelAndView("Reception/index");
	}
	
	
	//退出登录
		@RequestMapping("/outlogin")
		public void outlogin(HttpSession session,HttpServletResponse response) {
			if("yes".equals(session.getAttribute("login"))){
				session.removeAttribute("role");
			}
			try {
				response.sendRedirect("http://localhost:8888/aviation/reception/sgin");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	
	
	@RequestMapping("reception/reg")
	public ModelAndView getReg() {
		
		return new ModelAndView("Reception/reg");
	}
	@RequestMapping("reception/reg/succer")
	public ModelAndView getRegSuccer(String name ,String password) {
		try {
			userService.updateUser(new AviationUser( name,password, password,new Date()));
		} catch (Exception e) {
			return new ModelAndView("Reception/fail");
		}
		
		return new ModelAndView("Reception/Succer");
	}
	
	
	@RequestMapping(value = "/reception/selectFlight", produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public ModelAndView getGoInfo(String from,String to, String time ,int pageNo,int pageSize) throws UnsupportedEncodingException {
		List<FlightInfo> lists = flightService.findFlightGo(pageNo, pageSize, from, to,DateUtil.toDate("yyyy-MM-dd", time) );
		for (FlightInfo flightInfo : lists) {
		}
		ModelAndView mv = new ModelAndView("Reception/airfare");
		mv.addObject("lists", lists);
		return mv;
	}
	
	
	//游客预定票后身份信息填写
	// 某个航班的详细信息
	@RequestMapping("/reception/addPay")
	public ModelAndView getFlightId(HttpServletRequest request ,HttpSession session) {	
		System.out.println(22222222);
		int id  = Integer.parseInt(request.getParameter("flightId")); 
		int zuo  = Integer.parseInt(request.getParameter("zuot"));
		ModelAndView mv = new ModelAndView("Reception/addpay");
		FlightInfo lists = flightService.findFlightInfoAll(id);	
		
		session.setAttribute("lists",lists);
		session.setAttribute("zuo",zuo);
		mv.addObject("lists",lists);
		mv.addObject("zuo",zuo);
		return mv;
	}
	
	
	//游客填完身份信息页面后的支付页面
	//实现买票功能
	@RequestMapping(value ="/reception/payMents")
	public ModelAndView getPayMents(HttpServletRequest request ,HttpSession session) {
 String name = request.getParameter("name");
 String idcard = request.getParameter("idcard");
 String flightFrom=request.getParameter("point");
 String flightto=request.getParameter("end");
 String seat= request.getParameter("seat");
 int se = Integer.parseInt(session.getAttribute("userId").toString());
 System.out.println(se);
 double price = Double.parseDouble(request.getParameter("money"));
 
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 Date flightTime=null;
 Date flighttos=null;
try {
	String time = request.getParameter("time");
	flightTime= sdf.parse(time);
	flighttos = sdf.parse(request.getParameter("Arrival"));

} catch (ParseException e) {
	e.printStackTrace();
}

 AviationOrder  OrderId = new AviationOrder();
OrderId.setUserId(se);
 OrderId.setOrderUserName(name);
 OrderId.setOrderIdcard(idcard);
 OrderId.setOrderTimes(flightFrom);
 OrderId.setOrderTo(flightto);
 OrderId.setOrderFromTime(flightTime);
 OrderId.setOrderFromTo(flighttos);
 OrderId.setOrderPrice(seat);
 OrderId.setOrderMoney(price);
 
 orderService.ChageOrder(OrderId);
 ModelAndView mv = new ModelAndView("Reception/index");
 mv.addObject("price", price);
		return mv;
		
	}
	

	//支付接口 跳转
		
	@RequestMapping(value ="/reception/gopay" ,method = RequestMethod.POST)
	public ModelAndView gopay(HttpServletRequest request) {
		
		return new ModelAndView("/user/alipay.trade.page.pay");
		
	}
	
	
	
	//支付接口
	
	
	
		
	
	
	@RequestMapping("/reception/exit")
	public ModelAndView getExit(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("userName");
		session.setAttribute("userId", 0);
		System.out.println("11111111111111");
		return new ModelAndView("Reception/index");
	}
	
	
	
	//后台订单查询的订单
	@RequestMapping("/reception/personal")
	public ModelAndView getPersonal(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int id =  (int) session.getAttribute("userId");
		ModelAndView mv = new ModelAndView("Reception/personal");	
		
		try {
			//orderService.tuipoa(id, 1);
			List<AviationOrder>  order= orderService.user(id);
		
				mv.addObject("order",order);
			for (AviationOrder aviationOrder : order) {
				System.out.println(aviationOrder);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
}
