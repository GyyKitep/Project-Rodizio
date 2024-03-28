package br.com.rodizio.controller.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class EstablishmentReviewForm {

	@Min(value = 0, message = "O valor mínimo do serviço deve ser pelo menos 1")
    @Max(value = 10, message = "O valor máximo do serviço deve ser no máximo 10")
	private Integer service;
	
	@Min(value = 0, message = "O valor mínimo dos pratos deve ser pelo menos 1")
    @Max(value = 10, message = "O valor máximo dos pratos  deve ser no máximo 10")	
	private Integer dishes;
	
	@Min(value = 0, message = "O valor mínimo do ambiente deve ser pelo menos 1")
    @Max(value = 10, message = "O valor máximo do ambiente deve ser no máximo 10")	
	private Integer environment;
	
	private String best_dish;
	private String worst_dish;
	
	
	public Integer getService() {
		return service;
	}
	public void setService(Integer service) {
		this.service = service;
	}
	public Integer getDishes() {
		return dishes;
	}
	public void setDishes(Integer dishes) {
		this.dishes = dishes;
	}
	public String getBest_dish() {
		return best_dish;
	}
	public void setBest_dish(String best_dish) {
		this.best_dish = best_dish;
	}
	public String getWorst_dish() {
		return worst_dish;
	}
	public void setWorst_dish(String worst_dish) {
		this.worst_dish = worst_dish;
	}
	public Integer getEnvironment() {
		return environment;
	}
	public void setEnvironment(Integer environment) {
		this.environment = environment;
	}
	
	
}
