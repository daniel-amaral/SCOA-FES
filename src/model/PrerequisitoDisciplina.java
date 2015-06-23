package model;

public class PrerequisitoDisciplina {
	
	String codigo;
	String codigoDisciplinaRequisito;

	public PrerequisitoDisciplina() {
		// TODO Auto-generated constructor stub
	}

	public PrerequisitoDisciplina(String codigo,
			String codigoDisciplinaRequisito) {
		super();
		this.codigo = codigo;
		this.codigoDisciplinaRequisito = codigoDisciplinaRequisito;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoDisciplinaRequisito() {
		return codigoDisciplinaRequisito;
	}

	public void setCodigoDisciplinaRequisito(String codigoDisciplinaRequisito) {
		this.codigoDisciplinaRequisito = codigoDisciplinaRequisito;
	}
	
	

}
