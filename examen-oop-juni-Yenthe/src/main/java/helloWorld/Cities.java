package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Track")
public class Cities {
	
	@Id
	@Column(name = "Trackid")
	private Integer Trackid;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Albumid")
	private Integer Albumid;
	@Column(name = "MediaTypeid")
	private Integer MediaTypeid;
	@Column(name = "Genreid")
	private Integer Genreid;
	@Column(name = "Composer")
	private String Composer;
	
	public Integer getId() {
		return id;
	}
	

	public void setId(Integer Id) {
		this.id = Id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getLatitude() {
		return latitude;
	}


	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}


	public Double getLongitude() {
		return longitude;
	}


	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
}
