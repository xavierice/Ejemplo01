package service;

import java.util.List;

import bean.DocumentoDTO;
import bean.MovimientoDTO;
import dao.DAOFactory;
import dao.DocumentoDAO;
import dao.MovimientoDAO;

public class MovimientoServiceImpl implements MovimientoService {
	
	DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	MovimientoDAO objDAO = objDAOFactory.getMovimientoDAO();
	DocumentoDAO objDAODocumento = objDAOFactory.getDocumentoDAO();
	@Override
	public void registraMovimiento(MovimientoDTO movimiento, DocumentoDTO documento) throws Exception {
		
		
		objDAO.insertar(movimiento,documento);	
	}
	/*
	 * public void registraMovimiento(MovimientoDTO movimiento,DocumentoDTO documento) throws Exception {
		objDAO.insertar(movimiento);
		objDAODocumento.actualiza(documento);
	}
	 * */
	@Override
	public List<MovimientoDTO> listaMovimientos() throws Exception {
		return objDAO.listarMovimientos();
	}



}
