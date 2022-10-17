

package br.senai.sp.jandira.ui;

public class AgendaAppFrame extends javax.swing.JFrame {
    
    private EspecialidadesPanel especialidadesPanel;
    
    private final int Pos_x = 10;
    private final int Pos_y = 170;
    private final int Pos_w = 873;
    private final int Pos_h = 340;
    

    public AgendaAppFrame() {
        initComponents();
        initPanels();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agendaButton = new javax.swing.JButton();
        pacienteButton2 = new javax.swing.JButton();
        medicosButton = new javax.swing.JButton();
        planoDeSaudeButton = new javax.swing.JButton();
        especialidadesButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        PanelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("System-scheduling 1.0");
        setResizable(false);
        getContentPane().setLayout(null);

        agendaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        agendaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/296212_schedule_year_month_agenda_time_icon (1).png"))); // NOI18N
        agendaButton.setToolTipText("Agendamentos");
        agendaButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        agendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(agendaButton);
        agendaButton.setBounds(90, 100, 52, 50);

        pacienteButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pacienteButton2.setForeground(new java.awt.Color(204, 255, 255));
        pacienteButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/4715020_avatar_people_person_profile_user_icon.png"))); // NOI18N
        pacienteButton2.setToolTipText("Pacientes");
        pacienteButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(pacienteButton2);
        pacienteButton2.setBounds(220, 100, 60, 50);

        medicosButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        medicosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/4715024_avatar_nurse_people_person_profile_icon.png"))); // NOI18N
        medicosButton.setToolTipText("Médicos");
        medicosButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        medicosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(medicosButton);
        medicosButton.setBounds(290, 100, 60, 50);

        planoDeSaudeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        planoDeSaudeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/8530567_id_badge_icon.png"))); // NOI18N
        planoDeSaudeButton.setToolTipText("Planos de Saúde");
        planoDeSaudeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(planoDeSaudeButton);
        planoDeSaudeButton.setBounds(360, 100, 60, 50);

        especialidadesButton.setBackground(new java.awt.Color(204, 0, 204));
        especialidadesButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        especialidadesButton.setForeground(new java.awt.Color(204, 51, 0));
        especialidadesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/3844437_hamburger_list_menu_more_navigation_icon.png"))); // NOI18N
        especialidadesButton.setToolTipText("Especialidades");
        especialidadesButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        especialidadesButton.setContentAreaFilled(false);
        especialidadesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadesButton);
        especialidadesButton.setBounds(150, 100, 60, 50);

        sairButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sairButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/ui/4831049_door_enter_entrance_exit_leave_icon.png"))); // NOI18N
        sairButton.setText("Sair");
        sairButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton);
        sairButton.setBounds(810, 100, 77, 50);

        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HomeButton.setText("HOME");
        HomeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HomeButton);
        HomeButton.setBounds(10, 100, 70, 50);

        PanelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelHome.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("CL");
        PanelHome.add(jLabel2);
        jLabel2.setBounds(40, 50, 120, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Sistema para agendamento de Consultas");
        PanelHome.add(jLabel3);
        jLabel3.setBounds(40, 110, 290, 20);

        jLabel4.setFont(new java.awt.Font("Swis721 Blk BT", 1, 18)); // NOI18N
        jLabel4.setText("Suporte:");
        PanelHome.add(jLabel4);
        jLabel4.setBounds(650, 210, 90, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("E-mail:  kaue.slima000@gmail.com");
        PanelHome.add(jLabel5);
        jLabel5.setBounds(650, 240, 190, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Sisacon.com.br");
        PanelHome.add(jLabel6);
        jLabel6.setBounds(650, 260, 90, 16);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        PanelHome.add(jPanel1);
        jPanel1.setBounds(0, 150, 870, 10);

        getContentPane().add(PanelHome);
        PanelHome.setBounds(10, 170, 873, 340);

        headerPanel.setBackground(new java.awt.Color(51, 153, 255));
        headerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        headerPanel.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clínica Lima");
        jLabel1.setToolTipText("");
        headerPanel.add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 58);

        getContentPane().add(headerPanel);
        headerPanel.setBounds(0, 0, 900, 80);

        setSize(new java.awt.Dimension(912, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agendaButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
    dispose();                // TODO add your handling code here:
    }//GEN-LAST:event_sairButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        especialidadesButton.setBackground(new java.awt.Color(255,255,255));
        HomeButton.setBackground(new java.awt.Color(51,153,255));
        PanelHome.setVisible(true);
        especialidadesPanel.setVisible(false);
        
    }//GEN-LAST:event_HomeButtonActionPerformed
        
    private void medicosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicosButtonActionPerformed

    private void especialidadesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadesButtonActionPerformed
        especialidadesButton.setBackground(new java.awt.Color(51,153,255));
        HomeButton.setBackground(new java.awt.Color(255,255,255));
        PanelHome.setVisible(false);
        especialidadesPanel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidadesButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JButton agendaButton;
    private javax.swing.JButton especialidadesButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton medicosButton;
    private javax.swing.JButton pacienteButton2;
    private javax.swing.JButton planoDeSaudeButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        especialidadesPanel = new EspecialidadesPanel();
        especialidadesPanel.setBounds(Pos_x, Pos_y, Pos_w, Pos_h);
        getContentPane().add(especialidadesPanel);
        especialidadesPanel.setVisible(false);
        
        
    }

}
