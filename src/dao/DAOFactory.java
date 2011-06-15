package dao;







public abstract class DAOFactory {
    
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    
    public abstract ClienteDAO getClienteDAO();
    public abstract AreaDAO getAreaDAO();
    public abstract RequisitoDAO getRequisitoDAO();
    public abstract AsuntoDAO getAsuntoDAO(); 
    public abstract EstadoDAO getEstadoDAO(); 
    public abstract PersonaDAO getPersonaDAO();
	public abstract DocumentoDAO getDocumentoDAO();
	public abstract MovimientoDAO getMovimientoDAO();
	public abstract PasoDAO getPasoDAO();
	public abstract ImagenDAO getImagenDAO(); 
	public abstract LlamadaDAO getLlamadaDAO();

	
    public static DAOFactory getDAOFactory(int whichFactory){
       switch(whichFactory){
      	case MYSQL:
       	    return new MySqlDAOFactory();
       	default:
       	    return null;
       }
    }
	

	
	
    
}
