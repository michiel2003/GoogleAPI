package googleAPI.entitys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends CrudRepository<Logs, Integer>{
	
	

}
