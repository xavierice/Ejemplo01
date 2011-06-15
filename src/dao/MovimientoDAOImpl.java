package dao;

import java.io.Reader;
import java.util.List;

import bean.AsuntoDTO;
import bean.DocumentoDTO;
import bean.MovimientoDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class MovimientoDAOImpl implements MovimientoDAO {
	
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
	public void insertar(MovimientoDTO movimiento,DocumentoDTO documento) throws Exception {
	
	 movimiento.setCod_documento(documento.getCod_documento());
		movimiento.setCod_accion(1);
		
		sqlMap.insert("insertMovimientoFK", movimiento);
		
	}
	@Override
	public List<MovimientoDTO> listarMovimientos() throws Exception {
		@SuppressWarnings("unchecked")
		List<MovimientoDTO> movimientos = sqlMap.queryForList("getMovimientos", null);
		List<AsuntoDTO> tramite = sqlMap.queryForList("getTramites",null);
		return movimientos;
	}


}
