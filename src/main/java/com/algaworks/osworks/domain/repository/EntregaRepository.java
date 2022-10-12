package com.algaworks.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.osworks.domain.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>{
	
	//https://blog.algaworks.com/atalhos-e-configuracoes-para-ganhar-produtividade-com-eclipse/
	
	//https://youtu.be/5fWbrB3yOk4?list=PLQe8wR4v_7tZC58MownFvHNoMy8bT-C6W&t=2065
}
