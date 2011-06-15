package dao;


import java.io.Reader;
import java.util.List;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import bean.ClienteDTO;

public class ClienteDAOImpl implements ClienteDAO  {
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

	public void registraCliente(ClienteDTO objCliente) throws Exception{
		try {
			       
	     	sqlMap.insert("insertUsuario", objCliente);
	} catch (Exception e) {
		
		e.printStackTrace();
		
	         }
	}
	
	public ClienteDTO buscaPorUsuario(String usuario) throws Exception{
		
		if(usuario==null){
			System.out.println("el usuario llega nulo al dao cliente");
		}else{
			System.out.println("el susuario llega bien al dao impl");
		}
		ClienteDTO cliente = (ClienteDTO) sqlMap.queryForObject("getUsuario", usuario);
		if(cliente==null){
			System.out.println("el usuario es nulo, no lo encontro");
		}else{
			System.out.println("si encontro al usuario");
		}
		
		return cliente;
	}
	
	

	@Override
	public List<ClienteDTO> listaPorNombre(String vnombre) throws Exception {
		@SuppressWarnings("unchecked")
		List<ClienteDTO> clientes = sqlMap.queryForList("getUsuarios", null);
		return clientes;
	}

	@Override
	public ClienteDTO actualiza(ClienteDTO cliente ) throws Exception {
		sqlMap.update("updateUsuario", cliente);
		return cliente;
	}



}
