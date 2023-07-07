/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
        setLocationRelativeTo(null);
        loadProgress();
    }

    private void loadProgress() {
        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i <= 100; i++) {
                    pgrLoading.setValue(i);
                    pgrLoading.setBackground(Color.orange);
                    lblLoading.setText("Loading" + i + "%");
                    try {
                        sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    if (i == 100) {
                        try {
                            closeWhenDone();
                        } catch (Exception ex) {
                            Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }.start();
    }

    private void closeWhenDone() throws Exception {

        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgrLoading = new javax.swing.JProgressBar();
        lblLoading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading");
        setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgrLoading.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pgrLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 288, 490, 40));

        lblLoading.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblLoading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoading.setText("Loading 99%");
        getContentPane().add(lblLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 478, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ong.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 220, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nenXanh2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JProgressBar pgrLoading;
    // End of variables declaration//GEN-END:variables
}
