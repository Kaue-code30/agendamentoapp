package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282191\\java\\pastinha\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282191\\java\\pastinha\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }

        return null;

    }

    public static void excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }

        }
        autualizarArquivo();

    }

    public static void atualizar(Especialidade correta) {
        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
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
            for(Especialidade e : especialidades){
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
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

    public static void gravar(Especialidade espe) {
        especialidades.add(espe);
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(espe.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }

        // Gravar em arquivo \\
    }

    public static void criarListaDeEspecialidade() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                // transformar os dados da linha em especialidade 
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                // Guardar na lista de especialidades
                especialidades.add(e);

                //ler a proxima linha 
                linha = leitor.readLine();

            }
            leitor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getespecialidadesModel() {

        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};

        int i = 0;
        String[][] dados = new String[especialidades.size()][3];
        for (Especialidade esp : especialidades) {
            dados[i][0] = esp.getCodigo().toString();
            dados[i][1] = esp.getNome();
            dados[i][2] = esp.getDescricao();
            i++;

        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
    
    
    public static DefaultTableModel getEspecialidadesMoldel(){
        String[] titulos = {"Nome da Especialidade"};
        int i = 0;
        String[][] dados = new String[especialidades.size()][1];
        for (Especialidade e : especialidades){
            dados[i][0] = e.getNome();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }

}
