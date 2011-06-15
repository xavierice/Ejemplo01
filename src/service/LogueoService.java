package service;

import bean.ClienteDTO;

public interface LogueoService {

	public abstract ClienteDTO validaUsuario(ClienteDTO cliente)
			throws Exception;

}