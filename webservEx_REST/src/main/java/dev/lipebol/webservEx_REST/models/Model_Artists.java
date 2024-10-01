package dev.lipebol.webservEx_REST.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("artists")
public class Model_Artists {

	@Id
	private String _id;
	private String name;
	private String profile;
	private String followers;
	private String artUrl;
	private String[] genres;
	
	
	public String get_id() {
		return _id;
	}
	
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getProfile() {
		return profile;
	}
	
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public String getFollowers() {
		return followers;
	}
	
	public void setFollowers(String followers) {
		this.followers = followers;
	}
	
	public String getArtUrl() {
		return artUrl;
	}
	
	public void setArtUrl(String artUrl) {
		this.artUrl = artUrl;
	}
	
	public String[] getGenres() {
		return genres;
	}
	
	public void setGenres(String[] genres) {
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
		Model_Artists other = (Model_Artists) obj;
		return Objects.equals(_id, other._id);
	}
	
}
