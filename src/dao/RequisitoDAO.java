package dao;

import java.util.List;


import bean.RequisitoDTO;

public interface RequisitoDAO {

	public void insertar(RequisitoDTO req) throws Exception;

	public List<RequisitoDTO> listarRequisitos() throws Exception;

	public RequisitoDTO buscarRequisito(String codigo) throws Exception;

	public abstract void actualiza(RequisitoDTO req) throws Exception;
	
	
	public List<RequisitoDTO> listarRequisitosxTramite(String codigo) throws Exception;
	
	
}
