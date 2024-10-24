package br.com.rodizio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rodizio.dto.ReviewDto;
import br.com.rodizio.module.Reviews;

@Repository
public interface ReviewsRepository  extends JpaRepository<Reviews, Integer>  {

	@Query("SELECT i FROM Reviews i WHERE i.establishment.id = :id")
    List<ReviewDto> findByIdEstablishment(Integer id);
	
}
