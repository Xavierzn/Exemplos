
public class Veiculo {
	
	protected String marca;
	protected String modelo;
	protected int ano;
	
	
	public void buzinar() {
		System.out.println("Bi-Bi !!!");
	}
	
	public void imprimirDados() {
		System.out.println("Marca:" + marca
						+ "\n Modelo:" + modelo
						+ "\n Ano" + ano);
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
