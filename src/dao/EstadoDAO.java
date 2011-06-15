package dao;

import java.util.List;

import bean.EstadoDTO;



public interface EstadoDAO{

	public  List<EstadoDTO> listaEstados() throws Exception;
}
