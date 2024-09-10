package dev.lipebol.webservEx_REST.models;


import java.util.Map;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("tracks")
public class Model_Tracks {
	
	@Id
	private String _id;
	private String trackid;
	private String length;
	private String artUrl;
	private String album;
	private String artist;
	private Float autoRating;
	private String discNumber;
	private String title;
	private Integer trackNumber;
	private String url;
	private Map<String, String> genres;
	
	
	public String get_id() {
		return _id;
	}
	
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getTrackid() {
		return trackid;
	}
	
	public void setTrackid(String trackid) {
		this.trackid = trackid;
	}
	
	public String getLength() {
		return length;
	}
	
	public void setLength(String length) {
		this.length = length;
	}
	
	public String getArtUrl() {
		return artUrl;
	}
	
	public void setArtUrl(String artUrl) {
		this.artUrl = artUrl;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public Float getAutoRating() {
		return autoRating;
	}
	
	public void setAutoRating(Float autoRating) {
		this.autoRating = autoRating;
	}
	
	public String getDiscNumber() {
		return discNumber;
	}
	
	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getTrackNumber() {
		return trackNumber;
	}
	
	public void setTrackNumber(Integer trackNumber) {
		this.trackNumber = trackNumber;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String> getGenres() {
		return genres;
	}

	public void setGenres(Map<String, String> genres) {
		this.genres = genres;
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
		Model_Tracks other = (Model_Tracks) obj;
		return Objects.equals(_id, other._id);
	}
	
}
