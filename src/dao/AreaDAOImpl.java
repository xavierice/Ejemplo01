package dao;

import java.io.Reader;
import java.util.List;

import bean.AreaDTO;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;


public class AreaDAOImpl implements AreaDAO {
	
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

	
	public void insertar(AreaDTO area) throws Exception {
		try {	
			sqlMap.insert("insertArea", area);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public List<AreaDTO> listarAreas() throws Exception {
		
		 @SuppressWarnings("unchecked")
		List<AreaDTO> areas = sqlMap.queryForList("getAreas", null);
		 
		return areas;
	}

	@Override
	public AreaDTO buscarArea(String codigo) throws Exception {
		AreaDTO areas = (AreaDTO) sqlMap.queryForObject("getArea", codigo);
		return areas;
	}

	@Override
	public void actualiza(AreaDTO area) throws Exception {
		sqlMap.update("updateArea", area);
	
	}





	


	

	
	

}
