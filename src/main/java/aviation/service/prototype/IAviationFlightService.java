package aviation.service.prototype;

import java.util.Date;
import java.util.List;

import aviation.entity.po.AviationFlight;
import aviation.entity.po.AviationMoney;
import aviation.entity.vo.FlightInfo;

public interface IAviationFlightService {

	List<AviationFlight> findFlightAll(int pageNo, int pageSize);
	FlightInfo findFlightInfoAll(int id);
	int delFlight(int id);
	// -根据出发地目的地时间来查询航班信息
	List<FlightInfo> findFlightGo(int pageNo,int pageSize,String from,String to,Date time);	
	// - 插入航班信息，以及航班的座位的价格
	int insertOrUpdateFlight(AviationFlight flight,AviationMoney money);
}
