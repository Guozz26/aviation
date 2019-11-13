package aviation.dao.prototype;

import java.util.Date;
import java.util.List;

import aviation.entity.vo.VolumeInfo;

public interface IAviationVolumeDao {
	// -查询某天某营业点的盈利收入
	List<VolumeInfo> selectPointVolume(int pointId,Date orderDate,int num);
	// -查询某天某员工的盈利收入
	List<VolumeInfo> selectSalesman(int salesmanId,Date orderDate,int num);
	// -查询总收入清空
	List<VolumeInfo> selectVolume(Date orderTime,int num);
	
}
