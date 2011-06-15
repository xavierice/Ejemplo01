package dao;

import java.util.List;

import bean.PasoDTO;

public interface PasoDAO {
	public  List<PasoDTO> listarPasos(String codigo) throws Exception;
}
