package com.example.demo.restservice;

import com.example.demo.model.CategoriaModel;
import com.example.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/v1/categorias")
public class CategoriaRestService {
	
	@Autowired
	private CategoriaRepository repo;


	@GetMapping()
	public List<CategoriaModel> findAll(){
		return repo.findAll();
	}  
	
	@GetMapping(value="/{id}")
	public CategoriaModel view(@PathVariable("id") Integer id){
		return repo.findById(id).get();
	}

	@PreAuthorize("hasRole('USER')")
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void add(@RequestBody CategoriaModel e){
		repo.save(e);
	}

	@PatchMapping()
	public void edit(@RequestBody CategoriaModel e){
		repo.save(e);
	}

	@DeleteMapping(value="/{id}")
	public void delete(@PathVariable("id") Integer id){
		repo.deleteById(id);
	}


}
