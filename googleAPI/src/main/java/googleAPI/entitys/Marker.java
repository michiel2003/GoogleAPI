package googleAPI.entitys;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "marker")
public class Marker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer markerId;
	
	@Column(name = "lat")
	public Double lat;
	
	@Column(name = "lng")
	public Double lng;
	
	@OneToMany(mappedBy = "marker")
	public List<Adress> adress;

	
}
