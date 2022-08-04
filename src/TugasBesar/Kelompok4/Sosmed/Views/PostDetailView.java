/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Views;

import TugasBesar.Kelompok4.Sosmed.Componenets.CardComment;
import TugasBesar.Kelompok4.Sosmed.Controllers.CommentController;
import TugasBesar.Kelompok4.Sosmed.Controllers.PostController;
import java.awt.Color;
import java.util.Stack;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;

/**
 *
 * @author FRZ
 */
public class PostDetailView extends javax.swing.JFrame {

    /**
     * Creates new form PostDetailView
     */
    PostController controller;
    CommentController commentController;
    private String postId;

    public PostDetailView() {
        initComponents();
    }

    public PostDetailView(String id) {
        initComponents();

        this.setPostId(id);
        controller = new PostController();
        commentController = new CommentController();
        LoadPost();
        loadComment();

    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    private void LoadPost() {
//        System.out.println(this.getPostId());
        Stack<String> post = controller.getDetail(this.getPostId());
        System.out.println("post = " + post);
        cardPanel1.setName(post.get(0));
        cardPanel1.setTitle(post.get(1));
        cardPanel1.setDesc(post.get(2));
        cardPanel1.setDate(post.get(3));
        cardPanel1.setLikeCount(post.get(5));
        cardPanel1.setId(post.get(4));
        cardPanel1.hideButton();
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
        jButton1 = new javax.swing.JButton();
        createComment = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentField = new javax.swing.JTextArea();
        commentButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        postPanel = new javax.swing.JPanel();
        cardPanel1 = new TugasBesar.Kelompok4.Sosmed.Componenets.CardPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 984));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 50, -1, -1));

        createComment.setBackground(new java.awt.Color(255, 255, 255));
        createComment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 100, true));
        createComment.setPreferredSize(new java.awt.Dimension(1300, 200));
        createComment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1220, 120));

        commentField.setColumns(20);
        commentField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        commentField.setRows(5);
        jScrollPane2.setViewportView(commentField);

        createComment.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        commentButton.setBackground(new java.awt.Color(241, 241, 241));
        commentButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 25, true));
        commentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                commentButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                commentButtonMouseExited(evt);
            }
        });
        commentButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Comment");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 40));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        commentButton.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        createComment.add(commentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 150, -1, -1));

        jPanel1.add(createComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 274, -1, -1));

        postPanel.setBackground(new java.awt.Color(255, 255, 255));
        postPanel.setPreferredSize(new java.awt.Dimension(1440, 264));
        postPanel.setLayout(new javax.swing.BoxLayout(postPanel, javax.swing.BoxLayout.LINE_AXIS));
        postPanel.add(cardPanel1);

        jPanel1.add(postPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(153, 153, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1300, 600));

        commentPanel.setBackground(new java.awt.Color(255, 255, 255));
        commentPanel.setLayout(new javax.swing.BoxLayout(commentPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(commentPanel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 484, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        String post_id = this.postId;
        String comment = commentField.getText();
        String[] inputs = {post_id, comment};
        commentController.store(inputs);
        commentField.setText("");
        loadComment();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:

        commentButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        commentButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_jLabel2MouseExited

    private void commentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_commentButtonMouseClicked

    private void commentButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentButtonMouseEntered
        // TODO add your handling code here:
        commentButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
        System.out.println("mouse enter");
    }//GEN-LAST:event_commentButtonMouseEntered

    private void commentButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentButtonMouseExited
        // TODO add your handling code here:
        commentButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_commentButtonMouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        new HomeView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PostDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostDetailView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostDetailView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private TugasBesar.Kelompok4.Sosmed.Componenets.CardPanel cardPanel1;
    private javax.swing.JPanel commentButton;
    private javax.swing.JTextArea commentField;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JPanel createComment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel postPanel;
    // End of variables declaration//GEN-END:variables

    public void loadComment() {
        Stack<Stack> data = commentController.getDetail(this.postId);

        commentPanel.setLayout(new BoxLayout(commentPanel, BoxLayout.Y_AXIS));

        commentPanel.removeAll();
        commentPanel.revalidate();
        for (Stack<String> row : data) {
            CardComment card = new CardComment();
            card.setNama(row.get(1));
            card.setComment(row.get(2));
            commentPanel.add(card);
        }
    }

}
