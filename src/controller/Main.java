package controller;

import view.LoginFrame;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Professor,\n\n" +
				"Ainda temos muita coisa a implementar, por enquanto o sr. pode\n" +
				"testar o login com o �nico usu�rio cadastrado at� ent�o:\n" +
				"Matricula: 1111\n" +
				"Senha: 1234.\n\n" +
				"Obrigado!");
		
		try {
			LoginFrame frame = new LoginFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
