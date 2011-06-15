package service;

import java.util.List;



import bean.AreaDTO;

public interface AreaService {

	public void registraArea(AreaDTO area) throws Exception;

	public List<AreaDTO> listaAreasxNombre() throws Exception;

	public AreaDTO buscaArea(String codigo) throws Exception;

	public void actualizaArea(AreaDTO area) throws Exception;

	
	

	

}
