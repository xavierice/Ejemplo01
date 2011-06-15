package dao;

import java.io.Reader;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.ClaseBusqueda;
import bean.LlamadaDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class LlamadaDAOImpl  implements  LlamadaDAO {
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
	
	
	public List<LlamadaDTO> listaLlamadasxNum(String numero) throws Exception {
		System.out.println("busca en el dao imp con este numero "+numero);
		List<LlamadaDTO> llamadas = sqlMap.queryForList("getLlamada", numero);
		System.out.println("llamadas en dao imp :" + llamadas.size());
		return llamadas;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<LlamadaDTO> listaLlamadasxNumYFec(String numero, Date fecha1,
			Date fecha2) {
		System.out.println("busca en el dao imp con este numero "+numero+ " y en estas fechas" +fecha1+" y "+ fecha2);
		
		ClaseBusqueda obj = null;
		obj=new ClaseBusqueda();
		obj.setPhonenumber(numero);
		obj.setFecha1(fecha1);
		obj.setFecha2(fecha2);
		System.out.println("el objeto tiene: ");
		System.out.println(obj.getPhonenumber());
		System.out.println(obj.getFecha1());
		System.out.println(obj.getFecha2());
		
		/*
		Map param = new HashMap();
		param.put("num",numero); 
		param.put("fec1",fecha1);
		param.put("fec2",fecha2);
		*/
		
		List<LlamadaDTO> llamadas=null;
		
			try {
				llamadas = 	sqlMap.queryForList("getLlamadasxFec", obj);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("llamadas en dao imp :" + llamadas.size());
			
	
		
		return llamadas;
	}
	
}
