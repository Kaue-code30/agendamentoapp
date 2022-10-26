/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282191
 */
public class PlanoDeSaudeDialog extends javax.swing.JDialog {
    
    
    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;
    
    

    public PlanoDeSaudeDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal,
            PlanoDeSaude p, 
            OperacaoEnum operacao) {
        
        super(parent,modal);
        initComponents();
        planoDeSaude = p;
        preencherFormulario();
        
        this.operacao = operacao;
        preencherTitulo();
        
    }
    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal,OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        
        
        
    }
    
    
    private void preencherFormulario(){
        
        jTextFieldCodigo.setText(planoDeSaude.getCodigo().toString());
        jTextFieldPlano.setText(planoDeSaude.getOperadora());
        jTextFieldcategoria.setText(planoDeSaude.getCategoria());
        DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jTextFieldNumero.setText(planoDeSaude.getNumero());
        jTextFieldvalidade.setText(planoDeSaude.getvalidade().format(barra));
        
    }
    
    private void preencherTitulo(){
        jLabelTitulo.setText("Planos de Saúde - " + operacao );
        
      

    }
    
    
    
    private void adicionar(){
        PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude();
        novoPlanoDeSaude.setOperadora(jTextFieldPlano.getText());
        novoPlanoDeSaude.setCategoria(jTextFieldcategoria.getText());
        novoPlanoDeSaude.setValidade(LocalDate.parse(jTextFieldvalidade.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        novoPlanoDeSaude.setNumero(jTextFieldNumero.getText());
        PlanoDeSaudeDAO.gravar(novoPlanoDeSaude);
        JOptionPane.showMessageDialog(this, "Plano de saúde gravado com sucesso",
                "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        planoDeSaude.setOperadora(jTextFieldPlano.getText());
        planoDeSaude.setCategoria(jTextFieldcategoria.getText());
        planoDeSaude.setValidade(LocalDate.parse(jTextFieldvalidade.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        planoDeSaude.setNumero(jTextFieldNumero.getText());
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        JOptionPane.showMessageDialog(this,"Atualizada com sucesso","Planos de Saúde",JOptionPane.INFORMATION_MESSAGE,null);
        dispose();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        categoria = new javax.swing.JLabel();
        jTextFieldcategoria = new javax.swing.JTextField();
        jLabelNomedoPlano = new javax.swing.JLabel();
        jTextFieldPlano = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldvalidade = new javax.swing.JFormattedTextField();
        jTextFieldNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setSize(new java.awt.Dimension(740, 380));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Plano de Saúde - ADICIONAR");
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(740, 310));
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(40, 30, 370, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(255, 51, 0))); // NOI18N
        jPanel2.setLayout(null);

        LabelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LabelCodigo.setText("Código:");
        jPanel2.add(LabelCodigo);
        LabelCodigo.setBounds(40, 30, 50, 16);

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(40, 50, 80, 30);

        categoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categoria.setText("Categoria:");
        jPanel2.add(categoria);
        categoria.setBounds(40, 130, 70, 16);

        jTextFieldcategoria.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextFieldcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldcategoria);
        jTextFieldcategoria.setBounds(40, 150, 290, 30);

        jLabelNomedoPlano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNomedoPlano.setText("Plano de Saúde:");
        jPanel2.add(jLabelNomedoPlano);
        jLabelNomedoPlano.setBounds(40, 80, 140, 16);

        jTextFieldPlano.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jTextFieldPlano);
        jTextFieldPlano.setBounds(40, 100, 170, 30);

        jButtonCancelar.setBackground(new java.awt.Color(255, 83, 89));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.setToolTipText("");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar);
        jButtonCancelar.setBounds(470, 270, 100, 30);

        jButtonsalvar.setBackground(new java.awt.Color(0, 188, 98));
        jButtonsalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonsalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsalvar.setText("SALVAR");
        jButtonsalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalvarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonsalvar);
        jButtonsalvar.setBounds(590, 270, 100, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CL");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(580, 120, 30, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Validade");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 180, 60, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Número");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 230, 50, 16);

        jTextFieldvalidade.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextFieldvalidade.setColumns(8);
        try {
            jTextFieldvalidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextFieldvalidade);
        jTextFieldvalidade.setBounds(40, 200, 70, 22);

        jTextFieldNumero.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));
        try {
            jTextFieldNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextFieldNumero);
        jTextFieldNumero.setBounds(40, 250, 170, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 740, 310);

        setSize(new java.awt.Dimension(784, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcategoriaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalvarActionPerformed
        CharSequence chart = " ";
        if(jTextFieldPlano.getText().isEmpty() || jTextFieldcategoria.getText().isEmpty() || jTextFieldNumero.getText().contains(chart) || jTextFieldvalidade.getText().contains(chart) == true ){
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos", "Plano de Saude", 1 );
            
       }else{
            if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{editar();
            
        }
        
        dispose();
        }
         

    }//GEN-LAST:event_jButtonsalvarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel categoria;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNomedoPlano;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JFormattedTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldPlano;
    private javax.swing.JTextField jTextFieldcategoria;
    private javax.swing.JFormattedTextField jTextFieldvalidade;
    // End of variables declaration//GEN-END:variables
}
