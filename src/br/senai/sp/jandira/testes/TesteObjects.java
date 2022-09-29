package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjects {

	public static void main(String[] args) {
		Especialidade e1 = new Especialidade();
		e1.setNome("Cardiologia");
		e1.setDescricao("Cuida do coração");

		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		e2.setDescricao("Cuida da barriga");

		Especialidade e3 = new Especialidade("Indocno");
		e3.setDescricao("Cuida do não sei oque!");
//		System.out.println(e3.getNome());
//		System.out.println(e3.getDescricao());

		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
//		System.out.println(especialidades.size());

//		for (Integer i = 0; i < especialidades.size(); i++) {
//			System.out.println(especialidades.get(i).getNome());	
//		}
//		
//		
//		for (Especialidade e : especialidades) {
//			System.out.println(e.getNome());
//		}
//	

		PlanoDeSaude p1 = new PlanoDeSaude("Bradesco");
		PlanoDeSaude p2 = new PlanoDeSaude("Amil");
		PlanoDeSaude p3 = new PlanoDeSaude("Notredame");
		PlanoDeSaude p4 = new PlanoDeSaude("NOVA VIDA");
		

		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(p1);
		planos.add(p2);
		planos.add(p3);
		planos.add(p4);
		

		for (PlanoDeSaude planoDeSaude : planos) {
			System.out.println(planoDeSaude.getOperadora());
			

		}
		
		
		
		AgendaApp.main(args);
                Especialidade e4 = new Especialidade("Indo99cno");
                Especialidade e5 = new Especialidade("Indocn665o");
		
		System.out.println(e1.getCodigo() + " ------------> " + e1.getNome());
		System.out.println(e5.getCodigo() + " ------------> " + e5.getNome());
		System.out.println(e4.getCodigo() + " ------------> " + e4.getNome());
		
		
                
		
		          
	}
}
