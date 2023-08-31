/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Registro extends javax.swing.JFrame {

    DefaultTableModel modelo;
    int filas;

    public Registro() {
        initComponents();
        modelo = new DefaultTableModel();
        this.setTitle("Registro de Animales");
        this.setLocationRelativeTo(null);
        modelo.addColumn("Nombre");
        modelo.addColumn("Especie");
        modelo.addColumn("Nombre Cientifico");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Zona");
        this.tablaDatos.setModel(modelo);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCientifico = new javax.swing.JTextField();
        textDescripcion = new javax.swing.JTextField();
        textZona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btonGuardar = new javax.swing.JButton();
        btonLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textEspecie = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btonDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del animal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 96, 110, 30));

        jLabel2.setText("Nombre cientifico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 100, 20));

        jLabel3.setText("Descripcion general");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 130, 20));

        jLabel4.setText("Zona");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 40, 20));

        textNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 174, -1));

        textCientifico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(textCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 174, -1));

        textDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(textDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 174, -1));

        textZona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(textZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 174, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLabel5.setText("Registro de Animales");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1/Save-as_37111.png"))); // NOI18N
        btonGuardar.setText("Registrar");
        btonGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        btonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1/clean_icon_215881.png"))); // NOI18N
        btonLimpiar.setText("Limpiar Formulario");
        btonLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel6.setText("Especie");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 60, 30));

        textEspecie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(textEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 174, -1));

        tablaDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 484, 265));

        jLabel7.setFont(new java.awt.Font("sansserif", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("Animales Registrados");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1/refreshpageaction_114520.png"))); // NOI18N
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        btonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1/ic_delete_128_28267.png"))); // NOI18N
        btonDelete.setText("Eliminar");
        btonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/h1/Fondo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -10, -1, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void btonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonGuardarActionPerformed

        if (textNombre.getText().isEmpty() || textEspecie.getText().isEmpty()
                || textCientifico.getText().isEmpty() || textDescripcion.getText().isEmpty()
                || textZona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay Campos Vacios");

        } else {
            try {
                String[] info = new String[5];

                info[0] = textNombre.getText();
                info[1] = textEspecie.getText();
                info[2] = textCientifico.getText();
                info[3] = textDescripcion.getText();
                info[4] = textZona.getText();
                modelo.addRow(info);
                JOptionPane.showMessageDialog(this, "Animal Registrado");
                textNombre.setText("");
                textEspecie.setText("");
                textCientifico.setText("");
                textDescripcion.setText("");
                textZona.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR");
            }
        }
    }//GEN-LAST:event_btonGuardarActionPerformed


    private void btonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonLimpiarActionPerformed
        textNombre.setText("");
        textEspecie.setText("");
        textCientifico.setText("");
        textDescripcion.setText("");
        textZona.setText("");
    }//GEN-LAST:event_btonLimpiarActionPerformed

    private void btonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonDeleteActionPerformed
        int filaseleccionada = tablaDatos.getSelectedRow();
        if (filaseleccionada >= 0) {
            modelo.removeRow(filaseleccionada);
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
            textNombre.setText("");
            textEspecie.setText("");
            textCientifico.setText("");
            textDescripcion.setText("");
            textZona.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Tabla Vacia o No se Selecciono Ninguna Fila");
        }
    }//GEN-LAST:event_btonDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] info = new String[5];
        info[0] = textNombre.getText();
        info[1] = textEspecie.getText();
        info[2] = textCientifico.getText();
        info[3] = textDescripcion.getText();
        info[4] = textZona.getText();

        for (int i = 0; i < tablaDatos.getColumnCount(); i++) {
            modelo.setValueAt(info[i], filas, i);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int seleccion = tablaDatos.getSelectedRow();
        textNombre.setText(tablaDatos.getValueAt(seleccion, 0).toString());
        textEspecie.setText(tablaDatos.getValueAt(seleccion, 1).toString());
        textCientifico.setText(tablaDatos.getValueAt(seleccion, 2).toString());
        textDescripcion.setText(tablaDatos.getValueAt(seleccion, 3).toString());
        textZona.setText(tablaDatos.getValueAt(seleccion, 4).toString());
        filas = seleccion;
    }//GEN-LAST:event_tablaDatosMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btonDelete;
    private javax.swing.JButton btonGuardar;
    private javax.swing.JButton btonLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField textCientifico;
    private javax.swing.JTextField textDescripcion;
    private javax.swing.JTextField textEspecie;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textZona;
    // End of variables declaration//GEN-END:variables
}
