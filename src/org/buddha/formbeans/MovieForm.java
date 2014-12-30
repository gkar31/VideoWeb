package org.buddha.formbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class MovieForm extends ActionForm implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6428120076616168987L;
	
	private int filmId;
	
	private String title;
	private String summary;
	private String pictureUrl;
	private int duration;
	private String categories;
	private String actors;
	private String productor;
	private String is3D;
	
	


	private List<MovieForm> films;





	public List<MovieForm> getBooks() {
		return films;
	}





	public void setFilms(List<MovieForm> pfilms) {
		this.films = pfilms;
	}





	public int getFilmId() {
		return filmId;
	}





	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}





	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getSummary() {
		return summary;
	}





	public void setSummary(String summary) {
		this.summary = summary;
	}





	public String getPictureUrl() {
		return pictureUrl;
	}





	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}





	public int getDuration() {
		return duration;
	}





	public void setDuration(int duration) {
		this.duration = duration;
	}





	public String getCategories() {
		return categories;
	}





	public void setCategories(String categories) {
		this.categories = categories;
	}





	public String getActors() {
		return actors;
	}





	public void setActors(String actors) {
		this.actors = actors;
	}





	public String getProductor() {
		return productor;
	}





	public void setProductor(String productor) {
		this.productor = productor;
	}





	public String getIs3D() {
		return is3D;
	}





	public void setIs3D(String is3d) {
		is3D = is3d;
	}





	public List<MovieForm> getFilms() {
		return films;
	}





	@Override
	public String toString() {
		return "MovieForm [title=" + title + ", summary=" + summary
				+ ", pictureUrl=" + pictureUrl + ", duration=" + duration
				+ ", categories=" + categories + ", actors=" + actors
				+ ", productor=" + productor + ", is3D=" + is3D + "]";
	}

	
	
}
