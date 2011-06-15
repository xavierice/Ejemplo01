package service;


import java.util.List;

import bean.AsuntoDTO;
import bean.RequisitoDTO;
import dao.AsuntoDAO;
import dao.DAOFactory;

public class AsuntoServiceImpl implements AsuntoService {

	
    DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	AsuntoDAO objDAO = objDAOFactory.getAsuntoDAO();
	@Override
	public void registraAsunto(AsuntoDTO asunto) throws Exception {
	
		objDAO.insertar(asunto);
	}
	@Override
	public List<AsuntoDTO> listaAsuntoxNombre(String descripcion)
			throws Exception {
		return objDAO.listarAsunto();
	}

	@Override
	public AsuntoDTO buscaAsunto(String codigo) throws Exception {
		return objDAO.buscarAsunto(codigo);
	}
	@Override
	public void actualizaAsunto(AsuntoDTO asunto) throws Exception {
		objDAO.actualizaAsunto(asunto);
		
	}
	@Override
	public void registraRequisitoAsunto(AsuntoDTO asunto, RequisitoDTO requisito)
			throws Exception {
		objDAO.registraRequisitoAsunto(asunto,requisito);
		
	}



}
