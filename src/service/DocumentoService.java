package service;

import java.util.List;

import bean.DocumentoDTO;
import bean.PersonaDTO;

public interface DocumentoService {

	List<DocumentoDTO> listarDocumentos() throws Exception;

	public void registraDocumento(DocumentoDTO documento, PersonaDTO persona) throws Exception;

	public DocumentoDTO buscaDocumento(String codigo) throws Exception;
	
	List<DocumentoDTO> listaPorArea(String area) throws Exception;
	
	public 	List<DocumentoDTO> buscaxdni(int nro_documento) throws Exception;

	public void actualizaDocumento(DocumentoDTO documento) throws Exception;
	
}
