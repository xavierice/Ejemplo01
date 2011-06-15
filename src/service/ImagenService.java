package service;

import java.util.List;

import bean.AreaDTO;
import bean.ImagenDTO;
import bean.RequisitoDTO;

public interface ImagenService {

	public void registra(ImagenDTO img) throws Exception;

	public List<ImagenDTO> listarImagenesxDocumento(String codigo) throws Exception;

	public ImagenDTO buscaImagen(String codigo) throws Exception;
}
