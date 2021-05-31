package googleAPI.entitys;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkerRepo extends CrudRepository<Marker, Integer>{
	
	@Query(value = "select * from marker where lat = ?1 and lng = ?2 limit 1", nativeQuery = true)
	Marker FindMarkerByLatLng(Double lat, Double lng);

}
