/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author catas
 */
public class Dificultad extends javax.swing.JFrame {

    /**
     * Creates new form Dificultad
     */
    public Dificultad() {
       // initComponents();
        init();
    }
    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        cierre = new javax.swing.JLabel();
        nvDificil = new javax.swing.JLabel();
        nvfacil = new javax.swing.JLabel();
        nvMedio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(14, 19, 49));
        fondo.setLayout(null);

        cierre.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        cierre.setForeground(new java.awt.Color(255, 255, 255));
        cierre.setText("X");
        cierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cierre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cierreMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cierreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cierreMouseExited(evt);
            }
        });
        fondo.add(cierre);
        cierre.setBounds(410, 10, 25, 20);

        nvDificil.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        nvDificil.setForeground(new java.awt.Color(255, 255, 255));
        nvDificil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvDificil.setText("Modo diablo");
        fondo.add(nvDificil);
        nvDificil.setBounds(140, 230, 180, 40);

        nvfacil.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        nvfacil.setForeground(new java.awt.Color(255, 255, 255));
        nvfacil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvfacil.setText("noob");
        fondo.add(nvfacil);
        nvfacil.setBounds(180, 130, 90, 40);

        nvMedio.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        nvMedio.setForeground(new java.awt.Color(255, 255, 255));
        nvMedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nvMedio.setText("Normal");
        fondo.add(nvMedio);
        nvMedio.setBounds(170, 180, 120, 40);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona la dificultad");
        fondo.add(jLabel2);
        jLabel2.setBounds(110, 50, 250, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cierreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierreMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cierreMouseClicked

    private void cierreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierreMouseEntered
        cierre.setForeground(Color.RED);
    }//GEN-LAST:event_cierreMouseEntered

    private void cierreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cierreMouseExited
        cierre.setForeground(Color.WHITE);
    }//GEN-LAST:event_cierreMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cierre;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nvDificil;
    private javax.swing.JLabel nvMedio;
    private javax.swing.JLabel nvfacil;
    // End of variables declaration//GEN-END:variables
}
