package br.com.danimlds.hrworker.resources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.danimlds.hrworker.entities.Worker;
import br.com.danimlds.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	
	@Autowired
	private WorkerRepository repository;
	@GetMapping
	public ResponseEntity<java.util.List<Worker>> findAll() {
		java.util.List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <Worker> findById(@PathVariable Long id) {
		
		logger.info("Port = " +env.getProperty("local.server.port"));
		
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
