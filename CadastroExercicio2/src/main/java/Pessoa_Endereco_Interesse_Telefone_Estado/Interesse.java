package Pessoa_Endereco_Interesse_Telefone_Estado;

public class Interesse {
	
	
	private Integer id;
	private String area;
	
	public static final Interesse [] INTERESES;
	
	static {
		INTERESES = new Interesse[6];
		
		INTERESES[0] = new Interesse(1, "Esportes");
		INTERESES[1] = new Interesse(2, "Musica");
		INTERESES[2] = new Interesse(3, "Artes Marciais");
		INTERESES[3] = new Interesse(4, "Viagens");
		INTERESES[4] = new Interesse(5, "Cinema");
		INTERESES[5] = new Interesse(6, "Dança");
		
	}

	public Interesse(Integer id, String area) {
		this.id = id;
		this.area = area;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
		
	
}
