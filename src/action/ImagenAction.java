package action;

import java.io.InputStream;

import service.ImagenService;
import service.PaqueteBusinessDelegate;
import service.RequisitoService;
import bean.ImagenDTO;
import bean.RequisitoDTO;

import com.opensymphony.xwork2.ActionSupport;

public class ImagenAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
   private InputStream imagen;
   private ImagenService servicioimagen = PaqueteBusinessDelegate.getImagenService();
   
  private ImagenDTO imge,img,imagenmostrada;
   private String codigo;
   
   private String cod_documento;
   
   private String cod_requisito;
   
   private RequisitoDTO requisito;
   private RequisitoService serviciorequisito = PaqueteBusinessDelegate.getRequisitoService();

   
   
   public RequisitoDTO getRequisito() {
	return requisito;
}
public void setRequisito(RequisitoDTO requisito) {
	this.requisito = requisito;
}
public RequisitoService getServiciorequisito() {
	return serviciorequisito;
}
public void setServiciorequisito(RequisitoService serviciorequisito) {
	this.serviciorequisito = serviciorequisito;
}
public String getCod_requisito() {
	return cod_requisito;
}
public void setCod_requisito(String cod_requisito) {
	this.cod_requisito = cod_requisito;
}
public String getCod_documento() {
	return cod_documento;
}
public void setCod_documento(String cod_documento) {
	this.cod_documento = cod_documento;
}



public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public ImagenDTO getImagenmostrada() {
	return imagenmostrada;
}
public void setImagenmostrada(ImagenDTO imagenmostrada) {
	this.imagenmostrada = imagenmostrada;
}
public ImagenDTO getImg() {
	return img;
}
public void setImg(ImagenDTO img) {
	this.img = img;
}
public ImagenDTO getImge() {
	return imge;
}
public void setImge(ImagenDTO imge) {
	this.imge = imge;
}
public InputStream getImagen() {
	return imagen;
}
public void setImagen(InputStream imagen) {
	this.imagen = imagen;
}
public ImagenService getServicioimagen() {
	return servicioimagen;
}
public void setServicioimagen(ImagenService servicioimagen) {
	this.servicioimagen = servicioimagen;
}
   
public String insertaimagen() throws Exception{
	String vista="exito";


imge.setCod_documento(Integer.parseInt(cod_documento));
imge.setCod_requisito(Integer.parseInt(cod_requisito));

requisito = serviciorequisito.buscaRequisito(cod_requisito);

imge.setDesc_requisito(requisito.getDesc_requisito());
System.out.println("codigo documento que llego "+cod_documento);
System.out.println("codigo requisito que llego "+cod_requisito);
System.out.println("desc del requisitoDTO "+requisito.getDesc_requisito());
System.out.println("codigo de documento "+imge.getCod_documento());
System.out.println("codigo de requisito "+imge.getCod_requisito());
System.out.println("desc de requisito "+imge.getDesc_requisito());
		//this.imagen=imge.getIsFoto();
	try {
		servicioimagen.registra(imge);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	return vista;
}

//igual a cargamodifica ejemplo clase
public String mostrarImagen() {
	String vista = "exito";
	
	//img.setCod_documento(3);
//	System.out.println("codigo de imagen que buscara: "+img.getCodigo());
	try {

		imge = servicioimagen.buscaImagen(codigo);
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("entro al catch de motrarImagen");
	}
	return vista;
}	

//igual al recuperaImagenCliente
public String recuperaImagen(){
	String vista="exito";
	try {
		imagenmostrada = servicioimagen.buscaImagen(codigo);
		if(imagenmostrada==null){
			System.out.println("no hay imagen mostrada");
		}else{
			System.out.println("si hay imagen mostrada");
		}
		this.imagen = imagenmostrada.getIsFoto();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return vista;
}

public String subeImagenaBD() {
	String vista = "exito";
	
	

	return vista;
}


}
