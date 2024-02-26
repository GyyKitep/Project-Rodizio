package br.com.rodizio.controller.form;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.rodizio.module.Images;

public class EstablishmentForm {

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

	private Set<EstablishmentCategoriesForm> categories;
	private Set<EstablishmentImageForm> images;

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

	public void setUpdated_price(Timestamp updated_price) {
		this.updated_price = updated_price;
	}

	// public Timestamp getCreated_at() {
	// return created_at;
	// }
	// public Timestamp getUpdated_at() {
	// return updated_at;
	// }
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

	public Set<EstablishmentCategoriesForm> getCategories() {
		return categories;
	}

	public Set<EstablishmentImageForm> getImages() {
		return images;
	}

}
