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

public class VistaApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		VistaPrincipal vistaPrincipal = new VistaPrincipal();
		vistaPrincipal.setBounds(0, 21, 434, 428);
		contentPane.add(vistaPrincipal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 264, 21);
		contentPane.add(menuBar);
		
		JMenu principalMenu = new JMenu("Principal");
		menuBar.add(principalMenu);
		
		JMenuItem principalItem = new JMenuItem("Principal");
		principalMenu.add(principalItem);
		
		JMenu juegosMenu = new JMenu("Juegos");
		menuBar.add(juegosMenu);
		
		JMenuItem listaJuegosItem = new JMenuItem("Lista Juegos");
		juegosMenu.add(listaJuegosItem);
		
		JMenu perfilMenu = new JMenu("Perfil");
		menuBar.add(perfilMenu);
		
		JMenuItem perfilItem = new JMenuItem("Perfil");
		perfilMenu.add(perfilItem);
		
			}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
