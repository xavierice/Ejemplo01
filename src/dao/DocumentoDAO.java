package dao;

import java.util.List;

import bean.DocumentoDTO;
import bean.PersonaDTO;

public interface DocumentoDAO {

	List<DocumentoDTO> listarDocumentos() throws Exception;

	
	public void insertar(DocumentoDTO documento,PersonaDTO persona) throws Exception;

	public abstract DocumentoDTO buscarDocumento(String codigo) throws Exception;
	/*
	public abstract DocumentoDTO autogeneraCodigo() throws Exception;
	*/
	List<DocumentoDTO> listaPorArea(String area) throws Exception;

	List<DocumentoDTO> buscarxdni(int nro_documento)throws Exception;

	public void actualiza(DocumentoDTO documento) throws Exception;
	
}
