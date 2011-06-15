package service;


import java.util.List;

import bean.PersonaDTO;
import dao.DAOFactory;
import dao.PersonaDAO;

public class PersonaServiceImpl implements PersonaService{

DAOFactory objDAOFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	
	PersonaDAO objDAO = objDAOFactory.getPersonaDAO();

	@Override
	public void registraPersona(PersonaDTO persona) throws Exception {
	
		objDAO.insertar(persona);
	}

	@Override
	public PersonaDTO buscaPersona(PersonaDTO persona) throws Exception {
		return objDAO.buscaPersona(persona);
	}

	@Override
	public List<PersonaDTO> listaPersonaPorNombre(String nombre_persona)
			throws Exception {
		return objDAO.listarPersonas(nombre_persona);
	}

	@Override
	public PersonaDTO buscarporDNI(int nro_documento) throws Exception {
	
		return objDAO.buscaporDNI(nro_documento);
	}

	

}
