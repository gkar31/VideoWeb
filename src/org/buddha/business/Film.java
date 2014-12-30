package org.buddha.business;

public class Film {

	
	private int filmId;
	
	private String title;
	private String summary;
	private String pictureUrl;
	private int duration;
	private String categories;
	private String actors;
	private String director;
	private String is3D;
	
	
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
	
	public String getIs3D() {
		return is3D;
	}
	public void setIs3D(String is3d) {
		is3D = is3d;
	}
	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", summary="
				+ summary + ", pictureUrl=" + pictureUrl + ", duration="
				+ duration + ", categories=" + categories + ", actors="
				+ actors + ", productor=" + director + ", is3D=" + is3D + "]";
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
