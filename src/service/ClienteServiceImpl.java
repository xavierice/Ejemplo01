package service;

import java.util.List;
import bean.ClienteDTO;
import dao.ClienteDAO;
import dao.DAOFactory;


public class ClienteServiceImpl implements ClienteService {
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	ClienteDAO objClienteDAO = fabrica.getClienteDAO();
	
	public void registraElCliente(ClienteDTO objCliente) throws Exception {
	
		objClienteDAO.registraCliente(objCliente);
	}	
	
	public List<ClienteDTO> listaClientesPorNombre(String nombre) throws Exception{
		return objClienteDAO.listaPorNombre(nombre);
	}
	
	public ClienteDTO buscaClientePorUsuario(String usuario) throws Exception {
		return objClienteDAO.buscaPorUsuario(usuario);
	}

	@Override
	public ClienteDTO actualiza(ClienteDTO cliente) throws Exception {
		
		return objClienteDAO.actualiza(cliente);
	}



}
