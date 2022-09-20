package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

	private String nome;
	private LocalDate dataDeNascimento;
	private String telefone;
	private String rg;
	private String cpf;
	private Endereco endereco;
	private PlanoDeSaude planoDeSaude;

	// CRIAÇÃO DOS MÉTODOS DA CLASSE PACIENTE \\

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	// -----------------------------------------------\\

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	// ----------------------------------------------\\

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	// ----------------------------------------------\\

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	// ----------------------------------------------\\

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	// ----------------------------------------------\\

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	// ----------------------------------------------\\

	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}

}
