package action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import service.AreaService;
import service.DocumentoService;
import service.EstadoService;
import service.ImagenService;
import service.PaqueteBusinessDelegate;
import service.PasoService;
import service.RequisitoService;
import bean.AreaDTO;
import bean.ClienteDTO;
import bean.DocumentoDTO;
import bean.EstadoDTO;
import bean.ImagenDTO;
import bean.PasoDTO;
import bean.PersonaDTO;
import bean.RequisitoDTO;

import com.opensymphony.xwork2.ActionContext;

public class DocumentoAction {

	private Map<String,String> comboAreas;
	
	private DocumentoDTO documento;
	private PersonaDTO persona;
	private List<DocumentoDTO> documentos;
	private DocumentoService servicioDocumento = PaqueteBusinessDelegate.getDocumentoService();
	private List<EstadoDTO> estados;
	private String cod_documento;
	private String codigo_tramite;
	private AreaDTO area;
	private List<AreaDTO> areas;
	private AreaService servicioArea = PaqueteBusinessDelegate.getAreaService();
	private String usuario;
	
	
	
public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public List<AreaDTO> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaDTO> areas) {
		this.areas = areas;
	}

	public AreaService getServicioArea() {
		return servicioArea;
	}

	public void setServicioArea(AreaService servicioArea) {
		this.servicioArea = servicioArea;
	}
	//modificado
	private EstadoService servicioEstado= PaqueteBusinessDelegate.getEstadoService();
	
	
	
	public EstadoService getServicioEstado() {
		return servicioEstado;
	}

	public void setServicioEstado(EstadoService servicioEstado) {
		this.servicioEstado = servicioEstado;
	}

	public List<EstadoDTO> getEstados() {
		return estados;
	}

	public void setEstados(List<EstadoDTO> estados) {
		this.estados = estados;
	}
	private ImagenService servicioImagen = PaqueteBusinessDelegate.getImagenService();
	
	
	public String getCodigo_tramite() {
		return codigo_tramite;
	}

	public void setCodigo_tramite(String codigo_tramite) {
		this.codigo_tramite = codigo_tramite;
	}

	public ImagenService getServicioImagen() {
		return servicioImagen;
	}

	public void setServicioImagen(ImagenService servicioImagen) {
		this.servicioImagen = servicioImagen;
	}
	private RequisitoService servicioRequisito = PaqueteBusinessDelegate.getRequisitoService();
	
	private PasoService servicioPaso = PaqueteBusinessDelegate.getPasoService();
	
	public PasoService getServicioPaso() {
		return servicioPaso;
	}

	public void setServicioPaso(PasoService servicioPaso) {
		this.servicioPaso = servicioPaso;
	}
	
	private ImagenDTO imagen;
	private List<ImagenDTO> imagenes;
	
	
public ImagenDTO getImagen() {
		return imagen;
	}

	public void setImagen(ImagenDTO imagen) {
		this.imagen = imagen;
	}

	public List<ImagenDTO> getImagenes() {
		return imagenes;
	}

	public void setImagenes(List<ImagenDTO> imagenes) {
		this.imagenes = imagenes;
	}
private RequisitoDTO requisito;
private List<RequisitoDTO> requisitos;

	public RequisitoService getServicioRequisito() {
	return servicioRequisito;
}

public void setServicioRequisito(RequisitoService servicioRequisito) {
	this.servicioRequisito = servicioRequisito;
}

public RequisitoDTO getRequisito() {
	return requisito;
}

public void setRequisito(RequisitoDTO requisito) {
	this.requisito = requisito;
}

public List<RequisitoDTO> getRequisitos() {
	return requisitos;
}

public void setRequisitos(List<RequisitoDTO> requisitos) {
	this.requisitos = requisitos;
}
	private PasoDTO paso;
	private List<PasoDTO> pasos;

	public PasoDTO getPaso() {
		return paso;
	}

	public void setPaso(PasoDTO paso) {
		this.paso = paso;
	}

	public List<PasoDTO> getPasos() {
		return pasos;
	}

	public void setPasos(List<PasoDTO> pasos) {
		this.pasos = pasos;
	}
	
	//modificado
	
	
	
	
	
	public String getCod_documento() {
		return cod_documento;
	}
	public void setCod_documento(String cod_documento) {
		this.cod_documento = cod_documento;
	}
	public PersonaDTO getPersona() {
		return persona;
	}
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}
	public DocumentoDTO getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}
	public List<DocumentoDTO> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(List<DocumentoDTO> documentos) {
		this.documentos = documentos;
	}
	public void setServicioDocumento(DocumentoService servicioDocumento) {
		this.servicioDocumento = servicioDocumento;
	}
	public DocumentoService getServicioDocumento() {
		return servicioDocumento;
	}
	
	public String lista(){
		String vista="exito";
		try {
			documentos=servicioDocumento.listarDocumentos();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	public String listaPorArea(){
		String vista="exito";
		try {
			//documentos=servicioDocumento.listarDocumentos();
			
			Map<String, Object> session = ActionContext.getContext().getSession();
		
				ClienteDTO usuario = new ClienteDTO();
				usuario = (ClienteDTO)session.get("b_usuario") ;
				System.out.println("si hay sesion");
			//	System.out.println("usuario que se insertara "+usuario.getUsuario());
			
				//this.usuario = usuario.getUsuario();
			
			//documentos=servicioDocumento.listaPorArea(usuario.getArea());
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	public String cargaVerDocumentos(){
		String vista="exito";
		
		try {
			
			
			
			
	documento = servicioDocumento.buscaDocumento(this.getCod_documento());
System.out.println("codigo de tramite "+documento.getCodigo_tramite());
estados = servicioEstado.listaEstados();
areas = servicioArea.listaAreasxNombre();
		pasos=servicioPaso.listarPasos(documento.getCodigo_tramite()+"");
		
		//requisitos x tramite
		requisitos = servicioRequisito.listarRequisitosxTramite(documento.getCodigo_tramite()+"");
		
		//archivos imagenes registradas
		imagenes = servicioImagen.listarImagenesxDocumento(documento.getCod_documento()+"");
		
		
		System.out.println("encontro documento "+documento.getCodigo_tramite() );
		
		
		if(pasos==null){
			System.out.println("no encontro pasos");
			System.out.println("tamaño de la lista:"+pasos.size());
		}
		if(pasos!=null){
			System.out.println("si encontro pasos");
			System.out.println("tamaño de la lista:"+pasos.size());
			
			Iterator it2 = pasos.iterator();
			while ( it2.hasNext() ) {
			Object objeto = it2.next();
			PasoDTO paso = (PasoDTO)objeto;
			
			
			System.out.println("Codigo :"+paso.getCod_paso());

			System.out.println("Descripcion: "+paso.getDesc_paso());
			
			} 
		
		}

		
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("encontro documento"+documento.getCodigo_tramite() );
		return vista;
	}
	
	
	public String registra(){
		String vista="exito";
		try {
		servicioDocumento.registraDocumento(documento,persona);
		}catch (Exception e){
			
		}
		return vista;
	}
	public void setComboAreas(Map<String,String> comboAreas) {
		this.comboAreas = comboAreas;
	}
	public Map<String,String> getComboAreas() {
		List<AreaDTO> lista;
		try {
			lista = PaqueteBusinessDelegate.getAreaService().listaAreasxNombre();
			for(AreaDTO dto:lista){
				comboAreas.put(String.valueOf(dto.getCod_area()),dto.getNombre_area());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return comboAreas;
	}
	
	public String buscarporDNI(){
		String vista="exito";
		try {
			documentos=  servicioDocumento.buscaxdni(persona.getNro_documento());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	
	public String cargaAgregarReqDocumento(){
		String vista="exito";
		
		try {
	documento = servicioDocumento.buscaDocumento(cod_documento);
	System.out.println("codigo de tramite "+documento.getCodigo_tramite());
	
		
		//requisitos x tramite
		requisitos = servicioRequisito.listarRequisitosxTramite(documento.getCodigo_tramite()+"");
		
		//archivos imagenes registradas
	//	imagenes = servicioImagen.listarImagenesxDocumento(documento.getCod_documento()+"");
		
		
	System.out.println("encontro documento con numero de tramite "+documento.getCodigo_tramite() );
		
		
		if(requisitos==null){
			System.out.println("no encontro requisitos");
			System.out.println("tamaño de la lista:"+requisitos.size());
		}
		if(requisitos!=null){
			System.out.println("si encontro requisitos");
			System.out.println("tamaño de la lista:"+requisitos.size());
			
			Iterator it2 = requisitos.iterator();
			while ( it2.hasNext() ) {
			Object objeto = it2.next();
			RequisitoDTO req = (RequisitoDTO)objeto;
			
			
			System.out.println("Codigo :"+req.getCod_requisito());

			System.out.println("Descripcion: "+req.getDesc_requisito());
			
			} 
		
		}

		
		}catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("encontro documento"+documento.getCodigo_tramite() );
		return vista;
	}
	
	public String actualiza(){
    	String vista="exito";
    	try {
			
			
			servicioDocumento.actualizaDocumento(documento);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return vista;
    }
	
	
	
}
