package service;

import java.util.List;

import bean.PersonaDTO;

public interface PersonaService {


	public void registraPersona(PersonaDTO persona) throws Exception;

	public PersonaDTO buscaPersona(PersonaDTO persona) throws Exception;

	public List<PersonaDTO> listaPersonaPorNombre(String nombre_persona)
	throws Exception;

	public PersonaDTO buscarporDNI(int nro_documento)throws Exception;


	
}
