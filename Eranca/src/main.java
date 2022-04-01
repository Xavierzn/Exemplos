
public class main {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		carro1.ano = 1999;
		carro1.setMarca("Ford");
		carro1.setModelo("Mustang");
		carro1.setQuatroPortas(true);

		Moto moto1 = new Moto();
		
		moto1.setModelo("Honda");
		moto1.setMarca("Empinadora");
		moto1.setAno(1999);
		moto1.imprimirDados();
		moto1.enpinar();
		moto1.buzinar();
		
		Caminhao caminhao1 = new Caminhao();
		
		caminhao1.setAno(2000);
		caminhao1.setMarca("Honda");
		caminhao1.buzinar();
		
		caminhao1.imprimirDados();
		
		
		
	}

}
