package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationPointDao;
import aviation.entity.po.AviationPoint;
import aviation.service.prototype.IAviationPointService;

@Service("aviationPointServiceImpl")
public class AviationPointServiceImpl implements IAviationPointService {
	  @Autowired
      private IAviationPointDao aviationdao;
	  //营业点单个查找
	@Override
	public AviationPoint findOne(int id) {
		// TODO Auto-generated method stub
		return aviationdao.findOne(id);
	}

	@Override
	public List<AviationPoint> listAccounts(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AviationPoint> listPaged(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return aviationdao.findAll((pageNo-1)*pageSize,pageSize);
	}

}
