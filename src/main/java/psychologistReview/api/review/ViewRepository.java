package psychologistReview.api.review;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ViewRepository extends CrudRepository<Review, Integer>{

	public List<Review> findByPsychologistName(String name);
	
	
}
