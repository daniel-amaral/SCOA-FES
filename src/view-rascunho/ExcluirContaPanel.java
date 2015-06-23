package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class ExcluirContaPanel extends JPanel {
	private JTextField matriculaField;

	/**
	 * Create the panel.
	 */
	public ExcluirContaPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("Matr\u00EDcula:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(74, 123, 105, 27);
		add(label);
		
		matriculaField = new JTextField();
		matriculaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		matriculaField.setColumns(10);
		matriculaField.setBounds(191, 123, 161, 30);
		add(matriculaField);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(165, 230, 90, 23);
		add(btnExcluir);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(262, 230, 90, 23);
		add(button_1);
		
		JLabel lblExcluirConta = new JLabel("Excluir Conta");
		lblExcluirConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExcluirConta.setBounds(10, 11, 105, 19);
		add(lblExcluirConta);

	}
}
