package psychologistReview.api.review;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import psychologistReview.api.psychologist.Psychologist;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService service;

	@RequestMapping("/psychologists/{name}/reviews")
	public List<Review> getAllReview(@PathVariable String name) {
		
		return service.getAllReview(name);
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/psychologists/{name}/reviews")
	public void addReview(@RequestBody Review review, @PathVariable String name) {
		review.setPostTime(new Date());
		review.setPsychologist(new Psychologist(name, 0,0));
		service.addReview(review);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/psychologists/{name}/reviews/{id}")
	public void removeReview(@PathVariable Integer id) {
		
		service.deleteReview(id);
		
		
	}
	
	
	
}
