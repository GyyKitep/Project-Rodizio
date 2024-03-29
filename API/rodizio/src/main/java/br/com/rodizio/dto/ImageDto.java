package br.com.rodizio.dto;

import java.sql.Timestamp;

import br.com.rodizio.module.Images;

public record ImageDto(Integer id, byte[] image_Data, Timestamp created_at) {

	public ImageDto(Images image) {
		this(image.getId(), image.getImage_Data(), image.getCreated_at());
	}

}
