package br.com.rodizio.dto;

import java.sql.Timestamp;

import br.com.rodizio.module.Reviews;

public record ReviewDto(Integer id, Integer service, Integer dishes,  Integer environment, String best_dish, String worst_dish, Timestamp created_at, Timestamp updated_at	) {

	public ReviewDto(Reviews review) {
		this(review.getId(), review.getService(), review.getDishes(), review.getEnvironment(), review.getBest_dish(), review.getWorst_dish(), review.getCreated_at(), review.getUpdated_at());
	}	
}
