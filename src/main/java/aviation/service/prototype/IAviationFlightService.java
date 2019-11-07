package aviation.service.prototype;

import java.util.List;

import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.util.MiniPager;

public interface IAviationFlightService {

	List<AviationFlight> findFlightAll(int pageNo, int pageSize);
	FlightInfo findFlightInfoAll(int id);
	int delFlight(int id);
}
