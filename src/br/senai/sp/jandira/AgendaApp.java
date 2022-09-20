package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;
import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {

		Especialidade especialidade1 = new Especialidade();
		Especialidade especialidade2 = new Especialidade();
		Especialidade especialidade3 = new Especialidade();
		Especialidade especialidade4 = new Especialidade();
		Especialidade especialidade5 = new Especialidade();

		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração ");

		especialidade2.setNome("Otorrinolaringogia");
		especialidade2.setDescricao("cuida do ouvido");

		especialidade3.setNome("Gastroentorologia");
		especialidade3.setDescricao("cuida do estomago");

		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao("Cuida dos movimentos");

		especialidade5.setNome("Clinico Geral");
		especialidade5.setDescricao("Primeiro suporte");

		Medico medico1 = new Medico();
		medico1.setNome("Kauê Lima");
		medico1.setEmail("kauelima000@gmail.com");
		medico1.setCrm("2222225864");
		medico1.setTelefone("11988604999");
		Especialidade[] especialidades1 = { especialidade1, especialidade5 };
		medico1.setEspecialidades(especialidades1);

		Medico medico2 = new Medico();
		medico2.setNome("Denise Lima");
		medico2.setEmail("denisealmeidaasl@outlook.com");
		medico2.setCrm("2224864");
		medico2.setTelefone("11988151299");
		Especialidade[] especialidades2 = { especialidade1, especialidade4, especialidade5 };
		medico2.setEspecialidades(especialidades2);
//
//		System.out.println("Nome do Médico: " + medico1.getNome());
//		System.out.println("CRM do Médico: " + medico1.getCrm());
//		int i = 0;
//		while (i < medico1.getEspecialidade().length) {
//			System.out.println(medico1.getEspecialidade()[i].getNome() + ", ");
//			i++;
//		}
//
//		System.out.println("-----------------------------------------------------------");
//
//		System.out.println("Nome do Médico: " + medico2.getNome());
//		System.out.println("CRM do Médico: " + medico2.getCrm());
//		int b = 0;
//		while (b < medico2.getEspecialidade().length) {
//			System.out.print(medico2.getEspecialidade()[i].getNome() + ", ");
//			b++;
//		}

		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Condominio Nova Paulista, Rua Francisco Camargo");
		endereco1.setBairro("Nova paulista");
		endereco1.setNumero("106");
		endereco1.setCidade("Barueri");
		endereco1.setCep("06636-120");
		endereco1.setEstado("São Paulo");

		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Werner Goldberg");
		endereco2.setNumero("64");
		endereco2.setBairro("Tupancy");
		endereco2.setCidade("Barueri");
		endereco2.setCep("06614-025");
		endereco2.setEstado("São Paulo");

		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
		planoDeSaude1.setOperadora("Bradesco");
		planoDeSaude1.setCategoria("Premium");
		planoDeSaude1.setNumero("21848-554");
		planoDeSaude1.setValidade(LocalDate.of(2022, 8, 31));

		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		planoDeSaude2.setOperadora("Porto Seguro");
		planoDeSaude2.setCategoria("Premium");
		planoDeSaude2.setNumero("21848-554");
		planoDeSaude2.setValidade(LocalDate.of(2024, 8, 31));

		Paciente paciente1 = new Paciente();
		paciente1.setNome("Maycon Lima");
		paciente1.setRg("54.716.929-2");
		paciente1.setCpf("442.076.538-31");
		paciente1.setTelefone("11986706354");
		paciente1.setDataDeNascimento(LocalDate.of(2004, 11, 30));
		paciente1.setPlanoDeSaude(planoDeSaude1);
		paciente1.setEndereco(endereco1);

		Paciente paciente2 = new Paciente();
		paciente2.setNome("Matheus Lima");
		paciente2.setRg("54.716.799-2");
		paciente2.setCpf("242.126.538-31");
		paciente2.setTelefone("11966706354");
		paciente2.setDataDeNascimento(LocalDate.of(2003, 01, 19));
		paciente2.setPlanoDeSaude(planoDeSaude2);
		paciente2.setEndereco(endereco2);
//
//		System.out.println("Lista dos pacientes");
//		System.out.println("---------------------------------------------------------------");
//
//		System.out.println("Nome do paciente: " + paciente1.getNome());
//		System.out.println("Data de nascimento: " + paciente1.getDataDeNascimento());
//		System.out.println("Telefone: " + paciente1.getTelefone());
//		System.out.println("Cidade: " + paciente1.getEndereco().getCidade());
//		System.out.println("Estado: " + paciente1.getEndereco().getEstado());
//		System.out.println("Operadora do plano: " + paciente1.getPlanoDeSaude().getOperadora());
//
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("Nome do paciente: " + paciente2.getNome());
//		System.out.println("Data de nascimento: " + paciente2.getDataDeNascimento());
//		System.out.println("Telefone: " + paciente2.getTelefone());
//		System.out.println("Cidade: " + paciente2.getEndereco().getCidade());
//		System.out.println("Estado: " + paciente2.getEndereco().getEstado());
//		System.out.println("Operadora do plano: " + paciente2.getPlanoDeSaude().getOperadora());
//		System.out.println("----------------------------------------------------------------");
		
		Agenda agenda = new Agenda();
		agenda.setPaciente(paciente1);
		agenda.setDataDaConsuta(LocalDate.of(2022, 8, 21));
		agenda.setHoraDaConsulta(LocalTime.of(8, 30));
		agenda.setMedico(medico2);
		agenda.setEspecialidade(especialidade4);
		agenda.getPaciente().getPlanoDeSaude();

		System.out.println("AGENDA");
		System.out.println("Nome do paciente: "+ agenda.getPaciente().getNome());
		System.out.println("Data da consulta: "+ agenda.getDataDaConsuta());
		System.out.println("Hora da consulta: "+ agenda.getHoraDaConsulta());
		System.out.println("Médico(a): "+ agenda.getMedico().getNome());
		System.out.println("Tipo da consulta: "+agenda.getEspecialidade().getNome());
		System.out.println("Plano de Saúde: "+ agenda.getPaciente().getPlanoDeSaude().getOperadora() );
		
		

	}

}
