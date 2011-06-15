package dao;

import java.util.List;

import bean.ClienteDTO;

public interface ClienteDAO {

	public abstract void registraCliente(ClienteDTO objCliente) throws Exception;

	public abstract ClienteDTO buscaPorUsuario(String usuario) throws Exception;

	public abstract List<ClienteDTO> listaPorNombre(String vnombre)
			throws Exception;

	public ClienteDTO actualiza(ClienteDTO cliente) throws Exception;

}