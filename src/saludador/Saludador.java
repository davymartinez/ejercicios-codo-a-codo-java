package saludador;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class Saludador extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField textFieldTexto;
	
	private JLabel labelIngresarNombre = new JLabel("Por favor ingrese su nombre:");
	private JButton btnBotonOK = new JButton("Saludar");
	private JCheckBox checkBoxEntusiasmo = new JCheckBox("Con entusiamo");
	
	private static final long serialVersionUID = 1L;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Saludador frame = new Saludador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Saludador 0.9a");
		setResizable(false);
		
		labelIngresarNombre.setHorizontalAlignment(SwingConstants.CENTER);
		labelIngresarNombre.setFont(new Font("Consolas", Font.BOLD, 18));
		labelIngresarNombre.setBounds(10, 56, 424, 20);
		contentPane.add(labelIngresarNombre);
		
		textFieldTexto = new JTextField();
		textFieldTexto.setForeground(Color.GRAY);
		textFieldTexto.setBounds(147, 87, 140, 20);
		contentPane.add(textFieldTexto);
		textFieldTexto.setColumns(10);
		
		btnBotonOK.setFont(new Font("Consolas", Font.BOLD, 12));
		btnBotonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JButtonSaludarActionPerformed(evt);
			}
		} );
		btnBotonOK.setAction(action);
		btnBotonOK.setBounds(173, 119, 89, 23);
		contentPane.add(btnBotonOK);
		
		checkBoxEntusiasmo.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxEntusiasmo.setBounds(147, 149, 140, 23);
		contentPane.add(checkBoxEntusiasmo);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Saludar");
			putValue(SHORT_DESCRIPTION, "Presione para saludar");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private void JButtonSaludarActionPerformed(ActionEvent evt) {
		if (textFieldTexto.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Pon un nombre... ¬_¬", "ERROR", JOptionPane.ERROR_MESSAGE);
		} else {
			String nombre = textFieldTexto.getText();
			String elSaludo = "Hola " + nombre;
			
			if (checkBoxEntusiasmo.isSelected()) {
				elSaludo += "!!! Capo!!! Idolo!!! Te quiero!!!";
			}
			JOptionPane.showMessageDialog(null, elSaludo, "SALUDANDO", JOptionPane.ERROR_MESSAGE);
		}
	}
}
