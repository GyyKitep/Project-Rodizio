package br.com.rodizio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rodizio.dto.ImageDto;
import br.com.rodizio.module.Images;

@Repository
public interface ImagesRepository  extends JpaRepository<Images, Integer>  {
	
	@Query("SELECT i FROM Images i WHERE i.establishment.id = :id")
    List<ImageDto> findByIdEstablishment(Integer id);


}
