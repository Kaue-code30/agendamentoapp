package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Month;



public class PlanoDeSaude {

	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
        private static int contador = 99;
        private Integer codigo ;
	
	// CRIAÇÃO DOS MÉTODOS DA CLASSE PLANO DE SAÚDE \\
	
	public PlanoDeSaude(String operadora, String categoria, LocalDate validade, String numero) {
		this.operadora = operadora;
                this.categoria = categoria;
                this.validade = validade;
                this.numero = numero;
		gerarCodigo();
	}
	
	public PlanoDeSaude() {
		gerarCodigo();
		
		
	}
        

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return operadora;
	}

	// ------------------------------\\

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	// ------------------------------\\

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	// -------------------------------\\

	public void setValidade(LocalDate validade) {
                
		this.validade = validade;
                
	}

    public LocalDate getvalidade() {
     return validade;
    }
        

     
        

	
        
        public static int getContador() {
        return contador;
    }

        public Integer getCodigo() {
          return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }
        private void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }
}
