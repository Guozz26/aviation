package aviation.testDao.AviationSalesman;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationSalesmanDao;
import aviation.entity.po.AviationSalesman;
import aviation.util.DateUtil;
/**
 * 营业员的dao层测试
 * @author 卟嗳
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationSalesmanImpl {
	      @Autowired
          private IAviationSalesmanDao avi;
	      //营业员单个查找的测试
          @Test
          public void testfindOne() {
        	   AviationSalesman act= avi.findOne(1);
  	    	  System.out.println(act);
    }		
          //营业员单个删除的测试
          @Test
          public void testDeleteOne() {
        	  avi.deleteOne(3);
          }
          //营业员整个查找的测试
          @Test
          public void testfindAll() {
        	  List<AviationSalesman> pages =  avi.findAll(0, 5);
        	  for(AviationSalesman a :pages) {
        		  System.out.println(a);
        	  }
        	  
          }
          //营业员的的修改和插入
          @Test
          public void saveOrUpdataOne() {
        	 AviationSalesman man = new AviationSalesman("郭帅斌","男", 
        	DateUtil.toDate("yyyy-MM-dd hh:mm:ss",  "1997-01-08 23:03:20"),"slw3456", 7);
        	   System.out.println(avi.saveOrUpdataOne(man));
          }
         
          
}