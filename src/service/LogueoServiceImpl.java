package service;

import bean.ClienteDTO;
import dao.ClienteDAO;
import dao.DAOFactory;

public class LogueoServiceImpl implements LogueoService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	ClienteDAO objClienteDAO = fabrica.getClienteDAO();

	public ClienteDTO validaUsuario(ClienteDTO cliente) throws Exception {
		if(cliente==null){
			System.out.println("el cliente llega nulo al service");
		}else{
			System.out.println("llega el cliente normal al service");
		}
		
		return objClienteDAO.buscaPorUsuario(cliente.getCodigo());
	}
	
}
