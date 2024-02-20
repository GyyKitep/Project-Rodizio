package br.com.rodizio.module;

import java.sql.Timestamp;
import java.util.List;

import br.com.rodizio.controller.form.CategoriesForm;
import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private Timestamp created_at;
	@Nullable
	private Timestamp updated_at;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "categories")
	private List<Establishment> listEstablishment;

	public Categories() {
	}

	public Categories(CategoriesForm form) {
		this.name = form.getName();
		this.created_at = new Timestamp(System.currentTimeMillis());

	}

	public void updateCategorie(CategoriesForm form) {
		this.name = form.getName();
		this.updated_at = new Timestamp(System.currentTimeMillis());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Integer getId() {
		return id;
	}

}
