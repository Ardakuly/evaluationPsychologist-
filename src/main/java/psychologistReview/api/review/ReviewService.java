package psychologistReview.api.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import psychologistReview.api.psychologist.Psychologist;

@Service
public class ReviewService {
	
	@Autowired
	private ViewRepository repository;
	
	public List<Review> getAllReview(String name) {
		
		List<Review> reviewList = new ArrayList<>();
		
		repository.findByPsychologistName(name).forEach((review)-> reviewList.add(review));
		
		return reviewList;
	}
	
	
	
	public void addReview(Review review) {
		
		repository.save(review);
		
	}
	
	public void deleteReview(Integer id) {
		
		repository.deleteById(id);
		
	}
	
	
	
	
}
