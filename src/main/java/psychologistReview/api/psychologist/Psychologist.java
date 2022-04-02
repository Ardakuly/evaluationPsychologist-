package psychologistReview.api.psychologist;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import psychologistReview.api.review.Review;

@Entity
@Table(name = "PsychologistTable")
public class Psychologist {
	
	@Id
	

	@Column( name = "PsychologistName", nullable = false)
	private String name;
	
	@Column( name = "PsychologistRating",nullable = false)
	private int rating;
	
	@Column( name = "PsychologistViews",nullable = false)
	private int views;
	
	
	
	public Psychologist() {
		
	}
	
	public Psychologist(String name, int rating, int views) {
		this.name = name;
		this.rating = rating;
		this.views = views;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	

}
