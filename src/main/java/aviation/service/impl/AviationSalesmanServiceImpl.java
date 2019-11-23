package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationSalesmanDao;
import aviation.entity.po.AviationSalesman;
import aviation.service.prototype.IAviationSalesmanService;

/**
 * 营业员的service层实现类
 * @author 卟嗳
 *
 */
@Service("aviationSalesmanServiceImpl")
public class AviationSalesmanServiceImpl implements IAviationSalesmanService {
	
	@Autowired
	private IAviationSalesmanDao salesmandao;
	@Override
	// 营业员的单个查找
	public AviationSalesman findOne(int salesmanId) {
		return salesmandao.findOne(salesmanId);
	}
  // 营业员的单个删除
	@Override
	public int deleteOne(int salesmanId) {
		// TODO Auto-generated method stub
		return salesmandao.deleteOne(salesmanId);
	}
	//营业员的插入和修改
	@Override
	public int saveOrUpdataOne(AviationSalesman salesmanId) {
		return salesmandao.saveOrUpdataOne(salesmanId);
		
	}
    //营业员的所有查找
	@Override
	public List<AviationSalesman> findAll(int pageNo, int pageSize) {
		
		return salesmandao.findAll((pageNo-1)*pageSize,pageSize);
	}

	@Override
	public int totalItems() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	//根据用户和密码查找
	@Override
	public AviationSalesman fingsaesman(String name, String password) {
		
		return salesmandao.fingsaesman(name, password);
	}



}
