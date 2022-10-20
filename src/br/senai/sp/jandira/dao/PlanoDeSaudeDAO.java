
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static ArrayList<PlanoDeSaude> getPlanosDeSaudes() {
        return planoDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo){
        for(PlanoDeSaude p : planoDeSaude){
           if (codigo == p.getCodigo()){
               return p; 
           }   
        } 
        
        return null;
    }
     public static void excluir(Integer codigo){
        for (PlanoDeSaude e : planoDeSaude){
            if (codigo == e.getCodigo()){
                planoDeSaude.remove(e);
                break;
            }
            
        }
        
    }
    
    public static void atualizar(PlanoDeSaude correta){
        for(PlanoDeSaude p : planoDeSaude ){
            if(correta.getCodigo() == p.getCodigo()){
              int posicao = planoDeSaude.indexOf(p);
              planoDeSaude.set(posicao, correta);
            }
        }
    }
    
    public static void gravar(PlanoDeSaude plano){
        planoDeSaude.add(plano);
        
    }
    
    public static void criarListaDePlanosDeSaude(){
        PlanoDeSaude e1 = new PlanoDeSaude("Bradesco","Premium");
        PlanoDeSaude e2 = new PlanoDeSaude("Amil","Premium");
        PlanoDeSaude e3 = new PlanoDeSaude("Azul","Premium");
        PlanoDeSaude e4 = new PlanoDeSaude("Notredame","Premium");
     
    
        planoDeSaude.add(e1);
        planoDeSaude.add(e2);
        planoDeSaude.add(e3);
        planoDeSaude.add(e4);
        
        
  
}
    public static DefaultTableModel getplanosDeSaudeModel(){
        
        String[] titulos = {"CÓDIGO","OPERADORA","Categoria","Validade"};
        
        int i = 0;
        String[][] dados = new String[planoDeSaude.size()][3];
        for (PlanoDeSaude p : planoDeSaude ){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            i++;
            
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
        
    }
    
}

