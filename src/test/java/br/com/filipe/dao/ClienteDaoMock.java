package br.com.filipe.dao;

import br.com.filipe.domain.Cliente;

public class ClienteDaoMock implements IClienteDao {

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		Cliente cliente = new Cliente();
		cliente.setCpf(cpf);
		return cliente;
	}

}
