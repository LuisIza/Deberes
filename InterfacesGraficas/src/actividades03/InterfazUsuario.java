package actividades03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

public class InterfazUsuario extends JFrame {
	
	public InterfazUsuario () {
		super("Selección de modelo");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		String modelos[] = {"Peugeot","Volkswagen","Renault","Seat",
				"Ferrari","Porsche","Jaguar","Dacia","Fiat"};
		
		JList <String>lista = new JList(modelos);
		JScrollPane panel = new JScrollPane(lista);
		JLabel lblModelo = new JLabel("Modelo?");
		
	
		add(panel);
		add(lblModelo);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		InterfazUsuario ventana = new InterfazUsuario();

	}

}