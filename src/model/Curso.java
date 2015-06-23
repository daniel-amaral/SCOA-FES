package model;

public class Curso {
	
	String codigo;
	String codigoDepartamento;
	String nome;
	
	public Curso() {
	}

	public Curso(String codigo, String codigoDepartamento, String nome) {
		super();
		this.codigo = codigo;
		this.codigoDepartamento = codigoDepartamento;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(String codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
