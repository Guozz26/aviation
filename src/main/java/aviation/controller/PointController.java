package aviation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aviation.entity.po.AviationManager;
import aviation.entity.po.AviationPoint;
import aviation.entity.vo.PointInfo;
import aviation.service.prototype.IAviationManagerService;
import aviation.service.prototype.IAviationPointService;

@Controller
public class PointController {
	
	
	@Autowired
	private IAviationManagerService mangerService;
	@Autowired
	private IAviationPointService pointService;
	
	
	
	
	@RequestMapping("point/lists")
	public ModelAndView getPointList() {
		List<AviationPoint> list  =pointService.listfindAll(1, 10);
		List<PointInfo> lists = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			PointInfo pt = new PointInfo();
			AviationManager e = mangerService.find(list.get(i).getManagerId());
			pt.setPointId(list.get(i).getPointId());
			pt.setPointCity(list.get(i).getPointCity());
			pt.setManagerId(e.getManagerId());
			pt.setManagerName(e.getManagerName());
			pt.setManagerSex(e.getManagerSex());
			pt.setManagerTel(e.getManagerTel());
			lists.add(pt);
		}
		ModelAndView mv = new ModelAndView("point/list");
		mv.addObject("lists",lists);
		return mv;
	}
	
	
	@RequestMapping("point/lists/updPoint/update")
	public ModelAndView getUpdatePoint(String pointCity,int managerId,String managerName,String managerSex,String managerTel,String managerPwd) {
		mangerService.updateManager(new AviationManager(managerName, managerSex, managerTel, managerPwd));
		managerId = mangerService.findMaxId();
		pointService.ServicesaveOrUpdataOne(new AviationPoint(pointCity, managerId));
		return new ModelAndView("point/succer");
	}
	
	@RequestMapping("point/insertPoint")
	public ModelAndView getInsertPoint() {
		ModelAndView mv = new ModelAndView("point/insertPoint");
		return  mv;
	}
	
}
