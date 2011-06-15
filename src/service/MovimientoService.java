package service;

import java.util.List;

import bean.DocumentoDTO;
import bean.MovimientoDTO;

public interface MovimientoService {

	public void registraMovimiento(MovimientoDTO movimiento,DocumentoDTO documento) throws Exception;

	public List<MovimientoDTO> listaMovimientos() throws Exception;

	
}
