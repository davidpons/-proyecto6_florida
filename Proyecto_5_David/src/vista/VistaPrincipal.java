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
	
	//El Modelo de usuarios para el combobox
	private UsuariosModel usuarios;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("unchecked")
	public VistaPrincipal() {
		setLayout(null);
		
		txtJuegos = new JTextField();
		txtJuegos.setToolTipText("La contrase\u00F1a debe contener diversos car\u00E1cteres.");
		txtJuegos.setHorizontalAlignment(SwingConstants.CENTER);
		txtJuegos.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		txtJuegos.setBounds(28, 280, 149, 30);
		add(txtJuegos);
		//txtJuegos.setColumns(10);
		
		JButton btnJuegos = new JButton("Juegos>");
		btnJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJuegos.setBounds(258, 64, 135, 23);
		add(btnJuegos);
		
		JButton btnPerfil = new JButton("Perfil>");
		btnPerfil.setBounds(258, 98, 135, 23);
		add(btnPerfil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(28, 208, 149, 23);
		add(comboBox);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(35, 183, 79, 14);
		add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(35, 256, 66, 14);
		add(lblContrasea);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.setBounds(28, 338, 135, 23);
		add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setEnabled(false);
		btnRegistrarse.setBounds(28, 375, 135, 23);
		add(btnRegistrarse);
		
		border = LineBorder.createGrayLineBorder();
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/images/avatar_1.jpg")));
		lblAvatar.setBounds(22, 11, 181, 161);
		
		lblAvatar.setBorder(border);
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
