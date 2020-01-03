package com.products.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.apirest.models.Produto;
import com.products.apirest.repository.ProductRepository;

@RestController
@RequestMapping(value = "/api")
public class ProductResource {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listaProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto buscaProduto(@PathVariable(value = "id") long id) {
		return productRepository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto insertProduct(@RequestBody Produto produto) {
		return productRepository.save(produto);
	}
	
	@PutMapping("/produto")
	public Produto updateProduct(@RequestBody Produto produto) {
		return productRepository.save(produto);
	}
	
	@DeleteMapping("/produto")
	public void deleteProduct(@RequestBody Produto produto) {
		productRepository.delete(produto);
	}

}
