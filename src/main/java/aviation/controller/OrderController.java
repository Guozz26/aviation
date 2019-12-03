package aviation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aviation.dao.impl.AviationBossDaoImpl;
import aviation.entity.po.AviationOrder;
import aviation.entity.vo.OrderInfo;
import aviation.service.prototype.IAviationOrderService;

@Controller
public class OrderController {
	
	
	@Autowired
	private IAviationOrderService aOrderService;
	
	
	// - 所有航班信息的页面
	@RequestMapping("/order/lists")
	public ModelAndView getUsers() {
		ModelAndView mv = new ModelAndView("order/list");
		List<AviationOrder> lists = aOrderService.findFlightInfoAll();
		
		mv.addObject("lists",lists);
		
		for (AviationOrder aviationOrder : lists) {
			System.out.println("======================="+aviationOrder);
		}
		return mv;
	}
	
	//查询订单
	@RequestMapping("/order/lists/listInfo/{id}")
	public ModelAndView getlistInfo(@PathVariable("id")int id , HttpSession session ) {
		System.out.println("asfafafege"+id);
		ModelAndView mv = new ModelAndView("order/listInfo");
		
		AviationOrder a =  aOrderService.chess(id);
		System.out.println(a);
		
	
		mv.addObject("a", a);
		return mv;
	}
	

	@RequestMapping("/order/lists/delOrder/{id}")
	public ModelAndView getDelOrder(@PathVariable("id")int id ) {
		ModelAndView mv = new ModelAndView("order/Succer");
		
		int a  =  aOrderService.daleteOrder(id);
		if(a>0)
			return mv;
		else
			return new ModelAndView("order/Succer");
	}
	
	//退票
	
	@RequestMapping("/order/lists/duipiao/{orderId}")
	public ModelAndView tuipao(@PathVariable("orderId")int orderId ) {
		System.out.println(orderId);
	ModelAndView mv = new ModelAndView("order/listInfo");
			aOrderService.tuipoa(orderId, 1);
		AviationOrder a =  aOrderService.chess(orderId);
		System.out.println(a);
	
		mv.addObject("a", a);
		return mv	;
		

	}

	
	//改签
	@RequestMapping("/order/lists/changes/{orderId}")
	public ModelAndView changes(@PathVariable("orderId")int orderId ) {
		
		ModelAndView mv =  new ModelAndView("order/listInfo");
		aOrderService.tuipoa(orderId, 3);
		AviationOrder a =  aOrderService.changes(orderId);
		
		
		return null;
		
		
	}
	
	//根据用户和身份证查询
	@RequestMapping("/order/lists/abc")
	public ModelAndView getPayMentsw(HttpServletRequest request ) {
		System.out.println("123");
		String name = request.getParameter("orderUserName");
/*		String orderIdcard = request.getParameter("orderidcardr");*/
		System.out.println(name);
/*		System.out.println(orderIdcard);*/
		List<AviationOrder> ss = aOrderService.usernaem(name);
		System.out.println(ss);
		ModelAndView mv = new ModelAndView("/order/list");
		mv.addObject("lists",ss);
		return mv;
		
		
	}
	
	//退票
/*	@RequestMapping("/order/lists/ticket")
	public String ticket(HttpServletRequest request ) {
		int  id = Integer.getInteger(request.getParameter(name));
		
		return aOrderService.tuipoa(OrderId, statics)
		
	}*/
	
	
	
}
