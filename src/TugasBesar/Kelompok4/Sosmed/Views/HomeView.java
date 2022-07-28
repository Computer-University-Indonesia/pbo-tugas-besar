/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Views;

import TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel;
import TugasBesar.Kelompok4.Sosmed.Componenets.CardPanel;
import TugasBesar.Kelompok4.Sosmed.Componenets.CreatePostPanel;
import TugasBesar.Kelompok4.Sosmed.Controllers.PostController;
import java.awt.Color;
import java.util.Stack;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

/**
 *
 * @author sahanya
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    PostController controller;

    public HomeView() {
        initComponents();
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_HORIZ);
        controller = new PostController();
        homeButton.setText("Home");
        profileButton.setText("Profile");
        homeButton.isAtctive(true);
        loadPost();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profileButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        homeButton = new TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        createPostPanel1 = new TugasBesar.Kelompok4.Sosmed.Componenets.CreatePostPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 984));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 884));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1440, 600));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanel6);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1480, -1));

        createPostPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createPostPanel1MouseClicked(evt);
            }
        });
        jPanel1.add(createPostPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileButtonMouseClicked
        // TODO add your handling code here:
        profileButton.isAtctive(true);
        homeButton.isAtctive(false);

    }//GEN-LAST:event_profileButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        profileButton.isAtctive(false);
        homeButton.isAtctive(true);

    }//GEN-LAST:event_homeButtonMouseClicked

    private void createPostPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createPostPanel1MouseClicked
        // TODO add your handling code here:
        boolean created = CreatePostPanel.isCreated;    
        if(created){
            loadPost();
        }
    }//GEN-LAST:event_createPostPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void loadPost() {
        Stack<Stack> data = controller.get();
        jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.Y_AXIS));

        jPanel6.removeAll();
        jPanel6.revalidate();
        for (Stack<String> row : data) {
            CardPanel card = new CardPanel();
            System.out.println(row);

            card.setName(row.get(0));
            card.setTitle(row.get(1));
            card.setDesc(row.get(2));
            card.setDate(row.get(3));

            jPanel6.add(card);
        }
//        jPanel6.revalidate();
    }

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TugasBesar.Kelompok4.Sosmed.Componenets.CreatePostPanel createPostPanel1;
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardDashboardLabel profileButton;
    // End of variables declaration//GEN-END:variables
}