package service;

import java.util.Date;
import java.util.List;

import bean.LlamadaDTO;
import dao.DAOFactory;
import dao.LlamadaDAO;

public class LlamadaServiceImpl implements LlamadaService{

	DAOFactory fabrica = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
	LlamadaDAO llamadaDAO = fabrica.getLlamadaDAO();
	@Override
	
	public List<LlamadaDTO> listaLlamadasxNum(String numero) throws Exception {
		// TODO Auto-generated method stub
		return llamadaDAO.listaLlamadasxNum(numero);
	}
@Override
	
	public List<LlamadaDTO> listaLlamadasxNumYFec(String numero,Date fecha1,Date fecha2) throws Exception {
		// TODO Auto-generated method stub
		return llamadaDAO.listaLlamadasxNumYFec(numero,fecha1,fecha2);
	}
}
