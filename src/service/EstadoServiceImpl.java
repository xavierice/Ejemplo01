package service;

import java.util.List;

import bean.EstadoDTO;
import dao.DAOFactory;
import dao.EstadoDAO;

public class EstadoServiceImpl implements EstadoService{
	
    DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
    EstadoDAO objDAO = objDAOFactory.getEstadoDAO();


	@Override
	public List<EstadoDTO> listaEstados() throws Exception {
		// TODO Auto-generated method stub
		return objDAO.listaEstados();
	}

}
