package dao;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import util.MySqlDBConn;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import bean.ClienteDTO;
import bean.ImagenDTO;
import bean.RequisitoDTO;

public class ImagenDAOImpl implements ImagenDAO {
	
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
	public void registra(ImagenDTO img) throws Exception {

		//	sqlMap.insert("insertImagen",img);
		int resultado =0;
		Connection cn = MySqlDBConn.obtenerConexion();
		String sql = "insert into tb_archivos(codigo,foto,cod_documento,cod_requisito,desc_requisito) values(?,?,?,?,?)";
		
		PreparedStatement pst = cn.prepareStatement(sql);
		pst.setInt(1, img.getCodigo());
		pst.setBinaryStream(2, null,0);
		if(img.getFoto()!=null){
			pst.setBinaryStream(2, img.getIsFoto(),img.getIsFoto().available());
		}
		pst.setInt(3, img.getCod_documento());
		pst.setInt(4, img.getCod_requisito());
		pst.setString(5,img.getDesc_requisito());
		resultado = pst.executeUpdate();
		cn.close();
		
		if(resultado==0){
			System.out.println("no hizo nada");
		}else{
			System.out.println("inserto la imagen");
		}

	}

	@Override
	public List<ImagenDTO> listarImagenesxDocumento(String codigo)
			throws Exception {
		@SuppressWarnings("unchecked")
		 
		List<ImagenDTO> imagenes = sqlMap.queryForList("getImagenesxTram", codigo);
		 System.out.println("el tamaño de imagenes es "+imagenes.size());
		return imagenes;
	}

	@Override
	public ImagenDTO buscarImagen(String codigo) throws Exception {


		ImagenDTO objImagenDTO=null;
		Connection cn = MySqlDBConn.obtenerConexion();
		String sql="SELECT codigo,foto,cod_documento,cod_requisito,desc_requisito FROM tb_archivos where codigo = ?";
		PreparedStatement pst=cn.prepareStatement(sql);
		pst.setString(1,codigo);
		ResultSet rs=pst.executeQuery();
		if(rs.next()){
			objImagenDTO = new ImagenDTO();
			objImagenDTO.setCodigo(rs.getInt(1));
			objImagenDTO.setIsFoto(rs.getBinaryStream(2));
			objImagenDTO.setCod_documento(rs.getInt(3));
			objImagenDTO.setCod_requisito(rs.getInt(4));
			objImagenDTO.setDesc_requisito(rs.getString(5));
		
			if(objImagenDTO.getIsFoto()==null){
				System.out.println("no encontro stream ");
			}else{
				System.out.println("encontro stream");
			}
		
			
		}
		cn.close();		
		return objImagenDTO;
		
		
		
	
	}
	
	
	

	
}
