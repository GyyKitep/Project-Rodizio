package br.com.rodizio.controller.form;

import java.util.Base64;

public class EstablishmentImageForm {

	private String imageData;
	
	public String getImageData() {
		return this.imageData;
	}	
	
	public byte[] convert64ToImage() {		
        byte[] image = Base64.getDecoder().decode(this.imageData);
        return image;
	}
}
