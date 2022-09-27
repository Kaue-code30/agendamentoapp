package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

	public static void main(String[] args) {

		ArrayList<Especialidade> especialidades = new ArrayList<>();

		Especialidade e1 = new Especialidade("nome");
//		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração");

		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		e2.setDescricao("Cuida da barriga");

		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida dos movimentos");

		Especialidade e4 = new Especialidade();
		e4.setNome("Clinico");
		e4.setDescricao("Primeiro suporte");

		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescricao("Cuida das Crianças");

		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		especialidades.add(e4);
		especialidades.add(e5);

		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(50);
		notas.add(20);
		notas.add(28);
		notas.add(89);

//		System.out.println(especialidades.get(3).getNome());

		especialidades.get(1).setNome("KAue");
//		System.out.println(especialidades.get(1).getNome());

		Especialidade xy = new Especialidade("Kaue", "Silva de Lima");
		System.out.println(xy.getNome());

		System.out.println(especialidades.get(2).getNome());

//		Especialidade[] especialidades = {e1, e2, e3, e4};

	}

}
