package br.com.rodizio.repository;

import org.springframework.stereotype.Repository;

import br.com.rodizio.module.Establishment;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EstablishmentRepository  extends JpaRepository<Establishment, Integer> {

	Optional<Establishment> findById(Integer id); 
}
