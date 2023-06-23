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
	public Integer Trackid;
	@Column(name = "Name")
	public String Name;
	@Column(name = "Albumid")
	public Integer Albumid;
	@Column(name = "Miliseconds")
	public Integer Miliseconds;
	@Column(name = "Composer")
	public String Composer;
	
	public Integer getTrackId() {
		return Trackid;
	}
	

	public void setId(Integer TrackId) {
		this.Trackid = TrackId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	public Integer getAlbumid() {
		return Albumid;
	}


	public void setAlbumid(Integer Albumid) {
		this.Albumid = Albumid;
	}


	public Integer getMiliseconds() {
		return Miliseconds;
	}


	public void Miliseconds(Integer Miliseconds) {
		this.Miliseconds = Miliseconds;
	}
	public String getComposer() {
		return Composer;
	}


	public void setComposer(String Composer) {
		this.Composer = Composer;
	}

	
	
}
