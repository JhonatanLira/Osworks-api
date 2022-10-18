package com.algaworks.osworks.domain.service;

import java.time.OffsetDateTime;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.algaworks.osworks.domain.model.Cliente;
import com.algaworks.osworks.domain.model.Entrega;
import com.algaworks.osworks.domain.model.StatusEntrega;
import com.algaworks.osworks.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

	private EntregaRepository entregaRepository;
	private CatalogoClienteService catalogoClienteService;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENEDENTE);
		entrega.setDataPedido(OffsetDateTime .now());
		
		return entregaRepository.save(entrega);
	}
}
