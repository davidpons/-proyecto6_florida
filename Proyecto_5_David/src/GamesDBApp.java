import modelo.ConexionDB;
import modelo.UsuariosModel;
import vista.VistaApp;


public class GamesDBApp {

	public GamesDBApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Estableciendo la conexion a la BD.
		ConexionDB gameDB = new ConexionDB("localhost", "proyecto_06", "root", "");
		
		if(gameDB.conectarDB()==true){
			System.out.println("Conectados con éxito");
		}else{
			System.out.println("Error en la conexión");
		}
		
		//Creamos y mostramos la pantalla principal
		VistaApp vista = new VistaApp();
		vista.setVisible(true);
	}

}
