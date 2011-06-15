package dao;

import java.util.List;

import bean.DocumentoDTO;
import bean.MovimientoDTO;

public interface MovimientoDAO {

	public void insertar(MovimientoDTO movimiento, DocumentoDTO documento) throws Exception;

	public List<MovimientoDTO> listarMovimientos() throws Exception;


}
