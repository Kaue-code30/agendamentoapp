package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
    
    private Integer codigo;
    private String nome;
    private String descricao;

    // Construtor de classes \\
    public Especialidade(String nome) {
        this.nome = nome;

    }

    public Especialidade() {

    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;

    }

    // Métodos de acessos aos atributos \\
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " Nome não é válido. Deve conter pelo menos 3 letras.");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null,
                    descricao + " Descrição não é valido. Deve conter pelo menos 10 letras ");
        }
    }

    public String getDescricao() {
        return descricao;
    }

}
