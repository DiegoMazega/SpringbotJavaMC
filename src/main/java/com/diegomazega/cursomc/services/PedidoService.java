package com.diegomazega.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegomazega.cursomc.domain.Pedido;
import com.diegomazega.cursomc.repositories.PedidoRepository;
import com.diegomazega.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = pedidoRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
				"Objeto não encontrado! ID: "+id+", tipo: "+Pedido.class.getName()));
	}
	
	public List<Pedido> findAll(){
		return pedidoRepository.findAll();
	}
}
