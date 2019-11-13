package aviation.testDao.AviationUser;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import aviation.config.TestConfig;
/*
 * 用户dao层测试
 * 
 * */
import aviation.dao.prototype.IAviationUserDao;
import aviation.entity.po.AviationUser;
import aviation.util.DateUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
public class testAviationUserImpl {

	@Autowired 
	private IAviationUserDao iaviationUserDao;
	
	//--查询一个 
	@Test
	public void find() {
		AviationUser ss = iaviationUserDao.find(1);
		System.out.println(ss);
		
	}
	
	//--查询所有
	@Test
	public void testfindAll() {
		List<AviationUser> ss = iaviationUserDao.findAll();
		for (AviationUser aviationUser : ss) {
			System.out.println(aviationUser);
		}
		
		
	}
	
	//--插入和修改用户
	@Test
	public void testupdateUser() {
		AviationUser ss = new  AviationUser("lisi","123456","男",DateUtil.toDate("yyyy-MM-dd hh:mm:ss", "1997-06-13 23:12:12"));
		iaviationUserDao.updateUser(ss);
	}
	@Test
	public void  setuserdelete() {
		
		iaviationUserDao.deleteUser(3);
	}
	
	
	@Test
	public void testfindUser() {
		AviationUser user = iaviationUserDao.fingUser("李四", "123");
		System.out.println(user);
		
	}
}
