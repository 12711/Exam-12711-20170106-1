package com.lsm.dto;

/*电影实体类*/
public class Film {
	private Integer filmId;
	private String title;
	private String description;
	private String languageName;
	private Integer languageId;

	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getLanguageName() {
		return languageName; 
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", description=" + description + ", languageName="
				+ languageName + "]";
	}
   
}
