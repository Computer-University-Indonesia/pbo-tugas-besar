/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Componenets;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author sahanya
 */
public class CardPanel extends javax.swing.JPanel {

    public boolean isLiked = false;
    /**
     * Creates new form CardPanel
     */
    public CardPanel() {
        initComponents();
    }

    public void setName(String TXTName) {
        this.TXTName.setText(TXTName);
    }


    public void setTitle(String text) {
        this.TXTTittle.setText(text);
    }

    public void setDesc(String text) {
        this.TXTDesc.setText(text);
    }

    public void setDate(String text) {
        this.TXTDate.setText(text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgorundPanel = new javax.swing.JPanel();
        TXTTittle = new javax.swing.JLabel();
        TXTDate = new javax.swing.JLabel();
        TXTName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTDesc = new javax.swing.JTextArea();
        likeButton = new javax.swing.JToggleButton();
        TXTLike = new javax.swing.JLabel();
        detailButton = new javax.swing.JPanel();
        detailText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1440, 284));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgorundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgorundPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 125, true));
        backgorundPanel.setPreferredSize(new java.awt.Dimension(1380, 250));
        backgorundPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgorundPanelMouseClicked(evt);
            }
        });
        backgorundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTTittle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TXTTittle.setText("Title");
        TXTTittle.setPreferredSize(new java.awt.Dimension(400, 30));
        backgorundPanel.add(TXTTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        TXTDate.setText("Date");
        backgorundPanel.add(TXTDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 210, -1, -1));

        TXTName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TXTName.setText("Nama");
        TXTName.setPreferredSize(new java.awt.Dimension(400, 30));
        backgorundPanel.add(TXTName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1300, 90));

        TXTDesc.setEditable(false);
        TXTDesc.setColumns(20);
        TXTDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TXTDesc.setLineWrap(true);
        TXTDesc.setRows(3);
        jScrollPane1.setViewportView(TXTDesc);

        backgorundPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        likeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasBesar/Kelompok4/Sosmed/Componenets/heart.png"))); // NOI18N
        likeButton.setPreferredSize(new java.awt.Dimension(50, 30));
        likeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                likeButtonMouseClicked(evt);
            }
        });
        backgorundPanel.add(likeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 205, -1, -1));

        TXTLike.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TXTLike.setText("100");
        TXTLike.setPreferredSize(new java.awt.Dimension(40, 30));
        backgorundPanel.add(TXTLike, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 205, -1, -1));

        detailButton.setBackground(new java.awt.Color(241, 241, 241));
        detailButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(21, 115, 255), 25, true));
        detailButton.setPreferredSize(new java.awt.Dimension(100, 30));
        detailButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detailButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detailButtonMouseExited(evt);
            }
        });
        detailButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailText.setBackground(new java.awt.Color(241, 241, 241));
        detailText.setForeground(new java.awt.Color(255, 255, 255));
        detailText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailText.setText("Detail");
        detailText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        detailText.setPreferredSize(new java.awt.Dimension(40, 30));
        detailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                detailTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                detailTextMouseExited(evt);
            }
        });
        detailButton.add(detailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        backgorundPanel.add(detailButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 205, -1, -1));

        add(backgorundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void likeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_likeButtonMouseClicked
        // TODO add your handling code here:
        isLiked = !isLiked;
        if(isLiked == true){
            this.TXTLike.setText("200");
        }else{
            this.TXTLike.setText("500");
        }
    }//GEN-LAST:event_likeButtonMouseClicked

    private void backgorundPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgorundPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backgorundPanelMouseClicked

    private void detailButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailButtonMouseEntered
        // TODO add your handling code here:
        detailButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
    }//GEN-LAST:event_detailButtonMouseEntered

    private void detailButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailButtonMouseExited
        // TODO add your handling code here:
        detailButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_detailButtonMouseExited

    private void detailButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailButtonMouseClicked
        // TODO add your handling code here:
        System.out.println("Detail Post");
    }//GEN-LAST:event_detailButtonMouseClicked

    private void detailTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailTextMouseEntered
        // TODO add your handling code here:
        detailButton.setBorder(new LineBorder(new Color(1, 95, 235), 25, true));
    }//GEN-LAST:event_detailTextMouseEntered

    private void detailTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailTextMouseExited
        // TODO add your handling code here:
        detailButton.setBorder(new LineBorder(new Color(21, 115, 255), 25, true));
    }//GEN-LAST:event_detailTextMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TXTDate;
    private javax.swing.JTextArea TXTDesc;
    private javax.swing.JLabel TXTLike;
    private javax.swing.JLabel TXTName;
    private javax.swing.JLabel TXTTittle;
    private javax.swing.JPanel backgorundPanel;
    private javax.swing.JPanel detailButton;
    private javax.swing.JLabel detailText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton likeButton;
    // End of variables declaration//GEN-END:variables
}
