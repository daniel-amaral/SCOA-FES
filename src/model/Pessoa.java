package model;

public class Pessoa {
	
	String matricula;
	String nome;
	String categoria;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String matricula, String nome, String categoria) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.categoria = categoria;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
