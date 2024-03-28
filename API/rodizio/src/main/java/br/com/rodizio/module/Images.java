package br.com.rodizio.module;

import java.sql.Timestamp;

import br.com.rodizio.controller.form.EstablishmentImageForm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Images {
		
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private Establishment establishment;

	@Column(name = "image_data", columnDefinition = "bytea")
	private byte[] image_Data;
	
	private Timestamp created_at;

	public Images() {

	}

	public Images(Establishment establishment, EstablishmentImageForm image) {
		this.establishment = establishment;
		this.created_at = new Timestamp(System.currentTimeMillis());
		this.image_Data = image.convert64ToImage();

	}
	

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Integer getId() {
		return id;
	}

	public void setImageData(byte[] imageData) {
		this.image_Data = imageData;
	}
	
	public byte[] getImage_Data() {
		return image_Data;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

}
