package aviation.dao.prototype;

import java.util.Date;
import java.util.List;

import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;

/**
 * 
 * 	航班的Dao
 * @author LENOVO
 *
 */
public interface IAviationFlightDao {
	// -查询所有的航班计划
	List<AviationFlight> findFlightAll(int pageSize, int offset );
	// -根据出发地和目的地查询航班计划
	List<FlightInfo> findFlightGo(int pageSize, int offset ,String from , String to,Date time);
	//- 查询航班的所有的信息
	FlightInfo findFlightInfoAll(int id);
	// -删除一条航班信息
	int delFlight(int id);
	
}
