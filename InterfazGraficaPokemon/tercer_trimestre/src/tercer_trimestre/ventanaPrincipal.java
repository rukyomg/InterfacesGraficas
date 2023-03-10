package tercer_trimestre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.ScrollPane;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 123, -336, 5);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(52, 108, 68, 19);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1.setBounds(52, 158, 68, 19);
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contraseña");
		lblNewLabel_1_2.setBounds(52, 204, 90, 19);
		lblNewLabel_1_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("E-Mail");
		lblNewLabel_1_3.setBounds(56, 256, 77, 19);
		lblNewLabel_1_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Teléfono");
		lblNewLabel_1_4.setBounds(56, 310, 68, 19);
		lblNewLabel_1_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(255, 0, 0));
		textField.setBounds(134, 109, 100, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(255, 255, 255));
		textField_3.setBackground(new Color(255, 0, 0));
		textField_3.setBounds(134, 257, 96, 19);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setForeground(new Color(255, 255, 255));
		textField_6.setBackground(new Color(255, 0, 0));
		textField_6.setBounds(134, 311, 96, 19);
		textField_6.setColumns(10);
		contentPane.add(textField_6);
		
		Panel panel = new Panel();
		panel.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		panel.setBounds(0, 0, 504, 75);
		panel.setBackground(new Color(255, 0, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Formulario De Registro");
		lblNewLabel.setBounds(77, 22, 274, 31);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/Pokeball-PNG-Photos (1).png")));
		lblNewLabel_3.setBounds(10, 10, 57, 66);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setBounds(10, 10, 57, 66);
		panel.add(lblNewLabel_3_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acceptar los Términos y Condiciones");
		chckbxNewCheckBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setBounds(52, 365, 254, 32);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(200, 455, 131, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Registrarse");
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setBounds(33, 455, 131, 42);
		contentPane.add(btnNewButton_2);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 0, 0));
		textField_1.setBounds(134, 159, 96, 19);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(255, 0, 0));
		passwordField.setBounds(134, 205, 99, 19);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/Imagenes/Pokemon-GO-comienza-el-maraton-de-eventos-hoy-Nuevas.png")));
		lblNewLabel_4.setBounds(186, 123, 314, 231);
		contentPane.add(lblNewLabel_4);
	}
}
