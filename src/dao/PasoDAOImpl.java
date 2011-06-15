package dao;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import bean.AreaDTO;
import bean.PasoDTO;

public class PasoDAOImpl implements PasoDAO{

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
	public static SqlMapClient getSqlMapClient(){
		return sqlMap;
		
	}
	
	
	@Override
	public List<PasoDTO> listarPasos(String codigo) throws Exception {
		
		
		@SuppressWarnings("unchecked")
		 
			List<PasoDTO> pasos = sqlMap.queryForList("getPasosxDoc", codigo);
			 System.out.println("el tamaño de pasos es "+pasos.size());
			return pasos;
	}

}
