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
		ESTADO.add(new Estado("Amapá", "AP"));
		ESTADO.add(new Estado("Amazonas", "AM"));
		ESTADO.add(new Estado("Bahia", "BH"));
		ESTADO.add(new Estado("Ceará", "CE"));
		ESTADO.add(new Estado("Distrito Federal", "DF"));
		ESTADO.add(new Estado("Espiritos Santos", "ES"));
		ESTADO.add(new Estado("Goías", "GO"));
		ESTADO.add(new Estado("Maranhão", "MA"));
		ESTADO.add(new Estado("Mato Grosso", "MT"));
		ESTADO.add(new Estado("Mato Grosso do Sul", "MS"));
		ESTADO.add(new Estado("Mina Gerais ", "MG"));
		ESTADO.add(new Estado("Paraíba", "PB"));
		ESTADO.add(new Estado("Paraná", "PR"));
		ESTADO.add(new Estado("Pernambuco", "PE"));
		ESTADO.add(new Estado("Piauí", "PI"));
		ESTADO.add(new Estado("Rio de Janeiro", "RJ"));
		ESTADO.add(new Estado("Rio Grande do Norte", "RN"));
		ESTADO.add(new Estado("Rio Grande do Sul", "RS"));
		ESTADO.add(new Estado("Rondonio", "RO"));
		ESTADO.add(new Estado("Roraima", "RR"));
		ESTADO.add(new Estado("Santa Catarina", "SC"));
		ESTADO.add(new Estado("São Paulo", "SP"));
		ESTADO.add(new Estado("Sergipe", "SE"));
		ESTADO.add(new Estado("Tocatins", "TO"));
		
		INTERESES = new ArrayList<Interesse>();
		INTERESES.add(new Interesse(1,"Esportes"));
		INTERESES.add(new Interesse(2,"Música"));
		INTERESES.add(new Interesse(3,"Artes Maciais"));
		INTERESES.add(new Interesse(4,"Viagens"));
		INTERESES.add(new Interesse(5,"Cinema"));
		INTERESES.add(new Interesse(6,"Dança"));
		
		
		
	}
}

