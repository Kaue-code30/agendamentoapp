package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Agenda {

	private LocalDate dataDaConsuta;
	private LocalTime horaDaConsulta;
	private Paciente paciente;
	private Medico medico;
	private Especialidade especialidade;
	
	// CRIAÇÃO DOS MÉTODOS DA CLASSE AGENDA \\

	public void setDataDaConsuta(LocalDate dataDaConsuta) {
		this.dataDaConsuta = dataDaConsuta;
	}

	public LocalDate getDataDaConsuta() {
		return dataDaConsuta;
	}

	// --------------------------------------------------\\

	public void setHoraDaConsulta(LocalTime horaDaConsulta) {
		this.horaDaConsulta = horaDaConsulta;
	}

	public LocalTime getHoraDaConsulta() {
		return horaDaConsulta;
	}

	// --------------------------------------------------\\

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	// --------------------------------------------------\\

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Medico getMedico() {
		return medico;
	}

	// --------------------------------------------------\\

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

}
