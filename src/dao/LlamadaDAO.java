package dao;

import java.util.Date;
import java.util.List;

import bean.LlamadaDTO;

public interface LlamadaDAO {

	
	List<LlamadaDTO> listaLlamadasxNum(String numero) throws Exception;

	List<LlamadaDTO> listaLlamadasxNumYFec(String numero, Date fecha1,
			Date fecha2);
}
