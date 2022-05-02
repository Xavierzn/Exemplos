import java.util.ArrayList;
import java.util.List;

import Pessoa_Endereco_Interesse_Telefone_Estado.Estado;
import Pessoa_Endereco_Interesse_Telefone_Estado.Interesse;






public class DataProvider {
	
	public final static List<Estado> ESTADO;
	public static final List<Interesse> INTERESES;
	
	
	static {
		ESTADO = new ArrayList<Estado>();
		ESTADO.add(new Estado("Acre", "AC"));
		ESTADO.add(new Estado("Alogoas", "AL"));
		ESTADO.add(new Estado("Amap�", "AP"));
		ESTADO.add(new Estado("Amazonas", "AM"));
		ESTADO.add(new Estado("Bahia", "BH"));
		ESTADO.add(new Estado("Cear�", "CE"));
		ESTADO.add(new Estado("Distrito Federal", "DF"));
		ESTADO.add(new Estado("Espiritos Santos", "ES"));
		ESTADO.add(new Estado("Go�as", "GO"));
		ESTADO.add(new Estado("Maranh�o", "MA"));
		ESTADO.add(new Estado("Mato Grosso", "MT"));
		ESTADO.add(new Estado("Mato Grosso do Sul", "MS"));
		ESTADO.add(new Estado("Mina Gerais ", "MG"));
		ESTADO.add(new Estado("Para�ba", "PB"));
		ESTADO.add(new Estado("Paran�", "PR"));
		ESTADO.add(new Estado("Pernambuco", "PE"));
		ESTADO.add(new Estado("Piau�", "PI"));
		ESTADO.add(new Estado("Rio de Janeiro", "RJ"));
		ESTADO.add(new Estado("Rio Grande do Norte", "RN"));
		ESTADO.add(new Estado("Rio Grande do Sul", "RS"));
		ESTADO.add(new Estado("Rondonio", "RO"));
		ESTADO.add(new Estado("Roraima", "RR"));
		ESTADO.add(new Estado("Santa Catarina", "SC"));
		ESTADO.add(new Estado("S�o Paulo", "SP"));
		ESTADO.add(new Estado("Sergipe", "SE"));
		ESTADO.add(new Estado("Tocatins", "TO"));
		
		INTERESES = new ArrayList<Interesse>();
		INTERESES.add(new Interesse(1,"Esportes"));
		INTERESES.add(new Interesse(2,"M�sica"));
		INTERESES.add(new Interesse(3,"Artes Maciais"));
		INTERESES.add(new Interesse(4,"Viagens"));
		INTERESES.add(new Interesse(5,"Cinema"));
		INTERESES.add(new Interesse(6,"Dan�a"));
		
		
		
	}
}

