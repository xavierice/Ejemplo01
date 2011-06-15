package action;


import java.util.Iterator;
import java.util.List;

import service.AreaService;
import service.AsuntoService;
import service.DocumentoService;
import service.EstadoService;
import service.PaqueteBusinessDelegate;
import service.PersonaService;
import service.RequisitoService;
import bean.AreaDTO;
import bean.AsuntoDTO;
import bean.DocumentoDTO;
import bean.EstadoDTO;
import bean.PersonaDTO;
import bean.RequisitoDTO;

import com.opensymphony.xwork2.ActionSupport;

public class PersonaAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9132849019679591630L;
	private PersonaDTO persona;
	private DocumentoDTO documento;
	private AsuntoDTO asunto;
	private List<AsuntoDTO> asuntos;
	private List<PersonaDTO> personas;
	private List<EstadoDTO> estados;
	private List<AreaDTO> areas;
	private AreaDTO area;
	private String cod_persona,nro_documento;
	private RequisitoDTO requisito;
	private List<RequisitoDTO> requisitos;
	
	
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

	public RequisitoService getServicioRequisito() {
		return servicioRequisito;
	}

	public void setServicioRequisito(RequisitoService servicioRequisito) {
		this.servicioRequisito = servicioRequisito;
	}

	public DocumentoDTO getDocumento() {
		return documento;
	}

	public void setDocumento(DocumentoDTO documento) {
		this.documento = documento;
	}

	public String getCod_persona() {
		return cod_persona;
	}

	public void setCod_persona(String cod_persona) {
		this.cod_persona = cod_persona;
	}

	public String getNro_documento() {
		return nro_documento;
	}

	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}


	private PersonaService servicioPersona = PaqueteBusinessDelegate.getPersonaService();
private EstadoService servicioEstado= PaqueteBusinessDelegate.getEstadoService();
private AreaService servicioArea = PaqueteBusinessDelegate.getAreaService();	
private DocumentoService servicioDocumento = PaqueteBusinessDelegate.getDocumentoService();
private AsuntoService servicioAsunto = PaqueteBusinessDelegate.getAsuntoService();
private RequisitoService servicioRequisito = PaqueteBusinessDelegate.getRequisitoService();

public AsuntoService getServicioAsunto() {
	return servicioAsunto;
}

public void setServicioAsunto(AsuntoService servicioAsunto) {
	this.servicioAsunto = servicioAsunto;
}

public AsuntoDTO getAsunto() {
	return asunto;
}

public void setAsunto(AsuntoDTO asunto) {
	this.asunto = asunto;
}

public List<AsuntoDTO> getAsuntos() {
	return asuntos;
}

public void setAsuntos(List<AsuntoDTO> asuntos) {
	this.asuntos = asuntos;
}


public PersonaDTO getPersona() {
		return persona;
	}

	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}

	public List<PersonaDTO> getPersonas() {
		return personas;
	}

	public List<EstadoDTO> getEstados() {
		return estados;
	}

	public void setEstados(List<EstadoDTO> estados) {
		this.estados = estados;
	}

	public List<AreaDTO> getAreas() {
		return areas;
	}

	public void setAreas(List<AreaDTO> areas) {
		this.areas = areas;
	}

	public AreaDTO getArea() {
		return area;
	}

	public void setArea(AreaDTO area) {
		this.area = area;
	}

	public AreaService getServicioArea() {
		return servicioArea;
	}

	public void setServicioArea(AreaService servicioArea) {
		this.servicioArea = servicioArea;
	}

	public void setPersonas(List<PersonaDTO> personas) {
		this.personas = personas;
	}

	public PersonaService getServicioPersona() {
		return servicioPersona;
	}

	public void setServicioPersona(PersonaService servicioPersona) {
		this.servicioPersona = servicioPersona;
	}

	public EstadoService getServicioEstado() {
		return servicioEstado;
	}

	public void setServicioEstado(EstadoService servicioEstado) {
		this.servicioEstado = servicioEstado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String registra(){
		String vista="exito";
		try{
			
			servicioPersona.registraPersona(persona);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
		
	}
	
	/**
	 declaracion de metodo(cargamodifica)/servicio
	 */
	public String cargaModifica(){
		String vista="exito";
		try {
			persona = servicioPersona.buscaPersona(this.getPersona());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	/**
	 declaracion de metodo(lista)/servicio
	 */
	public String lista(){
		String vista="exito";
		try {
			personas=servicioPersona.listaPersonaPorNombre(persona.getNombre_persona());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	

	public String buscarporDNI(){
		String vista="exito";
		try {
			persona=servicioPersona.buscarporDNI(persona.getNro_documento());
			estados=servicioEstado.listaEstados();
			areas = servicioArea.listaAreasxNombre();
			asuntos = servicioAsunto.listaAsuntoxNombre("");
			
	
			
			
			//documento=servicioDocumento.autogeneraCodigo();
			
			if(estados==null){
				System.out.println("no encontro estados");
				System.out.println("tamaño de la lista:"+estados.size());
			}
			if(estados!=null){
				System.out.println("si encontro estados");
				System.out.println("tamaño de la lista:"+estados.size());
				
				Iterator it = estados.iterator();
				while ( it.hasNext() ) {
				Object objeto = it.next();
				EstadoDTO estadito = (EstadoDTO)objeto;
				
				
				System.out.println("Codigo :"+estadito.getCod_estado());

				System.out.println("Descripcion: "+estadito.getDesc_estado());
				
				} 
			} 
				if(areas==null){
					System.out.println("no encontro areas");
					System.out.println("tamaño de la lista:"+areas.size());
				}
				if(areas!=null){
					System.out.println("si encontro areas");
					System.out.println("tamaño de la lista:"+areas.size());
					
					Iterator it2 = areas.iterator();
					while ( it2.hasNext() ) {
					Object objeto = it2.next();
					AreaDTO are = (AreaDTO)objeto;
					
					
					System.out.println("Codigo :"+are.getCod_area());

					System.out.println("Descripcion: "+are.getNombre_area());
					
					} 
				
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vista;
	}
	
	
}
