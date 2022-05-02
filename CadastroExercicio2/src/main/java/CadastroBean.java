import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import Pessoa_Endereco_Interesse_Telefone_Estado.Endereco;
import Pessoa_Endereco_Interesse_Telefone_Estado.Estado;
import Pessoa_Endereco_Interesse_Telefone_Estado.Pessoa;
import Pessoa_Endereco_Interesse_Telefone_Estado.Telefone;

@SuppressWarnings("serial")
@RequestScoped
@Named("cadastro")

public class CadastroBean implements Serializable {
	
	private Pessoa pessoa;
	
	public Pessoa getPessoa(){
		
		if(pessoa == null) {
		pessoa = new Pessoa();
		pessoa.setEndeResi(new Endereco());	
		pessoa.getEndeResi().setEstado(new Estado());
		pessoa.setEndeComerci(new Endereco());
		pessoa.getEndeComerci().setEstado(new Estado());
		pessoa.setTeleResi(new Telefone());
	}
		return pessoa;
		
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Estado> getEstado(){
		return DataProvider.ESTADO;
	}
	

	
	
}
