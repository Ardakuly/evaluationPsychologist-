package psychologistReview.api.psychologist;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PsychologistController {
	
	@Autowired
	private PsychologistService service;

	@RequestMapping("/psychologists")
	public List<Psychologist> getAllPsychologists() {
		
		return service.getAllPsychologists();
		
	}
	
	@RequestMapping("/psychologists/{name}")
	public Optional<Psychologist> getPsychologist(@PathVariable String name) {
		
		return service.getPsychologist(name);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/psychologists")
	public void addPsycjologist(@RequestBody Psychologist psychologist) {
		
		service.addPsychologist(psychologist);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/psychologists/{name}")
	public void removePsychologist(@PathVariable String name) {
		
		service.deletePsychologist(name);
		
		
	}
	
	
	
}
