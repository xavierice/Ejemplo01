package service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import dao.DAOFactory;
import dao.ImagenDAO;
import bean.ImagenDTO;

public class ImagenServiceImpl implements ImagenService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	ImagenDAO objImagen = fabrica.getImagenDAO();

	@Override
	public void registra(ImagenDTO img) throws Exception {
		
		
		if(img.getFoto()!=null){
			InputStream tempo = new FileInputStream(img.getFoto());
			img.setIsFoto(tempo);
		}
		objImagen.registra(img);
	}

	@Override
	public List<ImagenDTO> listarImagenesxDocumento(String codigo)
			throws Exception {
		System.out.println("el codigo de tramite que llego al servicio imagen imp es "+codigo);
		return objImagen.listarImagenesxDocumento(codigo);
	}

	@Override
	public ImagenDTO buscaImagen(String codigo) throws Exception {
		// TODO Auto-generated method stub
		return objImagen.buscarImagen(codigo);
	}


}
