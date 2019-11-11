package aviation.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aviation.dao.impl.AviationMoneyDaoImpl;
import aviation.dao.prototype.IAviationFlightDao;
import aviation.dao.prototype.IAviationMoneyDao;
import aviation.entity.po.AviationFlight;
import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationMoney;
import aviation.entity.vo.FlightInfo;
import aviation.service.prototype.IAviationFlightService;

@Service
public class AviationFlightServiceImpl implements IAviationFlightService{
	
	@Autowired
	private IAviationFlightDao aviationFlightDao;	
	
	@Autowired
	private IAviationMoneyDao aviationMoneyDao;
	
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

	@Override		// -按条件查询
	public List<FlightInfo> findFlightGo(int pageNo, int pageSize, String from, String to, Date time) {
		return aviationFlightDao.findFlightGo(pageSize, (pageNo-1)*pageSize, from, to, time);
	}

	
	// - 插入航班信息，以及航班的座位的价格
	@Override
	@Transactional
	public int insertOrUpdateFlight(AviationFlight flight,AviationMoney money) {
			
		aviationFlightDao.inertOrUpdateFlight(flight);
		int flightId = aviationFlightDao.fingFlightMaxId();
		money.setFlightId(flightId);
		aviationMoneyDao.ChageMoney(money);
		return 1;
	}

	


}