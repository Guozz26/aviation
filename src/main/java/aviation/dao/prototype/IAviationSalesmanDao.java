package aviation.dao.prototype;

import java.util.List;
import aviation.entity.po.AviationSalesman;
/**
 * 营业员的接口类
 * @author 卟嗳
 *
 */

public interface IAviationSalesmanDao {
	 //营业员的单个查找
    AviationSalesman findOne(int salesmanId);
    //营业员的单个删除删除
    int  deleteOne(int salesmanId);
    //营业员的单个插入和和更新
	int saveOrUpdataOne(AviationSalesman salesmanId);
	  //营业员的所有查找接口 
	List<AviationSalesman> findAll(int pageNo, int pageSize);
	   
	int totalItems();
}
