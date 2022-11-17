
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282191\\java\\pastinha\\PlanoDeSaude.txt"; 
    private final static String URL_TEMP = "C:\\Users\\22282191\\java\\pastinha\\PanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

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
            if (e.getCodigo().equals(codigo)){
                planoDeSaude.remove(e);
                break;
            }
            
        }
        autualizarArquivo();
        
    }
    
    public static void atualizar(PlanoDeSaude correta){
        for(PlanoDeSaude p : planoDeSaude ){
            if(correta.getCodigo() == p.getCodigo()){
              int posicao = planoDeSaude.indexOf(p);
              planoDeSaude.set(posicao, correta);
            }
        }
        autualizarArquivo();
    }
    
    private static void autualizarArquivo() {
        // Passo 01 - Criar uma respresentação dos arquivos que serão manipulados 
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o aquivo temporario 
            arquivoTemp.createNewFile();

            // Abrir para a escrita
            BufferedWriter bwTemp
                    = Files.newBufferedWriter(PATH_TEMP,
                            StandardOpenOption.APPEND,
                            StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporario, exceto o registro que irá ser excluido
            for(PlanoDeSaude e : planoDeSaude){
                bwTemp.write(e.getPlanoDeSaudeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            //excluir o arquivo atual 
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    public static void gravar(PlanoDeSaude plano){
        planoDeSaude.add(plano);
        
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(plano.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }
        
        
        
    }
    
    
    
    public static void criarListaDePlanosDeSaude(){
        
         try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while(linha != null){
                // transformar os dados da linha em especialidade
                //DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String[]vetor = linha.split(";");
               
                String[] data = vetor[3].split("-");
                       
                PlanoDeSaude e;
                e = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        LocalDate.of(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])),
                        vetor[4],
                        Integer.valueOf(vetor[0]));
                
     
                // Guardar na lista de especialidades
                planoDeSaude.add(e);
                
                //ler a proxima linha 
                linha = leitor.readLine();
                
            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
        
        
        
        
  
}
    
    
    public static DefaultTableModel getplanosDeSaudeModel(){
        
        String[] titulos = {"CÓDIGO","OPERADORA","CATEGORIA","VALIDADE","NÚMERO"};
        
        int i = 0;
        String[][] dados = new String[planoDeSaude.size()][5];
        for (PlanoDeSaude p : planoDeSaude ){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getvalidade().toString();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][3] = p.getvalidade().format(barra);
            dados[i][4] = p.getNumero();
            i++;
            
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
        
    }
    
}

