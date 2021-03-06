package DAOS;

import java.io.FileNotFoundException;
import java.io.IOException;

import ficheros.DMCriticaDAO;
import ficheros.DMEspectaculoDAO;
import ficheros.DMUsuarioDAO;

public class DAOManager {

	private static DAOManager instance = null;
	
	private DMUsuarioDAO usuarios = null;
	private DMCriticaDAO criticas = null;
	private DMEspectaculoDAO espectaculos;

	
	public DAOManager() {}
	
	public static DAOManager getInstance() {
		
		if(instance == null) {
			instance = new DAOManager();
		}
		
		return instance;
	}

	public DMUsuarioDAO getUsuarios() {
		if(usuarios == null){
            usuarios = new DMUsuarioDAO();
        }
		return usuarios;
	}

	public DMCriticaDAO getCriticas() {
		if(criticas == null){
			criticas = new DMCriticaDAO();
        }
		return criticas;
	}

	public DMEspectaculoDAO getEspectaculos() {
		
		if(espectaculos == null) {
			espectaculos = new DMEspectaculoDAO();
		}
		return espectaculos;
	}
	
	public void guardarFicheros() throws IOException, IOException {
		
		usuarios.guardarFichero();
		criticas.guardarFichero();
		
	}
	
}
