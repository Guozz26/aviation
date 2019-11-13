package aviation.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aviation.dao.prototype.IAviationVolumeDao;
import aviation.entity.vo.VolumeInfo;
import aviation.service.prototype.IAviationVolumeService;

@Service
public class AviationVolumeServiceImpl implements IAviationVolumeService{

	@Autowired
	private IAviationVolumeDao volumeDao;
	
	// - 查询员工每天的收入情况
	@Override
	public double salesmanVolume(int salesmanId, Date orderTime ,int num) {
		double pirce=0;
		List<VolumeInfo> vis = volumeDao.selectSalesman(salesmanId, orderTime,num);
		for (VolumeInfo volumeInfo : vis) {
			if(volumeInfo.getPriceId() ==1 ) {
				pirce += volumeInfo.getMoneyBodyPrice();
			}else {
				pirce += volumeInfo.getMoneyHeadPrice();
			}
		}
		return pirce;
	}


	@Override
	public double pointVolume(int pointId, Date orderTime,int num) {
		double pirce=0;
		List<VolumeInfo> vis = volumeDao.selectPointVolume(pointId, orderTime,num);
		for (VolumeInfo volumeInfo : vis) {
			if(volumeInfo.getPriceId() ==1 ) {
				pirce += volumeInfo.getMoneyBodyPrice();
			}else {
				pirce += volumeInfo.getMoneyHeadPrice();
			}
		}
		return pirce;
	}


	@Override
	public double allVolume(Date orderTime,int num) {
		double pirce=0;
		List<VolumeInfo> vis = volumeDao.selectVolume(orderTime, num);
		for (VolumeInfo volumeInfo : vis) {
			if(volumeInfo.getPriceId() ==1 ) {
				pirce += volumeInfo.getMoneyBodyPrice();
			}else {
				pirce += volumeInfo.getMoneyHeadPrice();
			}
		}
		return pirce;
	}


}
