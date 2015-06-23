package model;

public class Pauta {
	
	String codigoTurma;
	String matriculaAluno;
	float grau;
	int frequencia;

	public Pauta() {
		// TODO Auto-generated constructor stub
	}

	public Pauta(String codigoTurma, String matriculaAluno, float grau,
			int frequencia) {
		super();
		this.codigoTurma = codigoTurma;
		this.matriculaAluno = matriculaAluno;
		this.grau = grau;
		this.frequencia = frequencia;
	}

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	
	

}
