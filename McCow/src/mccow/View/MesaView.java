/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mccow.View;

import mccow.Administracion.Mesa;

/**
 *
 * @author enrique
 */
public class MesaView extends javax.swing.JPanel {
    Mesa mesa;

    /**
     * Creates new form MesaView
     */
    public MesaView() {
        initComponents();
        mesa = new Mesa();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMesa = new javax.swing.JButton();

        setBackground(null);
        setForeground(null);
        setOpaque(false);

        btnMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mccow/Imagenes/MesaJapon.png"))); // NOI18N
        btnMesa.setBorderPainted(false);
        btnMesa.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMesa;
    // End of variables declaration//GEN-END:variables
}
