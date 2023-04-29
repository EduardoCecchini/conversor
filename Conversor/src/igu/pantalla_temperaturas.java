package igu;

import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class pantalla_temperaturas extends javax.swing.JFrame {

    public pantalla_temperaturas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbMonedasDe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbMonedasA = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        txtMontoAConvertir = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JToggleButton();
        txtMontoConvertido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(526, 426));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(526, 426));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Conversor de Temperaturas");

        jLabel6.setText("Selecciona el tipo de grados que quieras convertir");

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(526, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("De");

        cmbMonedasDe.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasDe.setForeground(new java.awt.Color(0, 0, 255));
        cmbMonedasDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°c grados centígrados", "°f grados farenheit" }));
        cmbMonedasDe.setToolTipText("tiipo de temperatura de entrada a convertir");
        cmbMonedasDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasDeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("A");

        cmbMonedasA.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasA.setForeground(new java.awt.Color(51, 153, 0));
        cmbMonedasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°f grados farenheit", "°c grados centígrados" }));
        cmbMonedasA.setToolTipText("Seleciona el tipo de grados a convertir");
        cmbMonedasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(526, 63));

        txtMontoAConvertir.setBackground(new java.awt.Color(153, 204, 255));
        txtMontoAConvertir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMontoAConvertir.setForeground(new java.awt.Color(0, 51, 255));
        txtMontoAConvertir.setToolTipText("Campo para ingresar el valor a convertir");
        txtMontoAConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoAConvertirActionPerformed(evt);
            }
        });
        txtMontoAConvertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAConvertirKeyTyped(evt);
            }
        });

        btnConvertir.setText("Convert");
        btnConvertir.setToolTipText("Convierte los valores ingresados a las temperaturas que hayas seleccionado");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        txtMontoConvertido.setEditable(false);
        txtMontoConvertido.setBackground(new java.awt.Color(204, 204, 204));
        txtMontoConvertido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMontoConvertido.setForeground(new java.awt.Color(0, 153, 51));
        txtMontoConvertido.setToolTipText("Campo donde se muestra el valor convertido");
        txtMontoConvertido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoConvertidoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Ingrese aquí el valor a convertir");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConvertir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConvertir))
                    .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(526, 105));

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Clean");
        btnReset.setToolTipText("Reinia el conversor desde el principio");
        btnReset.setMaximumSize(new java.awt.Dimension(65, 41));
        btnReset.setMinimumSize(new java.awt.Dimension(65, 41));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalir.setText("Back");
        btnSalir.setToolTipText("Vuelve al menú de inicio");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("©Copyright - Oracle_One/Alura_Latam  - by Eduardo Cecchini - 2023 ");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnSalir)
                .addGap(50, 50, 50))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel10)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jLabel10)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setText("                                                                   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMonedasDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonedasDeActionPerformed

    }//GEN-LAST:event_cmbMonedasDeActionPerformed

    private void txtMontoAConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoAConvertirActionPerformed

    }//GEN-LAST:event_txtMontoAConvertirActionPerformed

    private void txtMontoAConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAConvertirKeyTyped

    }//GEN-LAST:event_txtMontoAConvertirKeyTyped

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed

        if (txtMontoAConvertir.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Debes ingresar algún valor de la temperatura a convertir",
                    "Aviso", JOptionPane.OK_OPTION);
            txtMontoAConvertir.requestFocus();
            return;
        }
        String opcionDe = cmbMonedasDe.getSelectedItem().toString();
        String opcionA = cmbMonedasA.getSelectedItem().toString();
        stringTemperatura = txtMontoAConvertir.getText();
        if (!esNumeroAceptado(stringTemperatura)) {
            JOptionPane.showMessageDialog(null,
                    "Debes ingresar un valor numérico",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtMontoAConvertir.requestFocus();
            txtMontoAConvertir.selectAll();
            return;
        }

        switch (opcionDe) {
            case "°c grados centígrados":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    dobleValorFinal = dobleTemperatura;
                    break;
                }
                if (opcionA == "°f grados farenheit") {
                    convertirCentigrados();
                    break;
                }
                break;

            case "°f grados farenheit":
                //code...
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    dobleValorFinal = dobleTemperatura; 
                    break;
                }
                if (opcionA == "°c grados centígrados") {
                    convertirFarenheit();
                    break;
                }
                break;
        }
        txtMontoConvertido.setText(df.format(dobleValorFinal));
        finalizarConversion();
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtMontoConvertidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoConvertidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoConvertidoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMontoAConvertir.setEditable(true);
        btnConvertir.setEnabled(true);
        txtMontoAConvertir.setText("");
        txtMontoConvertido.setText("");
        cmbMonedasA.setSelectedIndex(0);
        cmbMonedasDe.setSelectedIndex(0);
        jLabel7.setText("                                                                          ");
        txtMontoAConvertir.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        pantalla_inicial abrir = null;
        abrir = new pantalla_inicial();
        abrir.setVisible(true);
        abrir.setLocationRelativeTo(null);
        abrir.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbMonedasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonedasAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonedasAActionPerformed

    public boolean esNumeroAceptado(String s) {
        try {
            dobleTemperatura = Double.valueOf(stringTemperatura);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public void convertirCentigrados() {
        dobleValorFinal = dobleTemperatura * 9;
        dobleValorFinal = dobleValorFinal / 5;
        dobleValorFinal = dobleValorFinal + 32;
        jLabel7.setText("Fórmula de conversión: [(°C * 9)/ 5] + 32");
    }

    public void convertirFarenheit() {
        dobleValorFinal = dobleTemperatura - 32;
        dobleValorFinal = dobleValorFinal * 5;
        dobleValorFinal = dobleValorFinal / 9;
        jLabel7.setText("Fórmula de conversión: [(°f - 32) * 5] / 9");
    }

    public void finalizarConversion() {
        txtMontoAConvertir.setEditable(false);
        btnConvertir.setEnabled(false);
        stringTemperatura = "";
        dobleTemperatura = 0;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConvertir;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbMonedasA;
    public static javax.swing.JComboBox<String> cmbMonedasDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtMontoAConvertir;
    public static javax.swing.JTextField txtMontoConvertido;
    // End of variables declaration//GEN-END:variables

    String stringTemperatura = "";
    double dobleTemperatura = 0;
    String stringValorFinal = "";
    double dobleValorFinal = 0;
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat df2 = new DecimalFormat("0.0000");
    DecimalFormat df3 = new DecimalFormat("0.00000");

}
