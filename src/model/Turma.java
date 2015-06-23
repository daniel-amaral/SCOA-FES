package model;

public class Turma {
	
	String codigo;
	String codigoDisciplina;
	int ano;
	int semestre;
	String matriculaProfessor;
	String codigoSala;

	public Turma() {
		// TODO Auto-generated constructor stub
	}

	public Turma(String codigo, String codigoDisciplina, int ano, int semestre,
			String matriculaProfessor, String codigoSala) {
		super();
		this.codigo = codigo;
		this.codigoDisciplina = codigoDisciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.matriculaProfessor = matriculaProfessor;
		this.codigoSala = codigoSala;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(String matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getCodigoSala() {
		return codigoSala;
	}

	public void setCodigoSala(String codigoSala) {
		this.codigoSala = codigoSala;
	}
	
	

}
