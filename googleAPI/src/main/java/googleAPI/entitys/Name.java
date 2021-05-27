package googleAPI.entitys;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "name")
public class Name {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer nameId;
	
	@ManyToOne
	@JoinColumn(name = "marker_id", referencedColumnName = "id")
	public Marker marker;
	
	public Name() {
	}
	
	@OneToOne(mappedBy = "name")
	public Logs log;
	
	@Column(name = "name")
	public String name;

}
