package model;

public class Aluno extends Pessoa{
	
	String matricula;
	float cr;
	String situacaoMatricula;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(String matricula, float cr, String situacaoMatricula) {
		super();
		this.matricula = matricula;
		this.cr = cr;
		this.situacaoMatricula = situacaoMatricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getCr() {
		return cr;
	}

	public void setCr(float cr) {
		this.cr = cr;
	}

	public String getSituacaoMatricula() {
		return situacaoMatricula;
	}

	public void setSituacaoMatricula(String situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}
	

}
