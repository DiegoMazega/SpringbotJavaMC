package com.diegomazega.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegomazega.cursomc.domain.Cliente;
import com.diegomazega.cursomc.repositories.ClienteRepository;
import com.diegomazega.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Cliente não encontrando. ID: "+ id
				+". tipo: "+ Cliente.class.getName()));
	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}
}
