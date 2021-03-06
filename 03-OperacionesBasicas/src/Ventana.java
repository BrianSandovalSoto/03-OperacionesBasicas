import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author Brian DavidSandoval Soto
 *
 */
public class Ventana extends JFrame implements ActionListener{

	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2 = new JTextField();
	
	private JLabel lbN1 = new JLabel("N�mero 1");
	private JLabel lbN2 = new JLabel("N�mero 2");
	private JLabel lbResultado = new JLabel("Resultado");
	
	private JButton btnCalcular = new JButton("Calcular");
	
	private Container c= getContentPane();
	
	private Operaciones op= new Operaciones();
		
	/**
	 * Contructor de la Clase
	 */
	public Ventana(){
		
		super.setTitle("Operaciones");
		super.setSize(320, 480);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE); //para el bot�n de cerrar
		cargarControles();
	}
/**
 * se declaran los objetos
 */
	private void cargarControles() {
		c.setLayout(null); //acomodar los objetos como yo quiera
		lbN1.setBounds(10, 10, 280, 30);
		c.add(lbN1); //se asigna al contenedor
		
		txtN1.setBounds(10, 40, 280,30);
		c.add(txtN1);
		
		lbN2.setBounds(10,80,300,30);
		c.add(lbN2);
		txtN2.setBounds(10,110, 280,30);
		c.add(txtN2);
		
		btnCalcular.setBounds(10, 150, 280, 30);
		c.add(btnCalcular);
		
		lbResultado.setBounds(120,180, 280, 30);
		c.add(lbResultado);
		
		//evento en el bot�n
		btnCalcular.addActionListener(this);
			
	}
/**
 * 
 * evento del btnSumar
 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//JOptionPane.showMessageDialog(null, "Prueba del Bot�n");
		int r=op.sumar(Integer.parseInt(txtN1.getText()), 
				Integer.parseInt(txtN1.getText())
				);
		
		lbResultado.setText(String.format("%s + %s = %d",
				txtN1.getText(),
				txtN2.getText(),
				r));
		
	}
	

}