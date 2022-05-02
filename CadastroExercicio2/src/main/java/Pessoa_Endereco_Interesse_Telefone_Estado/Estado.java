package Pessoa_Endereco_Interesse_Telefone_Estado;

public class Estado {
	
	private String  rua;
	private String sigla;
	

	
	public Estado(String rua, String sigla) {
		this.rua = rua;
		this.sigla = rua;
	}

	public Estado() {
		
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	


	
	
}
