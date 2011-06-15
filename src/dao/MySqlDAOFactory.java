package dao;


public class MySqlDAOFactory extends DAOFactory {

	@Override
	public ClienteDAO getClienteDAO() {
		return new ClienteDAOImpl();
	}

	@Override
	public AreaDAO getAreaDAO() {
		return new AreaDAOImpl();
	}

	@Override
	public RequisitoDAO getRequisitoDAO() {
		return new RequisitoDAOImpl();
	}

	@Override
	public AsuntoDAO getAsuntoDAO() {
		return new AsuntoDAOImpl();
	}

	@Override
	public PersonaDAO getPersonaDAO() {
	
		return new PersonaDAOImpl();
	}

	@Override
	public DocumentoDAO getDocumentoDAO() {
		
		return new DocumentoDAOImpl();
	}

	@Override
	public MovimientoDAO getMovimientoDAO() {
		return new MovimientoDAOImpl();
	}

	@Override
	public EstadoDAO getEstadoDAO() {
		// TODO Auto-generated method stub
		return new EstadoDAOImpl();
	}

	@Override
	public PasoDAO getPasoDAO() {
		// TODO Auto-generated method stub
		return new PasoDAOImpl();
	}
	@Override
	public ImagenDAO getImagenDAO() {
		// TODO Auto-generated method stub
		return new ImagenDAOImpl();
	}
	
	@Override
	public LlamadaDAO getLlamadaDAO() {
		// TODO Auto-generated method stub
		return new LlamadaDAOImpl();
	}
	
}
