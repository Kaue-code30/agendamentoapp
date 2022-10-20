
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PlanoDeSaudePanel extends javax.swing.JPanel {
    
    private int linha;
   
    public PlanoDeSaudePanel() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
        
    }

    private int getLinha() {
        linha = tablePlano.getSelectedRow();
        return linha;
    }
    
    
    private void editarplanoDeSaude(){
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        preencherTabela();
    }
    
    
    private Integer getCodigo(){
        String codigoStr = tablePlano.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        excluirbutton = new javax.swing.JButton();
        editbutton = new javax.swing.JButton();
        newBotton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePlano = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Planos de Saúde", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
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

        newBotton.setBackground(new java.awt.Color(3, 174, 34));
        newBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/299068_add_sign_icon.png"))); // NOI18N
        newBotton.setToolTipText("Criar especialidade");
        newBotton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        newBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBottonActionPerformed(evt);
            }
        });
        jPanel1.add(newBotton);
        newBotton.setBounds(710, 270, 79, 41);

        tablePlano.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablePlano);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 30, 830, 220);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 350);
    }// </editor-fold>//GEN-END:initComponents
    
    

    
    
    private void excluirPlanoDeSaude(int linha){
       
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você deseja excluir esse Plano de Saude da lista?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);    
        
        if(resposta == 0){
        PlanoDeSaudeDAO.excluir(getCodigo());
        preencherTabela();
        }  
    }
    
    private void preencherTabela() {
        
        tablePlano.setModel(PlanoDeSaudeDAO.getplanosDeSaudeModel());
        ajustarTabela();

    }
    
    private void ajustarTabela(){
        tablePlano.getTableHeader().setReorderingAllowed(false);
        tablePlano.setDefaultEditor(Object.class, null);
        tablePlano.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlano.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablePlano.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePlano.getColumnModel().getColumn(2).setPreferredWidth(210);
        tablePlano.getColumnModel().getColumn(3).setPreferredWidth(210);
    }
    
    
    
    
    
    private void excluirbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirbuttonActionPerformed

        linha = tablePlano.getSelectedRow();
        if(getLinha() != -1){
            excluirPlanoDeSaude(linha);
        }else{
            JOptionPane.showMessageDialog(this,
                "Nenhuma especialidade foi selecionada, por favor selecione uma especialidade.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_excluirbuttonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed

        if (getLinha() != -1){
            editarplanoDeSaude();
        } else{
            JOptionPane.showMessageDialog(this, "Por favor, selecione o "
                + "Plano que você deseja editar",
                "Plano de Saúde",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_editbuttonActionPerformed

    private void newBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBottonActionPerformed
         PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null,                    
        true,OperacaoEnum.ADICIONAR);
       planoDeSaudeDialog.setVisible(true);  
       preencherTabela();
       
        

    }//GEN-LAST:event_newBottonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbutton;
    private javax.swing.JButton excluirbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newBotton;
    private javax.swing.JTable tablePlano;
    // End of variables declaration//GEN-END:variables
}
