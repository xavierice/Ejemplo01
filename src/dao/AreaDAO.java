package dao;


import java.util.List;

import bean.AreaDTO;

public interface AreaDAO {

	public abstract void insertar(AreaDTO area) throws Exception;
	
	public  List<AreaDTO> listarAreas() throws Exception;

	public abstract AreaDTO buscarArea(String codigo) throws Exception;

	public abstract void actualiza(AreaDTO area) throws Exception;

	


}
