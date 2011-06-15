package service;

import java.util.List;

import bean.DocumentoDTO;
import bean.PersonaDTO;
import dao.DAOFactory;
import dao.DocumentoDAO;

public class DocumentoServiceImpl implements DocumentoService {
	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	DocumentoDAO documentoDAO = fabrica.getDocumentoDAO();
	@Override
	public List<DocumentoDTO> listarDocumentos() throws Exception{
		
		return documentoDAO.listarDocumentos();
	}
	@Override
	public void registraDocumento(DocumentoDTO documento,PersonaDTO persona) throws Exception {
		
		documentoDAO.insertar(documento,persona);
	}
	@Override
	public DocumentoDTO buscaDocumento(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return documentoDAO.buscarDocumento(codigo);
	}
	@Override
	public List<DocumentoDTO> listaPorArea(String area) throws Exception {
		// TODO Auto-generated method stub
		return documentoDAO.listaPorArea(area);
	}
	
	@Override
	public List<DocumentoDTO> buscaxdni(int nro_documento) throws Exception {
		
		return documentoDAO.buscarxdni(nro_documento);
	}
	@Override
	public void actualizaDocumento(DocumentoDTO documento) throws Exception {
		documentoDAO.actualiza(documento);
	}
	
	/*
	public DocumentoDTO autogeneraCodigo() throws Exception {
		
		
		return documentoDAO.autogeneraCodigo();
	}
*/
}
