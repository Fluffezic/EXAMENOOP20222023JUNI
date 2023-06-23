package helloWorld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Playlist")
public class Playlist {
	
	@Id
	@Column(name = "Playlistid")
	private Integer Playlistid;
	@Column(name = "Name")
	private String Name;

	
	public Integer getPlaylistId() {
		return Playlistid;
	}
	

	public void setPlaylistId(Integer PlaylistId) {
		this.Playlistid = PlaylistId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String Name) {
		this.Name = Name;
	}


	
	
	
	
}