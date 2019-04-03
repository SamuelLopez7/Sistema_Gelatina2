package proyecto;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class programa_postres {
	
	
	public static void main(String args [])
	{
		ventana miVentana=new ventana();
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
	}
	
}

class ventana extends JFrame{
	
	public ventana()
	{
		setBounds(400,250,600,400);
		lamina miLamina=new lamina();
		add(miLamina);
		setVisible(true);
		
	}
		
	
}

class lamina extends JPanel{
     JTextField casilla;
	
	public lamina()
	{
		
	   JLabel texto=new JLabel("Escriba un postre");
	   add(texto);
	   casilla=new JTextField(15);
	   add(casilla);
	   JButton miBoton=new JButton("Guardar");
	   add(miBoton);
	
	   
	}
		
	
}





