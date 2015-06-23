package model;

public class SalaDeAula {
	
	String codigo;
	String predio;
	int andar;
	String numero;
	int lotacao;

	public SalaDeAula() {
		// TODO Auto-generated constructor stub
	}

	public SalaDeAula(String codigo, String predio, int andar, String numero,
			int lotacao) {
		super();
		this.codigo = codigo;
		this.predio = predio;
		this.andar = andar;
		this.numero = numero;
		this.lotacao = lotacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPredio() {
		return predio;
	}

	public void setPredio(String predio) {
		this.predio = predio;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}

}
