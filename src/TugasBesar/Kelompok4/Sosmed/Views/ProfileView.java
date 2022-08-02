/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Views;

import TugasBesar.Kelompok4.Sosmed.Constants.Authentication;
import TugasBesar.Kelompok4.Sosmed.Controllers.PostController;

/**
 *
 * @author FRZ
 */
public class ProfileView extends javax.swing.JFrame {

    /**
     * Creates new form ProfileView
     */
    public ProfileView() {
        initComponents();
        this.setResizable(false);
        homeButton.setText("Home");
        profileButton.setText("Profile");
        profileButton.isAtctive(true);
        nama.setText(Authentication.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        homeButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        nama = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 984));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(21, 115, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1440, 100));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FSociety");
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        profileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileButtonMouseClicked(evt);
            }
        });
        jPanel3.add(profileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, -1, -1));

        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        jPanel3.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 50, true));
        jPanel4.setPreferredSize(new java.awt.Dimension(440, 100));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nama.setText("Nama");
        nama.setPreferredSize(new java.awt.Dimension(440, 100));
        jPanel4.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1440, 700));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanel6);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_profileButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeView().setVisible(true);
    }//GEN-LAST:event_homeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nama;
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel profileButton;
    // End of variables declaration//GEN-END:variables
}
