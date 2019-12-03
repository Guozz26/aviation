package aviation.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

import aviation.entity.po.AviationPoint;
import aviation.entity.vo.VolumeInfo;
import aviation.service.prototype.IAviationPointService;
import aviation.service.prototype.IAviationVolumeService;
import aviation.util.DateUtil;

@Controller
public class volumeController {
	
	//统计信息的实现
	@Autowired
	private IAviationVolumeService volumeService;
	
	@Autowired
	private IAviationPointService pointServic;
	
	@RequestMapping("volume/index")
	public ModelAndView getIndex() {
		
	
		return new ModelAndView("volume/index");
	}
	
	@RequestMapping(value = "/volume/data",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String getDate() {
		List<AviationPoint> lists = pointServic.listfindAll(1, 100);
		List<VolumeInfo> pis = new ArrayList<>();
		for (int i = 0; i < lists.size(); i++) {
			AviationPoint point = lists.get(i);
			double a = volumeService.pointVolume(point.getPointId(), new Date(), 2);
			VolumeInfo vi = new VolumeInfo();
			vi.setPointCity(point.getPointCity());
			vi.setMoneyBodyPrice(a);
			pis.add(vi);
		}
		return JSONObject.toJSONString(pis);
	}
	
	
	
	@RequestMapping("volume/index2")
	public ModelAndView getIndex2() {
		
	
		return new ModelAndView("volume/index2");
	}
	
	@RequestMapping(value = "/volume/data2",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String getDate2() {
		List<AviationPoint> lists = pointServic.listfindAll(1, 100);
		List<VolumeInfo> pis = new ArrayList<>();
		for (int i = 0; i < lists.size(); i++) {
			AviationPoint point = lists.get(i);
			double a = volumeService.pointVolume(point.getPointId(), new Date(), 3);
			VolumeInfo vi = new VolumeInfo();
			vi.setPriceId(point.getPointId());
			vi.setPointCity(point.getPointCity());
			vi.setMoneyBodyPrice(a);
			pis.add(vi);
		}
		return JSONObject.toJSONString(pis);
	}
	
	
	@RequestMapping("volume/index3")
	public ModelAndView getIndex3() {
		return new ModelAndView("volume/index3");
	}
	
	@RequestMapping(value = "/volume/data3",produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public String getDate3() {
		List<Double> lists = new ArrayList<>();
		for (int i = 1; i < 13; i++) {
			double a  = volumeService.allVolume(DateUtil.toDate("yy-MM-dd", "2019-"+i+"-13"), 2);
			System.out.println(a);
			Double aa = new Double(a);
			lists.add(aa);
		}
		
		return JSONObject.toJSONString(lists);
	}
	
	
	
	@RequestMapping("volume/index4")
	public ModelAndView getIndex4() {
			return new ModelAndView("volume/index4");
	}

}
