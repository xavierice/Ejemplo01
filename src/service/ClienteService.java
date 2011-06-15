package service;

import java.util.List;

import bean.ClienteDTO;

public interface ClienteService {

	public abstract List<ClienteDTO> listaClientesPorNombre(String nombre)
			throws Exception;

	public void registraElCliente(ClienteDTO objCliente) throws Exception;

	public ClienteDTO buscaClientePorUsuario(String usuario) throws Exception;
	
	public abstract ClienteDTO actualiza(ClienteDTO cliente) throws Exception;

	

}