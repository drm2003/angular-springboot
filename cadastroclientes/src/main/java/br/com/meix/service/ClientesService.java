package br.com.meix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meix.model.Cliente;
import br.com.meix.repository.ClientesRepository;

@Service
public class ClientesService {
	@Autowired
	private ClientesRepository repository;

	public void salvarCliente(Cliente cliente) {
		validarCliente(cliente);

		this.repository.persistir(cliente);
	}

	public void validarCliente(Cliente cliente) {
		// TODO aplica validações
	}
}