package service;
import java.util.List;

import bean.PasoDTO;



public interface PasoService {
	public List<PasoDTO> listarPasos(String codigo) throws Exception;
	
	
	
	
}
