package aviation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		List<AviationOrder> lists = aOrderService.check(1, 10);
		mv.addObject("lists",lists);
		return mv;
	}
	
	@RequestMapping("/order/lists/listInfo/{id}")
	public ModelAndView getlistInfo(@PathVariable("id")int id ) {
		ModelAndView mv = new ModelAndView("order/listInfo");
		int price = aOrderService.chess(id).getPriceId();
		
		OrderInfo lists =  aOrderService.findFlightInfoAll(id);
		if(price==1) {
			lists.setMoneyHeadPrice(lists.getMoneyBodyPrice());
			mv.addObject("zuo","经济舱");
		}else {
			
			lists.setMoneyBodyPrice(lists.getMoneyHeadPrice());
			mv.addObject("zuo","头等舱");
		}
		mv.addObject("lists", lists);
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
	
}
