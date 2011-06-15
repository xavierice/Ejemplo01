package service;


import java.util.List;

import dao.DAOFactory;
import dao.RequisitoDAO;
import bean.RequisitoDTO;

public class RequisitoServiceImpl implements RequisitoService {
	
	  DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		
		RequisitoDAO objDAO = objDAOFactory.getRequisitoDAO();

	@Override
	public void registraRequisito(RequisitoDTO req) {
		
		try {
			objDAO.insertar(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<RequisitoDTO> listaAreasxRequisito()
			throws Exception {
		return objDAO.listarRequisitos();
		
	}

	@Override
	public RequisitoDTO buscaRequisito(String codigo) throws Exception {
		return objDAO.buscarRequisito(codigo);
	}

	@Override
	public void actualizaRequisito(RequisitoDTO req) throws Exception {
		objDAO.actualiza(req);
		
	}

	@Override
	public List<RequisitoDTO> listarRequisitosxTramite(String codigo)
			throws Exception {
		System.out.println("el codigo de tramite que llego al servicio requistio imp es "+codigo);
		return objDAO.listarRequisitosxTramite(codigo);
	}

}
