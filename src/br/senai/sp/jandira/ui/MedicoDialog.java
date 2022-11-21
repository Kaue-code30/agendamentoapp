/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author 22282191
 */
public class MedicoDialog extends javax.swing.JDialog {
     
    private Medico medico;
    private OperacaoEnum operacao;
    private Especialidade especialidades;
    
    public MedicoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    public MedicoDialog(java.awt.Frame parent, boolean modal,
            Medico m, 
            OperacaoEnum operacao) {
        
        super(parent, modal);
        initComponents();
        
        medico = m;
      
        
        this.operacao = operacao;
        preencherTitulo();
        preecherEspecialidades();
        
    }
    
     public MedicoDialog(java.awt.Frame parent, boolean modal,OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        
        
        
    }
     
     public void preencherFormulario(){
        
        jTextFieldCodigo.setText(medico.getCodigo().toString());
        jTextFielNomeDoMedico.setText(medico.getNome());
        jTextFieldCrm.setText(medico.getCrm());
        jFormattedTextFieldTelefone.setText(medico.getTelefone());
        jFormattedTextEmail.setText(medico.getEmail());
        DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        jFormattedTextFieldDataDeNascimento.setText(medico.getDataDeNascimento().format(barra));
        preecherEspecialidades();
       
        
        
        
    }
   
    
    private void preencherTitulo(){
        jLabelTitulo.setText("Médicos - " + operacao );
        
     

    }
    
    private void preecherEspecialidades(){
       jTableEspecialidades.setModel(EspecialidadeDAO.getEspecialidadesMoldel());
        EspecialidadeDAO.criarListaDeEspecialidade();
       
    }
    
    private void adicionar(){
        Medico novoMedico = new Medico();
        novoMedico.setNome(jTextFielNomeDoMedico.getText());      
        novoMedico.setCrm(jTextFieldCrm.getText());
        novoMedico.setEmail(jFormattedTextEmail.getText());
        novoMedico.setTelefone(jFormattedTextFieldTelefone.getText());
        novoMedico.setDataDeNascimento(LocalDate.parse(jFormattedTextFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
            MedicoDAO.gravar(novoMedico);
        JOptionPane.showMessageDialog(this, "Novo médico gravado com sucesso",
                "Médico", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }
    
    private void editar(){
        medico.setNome(jTextFielNomeDoMedico.getText());
        medico.setCrm(jTextFieldCrm.getText());
        medico.setDataDeNascimento(LocalDate.parse(jFormattedTextFieldDataDeNascimento.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        medico.setEmail(jFormattedTextEmail.getText());
        medico.setTelefone(jFormattedTextFieldTelefone.getText());
        preecherEspecialidades();
            
        
        
        MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(this,"Atualizada com sucesso","Médicos",JOptionPane.INFORMATION_MESSAGE,null);
        dispose();
        
        
    }
    
//    public void  listaDeEspecialidades(){
//     jScrollPaneEspecialidades = especialidades;
//     
//   
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        jTextFielNomeDoMedico = new javax.swing.JTextField();
        jLabelCRM = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextEmail = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPaneEspecialidades = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEspecialidades = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldCrm = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Médicos - ADICIONAR");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(40, 30, 370, 40);

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
        descricao.setText("Nome do Médico:");
        jPanel2.add(descricao);
        descricao.setBounds(250, 30, 100, 16);

        jTextFielNomeDoMedico.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jTextFielNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFielNomeDoMedico);
        jTextFielNomeDoMedico.setBounds(250, 50, 200, 30);

        jLabelCRM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelCRM.setText("CRM:");
        jPanel2.add(jLabelCRM);
        jLabelCRM.setBounds(130, 30, 40, 16);

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Data de Nascimento:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(470, 30, 120, 16);

        jFormattedTextFieldDataDeNascimento.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        try {
            jFormattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextFieldDataDeNascimento);
        jFormattedTextFieldDataDeNascimento.setBounds(470, 50, 120, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Telefone:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(350, 90, 70, 16);

        jFormattedTextFieldTelefone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextFieldTelefone);
        jFormattedTextFieldTelefone.setBounds(350, 110, 130, 30);

        jFormattedTextEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jFormattedTextEmail);
        jFormattedTextEmail.setBounds(500, 110, 150, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(500, 90, 90, 16);

        jScrollPaneEspecialidades.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED))));

        jTableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableEspecialidades);

        jScrollPaneEspecialidades.setViewportView(jScrollPane1);

        jPanel2.add(jScrollPaneEspecialidades);
        jScrollPaneEspecialidades.setBounds(10, 120, 120, 150);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(200, 120, 120, 150);

        jTextFieldCrm.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        try {
            jTextFieldCrm.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextFieldCrm);
        jTextFieldCrm.setBounds(130, 50, 110, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 153));
        jButton1.setForeground(new java.awt.Color(102, 255, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(140, 210, 50, 40);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 130, 50, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Lista de Especialidades");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 100, 130, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Especialidades Médico:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(200, 100, 130, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFielNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielNomeDoMedicoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalvarActionPerformed
        if (jTextFieldCrm.getText().isBlank() || jTextFielNomeDoMedico.getText().isBlank() ||
                jFormattedTextEmail.getText().isBlank() || jFormattedTextFieldDataDeNascimento.getText().isBlank() || jFormattedTextFieldTelefone.getText().isBlank() == true){
            JOptionPane.showConfirmDialog(this, "Por favor preencha todos os campos", "Especialidades",JOptionPane.WARNING_MESSAGE,1);
        }else{
            if(operacao == OperacaoEnum.ADICIONAR ){
                adicionar();

            }

            else{editar();
            }
            dispose();
        }
       

    }//GEN-LAST:event_jButtonsalvarActionPerformed

    private void jFormattedTextFieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextFieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataDeNascimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MedicoDialog dialog = new MedicoDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JLabel descricao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonsalvar;
    private javax.swing.JFormattedTextField jFormattedTextEmail;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataDeNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCRM;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneEspecialidades;
    private javax.swing.JTable jTableEspecialidades;
    private javax.swing.JTextField jTextFielNomeDoMedico;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JFormattedTextField jTextFieldCrm;
    // End of variables declaration//GEN-END:variables
}
