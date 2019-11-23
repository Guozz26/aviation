package aviation.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationUser;
import aviation.entity.vo.FlightInfo;
import aviation.entity.vo.OrderInfo;
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
			mv.addObject("role",2);
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
			 return mv;
		}
		return new ModelAndView("Reception/index");
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
	@RequestMapping(value ="/reception/addPay")
	 public ModelAndView getAddpay(HttpServletRequest request) {
		return new ModelAndView("Reception/addpay");
		
	}
	//游客填完身份信息页面后的支付页面
	@RequestMapping(value ="/reception/payMents")
	public ModelAndView getPayMents(HttpServletRequest request) {
		return new ModelAndView("Reception/payments");
		
	}
	
	@RequestMapping("/reception/exit")
	public ModelAndView getExit(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("userName");
		session.setAttribute("userId", 0);
		System.out.println("11111111111111");
		return new ModelAndView("Reception/index");
	}
	
	
	@RequestMapping("/reception/personal")
	public ModelAndView getPersonal(HttpServletRequest request) {
		HttpSession session = request.getSession();
		int id =  (int) session.getAttribute("userId");
		ModelAndView mv = new ModelAndView("Reception/personal");		
		
		try {
			List<OrderInfo>  order= orderService.userss(id);
			if(order.size()!=0) {
				for (int i = 0; i < order.size(); i++) {
				int price = orderService.chess(order.get(i).getOrderId()).getPriceId();
				System.out.println(price);
				if(price==1) {
					order.get(i).setMoneyBodyPrice(order.get(i).getMoneyBodyPrice());
					order.get(i).setZuo("经济舱");
				}else {	
					order.get(i).setMoneyBodyPrice(order.get(i).getMoneyHeadPrice());
					order.get(i).setZuo("头等舱");
				}
			}
				mv.addObject("yes",1);
				mv.addObject("order",order);
			}else {
				mv.addObject("yes",0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
}
