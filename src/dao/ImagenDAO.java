package dao;

import java.util.List;

import bean.AreaDTO;
import bean.ImagenDTO;
import bean.RequisitoDTO;



public interface ImagenDAO {

	public void registra(ImagenDTO img) throws Exception;
	
	public List<ImagenDTO> listarImagenesxDocumento(String codigo) throws Exception;
	
	public abstract ImagenDTO buscarImagen(String codigo) throws Exception;

}
