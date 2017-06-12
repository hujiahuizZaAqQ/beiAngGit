package beiang.test.service;
import beiang.test.entity.TestaEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TestaServiceI extends CommonService{
	
 	public void delete(TestaEntity entity) throws Exception;
 	
 	public Serializable save(TestaEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TestaEntity entity) throws Exception;
 	
}
