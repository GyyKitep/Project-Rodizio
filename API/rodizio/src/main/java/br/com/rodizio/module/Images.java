package br.com.rodizio.module;

import java.sql.Blob;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "establishment")
public class Images {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @ManyToOne
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;
    
    private Blob imageData;
	private Timestamp created_at;
	
	public Integer getId() {
		return id;
	}
	public Establishment getEstablishment() {
		return establishment;
	}
	public Blob getImageData() {
		return imageData;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	
	
    
    
}