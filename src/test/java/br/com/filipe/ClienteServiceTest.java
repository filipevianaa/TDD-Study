package br.com.filipe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.filipe.dao.ClienteDaoMock;
import br.com.filipe.dao.IClienteDao;
import br.com.filipe.domain.Cliente;
import br.com.filipe.services.ClienteService;
import br.com.filipe.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDao dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12345678910l);
		
		cliente.setNome("Filipe");
		cliente.setCidade("Fortaleza");
		cliente.setEnd("Rua Correia Lima");
		cliente.setEstado("CE");
		cliente.setTel(996201459l);
		
		clienteService.salvar(cliente);
	}
	

	@Test
	public void pesquisarCliente() {
		
		
		
		
		Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
}
