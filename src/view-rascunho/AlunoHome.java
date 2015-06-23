package view;

import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import java.awt.Font;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import controller.LoginCtrl;

public class AlunoHome extends JFrame{

//	private JFrame frmScoaFuncionrios;
	
	JPanel homePanel;
	JPanel adicionarContaPanel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField loginField;
	private JTextField senhaField;
	private JTextField confirmSenhaField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EmployeeHome window = new EmployeeHome();
//					window.frmScoaFuncionrios.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AlunoHome() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initialize();
					setVisible(true);
					homePanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		frmScoaFuncionrios = new JFrame();
//		frmScoaFuncionrios.setTitle("SCOA - Funcion\u00E1rios");
//		frmScoaFuncionrios.setBounds(100, 100, 850, 500);
//		frmScoaFuncionrios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SCOA - Funcion\u00E1rios");
		setBounds(100, 100, 850, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
//		frmScoaFuncionrios.setJMenuBar(menuBar);
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		JMenu mnUsurios = new JMenu("Usu\u00E1rios");
		mnSistema.add(mnUsurios);
		
		JMenuItem mntmNovaConta = new JMenuItem("Nova conta");
		mntmNovaConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("aqui");
				homePanel.setVisible(false);
				getContentPane().add(adicionarContaPanel);
				adicionarContaPanel.setVisible(true);
			}
		});
		mnUsurios.add(mntmNovaConta);
		
		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar senha");
		mnUsurios.add(mntmAlterarSenha);
		
		JMenuItem mntmExcluirConta = new JMenuItem("Excluir conta");
		mnUsurios.add(mntmExcluirConta);
		mnSistema.add(mntmLogout);
		getContentPane().setLayout(null);
		
		
		homePanel = new JPanel();
		homePanel.setBounds(0, 0, 834, 441);
		getContentPane().add(homePanel);
		homePanel.setLayout(null);
		
		adicionarContaPanel = new JPanel();
		adicionarContaPanel.setBounds(0, 0, 834, 441);
		adicionarContaPanel.setLayout(null);
		getContentPane().add(adicionarContaPanel);
		adicionarContaPanel.setVisible(false);
		
		loginField = new JTextField();
		loginField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		loginField.setBounds(191, 102, 161, 30);
		adicionarContaPanel.add(loginField);
		loginField.setColumns(10);
		
		JLabel matriculaField = new JLabel("Matr\u00EDcula:");
		matriculaField.setHorizontalAlignment(SwingConstants.RIGHT);
		matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		matriculaField.setBounds(74, 102, 105, 27);
		adicionarContaPanel.add(matriculaField);
		
		senhaField = new JPasswordField();
		senhaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		senhaField.setColumns(10);
		senhaField.setBounds(191, 148, 161, 30);
		adicionarContaPanel.add(senhaField);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSenha.setBounds(74, 148, 105, 27);
		adicionarContaPanel.add(lblSenha);
		
		confirmSenhaField = new JPasswordField();
		confirmSenhaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		confirmSenhaField.setColumns(10);
		confirmSenhaField.setBounds(191, 194, 161, 30);
		adicionarContaPanel.add(confirmSenhaField);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar senha:");
		lblConfirmarSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConfirmarSenha.setBounds(51, 194, 128, 27);
		adicionarContaPanel.add(lblConfirmarSenha);
		
		JLabel lblNewLabel = new JLabel("Cadastrar novo usu\u00E1rio");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 182, 19);
		adicionarContaPanel.add(lblNewLabel);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(262, 297, 90, 23);
		adicionarContaPanel.add(btnCancelar);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try{
					if(!senhaField.getText().matches(confirmSenhaField.getText())){
						JOptionPane.showMessageDialog(null, "As senhas digitadas não coincidem", "Erro", JOptionPane.ERROR_MESSAGE);
						senhaField.setText("");
						confirmSenhaField.setText("");
					} else{
						LoginCtrl login = new LoginCtrl();
						if(login.createLogin(loginField.getText().toLowerCase(),
						   senhaField.getText(), buttonGroup.getSelection().getActionCommand())){
							JOptionPane.showMessageDialog(null, "Cadastro efetuado", "Confirmação", JOptionPane.OK_OPTION);
							loginField.setText("");
							senhaField.setText("");
							confirmSenhaField.setText("");
							buttonGroup.clearSelection();
						}
					}
				} catch(MySQLIntegrityConstraintViolationException e){
						JOptionPane.showMessageDialog(null, "Cadastro duplicado\nMatricula já cadastrada.", "Erro", JOptionPane.OK_OPTION);
				} catch(NullPointerException e){
					JOptionPane.showMessageDialog(null, "Verifique se todos os campos estão preenchidos", "Erro", JOptionPane.OK_OPTION);
				}
				}
		});
		
		
		btnOk.setBounds(165, 297, 90, 23);
		adicionarContaPanel.add(btnOk);
		
		JRadioButton rdbtnFuncionrio = new JRadioButton("Funcion\u00E1rio");
		rdbtnFuncionrio.setActionCommand("funcionario");
		buttonGroup.add(rdbtnFuncionrio);
		rdbtnFuncionrio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFuncionrio.setBounds(74, 247, 105, 23);
		adicionarContaPanel.add(rdbtnFuncionrio);
		
		JRadioButton rdbtnDocente = new JRadioButton("Docente");
		rdbtnDocente.setActionCommand("docente");
		buttonGroup.add(rdbtnDocente);
		rdbtnDocente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnDocente.setBounds(188, 247, 79, 23);
		adicionarContaPanel.add(rdbtnDocente);
		
		JRadioButton rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setActionCommand("discente");
		buttonGroup.add(rdbtnAluno);
		rdbtnAluno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAluno.setBounds(291, 247, 61, 23);
		adicionarContaPanel.add(rdbtnAluno);
		
		
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
