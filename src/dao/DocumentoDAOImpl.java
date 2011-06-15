package dao;

import java.io.Reader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import bean.AsuntoDTO;
import bean.DocumentoDTO;
import bean.PersonaDTO;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class DocumentoDAOImpl implements DocumentoDAO {
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
	public List<DocumentoDTO> listarDocumentos() throws Exception {
	@SuppressWarnings("unchecked")
	List<DocumentoDTO> documento = sqlMap.queryForList("getDocumentos", null);
	List<AsuntoDTO> tramite = sqlMap.queryForList("getTramites",null);
	List<DocumentoDTO> estado = sqlMap.queryForList("getEstados", null);
	List<DocumentoDTO> accion = sqlMap.queryForList("getAccion", null);

	return documento;
	}
	
	@Override
	public void insertar(DocumentoDTO documento,PersonaDTO persona) throws Exception {
		
		DocumentoDTO documento1 = null;
		documento.setCod_persona(persona.getCod_persona());
		System.out.println("codigo documento: "+documento.getCod_documento());
		System.out.println("persona: "+documento.getCod_persona());
		System.out.println("tramite: "+documento.getCodigo_tramite());
		System.out.println("fecha: "+documento.getFecha());
		System.out.println("estado: "+documento.getCod_estado());
		System.out.println("observacion: "+documento.getObservacion());
		System.out.println("area actual: "+documento.getArea_actual());
		
		Date fecha = new Date();
		System.out.println ("fecha: "+fecha);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		String dia,mes,annio,dia2,mes2,annio2;
		
		dia = Integer.toString(c1.get(Calendar.DATE));
		mes = Integer.toString(c1.get(Calendar.MONTH));
		annio = Integer.toString(c1.get(Calendar.YEAR));
		
		dia2 = Integer.toString(c2.get(Calendar.DATE));
		mes2 = Integer.toString(c2.get(Calendar.MONTH));
		annio2 = Integer.toString(c2.get(Calendar.YEAR));
		
		System.out.println("Fecha 1: "+dia+" "+mes+" "+annio);
		System.out.println("Fecha 2: "+dia2+" "+mes2+" "+annio2);
		
		documento1 = (DocumentoDTO) sqlMap.queryForObject("getUltimoDocumento", null);
		System.out.println("ultimo dato encontrado "+documento1.getCod_documento());
		
		
		documento1.setCod_documento(documento1.getCod_documento()+1);
		System.out.println("autogenerado  "+documento1.getCod_documento());
		
		documento.setCod_documento(documento1.getCod_documento());
		System.out.println("ESTE es el codigo que se insertara "+documento.getCod_documento());
		
		try {
			if(sqlMap!= null){
				sqlMap.insert("insertDocumentoFKS", documento);	
				System.out.println("paso!!!!!");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(sqlMap);
			System.out.println("esta porkeria se va defrente al catch del documentodao impl");
		}
	}

	@Override
	public DocumentoDTO buscarDocumento(String codigo) throws Exception {
		DocumentoDTO documento = (DocumentoDTO) sqlMap.queryForObject("getDocumento", codigo);
		return documento;
	}

	@Override
	public List<DocumentoDTO> listaPorArea(String area) throws Exception {
		List<DocumentoDTO> documento = sqlMap.queryForList("getDocumentosxArea", area);
		return documento;
	}

	@Override
	public List<DocumentoDTO> buscarxdni(int nro_documento) throws Exception {
		 List<DocumentoDTO> documento = (List<DocumentoDTO>) sqlMap.queryForList("getDocumentoxDNI",nro_documento);
		return documento;
	}

	@Override
	public void actualiza(DocumentoDTO documento) throws Exception {
		sqlMap.update("updateDocumento",documento);
		
	}

	
	
}
