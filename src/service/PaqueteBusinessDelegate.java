package service;

public class PaqueteBusinessDelegate {

	private PaqueteBusinessDelegate() {
		
	}

	// creamos un metodo estatico que retorne el servicio LogueoService
	public static LogueoService getLogueoService() {
		return new LogueoServiceImpl();
	}

	public static ClienteService getClienteService() {
		return new ClienteServiceImpl();
	}
	
	public static AreaService getAreaService() {
		return new AreaServiceImpl();
	}

	public static RequisitoService getRequisitoService() {
		return new RequisitoServiceImpl();
	}

	public static AsuntoService getAsuntoService() {
		return new AsuntoServiceImpl();
	}
	
	public static PersonaService getPersonaService() {
		return new PersonaServiceImpl();
	}

	public static DocumentoService getDocumentoService() {
		return new DocumentoServiceImpl();
	}

	public static MovimientoService getMovimientoService() {
		return new MovimientoServiceImpl();
	}
	public static EstadoService getEstadoService() {
		return new EstadoServiceImpl();
	}
	
	public static PasoService getPasoService() {
		return new PasoServiceImpl();
	}

	public static ImagenService getImagenService() {
		// TODO Auto-generated method stub
		return new ImagenServiceImpl();
	}
	
	public static LlamadaService getLlamadaService() {
		// TODO Auto-generated method stub
		return new LlamadaServiceImpl();
	}
}
