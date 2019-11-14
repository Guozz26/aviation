package aviation.service.prototype;

import aviation.entity.po.AviationRoot;

public interface IAviationRootService {
	
	AviationRoot find(String name,String password);
}
