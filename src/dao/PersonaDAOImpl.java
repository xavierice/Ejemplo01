package dao;

import java.io.Reader;
import java.util.List;

import bean.PersonaDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class PersonaDAOImpl implements PersonaDAO{

	private static Reader reader;
	private static SqlMapClient sqlMap;
	
	static{
		try{
			reader= Resources.getResourceAsReader("ConfiguracionIbatis.xml");
			sqlMap= SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void insertar(PersonaDTO persona) throws Exception {
		
	try {
			
			
			sqlMap.insert("insertPersonaFK", persona);
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	
	}
	@Override
	public PersonaDTO buscaPersona(PersonaDTO persona) throws Exception {
		PersonaDTO person = (PersonaDTO) sqlMap.queryForObject("getPersona", null);
		return person;
	}
	@Override
	public List<PersonaDTO> listarPersonas(String nombre_persona)
			throws Exception {
		@SuppressWarnings("unchecked")
		List<PersonaDTO> personas = sqlMap.queryForList("getPersonasIJ",null);
		
		return personas;
	}
	@Override
	public PersonaDTO buscaporDNI(int nro_documento) throws Exception {
		PersonaDTO persona = (PersonaDTO) sqlMap.queryForObject("getPersonaxDNI", nro_documento);
		if(persona==null){
			System.out.println("no encontro persona con ese dni en el dao impl");
			
		}
		if(persona!=null){
			System.out.println("encontro persona con ese dni en el dao impl");
			System.out.println("nombre persona "+persona.getNombre_persona());
		}
		return persona;
	}

	
}
