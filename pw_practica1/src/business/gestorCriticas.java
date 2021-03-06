package business;

import java.util.ArrayList;

import Data.Critica;
import Data.Espectaculo;
import Data.Usuario;
import Data.Valoracion;
import DAOS.DAOManager;

public class gestorCriticas {

	private static gestorCriticas instance = null;
	static DAOManager gestor = new DAOManager();
	
	public static gestorCriticas getInstance() {
		if(instance ==  null) {
			instance = new gestorCriticas();
		}
		return instance;
	}
	
	public static void crearCritica(int idCritica, String titulo ,Usuario usuarioRegistrado, Espectaculo espectaculo, String texto, int puntuacion) {
		
		Critica nuevaCritica = new Critica( idCritica, titulo ,usuarioRegistrado,  espectaculo,  texto, puntuacion);
		gestor.getCriticas().insertar(nuevaCritica);

	}
	
	public static ArrayList<Critica> consultarCriticas(){
		return gestor.getCriticas().obtenerTodos();
	}
	
	public static boolean borraCritica(Usuario autorSupuesto, int idCritica) {
		
		Critica criticaAuxiliar = gestor.getCriticas().obtenerCritica(idCritica);
		if(criticaAuxiliar.getAutor() == autorSupuesto) {
			gestor.getCriticas().eliminar(criticaAuxiliar);
			return true;
		}
		
		//si no es el autor no hace nada
		return false;
	}
	
	public static boolean votarUtilidad(Usuario usuarioRegistrado, int valoracionCritica, Critica critica) {
		
		Valoracion nuevaValoracion = new Valoracion(usuarioRegistrado, valoracionCritica, critica.getTexto());
		if(usuarioRegistrado == critica.getAutor()) {
			//no se pueden valorar tus propias criticas
			return false;
		}
		critica.adirValoracion(nuevaValoracion);
		return true;
	}
	
	public ArrayList<Critica> buscarCriticasUsuario(String nickname){
		
		ArrayList<Critica> listaCriticasAuxiliar = new ArrayList<Critica>();
		ArrayList<Critica> todas = gestor.getCriticas().obtenerTodos();
		for(Critica v : todas) {
			
			if(v.getAutor().getNickname() == nickname) {
				listaCriticasAuxiliar.add(v);
			}
			
		}
		
		return listaCriticasAuxiliar;
	}
	
}
