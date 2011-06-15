package service;

import java.util.List;

import bean.AreaDTO;


import dao.*;

public class AreaServiceImpl implements AreaService {
	
    DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	AreaDAO objDAO = objDAOFactory.getAreaDAO();

	@Override
	public void registraArea(AreaDTO area) throws Exception {

			objDAO.insertar(area);
			
	}

	@Override
	public List<AreaDTO> listaAreasxNombre() throws Exception {
		return objDAO.listarAreas();
	}

	@Override
	public AreaDTO buscaArea(String codigo) throws Exception {
		return objDAO.buscarArea(codigo);
	}

	@Override
	public void actualizaArea(AreaDTO area) throws Exception {
		objDAO.actualiza(area);
		
	}



	
	}


	

