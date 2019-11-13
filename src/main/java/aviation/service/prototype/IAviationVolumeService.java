package aviation.service.prototype;

import java.util.Date;

public interface IAviationVolumeService {
	
	// -统计每个员工的的日收入
	double salesmanVolume(int salesmanId ,Date orderTime,int num);
	// -统计每个营业点的年收入
	double pointVolume(int pointId,Date orderTime,int num);
	// -统计全部的月收入
	double allVolume(Date orderTime,int num);
}
