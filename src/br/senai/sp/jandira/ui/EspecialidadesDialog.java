/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282191
 */
public class EspecialidadesDialog extends javax.swing.JDialog {
    
    private Especialidade especialidade;
    private OperacaoEnum operacao;
    
    public EspecialidadesDialog(java.awt.Frame parent, boolean modal,
            Especialidade e, 
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        especialidade = e;
        preencherFormulario();
        
        this.operacao = operacao;
        preencherTitulo();
        
    }
    
    public EspecialidadesDialog(java.awt.Frame parent, boolean modal,OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        
        
        
    }
    private void preencherFormulario(){
        
        jTextFieldCodigo.setText(especialidade.getCodigo().toString());
        jTextFieldNome.setText(especialidade.getNome());
        jTextFielddescricao.setText(especialidade.getDescricao());
        
    }
    
    private void preencherTitulo(){
        jLabelTitulo.setText("Especialidades - " + operacao );
        
      

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        jTextFielddescricao = new javax.swing.JTextField();
        jLabelNomedaEspecialidade = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(785, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Especialidades - ADICIONAR");
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

        descricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        descricao.setText("Descrição da especialidade:");
        jPanel2.add(descricao);
        descricao.setBounds(40, 150, 150, 16);

        jTextFielddescricao.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextFielddescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddescricaoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFielddescricao);
        jTextFielddescricao.setBounds(40, 170, 290, 30);

        jLabelNomedaEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNomedaEspecialidade.setText("Nome da especialidade:");
        jPanel2.add(jLabelNomedaEspecialidade);
        jLabelNomedaEspecialidade.setBounds(40, 90, 140, 16);

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldNome);
        jTextFieldNome.setBounds(40, 110, 170, 30);

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

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 740, 310);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalvarActionPerformed
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{editar();
            
        }
        dispose();
        
    }//GEN-LAST:event_jButtonsalvarActionPerformed
    
    private void adicionar(){
        Especialidade novaespecialidade = new Especialidade();
        novaespecialidade.setNome(jTextFieldNome.getText());      
        novaespecialidade.setDescricao(jTextFielddescricao.getText());

        EspecialidadeDAO.gravar(novaespecialidade);
        JOptionPane.showMessageDialog(this, "Especialidade gravada com sucesso",
                "Especialidade", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        especialidade.setNome(jTextFieldNome.getText());
        especialidade.setDescricao(jTextFielddescricao.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        JOptionPane.showMessageDialog(this,"Atualizada com sucesso","Especialidades",JOptionPane.INFORMATION_MESSAGE,null);
        dispose();
        
    }
    
    
    
    private void jTextFielddescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddescricaoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel descricao;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomedaEspecialidade;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFielddescricao;
    // End of variables declaration//GEN-END:variables
}
