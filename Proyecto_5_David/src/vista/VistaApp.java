package vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.CardLayout;


public class VistaApp extends JFrame {

	private JPanel contentPane; //cuadro de app	
	VistaPrincipal vistaPrincipal=new VistaPrincipal(); //se declara la vistaPrincipal
	
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 487);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar); //barra de tareas
		
		JMenu principalMenu = new JMenu("Principal");//menu principal
		menuBar.add(principalMenu);
		
		JMenuItem principalItem = new JMenuItem("Principal"); //submenu principal
		principalMenu.add(principalItem);
		
		JMenu juegosMenu = new JMenu("Juegos");//menu juegos
		menuBar.add(juegosMenu);
		
		JMenuItem listaJuegosItem = new JMenuItem("Lista Juegos"); //submenu lista juegos
		juegosMenu.add(listaJuegosItem);
		
		JMenu perfilMenu = new JMenu("Perfil"); //menu perfil
		menuBar.add(perfilMenu);
		
		JMenuItem perfilItem = new JMenuItem("Perfil"); //submenu perfil
		perfilMenu.add(perfilItem);
		

		contentPane = new JPanel(); //JPanel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); //borde de la app.
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0)); //cardLayout para tener un panel principal y subpaneles.
		
		contentPane.add(vistaPrincipal, "VistaPrincipal"); //carga el panel de vista principal al final
		
			}
}
