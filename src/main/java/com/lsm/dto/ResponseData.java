package com.lsm.dto;

import java.util.List;

public class ResponseData<T> {
	private int totle;
	private List<T> films;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseData() {
		super();
	}

	public int getTotle() {
		return totle;
	}

	public void setTotle(int totle) {
		this.totle = totle;
	}

	public List<T> getFilms() {
		return films;
	}

	public void setFilms(List<T> films) {
		this.films = films;
	}

	

}
