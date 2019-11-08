package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationSalesman;
/**
 * 营业员的service接口
 * @author 卟嗳
 *
 */

public interface IAviationSalesmanService {
	
		 //营业员的单个查找
	    AviationSalesman findOne(int salesmanId);
	    //营业员的单个删除删除
	    int  deleteOne(int salesmanId);
	    //营业员的单个插入和和更新
		int saveOrUpdataOne(AviationSalesman salesmanId);
		 //营业员的所有查询  
		List<AviationSalesman> findAll(int pageNo, int pageSize);
		   
		int totalItems();		
    
}