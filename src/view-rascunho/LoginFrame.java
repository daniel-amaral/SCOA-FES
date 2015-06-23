package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;


import controller.LoginCtrl;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnOk;
	private JPasswordField passwordField;
	private JTextField matriculaField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginPanel frame = new LoginPanel();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setTitle("SCOA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(5, 5, 51, 20);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblLogin);
		
		JLabel lblMatrcula = new JLabel("Matr\u00EDcula:");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatrcula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMatrcula.setBounds(109, 116, 82, 23);
		contentPane.add(lblMatrcula);
		
		matriculaField = new JTextField();
		matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		matriculaField.setBounds(201, 114, 136, 31);
		contentPane.add(matriculaField);
		matriculaField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setBounds(109, 154, 82, 32);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordField.setBounds(201, 155, 136, 31);
		contentPane.add(passwordField);
		
		
		btnOk = new JButton("Ok");
		btnOk.setBounds(287, 293, 93, 23);
		btnOk.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent arg0) {
				LoginCtrl login = new LoginCtrl();
				if(login.login(matriculaField.getText(), passwordField.getText())){
					matriculaField.setText("");
					passwordField.setText("");
//					if(login.checkCategoria(matriculaField.getText()).matches("funcionario")){
						EmployeeHomeFrame employeeHome = new EmployeeHomeFrame();
//						setVisible(false);
//						while(employeeHome.isEnabled()){
//							try {
//								Thread.sleep(2000);
//								System.out.println("waiting...");
//							} catch (Exception e) {
//								// TODO Auto-generated catch block
//								System.out.println("deu chabugo");
//							}
//							}
						setVisible(true);
//					}
					//TODO
//					if(login.checkCategoria(matriculaField.getText()).matches("docente")){
//						EmployeeHome employeeHome = new EmployeeHome();
//					}
					//TODO
//					if(login.checkCategoria(matriculaField.getText()).matches("discente")){
//						EmployeeHome employeeHome = new EmployeeHome();
//					}
				} else{
					JOptionPane.showMessageDialog(null, "Login e/ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
					matriculaField.setText("");
					passwordField.setText("");
				}
				
			}
			
		});
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(382, 293, 93, 23);
		contentPane.add(btnCancelar);
	}
	
	

	public JTextField getMatricula() {
		return matriculaField;
	}
	public JPasswordField getSenha() {
		return passwordField;
	}
}
