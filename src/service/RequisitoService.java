package service;

import java.util.List;


import bean.RequisitoDTO;

public interface RequisitoService {

	public void registraRequisito(RequisitoDTO req) throws Exception;

	public List<RequisitoDTO> listaAreasxRequisito() throws Exception;
	
	public List<RequisitoDTO> listarRequisitosxTramite(String codigo) throws Exception;

	public RequisitoDTO buscaRequisito(String codigo) throws Exception;
	
	public void actualizaRequisito(RequisitoDTO req) throws Exception;
}
