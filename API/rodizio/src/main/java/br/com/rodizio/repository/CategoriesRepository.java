package br.com.rodizio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodizio.module.Categories;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Integer>{

	Optional<Categories> findById(Integer id); 
	
	
}
