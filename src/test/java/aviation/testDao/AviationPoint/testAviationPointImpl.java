package aviation.testDao.AviationPoint;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
import aviation.dao.prototype.IAviationPointDao;
import aviation.entity.po.AviationPoint;
/**
 * 营业点dao层测试
 * @author 卟嗳
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
public class testAviationPointImpl {
           @Autowired          
           private IAviationPointDao avi;
           //营业点的单个查找测试
           @Test
           public void testFind(){
 	    	  AviationPoint act= avi.findOne(1);
 	    	  System.out.println(act);
 	      }
           //营业点的单个删除测试
           @Test
           public void testDelect() {
        	   avi.deleteOne(3);
           }
           //营业点的单个插入和修改测试
           @Test
           public void saveOrUpdata() {
        	   AviationPoint  se = new AviationPoint(20,"上海", 1);
        	   System.out.println(avi.saveOrUpdataOne(se));
           }
           //营业点的整体查询测试
           @Test
           public void findAll() {
        	   List<AviationPoint> pages = avi.findAll(0, 5);
        	    for(AviationPoint a :pages) {
        	    	System.out.println(a);
        	    }
           }
}
