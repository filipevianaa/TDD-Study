package br.com.filipe.services;

import br.com.filipe.domain.Cliente;

public interface IClienteService {

	void salvar(Cliente cliente);

	Cliente buscarPorCpf(Long cpf);

	

	
	
	
}
