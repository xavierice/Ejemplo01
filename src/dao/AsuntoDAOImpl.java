package dao;

import java.io.Reader;
import java.util.List;

import bean.AsuntoDTO;
import bean.DetalleAsuntoRequisitoDTO;
import bean.RequisitoDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;



public class AsuntoDAOImpl implements AsuntoDAO {
	
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

	@Override
	public void insertar(AsuntoDTO asunto) throws Exception {
		
try {
	
			
			sqlMap.insert("insertAsunto", asunto);
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

	@Override
	public List<AsuntoDTO> listarAsunto() throws Exception {
		 @SuppressWarnings("unchecked")
		List<AsuntoDTO> asuntos = sqlMap.queryForList("getAsuntos", null);
		return asuntos;
	}

	@Override
	public AsuntoDTO buscarAsunto(String codigo) throws Exception {
		 AsuntoDTO asunto = (AsuntoDTO)sqlMap.queryForObject("getAsunto", codigo);
		 return asunto;
	}

	@Override
	public void actualizaAsunto(AsuntoDTO asunto) throws Exception {
		sqlMap.update("updateAsunto", asunto);
	}

	@Override
	public void registraRequisitoAsunto(AsuntoDTO asunto, RequisitoDTO requisito)
			throws Exception {

	DetalleAsuntoRequisitoDTO detalle=new DetalleAsuntoRequisitoDTO();
		
		if(detalle!=null){
			System.out.println("detalle no es nulo");
		}
		
		detalle.setCod_requisito(requisito.getCod_requisito());
		detalle.setCodigo_tramite(asunto.getCodigo_tramite());
		
		System.out.println("codigo tramite del detalle "+requisito.getCod_requisito());
		
		try {
			
		sqlMap.insert("insertRequisitoAsunto", detalle);
		System.out.println("exito lo logramos");
		}	 catch (Exception e) {
			
			e.printStackTrace();
System.out.println("no inserto detalle");
		}
		
	}
	
	

}
