package aviation.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationMoneyDao;
import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationMoney;

@Repository("aviationMoneyDaoImpl")
public class AviationMoneyImpl implements IAviationMoneyDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//查询
	@Override
	public AviationMoney chess(int ModelId) {
		
		return jdbcTemplate.queryForObject("select * from aviation_money where money_id=?", 
				new Object[] {(ModelId)},
				new BeanPropertyRowMapper<>(AviationMoney.class));
				
	}
//更新和修改
	@Override
	public void ChageMoney(AviationMoney ModelId) {
		if(ModelId.getMoneyId()==0) {
			jdbcTemplate.update(
					"insert into aviation_money(money_head_price,money_body_price,flight_id) values(?,?,?)", 
					new Object[]{ModelId.getMoneyBodyPrice(),ModelId.getMoneyHeadPrice(),ModelId.getFlightId()});
		}else {
			jdbcTemplate.update(
					"update aviation_money set money_head_price="
					+ "?,money_body_price=?,flight_id=?  where money_id=? ", 
					new Object[]{ModelId.getMoneyHeadPrice(),
							ModelId.getMoneyBodyPrice(),
							ModelId.getFlightId(),
							ModelId.getMoneyId()});
					}
		
		}
//删除
	@Override
	public int daleteMoney(int id) {

		return jdbcTemplate.update("delete from aviation_money where money_id=?", new Object[]{id});
		
	}

}
