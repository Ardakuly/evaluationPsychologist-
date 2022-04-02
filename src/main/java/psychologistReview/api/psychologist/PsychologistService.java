package psychologistReview.api.psychologist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsychologistService {
	
	@Autowired
	private PsychologistRepository repository;
	
	public List<Psychologist> getAllPsychologists() {
		
		List<Psychologist> psychologistsList = new ArrayList<>();
		
		repository.findAll().forEach((element) -> psychologistsList.add(element));
		
		return psychologistsList;
	}
	
	
	public Optional<Psychologist> getPsychologist(String name) {
		
		return repository.findById(name);
		
	}
	
	
	public void addPsychologist(Psychologist psychologist) {
		
		repository.save(psychologist);
		
	}
	
	public void deletePsychologist(String name) {
		
		repository.deleteById(name);
		
	}
	
	
	
	
}
