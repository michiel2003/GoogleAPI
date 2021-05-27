package googleAPI.entitys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepo extends CrudRepository<Marker, Integer>{

}
