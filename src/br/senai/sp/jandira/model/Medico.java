package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    private String nome;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private Integer codigo;
    private static int contador = 99;

    // Criação dos Construtores \\
    
    public Medico(Integer codigo ,String nome, String crm, String telefone,
            String email,LocalDate dataDeNascimento){
        
        this.codigo = codigo;
        this.contador = codigo;
        this.nome = nome;
        this.crm = crm;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        
        
    } 
    
    public Medico(){
        gerarCodigo();
        
    }
    public Medico(Integer codigo, String nome, String crm, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        gerarCodigo();
        
    }
    
    
    
    
    
    // CRIAÇÃO DOS MÉTODOS DA CLASSE MÉDICO \\
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // -------------------------------------------- \\
    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    // -------------------------------------------- \\
    
    public static int getContador() {
        return contador;
    }
   
    // -------------------------------------------- \\
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    // -------------------------------------------- \\
    
    public Integer getCodigo() {
        return codigo;
    }
    
    // -------------------------------------------- \\
    
    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
    }

    // -------------------------------------------- \\
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    // -------------------------------------------- \\
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // -------------------------------------------- \\
    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    // --------------------------------------------- \\
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    
    
    public String getMedicoSeparadaPorPontoEVirgula(){
        return this.codigo + ";" + this.crm + ";" + this.nome + ";" 
                + this.telefone + ";" + this.email + ";" 
                + this.dataDeNascimento + ";" + this.especialidades;
    }

}
