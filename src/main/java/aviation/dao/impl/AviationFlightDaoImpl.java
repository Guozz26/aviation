package aviation.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationFlightDao;
import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;
import aviation.util.DateUtil;


@Repository
public class AviationFlightDaoImpl implements IAviationFlightDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	// - 查询所有的航班信息
	public List<AviationFlight> findFlightAll(int pageSize, int offset) {
		return jdbcTemplate.query("select * from aviation_flight limit ? , ? ",
				new Object[] {offset , pageSize},
				new BeanPropertyRowMapper<AviationFlight>(AviationFlight.class));
	}
	 
	
	// -根据目的地和出发地查询航班
	
	public List<FlightInfo> findFlightGo(int pageSize, int offset, String from, String to,Date time) {
		System.out.println(DateUtil.dateToString("yyyy-MM-dd", time));
		return  jdbcTemplate.query( 
				"select a.*,b.model_name,b.model_headnum,b.model_bodynum,"
				+ "c.money_head_price,c.money_body_price from aviation_flight a "
				+ "left join aviation_model b on a.model_id = b.model_id "
				+ "left join aviation_money c on a.flight_id = c.flight_id "
				+ "where a.flight_from = ? and a.flight_to = ? "
				+ "and a.flight_from_time like '%"+DateUtil.dateToString("yyyy-MM-dd", time)+"%' limit ?,?",
				new Object[] {from,to,offset,pageSize}, 
				new BeanPropertyRowMapper<FlightInfo>(FlightInfo.class));
	}

	
	
	// -查询某个航班的详细的信息
	public FlightInfo findFlightInfoAll(int id) {
		return jdbcTemplate.queryForObject( 
				"select a.*,b.model_name,b.model_headnum,b.model_bodynum,c.money_head_price,c.money_body_price "
				+ "from aviation_flight a "
				+ "left join aviation_model b ON a.model_id = b.model_id "
				+ "left join aviation_money c on a.flight_id =c.flight_id where a.flight_id = ?",
				new Object[] {id}, new BeanPropertyRowMapper<>(FlightInfo.class));
	}
	
	
	// - 删除航班信息
	@Override
	public int delFlight(int id) {
		int a  = jdbcTemplate.update("delete from aviation_flight where flight_id =? ", 
				new Object[] {id});		
		if(a>0) {
			return 1 ;
		}
		return 0;
	}


	
	// -插入航班信息或修改航班信息
	@Override
	public int inertOrUpdateFlight(AviationFlight avFlight) {
		if(avFlight.getFlightId()==0) {
		jdbcTemplate.update("insert into aviation_flight (flight_from,flight_to,flight_from_time,"
				+ "flight_to_time,flight_head_num,flight_body_num,model_id) "
				+ "value (?,?,?,?,?,?,?)",
				new Object[] {avFlight.getFlightFrom(),avFlight.getFlightTo(),avFlight.getFlightFromTime(),
						avFlight.getFlightToTime(),avFlight.getFlightHeadNum(),avFlight.getFlightBodyNum(),
						avFlight.getModelId()
				});
		}else {
			jdbcTemplate.update("update aviation_flight set flight_from =?,"
						+ "flight_to = ?,flight_from_time = ?," 
						+ "flight_to_time = ?,flight_head_num = ?,"
						+ "flight_body_num = ?,model_id = ? where flight_id = ?" ,
						new Object[] {avFlight.getFlightFrom(),avFlight.getFlightTo(),avFlight.getFlightFromTime(),
								avFlight.getFlightToTime(),avFlight.getFlightHeadNum(),avFlight.getFlightBodyNum(),
								avFlight.getModelId(),avFlight.getFlightId()});
		} 
		return 0;	
	}

	// - 查询当前最大航班id
	@Override
	public int fingFlightMaxId() {
		AviationFlight af = jdbcTemplate.queryForObject("select * from aviation_flight order by flight_id desc limit 1", new BeanPropertyRowMapper<AviationFlight>(AviationFlight.class));	
		return af.getFlightId();
	}
//根据id查航班
	@Override
	public int flightId(int Flightid) {
		
		return 0;
	}
}
