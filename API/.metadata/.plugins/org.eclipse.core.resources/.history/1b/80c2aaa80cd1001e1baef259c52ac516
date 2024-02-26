package br.com.rodizio.controller;

import java.util.List;
import java.util.Optional;

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

import br.com.rodizio.controller.form.EstablishmentCompletForm;
import br.com.rodizio.controller.form.EstablishmentForm;
import br.com.rodizio.dto.EstablishmentDto;
import br.com.rodizio.module.Establishment;
import br.com.rodizio.repository.CategoriesRepository;
import br.com.rodizio.repository.EstablishmentRepository;

@RestController
@RequestMapping("establishment")
public class EstablishmentController {

	@Autowired
	private EstablishmentRepository establishmentRepository;
	
	@Autowired
	private CategoriesRepository categoriesRepository;	

	@PostMapping
	public ResponseEntity<EstablishmentDto> register(@RequestBody EstablishmentForm form) {		
		EstablishmentCompletForm complete = new EstablishmentCompletForm(form, categoriesRepository);
		
		
		Establishment establishment = new Establishment(complete);
		establishmentRepository.save(establishment);
		return ResponseEntity.ok(new EstablishmentDto(establishment));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable Integer id, @RequestBody EstablishmentForm form) {
		Optional<Establishment> establishment = establishmentRepository.findById(id);
		
		if (establishment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}
		
		EstablishmentCompletForm complete = new EstablishmentCompletForm(establishment.get());
		
		complete.changeCategories(form, categoriesRepository);
		
		establishment.get().updateEstablishment(complete);
		establishmentRepository.save(establishment.get());

		return ResponseEntity.ok(new EstablishmentDto(establishment.get()));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		Optional<Establishment> establishment = establishmentRepository.findById(id);

		if (establishment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}
		establishmentRepository.delete(establishment.get());

		return ResponseEntity.ok(new EstablishmentDto(establishment.get()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> detail(@PathVariable Integer id) {
		Optional<Establishment> establishment = establishmentRepository.findById(id);

		if (establishment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}

		return ResponseEntity.ok(new EstablishmentDto(establishment.get()));
	}

	@GetMapping
	public ResponseEntity<List<Establishment>> listar() {
		List<Establishment> establishment = establishmentRepository.findAll();
		return ResponseEntity.ok(establishment);
	}

}
