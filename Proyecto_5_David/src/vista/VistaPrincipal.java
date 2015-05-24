package vista;

import javax.swing.JPanel;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Button;
import java.awt.ScrollPane;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import modelo.UsuariosModel;

public class VistaPrincipal extends JPanel {

	private JTextField txtJuegos;
	private Border border;
	private UsuariosModel usuarios;

	
	public VistaPrincipal() {
		setLayout(null);
		
		txtJuegos = new JTextField();//donde se pone la contraseña vacia
		txtJuegos.setToolTipText("La contraseña debe contener diversos caracteres."); //requisitos de la contraseña
		txtJuegos.setHorizontalAlignment(SwingConstants.CENTER);//fuente de la contraseña
		txtJuegos.setFont(new Font("Sylfaen", Font.PLAIN, 23));//fuente de la contraseña
		txtJuegos.setBounds(28, 280, 149, 30);
		add(txtJuegos);
		
		JButton btnJuegos = new JButton("Juegos>"); //boton para juegos con el JBUTTON
		btnJuegos.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJuegos.setBounds(258, 64, 135, 23);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil>"); //boton para perfil con el JBUTTON
		btnPerfil.setBounds(258, 98, 135, 23);
		add(btnPerfil);
		
		JComboBox comboBox = new JComboBox(); //boton desplegable para usuario con el JLabel
		comboBox.setBounds(28, 208, 149, 23);
		add(comboBox);
		
		JLabel lblUsuario = new JLabel("Usuario"); //texto 'usuario' que hay arriba del desplegable.
		lblUsuario.setBounds(35, 183, 79, 14);
		add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña"); //texto 'contraseña' que hay arriba del JtextField.
		lblContraseña.setBounds(35, 256, 79, 14);
		add(lblContraseña);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);//hacemos que no este visible el boton de login.
		btnLogin.setBounds(28, 338, 135, 23);
		add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setEnabled(false);//hacemos que no este visible el boton de registrarse.
		btnRegistrarse.setBounds(28, 375, 135, 23);
		add(btnRegistrarse);
		
		border = LineBorder.createGrayLineBorder();  //crea el borde del avatar.
		
		JLabel lblAvatar = new JLabel("Avatar");//JLabel donde esta la foto de avatar
		lblAvatar.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/avatar_1.jpg")));//imagen avatar 
		lblAvatar.setBounds(22, 11, 167, 161);
		
		lblAvatar.setBorder(border);//crea el borde del avatar.
		add(lblAvatar);
		
		//TODO: Recuperar items de BD.
		//Creamos el modelo
		usuarios = new UsuariosModel();
		
		//TODO: Cargar combo con los usuarios.
		Iterator<String> it = this.usuarios.getUsuarios().iterator();
		
		while(it.hasNext()){
			String usuario = it.next();
			comboBox.addItem(usuario);
		}
		
	}
}
