package psychologistReview.api.review;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import psychologistReview.api.psychologist.Psychologist;

@Entity
@Table(name = "ReviewTable")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column( name = "ReviewId",nullable = false)
	private Integer id;
	
	@Column( name = "ReviewPosted",nullable = false)
	private Date postTime;
	
	@Column( name = "Review",nullable = false)
	private String review;
	
	@ManyToOne
	private Psychologist psychologist;
	
	public Review() {
		
	}
	
	public Review (int id, String review, String name) {
		
		this.id = id;
		this.setPostTime(new Date());
		this.review = review;
		this.psychologist = new Psychologist(name, 0, 0);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Psychologist getPsychologist() {
		return psychologist;
	}

	public void setPsychologist(Psychologist psychologist) {
		this.psychologist = psychologist;
	}


	public Date getPostTime() {
		return postTime;
	}


	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	
	
	
	
	

}
