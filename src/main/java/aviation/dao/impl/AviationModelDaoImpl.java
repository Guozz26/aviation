package aviation.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import aviation.dao.prototype.IAviationModelDao;
import aviation.entity.po.AviationModel;
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
		if(ModelId.getModelId()==0) {
			jdbcTemplate.update(
					"insert into aviation_model(model_name,model_headnum,model_bodynum) values(?,?,?)", 
					new Object[]{ModelId.getModelName(),ModelId.getModelHeadNum(),ModelId.getModelBodyNum()});
		}else {
			jdbcTemplate.update(
					"update aviation_model set model_name=?,model_headnum=?,model_bodynum=?  where model_id=? ", 
					new Object[]{ModelId.getModelName(),ModelId.getModelHeadNum(),ModelId.getModelBodyNum(),ModelId.getModelId()});
		}
		
	}
//删除
	@Override
	public int daleteModel(int id) {
		
		return jdbcTemplate.update("delete from aviation_model where model_id=?", new Object[]{id});
		
	}

}
