package br.com.rodizio.dto;

import java.sql.Timestamp;

import br.com.rodizio.module.Categories;

public record CategoriesDto(Integer id, String name, Timestamp created_at, Timestamp updated_at) {

	public CategoriesDto(Categories categories) {
		this(categories.getId(), categories.getName(), categories.getCreated_at(), categories.getUpdated_at());

	}
}
