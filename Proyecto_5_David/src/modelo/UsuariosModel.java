package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuariosModel {
	
	private Connection con;
	private Statement instruccion; //Representa la consulta de BD que vamos a lanzar.
	private ResultSet usuariosSet; //Lista de usuarios en formato Sql
	private final String sql="select usuario from usuarios;";
	
	public UsuariosModel(){
		this.con = ConexionDB.getConexion();
	}

	/**
	 * Devolver el listado de usuarios. 
	 * @return
	 */
	public ArrayList getUsuarios() {
		List<String> usuarios = new ArrayList<>();
		
		try {
			instruccion = con.createStatement();
			usuariosSet = instruccion.executeQuery(sql);
			
			while(usuariosSet.next()){
				String usuario = usuariosSet.getString("usuario");
				usuarios.add(usuario);
			}
			
			instruccion.close();
			
			return (ArrayList) usuarios;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
