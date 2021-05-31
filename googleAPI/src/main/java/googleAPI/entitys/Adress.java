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
@Table(name = "adress")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer adressID;
	
	@ManyToOne
	@JoinColumn(name = "marker_id", referencedColumnName = "id")
	public Marker marker;
	
	public Adress() {
	}
	
	@OneToOne(mappedBy = "adress")
	public Logs log;
	
	@Column(name = "street")
	public String street;
	
	@Column(name = "region")
	public String region;
	
	@Column(name = "country")
	public String country;

}
