package aviation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationFlightDao;
import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;

@Service
public class AviationFlightServiceImpl implements IAviationFlightService{
	
	@Autowired
	private IAviationFlightDao aviationFlightDao;	
	
	public List<AviationFlight> findFlightAll(int pageNo, int pageSize) {
		return aviationFlightDao.findFlightAll(pageSize, (pageNo-1)*pageSize);
	}

	@Override
	public FlightInfo findFlightInfoAll(int id) {
		
		return aviationFlightDao.findFlightInfoAll(id);
	}

	@Override
	public int delFlight(int id) {
		return aviationFlightDao.delFlight(id);
	}

}
