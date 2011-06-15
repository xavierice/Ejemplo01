package service;

import java.util.List;

import bean.PasoDTO;
import dao.DAOFactory;
import dao.PasoDAO;

public class PasoServiceImpl implements PasoService {
	 DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		PasoDAO objDAO = objDAOFactory.getPasoDAO();
	@Override
	public List<PasoDTO> listarPasos(String codigo) throws Exception {
		
		System.out.println("el codigo de tramite que llego al servicio pasos imp es "+codigo);
		return objDAO.listarPasos(codigo);
	}

}
