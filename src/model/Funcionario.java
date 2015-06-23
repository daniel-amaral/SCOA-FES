package model;

public class Funcionario extends Pessoa{
	
	String matricula;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

}
