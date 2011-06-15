package dao;

import java.util.List;

import bean.AsuntoDTO;
import bean.RequisitoDTO;

public interface AsuntoDAO {
	
	public abstract void insertar(AsuntoDTO asunto) throws Exception;

	public abstract List<AsuntoDTO> listarAsunto() throws Exception;

	public abstract AsuntoDTO buscarAsunto(String codigo) throws Exception;

	public abstract void actualizaAsunto(AsuntoDTO asunto) throws Exception;

	public abstract void registraRequisitoAsunto(AsuntoDTO asunto,RequisitoDTO requisito) throws Exception;
	
}
