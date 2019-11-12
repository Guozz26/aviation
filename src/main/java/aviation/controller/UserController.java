package aviation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationUser;
import aviation.service.prototype.IAviationUserService;

@Controller
public class UserController {
		
	@Autowired
	private IAviationUserService userService;
	
	@RequestMapping("user/lists")
	public ModelAndView getUserList() {
		List<AviationUser> lists= userService.findAll();
		ModelAndView mv = new ModelAndView("user/list");
		mv.addObject("lists",lists);
		return mv;
		
	}
	
	@RequestMapping("user/lists/delUser/{id}")
	public ModelAndView getDelUser(@PathVariable("id") int id) {
		if(userService.deleteUser(id)>0)
			return new ModelAndView("user/succer");
		else
			return new ModelAndView("user/fail");
	}
}
