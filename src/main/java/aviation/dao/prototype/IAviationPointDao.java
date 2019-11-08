package aviation.dao.prototype;

import java.util.List;

import aviation.entity.po.AviationPoint;

/**
 * 营业点的接口
 * @author 卟嗳
 *
 */

public interface IAviationPointDao {
	   //单个查找营业点
       AviationPoint findOne(int pointId);
       //删除营业点的一条信息
       int  deleteOne(int pointId);
       //插入和更新营业点的一条信息
   	   int saveOrUpdataOne(AviationPoint pointId);
   	   //查询所有的营业点
   	   List<AviationPoint> findAll(int offset, int pageSize);
   	   //获取总条数
   	   int totalItems();
}
