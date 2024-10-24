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

import br.com.rodizio.controller.form.EstablishmentCompletForm;
import br.com.rodizio.controller.form.EstablishmentForm;
import br.com.rodizio.dto.EstablishmentDto;
import br.com.rodizio.dto.ImageDto;
import br.com.rodizio.dto.ReviewDto;
import br.com.rodizio.module.Establishment;
import br.com.rodizio.module.Images;
import br.com.rodizio.module.Reviews;
import br.com.rodizio.repository.CategoriesRepository;
import br.com.rodizio.repository.EstablishmentRepository;
import br.com.rodizio.repository.ImagesRepository;
import br.com.rodizio.repository.ReviewsRepository;

@RestController
@RequestMapping("establishment")
public class EstablishmentController {

	@Autowired
	private EstablishmentRepository establishmentRepository;

	@Autowired
	private CategoriesRepository categoriesRepository;

	@Autowired
	private ImagesRepository imagesRepository;
	
	@Autowired
	private ReviewsRepository reviewsRepository;

	@PostMapping
	public ResponseEntity<EstablishmentDto> register(@RequestBody EstablishmentForm form) {
		EstablishmentCompletForm complete = new EstablishmentCompletForm(form, categoriesRepository);

		Establishment establishment = new Establishment(complete);
		establishmentRepository.save(establishment);

		if (form.getImages() != null && form.getImages().size() > 0) {
			List<Images> images = form.getImages().stream().map(item -> new Images(establishment, item))
					.collect(Collectors.toList());
			imagesRepository.saveAll(images);

		}
		
		if (form.getReviews() != null && form.getImages().size() > 0) {
			List<Reviews> reviews = form.getReviews().stream().map(item -> new Reviews(establishment, item))
					.collect(Collectors.toList());
			reviewsRepository.saveAll(reviews);			
		}

		List<ImageDto> consultaImagens = imagesRepository.findByIdEstablishment(establishment.getId());
		List<ReviewDto> consultaReviews = reviewsRepository.findByIdEstablishment(establishment.getId());

		return ResponseEntity.ok(new EstablishmentDto(establishment, consultaImagens, consultaReviews));
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

		if (form.getImages() != null && form.getImages().size() > 0) {
			List<Images> images = form.getImages().stream().map(item -> new Images(establishment.get(), item))
					.collect(Collectors.toList());
			imagesRepository.saveAll(images);

		}

		List<ImageDto> consultaImagens = imagesRepository.findByIdEstablishment(establishment.get().getId());
		List<ReviewDto> consultaReviews = reviewsRepository.findByIdEstablishment(establishment.get().getId());

		return ResponseEntity.ok(new EstablishmentDto(establishment.get(), consultaImagens, consultaReviews));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		Optional<Establishment> establishment = establishmentRepository.findById(id);

		if (establishment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}
		establishmentRepository.delete(establishment.get());

		return ResponseEntity.ok().build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> detail(@PathVariable Integer id) {
		Optional<Establishment> establishment = establishmentRepository.findById(id);

		if (establishment.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Não foi encontrado este estabelecimento");
		}
		
		List<ImageDto> consultaImagens = imagesRepository.findByIdEstablishment(establishment.get().getId());
		List<ReviewDto> consultaReviews = reviewsRepository.findByIdEstablishment(establishment.get().getId());

		return ResponseEntity.ok(new EstablishmentDto(establishment.get(), consultaImagens, consultaReviews));
	}

	@GetMapping
	public ResponseEntity<List<EstablishmentDto>> listar() {
		List<Establishment> establishment = establishmentRepository.findAll();

		List<EstablishmentDto> establishmentDtos = establishment.stream().map(
				item -> new EstablishmentDto(item, imagesRepository.findByIdEstablishment(item.getId()),reviewsRepository.findByIdEstablishment(item.getId())))
				.collect(Collectors.toList());

		return ResponseEntity.ok(establishmentDtos);
	}

}
