package model;

public class Login {
	
	String matricula;
	String senha;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String matricula, String senha) {
		super();
		this.matricula = matricula;
		this.senha = senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
