package dao;


import java.util.List;

import bean.PersonaDTO;



	public interface PersonaDAO {

		public abstract void insertar(PersonaDTO objPersona) throws Exception;

		public abstract PersonaDTO buscaPersona(PersonaDTO persona) throws Exception;

		public abstract List<PersonaDTO> listarPersonas(String nombre_persona) throws Exception;

		public abstract PersonaDTO buscaporDNI(int nro_documento)throws Exception;

	
	
}
