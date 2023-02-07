package br.com.filipe.services;

import br.com.filipe.dao.ClienteDao;
import br.com.filipe.dao.IClienteDao;
import br.com.filipe.domain.Cliente;

public class ClienteService implements IClienteService {

	
	private IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	@Override
	public void salvar(Cliente cliente) {
		clienteDao.salvar(cliente);

	}

	@Override
	public Cliente buscarPorCpf(Long cpf) {
		return clienteDao.buscarPorCpf(cpf);
	}

}
