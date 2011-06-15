package bean;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

public class ImagenDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private int cod_documento;
	private int cod_requisito;
	private String desc_requisito;
	
	public int getCod_requisito() {
		return cod_requisito;
	}
	public void setCod_requisito(int cod_requisito) {
		this.cod_requisito = cod_requisito;
	}
	public String getDesc_requisito() {
		return desc_requisito;
	}
	public void setDesc_requisito(String desc_requisito) {
		this.desc_requisito = desc_requisito;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCod_documento() {
		return cod_documento;
	}
	public void setCod_documento(int cod_documento) {
		this.cod_documento = cod_documento;
	}
	
	
	private File foto;
	private String fotoContentType;
	private String fotoFileName;
	private InputStream isFoto;
	
	
	
	public File getFoto() {
		return foto;
	}
	public void setFoto(File foto) {
		this.foto = foto;
	}
	public String getFotoContentType() {
		return fotoContentType;
	}
	public void setFotoContentType(String fotoContentType) {
		this.fotoContentType = fotoContentType;
	}
	public String getFotoFileName() {
		return fotoFileName;
	}
	public void setFotoFileName(String fotoFileName) {
		this.fotoFileName = fotoFileName;
	}
	public InputStream getIsFoto() {
		return isFoto;
	}
	public void setIsFoto(InputStream isFoto) {
		this.isFoto = isFoto;
	}

	
	
	

}
