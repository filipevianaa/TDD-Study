package br.com.filipe.dao;

import br.com.filipe.domain.Cliente;

public interface IClienteDao {

	void salvar(Cliente cliente);
	
	Cliente buscarPorCpf(Long cpf);

}
