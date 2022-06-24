package com.example.demo.restservice;

import com.example.demo.model.MarcaModel;
import com.example.demo.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@RequestMapping("/v1/marcas")
public class MarcaRestService {
	
	@Autowired
	private MarcaRepository repo;
	
	@GetMapping()
	public List<MarcaModel> findAll(){
		return repo.findAll();
	}  
	
	@GetMapping(value="/{id}")
	public MarcaModel view(@PathVariable("id") Integer id){
		return repo.findById(id).get();
	}  
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody MarcaModel e){
		repo.save(e);
	}

	@PutMapping()
	public void edit(@RequestBody MarcaModel e){
		repo.save(e);
	}

	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}


}
