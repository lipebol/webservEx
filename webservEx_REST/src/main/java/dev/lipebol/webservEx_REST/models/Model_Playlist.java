package dev.lipebol.webservEx_REST.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("playlist")
public class Model_Playlist {

	@Id
	private String _id;
	private String date;
	private String[] tracks;
	
	
	public String get_id() {
		return _id;
	}
	
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String[] getTracks() {
		return tracks;
	}

	public void setTracks(String[] tracks) {
		this.tracks = tracks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Model_Playlist other = (Model_Playlist) obj;
		return Objects.equals(_id, other._id);
	}
}
