package model;

public class Disciplina {
	
	String codigo;
	String codigoCurso;
	String nome;
	int creditos;

	public Disciplina() {
		// TODO Auto-generated constructor stub
	}

	public Disciplina(String codigo, String codigoCurso, String nome,
			int creditos) {
		super();
		this.codigo = codigo;
		this.codigoCurso = codigoCurso;
		this.nome = nome;
		this.creditos = creditos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	

}
