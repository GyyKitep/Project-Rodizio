package br.com.rodizio.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodizio.controller.form.CategoriesForm;
import br.com.rodizio.controller.form.EstablishmentForm;
import br.com.rodizio.dto.CategoriesDto;
import br.com.rodizio.dto.EstablishmentDto;
import br.com.rodizio.module.Categories;
import br.com.rodizio.module.Establishment;
import br.com.rodizio.repository.CategoriesRepository;

@RestController
@RequestMapping("categorie")
public class CategoriesController {

	@Autowired
	private CategoriesRepository repository;

	@PostMapping
	public ResponseEntity<CategoriesDto> register(@RequestBody CategoriesForm form) {
		Categories category = new Categories(form);
		repository.save(category);
		return ResponseEntity.ok(new CategoriesDto(category));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable Integer id, @RequestBody CategoriesForm form) {
		Optional<Categories> category = repository.findById(id);

		if (category.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado esta categoria");
		}

		category.get().updateCategorie(form);
		repository.save(category.get());

		return ResponseEntity.ok(new CategoriesDto(category.get()));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		Optional<Categories> category = repository.findById(id);

		if (category.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}
		repository.delete(category.get());

		return ResponseEntity.ok(new CategoriesDto(category.get()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> detail(@PathVariable Integer id) {
		Optional<Categories> category = repository.findById(id);

		if (category.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}

		return ResponseEntity.ok(new CategoriesDto(category.get()));
	}

	@GetMapping
	public ResponseEntity<List<CategoriesDto>> listar() {
		List<Categories> listCategories = repository.findAll();
		List<CategoriesDto> categories = listCategories.stream().map(i -> new CategoriesDto(i))
				.collect(Collectors.toList());
		;

		return ResponseEntity.ok(categories);
	}

}
