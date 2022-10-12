package com.algaworks.osworks.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome);// pesquisa por nome específico
	List<Cliente> findByNomeContaining(String nome);// pesquisa por nome usando %like
	Optional<Cliente> findByEmail(String email);
}
