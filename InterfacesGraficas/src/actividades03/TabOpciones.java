package actividades03;

import java.awt.*;
import javax.swing.*;

public class TabOpciones extends JFrame {
	
	public TabOpciones () {
		super("Asistente matemático");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout (new FlowLayout ());
		
		//PESTAÑA EDITOR		
		JPanel panelEditor = new JPanel();
		JCheckBox chx1 = new JCheckBox("Resaltar palabras clave");
		JCheckBox chx2 = new JCheckBox("Guardar como XML");
		panelEditor.add(chx1);
		panelEditor.add(chx2);
		panelEditor.setLayout(new FlowLayout(FlowLayout.LEFT));
		ImageIcon imgEditor = new ImageIcon("imgs/73.png");
		
		//PESTAÑA VENTANAS
		JPanel panelVentanas = new JPanel();
		JCheckBox chx3 = new JCheckBox("Mostrar barras laterales");
		JCheckBox chx4 = new JCheckBox("Mostrar barra de menús");
		panelVentanas.add(chx3);
		panelVentanas.add(chx4);
		panelVentanas.setLayout(new FlowLayout(FlowLayout.LEFT));
		ImageIcon imgVentanas = new ImageIcon("imgs/65.png");
		
		//PANEL DE PESTAÑAS
		
		JTabbedPane panelon = new JTabbedPane();
		panelon.addTab("Editor", imgEditor,panelEditor);
		panelon.addTab("Ventanas",imgVentanas,panelVentanas);
		panelon.setPreferredSize(new Dimension(250, 230));

		add(panelon);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TabOpciones ventana = new TabOpciones();

	}

}