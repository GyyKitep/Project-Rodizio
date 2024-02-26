package br.com.rodizio.controller.form;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.rodizio.module.Categories;
import br.com.rodizio.module.Establishment;
import br.com.rodizio.module.Images;
import br.com.rodizio.repository.CategoriesRepository;
import jakarta.annotation.Nullable;

public class EstablishmentCompletForm {

	private String name;
	private String address;
	private String about;
	private Double price;
	private String location;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	private Timestamp updated_price;
	// @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	// private Timestamp created_at;
	// @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	// private Timestamp updated_at;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_mon;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_tue;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_wed;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_thu;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_fri;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_sat;
	@JsonFormat(pattern = "HH:mm:ss")
	private Time opening_h_sun;

	private Set<Categories> categories;

	public EstablishmentCompletForm(EstablishmentForm form, CategoriesRepository categoriesRepository) {
		this.name = form.getName();
		this.address = form.getAddress();
		this.about = form.getAbout();
		this.price = form.getPrice();
		this.location = form.getLocation();

		this.opening_h_mon = form.getOpening_h_mon();
		this.opening_h_tue = form.getOpening_h_tue();
		this.opening_h_wed = form.getOpening_h_wed();
		this.opening_h_thu = form.getOpening_h_thu();
		this.opening_h_fri = form.getOpening_h_fri();
		this.opening_h_sat = form.getOpening_h_sat();
		this.opening_h_sun = form.getOpening_h_sun();

		this.categories = form.getCategories().stream().map(categorie -> categoriesRepository.findById(categorie.getId()))
				.filter(Optional::isPresent).map(Optional::get).collect(Collectors.toSet());

	}

	public EstablishmentCompletForm(Establishment establishment) {
		this.name = establishment.getName();
		this.address = establishment.getAddress();
		this.about = establishment.getAbout();
		this.price = establishment.getPrice();
		this.location = establishment.getLocation();

		this.opening_h_mon = establishment.getOpening_h_mon();
		this.opening_h_tue = establishment.getOpening_h_tue();
		this.opening_h_wed = establishment.getOpening_h_wed();
		this.opening_h_thu = establishment.getOpening_h_thu();
		this.opening_h_fri = establishment.getOpening_h_fri();
		this.opening_h_sat = establishment.getOpening_h_sat();
		this.opening_h_sun = establishment.getOpening_h_sun();

		this.categories = establishment.getCategories();
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAbout() {
		return about;
	}

	public Double getPrice() {
		return price;
	}

	public String getLocation() {
		return location;
	}

	public Timestamp getUpdated_price() {
		return updated_price;
	}

	public Time getOpening_h_mon() {
		return opening_h_mon;
	}

	public Time getOpening_h_tue() {
		return opening_h_tue;
	}

	public Time getOpening_h_wed() {
		return opening_h_wed;
	}

	public Time getOpening_h_thu() {
		return opening_h_thu;
	}

	public Time getOpening_h_fri() {
		return opening_h_fri;
	}

	public Time getOpening_h_sat() {
		return opening_h_sat;
	}

	public Time getOpening_h_sun() {
		return opening_h_sun;
	}

	public Set<Categories> getCategories() {
		return categories;
	}

	public void changeCategories(EstablishmentForm form, CategoriesRepository categoriesRepository) {
		this.categories = form.getCategories().stream().map(categorie -> categoriesRepository.findById(categorie.getId()))
				.filter(Optional::isPresent).map(Optional::get).collect(Collectors.toSet());
		
	}

}
