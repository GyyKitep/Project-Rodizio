package br.com.rodizio.dto;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import br.com.rodizio.module.Categories;
import br.com.rodizio.module.Establishment;

public record EstablishmentDto(Integer id, String name, String address, String about, Double price, String location,
		Timestamp updated_price, Timestamp created_at, Timestamp updated_at, Time opening_h_mon, Time opening_h_tue,
		Time opening_h_wed, Time opening_h_thu, Time opening_h_fri, Time opening_h_sat, Time opening_h_sun,
		Set<Categories> categories, List<ImageDto> imagens, List<ReviewDto> reviews){

	public EstablishmentDto(Establishment establishment, List<ImageDto> imagens, List<ReviewDto> reviews) {
		this(establishment.getId(), establishment.getName(), establishment.getAddress(), establishment.getAbout(),
				establishment.getPrice(), establishment.getLocation(), establishment.getUpdated_price(),
				establishment.getCreated_at(), establishment.getUpdated_at(), establishment.getOpening_h_mon(),
				establishment.getOpening_h_tue(), establishment.getOpening_h_wed(), establishment.getOpening_h_thu(),
				establishment.getOpening_h_fri(), establishment.getOpening_h_sat(), establishment.getOpening_h_sun(),
				establishment.getCategories(), imagens, reviews);
	}

}
