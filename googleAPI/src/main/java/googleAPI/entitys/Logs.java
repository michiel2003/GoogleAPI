package googleAPI.entitys;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "logs")
public class Logs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer logId;
	
	@DateTimeFormat
	@Column(name = "tnote")
	public Timestamp timeNote;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "name_id", referencedColumnName = "id")
	public Name name;

}
