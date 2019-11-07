package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationFlightDao;
import aviation.entity.po.AviationFlight;
import aviation.entity.vo.FlightInfo;


@Repository
public class AviationFlightDaoImpl implements IAviationFlightDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<AviationFlight> findFlightAll(int pageSize, int offset) {
		return jdbcTemplate.query("select * from aviation_flight limit ? , ? ",
				new Object[] {offset , pageSize},
				new BeanPropertyRowMapper<AviationFlight>(AviationFlight.class));
	}

	public List<AviationFlight> findFlightGo(int pageSize, int offset, String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}


	public FlightInfo findFlightInfoAll(int id) {
		return jdbcTemplate.queryForObject( 
				"select a.*,b.model_name,b.model_headnum,b.model_bodynum,"
				+ "c.money_head_price,c.money_body_price from aviation_flight a "
				+ "left join aviation_model b ON a.flight_id = b.flight_id "
				+ "left join aviation_money c on b.model_id=c.model_id where a.flight_id = ?",
				new Object[] {id}, new BeanPropertyRowMapper<>(FlightInfo.class));
	}

	@Override
	public int delFlight(int id) {
		int a  = jdbcTemplate.update("delete from aviation_flight where flight_id =? ", 
				new Object[] {id});		
		if(a>0) {
			return 1 ;
		}
		return 0;
	}
}
