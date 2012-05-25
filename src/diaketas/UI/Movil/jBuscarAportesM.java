/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Movil;

/**
 *
 * @author MIGUEL
 */

import diaketas.ConexionBD;
import diaketas.Modelo.ONG.Donante;
import diaketas.Modelo.ONG.Movimiento;
import diaketas.UI.UI;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;



public class jBuscarAportesM extends javax.swing.JPanel {

    protected jSTeclado tv;
    Donante donante = null;
    
    /**
     * Creates new form jBuscarAportesM
     */
    public jBuscarAportesM() {
        initComponents();      
        
        tv = new jSTeclado(cantidad1);
        donante = diaketas.diaketas.ong.gestorDonantes.obtenerDatosDonante();
        
        fecha1.setEnabled(false);
        fecha2.setEnabled(false);
        cantidad1.setEnabled(false);
        cantidad2.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cantidad1 = new javax.swing.JTextField();
        cantidad2 = new javax.swing.JTextField();
        fecha1 = new javax.swing.JTextField();
        fecha2 = new javax.swing.JTextField();
        operadorCantidad = new javax.swing.JComboBox();
        operadorFecha = new javax.swing.JComboBox();
        codigoTipo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(204, 255, 204));
        setForeground(new java.awt.Color(204, 255, 204));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(2, 2));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Cuantia");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("     Buscar Aportes");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Tipo");

        cantidad1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidad1MouseClicked(evt);
            }
        });
        cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad1ActionPerformed(evt);
            }
        });

        cantidad2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidad2MouseClicked(evt);
            }
        });

        fecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecha1MouseClicked(evt);
            }
        });

        fecha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecha2MouseClicked(evt);
            }
        });

        operadorCantidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Mayor", "Menor", "Igual", "Entre" }));
        operadorCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorCantidadActionPerformed(evt);
            }
        });

        operadorFecha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Mayor", "Menor", "Igual", "Entre" }));
        operadorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operadorFechaActionPerformed(evt);
            }
        });

        codigoTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cualquiera", "Donacion Efectiva", "Donacion Bancaria", "Donacion Material" }));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addGap(182, 182, 182))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(codigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cantidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(cantidad2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                .addComponent(fecha2))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(155, 155, 155))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(operadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(operadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operadorCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(cantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(operadorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );

        operadorCantidad.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String involucrado = donante.obtenerNIFCIF();
     
        diaketas.UI.Movil.UI.movimientosEncontrados = diaketas.diaketas.ong.gestorDonaciones.filtrarMovimientosM(operadorCantidad.getSelectedIndex(),cantidad1.getText(),cantidad2.getText(),operadorFecha.getSelectedIndex(),fecha1.getText(),fecha2.getText(),involucrado , codigoTipo.getSelectedIndex());
        
        
        JPanel panel = new jListarAportesM();
        diaketas.UI.Movil.UI.jPrincipal.add("ListarAportes", panel);
        diaketas.UI.Movil.UI.cl.show(diaketas.UI.Movil.UI.jPrincipal, "ListarAportes");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void operadorCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorCantidadActionPerformed
        // TODO add your handling code here:
        
        switch(operadorCantidad.getSelectedIndex()){
            case 0:
                cantidad1.setEnabled(false);
                cantidad2.setEnabled(false);
                break;
            case 1:
                cantidad1.setEnabled(true);
                cantidad2.setEnabled(false);
                break;
            case 2:
                cantidad1.setEnabled(true);
                cantidad2.setEnabled(false);
                break;
            case 3:
                cantidad1.setEnabled(true);
                cantidad2.setEnabled(false);
                break;
            case 4:
                cantidad1.setEnabled(true);
                cantidad2.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_operadorCantidadActionPerformed

    private void operadorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operadorFechaActionPerformed
        // TODO add your handling code here:
        
        switch(operadorFecha.getSelectedIndex()){
            case 0:
                fecha1.setEnabled(false);
                fecha2.setEnabled(false);
                break;
            case 1:
                fecha1.setEnabled(true);
                fecha2.setEnabled(false);
                break;
            case 2:
                fecha1.setEnabled(true);
                fecha2.setEnabled(false);
                break;
            case 3:
                fecha1.setEnabled(true);
                fecha2.setEnabled(false);
                break;
            case 4:
                fecha1.setEnabled(true);
                fecha2.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_operadorFechaActionPerformed

    private void cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidad1ActionPerformed

    private void cantidad1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidad1MouseClicked
        // TODO add your handling code here:
        tv.asociarCampo(cantidad1);
        tv.activar();
    }//GEN-LAST:event_cantidad1MouseClicked

    private void cantidad2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidad2MouseClicked
        // TODO add your handling code here:
        tv.asociarCampo(cantidad2);
        tv.activar();
    }//GEN-LAST:event_cantidad2MouseClicked

    private void fecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha1MouseClicked
        // TODO add your handling code here:
        tv.asociarCampo(fecha1);
        tv.activar();
    }//GEN-LAST:event_fecha1MouseClicked

    private void fecha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha2MouseClicked
        // TODO add your handling code here:
        tv.asociarCampo(fecha2);
        tv.activar();
    }//GEN-LAST:event_fecha2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad1;
    private javax.swing.JTextField cantidad2;
    private javax.swing.JComboBox codigoTipo;
    private javax.swing.JTextField fecha1;
    private javax.swing.JTextField fecha2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox operadorCantidad;
    private javax.swing.JComboBox operadorFecha;
    // End of variables declaration//GEN-END:variables
}