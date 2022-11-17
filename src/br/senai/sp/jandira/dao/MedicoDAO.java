
package br.senai.sp.jandira.dao;
    
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282191\\java\\pastinha\\Medicos.txt";
    private final static String URL_TEMP = "C:\\Users\\22282191\\java\\pastinha\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    public static ArrayList<Medico> getmedicos() {
        return medicos;
    }
    
     public static Medico getmedico(Integer codigo) {
        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }
     public static void excluir(Integer codigo) {

        for (Medico e : medicos) {
            if (e.getCodigo().equals(codigo)) {
                medicos.remove(e);
                break;
            }

        }
        autualizarArquivo();

    }

    public static void atualizar(Medico correta) {
        for (Medico e : medicos) {
            if ( e.getCodigo().equals(correta.getCodigo())) {
                int posicao = medicos.indexOf(e);
                medicos.set(posicao, correta);
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
            for(Medico e : medicos){
                bwTemp.write(e.getMedicoSeparadaPorPontoEVirgula());
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

    public static void gravar(Medico medic) {
        medicos.add(medic);
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(medic.getMedicoSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }

        // Gravar em arquivo \\
    }

    public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                // transformar os dados da linha em medidcos
                
                String[] vetor = linha.split(";");
                Medico m = new Medico(Integer.valueOf
                        (vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3]);

                // Guardar na lista de especialidades
                medicos.add(m);

                //ler a proxima linha 
                linha = leitor.readLine();

            }
            leitor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getmedicosModel() {

        String[] titulos = {"CÓDIGO", "CRM", "NOME DO MÉDICO","TELEFONE"};

        int i = 0;
        String[][] dados = new String[medicos.size()][3];
        for (Medico e : medicos) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();
            i++;

        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

    
    
    
    
    
    
    
    
    
    
}
