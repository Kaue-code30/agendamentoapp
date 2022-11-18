/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class MedicoPanel extends javax.swing.JPanel {

     private int linha;   
     
    public MedicoPanel() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        ajustarTabela();
        preencherTabela();
    }
    
     
  

    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    
    
    private void editarMedico(){
        
        Medico medico = MedicoDAO.getmedico(getCodigo());
        
        MedicoDialog medicoDialog
                = new MedicoDialog(null, true,medico,OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        preencherTabela();
    }
    
    
    private Integer getCodigo(){
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
     private void excluirMedico(int linha){
       
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você deseja excluir esse Médico da lista?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);    
        
        if(resposta == 0){
        MedicoDAO.excluir(getCodigo());
        preencherTabela();
        }  
    }
     
     private void preencherTabela() {
        
        tableMedicos.setModel(MedicoDAO.getmedicosModel());
        ajustarTabela();

    }
    
    private void ajustarTabela(){
        tableMedicos.getTableHeader().setReorderingAllowed(false);
        tableMedicos.setDefaultEditor(Object.class, null);
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(210);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(210);
        tableMedicos.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        excluirbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 80));
        jPanel1.setLayout(null);

        excluirbutton.setBackground(new java.awt.Color(255, 40, 68));
        excluirbutton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        excluirbutton.setForeground(new java.awt.Color(255, 255, 255));
        excluirbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/1814090_delete_garbage_trash_icon.png"))); // NOI18N
        excluirbutton.setToolTipText("Excluir a especialidade selecionada");
        excluirbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        excluirbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(excluirbutton);
        excluirbutton.setBounds(530, 270, 76, 41);

        editbutton.setBackground(new java.awt.Color(255, 250, 0));
        editbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editbutton.setForeground(new java.awt.Color(255, 255, 255));
        editbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/1814074_draw_edit_pencile_write_icon.png"))); // NOI18N
        editbutton.setToolTipText("Editar especialidade");
        editbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        editbutton.setBorderPainted(false);
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(editbutton);
        editbutton.setBounds(620, 270, 78, 41);

        newButton.setBackground(new java.awt.Color(3, 174, 34));
        newButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/299068_add_sign_icon.png"))); // NOI18N
        newButton.setToolTipText("Criar especialidade");
        newButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });
        jPanel1.add(newButton);
        newButton.setBounds(710, 270, 79, 41);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableMedicos);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 830, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed

       MedicoDialog medicoDialog = new MedicoDialog(null,

            true,OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_newButtonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed

        if (getLinha() != -1){
            editarMedico();
        } else{
            JOptionPane.showMessageDialog(this, "Por favor, selecione o "
                + "Médico que você deseja editar",
                "Médico",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_editbuttonActionPerformed

    private void excluirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbuttonActionPerformed

        linha = tableMedicos.getSelectedRow();
        if(getLinha() != -1){
            excluirMedico(linha);
        }else{
            JOptionPane.showMessageDialog(this,
                "Nenhuma especialidade foi selecionada, por favor selecione uma especialidade.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_excluirbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbutton;
    private javax.swing.JButton excluirbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newButton;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables
}
