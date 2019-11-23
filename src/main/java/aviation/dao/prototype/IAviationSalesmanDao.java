package aviation.dao.prototype;

import java.util.List;
import aviation.entity.po.AviationSalesman;
import aviation.entity.po.AviationUser;
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
	//通过neme和password查找
	// -根据用户名和密码查询用户
	AviationSalesman  fingsaesman(String name,String password);
}
