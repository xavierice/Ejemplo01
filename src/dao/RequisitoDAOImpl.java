package dao;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;


import bean.PasoDTO;
import bean.RequisitoDTO;

public class RequisitoDAOImpl implements RequisitoDAO {
	
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

	@Override
	public void insertar(RequisitoDTO req) throws ArrayIndexOutOfBoundsException {
		try {
			sqlMap.insert("insertRequisito", req);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<RequisitoDTO> listarRequisitos() throws Exception {

		 @SuppressWarnings("unchecked")
		List<RequisitoDTO> reqs = sqlMap.queryForList("getRequisitos", null);
		return reqs;
	}

	@Override
	public RequisitoDTO buscarRequisito(String codigo) throws Exception {
		RequisitoDTO req = (RequisitoDTO)sqlMap.queryForObject("getRequisito", codigo);
	
		return req;
	}

	@Override
	public void actualiza(RequisitoDTO req) throws Exception {
		sqlMap.update("updateRequisito", req);
		
	}

	@Override
	public List<RequisitoDTO> listarRequisitosxTramite(String codigo)
			throws Exception {
		@SuppressWarnings("unchecked")
		 
		List<RequisitoDTO> requisitos = sqlMap.queryForList("getReqxTram", codigo);
		 System.out.println("el tamaño de pasos es "+requisitos.size());
		return requisitos;
	}

}
