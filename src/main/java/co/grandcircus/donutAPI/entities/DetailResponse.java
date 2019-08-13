package co.grandcircus.donutAPI.entities;

import java.util.List;

public class DetailResponse {

	private List<Result> results;

	private Integer calories;

	private List<String> extras;

	private String photo;

	private String photo_attribution;

	public List<Result> getResults() {

		return results;
	}

	public void setResults(List<Result> results) {

		this.results = results;
	}

	public Integer getCalories() {

		return calories;
	}

	public void setCalories(Integer calories) {

		this.calories = calories;
	}

	public List<String> getExtras() {

		return extras;
	}

	public void setExtras(List<String> extras) {

		this.extras = extras;
	}

	public String getPhoto() {

		return photo;
	}

	public void setPhoto(String photo) {

		this.photo = photo;
	}

	public String getPhoto_attribution() {

		return photo_attribution;
	}

	public void setPhoto_attribution(String photo_attribution) {

		this.photo_attribution = photo_attribution;
	}
}
