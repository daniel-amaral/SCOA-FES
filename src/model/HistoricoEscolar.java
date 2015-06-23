package model;

public class HistoricoEscolar {
	
	String matriculaAluno;
	String codigoTurma;
	float grau;

	public HistoricoEscolar() {
		// TODO Auto-generated constructor stub
	}

	public HistoricoEscolar(String matriculaAluno, String codigoTurma,
			float grau) {
		super();
		this.matriculaAluno = matriculaAluno;
		this.codigoTurma = codigoTurma;
		this.grau = grau;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(String codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}
	
	

}
