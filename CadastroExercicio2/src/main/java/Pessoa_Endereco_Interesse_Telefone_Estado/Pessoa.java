package Pessoa_Endereco_Interesse_Telefone_Estado;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String email;
	private Date dataNaci;
	private Endereco endeResi;
	private Telefone teleResi;
	private Telefone teleCell;
	private String nomeEmpresa;
	private Endereco endeComerci;
	private Endereco teleComerci;
	private String cargo;
	private Double salario;
	private Integer[] Intereses;
	
	public Interesse[] getListaLinguagens() {
		return Interesse.INTERESES;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNaci() {
		return dataNaci;
	}

	public void setDataNaci(Date dataNaci) {
		this.dataNaci = dataNaci;
	}

	public Endereco getEndeResi() {
		return endeResi;
	}

	public void setEndeResi(Endereco endeResi) {
		this.endeResi = endeResi;
	}

	public Telefone getTeleResi() {
		return teleResi;
	}

	public void setTeleResi(Telefone teleResi) {
		this.teleResi = teleResi;
	}

	public Telefone getTeleCell() {
		return teleCell;
	}

	public void setTeleCell(Telefone teleCell) {
		this.teleCell = teleCell;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Endereco getEndeComerci() {
		return endeComerci;
	}

	public void setEndeComerci(Endereco endeComerci) {
		this.endeComerci = endeComerci;
	}

	public Endereco getTeleComerci() {
		return teleComerci;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer[] getIntereses() {
		return Intereses;
	}

	public void setIntereses(Integer[] intereses) {
		Intereses = intereses;
	}

	
	
	
}
