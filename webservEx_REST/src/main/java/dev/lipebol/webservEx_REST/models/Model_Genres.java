package dev.lipebol.webservEx_REST.models;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("genres")
public class Model_Genres {
	
	@Id
	private String _id;
	private String name;
	private String url;
	
	public Model_Genres(String _id, String name, String url) {
		super();
		this._id = _id;
		this.name = name;
		this.url = url;
	}
	
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
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
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
		Model_Genres other = (Model_Genres) obj;
		return Objects.equals(_id, other._id);
	}
	
}
