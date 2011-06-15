package service;

import java.util.List;

import bean.AsuntoDTO;
import bean.RequisitoDTO;

public interface AsuntoService {

	public void registraAsunto(AsuntoDTO asunto) throws Exception;
	
	public List<AsuntoDTO> listaAsuntoxNombre(String descripcion) throws Exception;

	public AsuntoDTO buscaAsunto(String codigo) throws Exception;

	public void actualizaAsunto(AsuntoDTO asunto) throws Exception;

	public void registraRequisitoAsunto(AsuntoDTO asunto,RequisitoDTO requisito) throws Exception;
	
	
	

}
