package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationUserDao;
import aviation.entity.po.AviationUser;
import aviation.service.prototype.IAviationUserService;
@Repository("aviationUserServices")
public class AviationUserServiceImpl implements IAviationUserService{

	@Autowired
	private IAviationUserDao  iaviationUserDao;
	
	@Override
	public AviationUser find(int Id) {
		
		return iaviationUserDao.find(Id);
	}

	@Override
	public List<AviationUser> findAll() {
		// TODO Auto-generated method stub
		return iaviationUserDao.findAll();
	}

	@Override
	public void updateUser(AviationUser UserId) {
		iaviationUserDao.updateUser(UserId);
		
	}

	@Override
	public int deleteUser(int id) {
		
		return iaviationUserDao.deleteUser(id);
	}

}
