/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Donaciones;

import ValidarCampos.ValidarCampos;
import diaketas.Modelo.ONG.ONG;
import diaketas.UI.UI;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jesús
 */
public class jRegistrarMovimiento extends javax.swing.JPanel {

    JPanel panel;
    
    /**
     * Creates new form jRegistrarMovimiento
     */
    public jRegistrarMovimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        voluntario = new javax.swing.JTextField();
        botonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonOK = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        tipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        involucrado = new javax.swing.JTextField();
        cuantia = new javax.swing.JTextField();

        setBackground(new java.awt.Color(233, 225, 242));

        jLabel20.setText("NIF Voluntario");

        voluntario.setBackground(new java.awt.Color(255, 255, 153));
        voluntario.setColumns(9);
        voluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                voluntarioKeyTyped(evt);
            }
        });

        botonCancel.setText("Cancelar");
        botonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(211, 232, 254));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Donaciones");

        botonOK.setText("Ok");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/Donaciones.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Registrar un movimiento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de movimiento");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Descripción");

        descripcion.setColumns(20);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Donacion Efectiva", "Donacian Bancaria", "Donacian Material", "Ayuda Efectiva", "Ayuda Bancaria", "Ayuda Material", "Gasto" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cuantía");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Involucrado");

        involucrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        involucrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                involucradoKeyTyped(evt);
            }
        });

        cuantia.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addContainerGap(412, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cuantia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(involucrado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1))))
                        .addGap(0, 27, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCancel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(17, 17, 17)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(involucrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOK)
                    .addComponent(botonCancel)
                    .addComponent(voluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelActionPerformed
        UI.cl.show(UI.jPrincipal, "Donaciones");
    }//GEN-LAST:event_botonCancelActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        // Comprobamos el formato de los valores introducidos
        String _tipo = (String) tipo.getSelectedItem();
        String _cuantia = cuantia.getText();
        String _involucrado = involucrado.getText();
        String _descripcion = descripcion.getText();
        String _voluntario = voluntario.getText();
        
        if (!ValidarCampos.isDouble(_cuantia)) {
            JOptionPane.showMessageDialog(this, "La Cuantia del movimiento no es correcta. Debe ser un numero", "Cuantia Movimiento inválida", JOptionPane.ERROR_MESSAGE);
        } else if (_involucrado.compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El NIF del involucrado no se ha introducido.", "NIF Involucrado", JOptionPane.ERROR_MESSAGE);
        } else if (_voluntario.compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "El NIF del voluntario no se ha introducido.", "NIF Involucrado", JOptionPane.ERROR_MESSAGE);
        } else if (!ONG.gestorVoluntarios.comprobarExistenciaVoluntario(_voluntario)) {
            JOptionPane.showMessageDialog(this, "El voluntario no existe en el sistema", "Voluntario donaciones inválido", JOptionPane.ERROR_MESSAGE);
        } else {
            // Hasta aqui no hay errores de formato
            int error = ONG.gestorDonaciones.introducirMovimiento(_tipo, Double.valueOf(_cuantia).doubleValue(), _involucrado, _descripcion, _voluntario);
            
            if (error == 1) {
                JOptionPane.showMessageDialog(this, "El donante involucrado no existe en el sistema", "Involucrado donante inválido", JOptionPane.ERROR_MESSAGE);
            } else if (error == 2) {
                JOptionPane.showMessageDialog(this, "El beneficiario involucrado no existe en el sistema", "Involucrado beneficiario inválido", JOptionPane.ERROR_MESSAGE);
            } else {
                // No hay errores tras introducir el movimiento, finalizamos
                ONG.gestorDonaciones.finRegistrarMovimiento();
            }
        }
 
        /*else if (tipo_movimiento.getSelectedIndex() == 0 || tipo_movimiento.getSelectedIndex() == 1 || tipo_movimiento.getSelectedIndex() == 2) {
            if (!ONG.gestorDonantes.comprobarDniDonante(involucrado.getText())){
            }
        } else if (tipo_movimiento.getSelectedIndex() == 4 || tipo_movimiento.getSelectedIndex() == 5 || tipo_movimiento.getSelectedIndex() == 6) {
            if (!ONG.gestorBeneficiarios.comprobarExistenciaBeneficiario(involucrado.getText())){
            }
        }*/
        
    }//GEN-LAST:event_botonOKActionPerformed

    private void voluntarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_voluntarioKeyTyped
        if (voluntario.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_voluntarioKeyTyped

    private void involucradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_involucradoKeyTyped
        if (involucrado.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_involucradoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancel;
    private javax.swing.JButton botonOK;
    private javax.swing.JTextField cuantia;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextField involucrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox tipo;
    private javax.swing.JTextField voluntario;
    // End of variables declaration//GEN-END:variables
}
