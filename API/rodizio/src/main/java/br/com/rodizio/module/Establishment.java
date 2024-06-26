package br.com.rodizio.module;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

import br.com.rodizio.controller.form.EstablishmentCompletForm;
import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "establishment")
public class Establishment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private String about;

	@Nullable
	private Double price;

	private String location;

	@Nullable
	private Timestamp updated_price;

	private Timestamp created_at;

	@Nullable
	private Timestamp updated_at;
	@Nullable
	private Time opening_h_mon;
	@Nullable
	private Time opening_h_tue;
	@Nullable
	private Time opening_h_wed;
	@Nullable
	private Time opening_h_thu;
	@Nullable
	private Time opening_h_fri;
	@Nullable
	private Time opening_h_sat;
	@Nullable
	private Time opening_h_sun;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name = "establishment_categories", joinColumns = {
			@JoinColumn(name = "establishment_id") }, inverseJoinColumns = { @JoinColumn(name = "category_id") })
	private Set<Categories> categories;
	
	public Establishment() {
	}

	public Establishment(EstablishmentCompletForm form) {
		this.name = form.getName();
		this.address = form.getAddress();
		this.about = form.getAbout();
		this.price = form.getPrice();
		this.location = form.getLocation();
		this.created_at = new Timestamp(System.currentTimeMillis());

		if (price != null) {
			this.updated_price = this.created_at;
		}

		this.opening_h_mon = form.getOpening_h_mon();
		this.opening_h_tue = form.getOpening_h_tue();
		this.opening_h_wed = form.getOpening_h_wed();
		this.opening_h_thu = form.getOpening_h_thu();
		this.opening_h_fri = form.getOpening_h_fri();
		this.opening_h_sat = form.getOpening_h_sat();
		this.opening_h_sun = form.getOpening_h_sun();
		this.categories = form.getCategories();
	}

	public void updateEstablishment(EstablishmentCompletForm form) {
		this.name = form.getName();
		this.address = form.getAddress();
		this.about = form.getAbout();
		this.location = form.getLocation();
		this.updated_at = new Timestamp(System.currentTimeMillis());

		if (price != form.getPrice()) {
			this.updated_price = this.updated_at;
		}

		this.price = form.getPrice();

		this.opening_h_mon = form.getOpening_h_mon();
		this.opening_h_tue = form.getOpening_h_tue();
		this.opening_h_wed = form.getOpening_h_wed();
		this.opening_h_thu = form.getOpening_h_thu();
		this.opening_h_fri = form.getOpening_h_fri();
		this.opening_h_sat = form.getOpening_h_sat();
		this.opening_h_sun = form.getOpening_h_sun();
		this.categories = form.getCategories();
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getUpdated_price() {
		return updated_price;
	}

	public void setUpdated_price(Timestamp updated_price) {
		this.updated_price = updated_price;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

	public Time getOpening_h_mon() {
		return opening_h_mon;
	}

	public void setOpening_h_mon(Time opening_h_mon) {
		this.opening_h_mon = opening_h_mon;
	}

	public Time getOpening_h_tue() {
		return opening_h_tue;
	}

	public void setOpening_h_tue(Time opening_h_tue) {
		this.opening_h_tue = opening_h_tue;
	}

	public Time getOpening_h_wed() {
		return opening_h_wed;
	}

	public void setOpening_h_wed(Time opening_h_wed) {
		this.opening_h_wed = opening_h_wed;
	}

	public Time getOpening_h_thu() {
		return opening_h_thu;
	}

	public void setOpening_h_thu(Time opening_h_thu) {
		this.opening_h_thu = opening_h_thu;
	}

	public Time getOpening_h_fri() {
		return opening_h_fri;
	}

	public void setOpening_h_fri(Time opening_h_fri) {
		this.opening_h_fri = opening_h_fri;
	}

	public Time getOpening_h_sat() {
		return opening_h_sat;
	}

	public void setOpening_h_sat(Time opening_h_sat) {
		this.opening_h_sat = opening_h_sat;
	}

	public Time getOpening_h_sun() {
		return opening_h_sun;
	}

	public void setOpening_h_sun(Time opening_h_sun) {
		this.opening_h_sun = opening_h_sun;
	}
	
	public Set<Categories> getCategories() {
		return categories;
	}

}
