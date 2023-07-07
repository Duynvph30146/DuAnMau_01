/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class dongHo extends javax.swing.JFrame {

    public dongHo() {
        initComponents();
        setLocationRelativeTo(null);
        dongHo();
    }

    private void dongHo() {
        new Thread() {
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();
                    int gio = ca.get(Calendar.HOUR);
                    int phut = ca.get(Calendar.MINUTE);
                    int giay = ca.get(Calendar.SECOND);
                    int AM_PM = ca.get(Calendar.AM_PM);

                    String day_night;
                    if (AM_PM == 1) {
                        day_night = "PM";
                    } else {
                        day_night = "AM";
                    }
                    lblDongHo.setText(gio + ":" + phut + ":" + giay + " " + day_night);
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        lblDongHo = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đồng hồ");

        lblDongHo.setBackground(new java.awt.Color(255, 0, 51));
        lblDongHo.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 0, 0));
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Alarm.png"))); // NOI18N
        lblDongHo.setText("00:00:00 AM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblDongHo)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblDongHo)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dongHo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblDongHo;
    // End of variables declaration//GEN-END:variables
}
