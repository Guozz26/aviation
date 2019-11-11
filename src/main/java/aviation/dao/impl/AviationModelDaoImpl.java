package aviation.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationModelDao;
import aviation.entity.po.AviationModel;
import aviation.entity.po.AviationMoney;
import aviation.entity.po.AviationOrder;

@Repository("aviationModelDaoImpl")
public class AviationModelDaoImpl implements IAviationModelDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
//查询
	@Override
	public AviationModel chess(int ModelId) {
		
		return jdbcTemplate.queryForObject("select * from aviation_Model where model_id=?", 
				new Object[] {(ModelId)},
				new BeanPropertyRowMapper<>(AviationModel.class)
				
				);
	}
//修改和增加
	@Override
	public void ChageModel(AviationModel ModelId) {
		System.out.println(ModelId);
		if(ModelId.getModelId()==0) {
			System.out.println(0);
			jdbcTemplate.update(
					"insert into aviation_model(model_name,model_headnum,model_bodynum) value(?,?,?)", 
					new Object[]{ModelId.getModelName(),ModelId.getModelHeadnum(),ModelId.getModelBodynum()});
		}else {
			jdbcTemplate.update(
					"update aviation_model set model_name=?,model_headnum=?,model_bodynum=?  where model_id=? ", 
					new Object[]{ModelId.getModelName(),ModelId.getModelHeadnum(),ModelId.getModelBodynum(),ModelId.getModelId()});
		}
		
	}
//删除
	@Override
	public int daleteModel(int id) {
		
		return jdbcTemplate.update("delete from aviation_model where model_id=?", new Object[]{id});
		
	}
	
	// - 查询所有的机型
	@Override
	public List<AviationModel> findAll() {
		
		List<AviationModel> lists = jdbcTemplate.query("select * from aviation_model", new BeanPropertyRowMapper<AviationModel>(AviationModel.class));
		return lists;
	}

}
