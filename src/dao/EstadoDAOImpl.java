package dao;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import bean.EstadoDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EstadoDAOImpl implements EstadoDAO {
	
	
	private static Reader reader;
	private static SqlMapClient sqlMap;
	
	static{
		try{
			reader= Resources.getResourceAsReader("ConfiguracionIbatis.xml");
			sqlMap= SqlMapClientBuilder.buildSqlMapClient(reader);
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException ("Error initializing MyAppSqlConfig class. Cause: " + e);
		}
			}
	
	
	
	public List<EstadoDTO> listaEstados() throws Exception {
		 @SuppressWarnings("unchecked")
			List<EstadoDTO> estados = sqlMap.queryForList("getEstados", null);
			 
		 if(estados==null){
				System.out.println("no encontro estados en el dao impl");
				System.out.println("tamaño de la lista:"+estados.size());
			}
			if(estados!=null){
				System.out.println("si encontro estados en el dao impl");
				System.out.println("tamaño de la lista dao imp:"+estados.size());
				
				Iterator it = estados.iterator();
				while ( it.hasNext() ) {
				Object objeto = it.next();
				EstadoDTO estadito = (EstadoDTO)objeto;
				
				
				System.out.println("Codigo Dao :"+estadito.getCod_estado());

				System.out.println("Descripcion dao: "+estadito.getDesc_estado());
				
				} 
				
				
			}
		 
		 
		 
			return estados;
	}

}
