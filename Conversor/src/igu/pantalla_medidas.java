package igu;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class pantalla_medidas extends javax.swing.JFrame {

    public pantalla_medidas() {
        initComponents();
    }

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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(526, 426));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Conversor de Medidas");

        jLabel6.setText("Realiza conversiones de medidas de longitud");

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(526, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("De");

        cmbMonedasDe.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasDe.setForeground(new java.awt.Color(0, 0, 255));
        cmbMonedasDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kilómetro", "metro", "centímetro", "milímetro", "milla naútica", "milla", "yarda", "pie", "pulgada" }));
        cmbMonedasDe.setToolTipText("Seleciona el tipo de medida de entrada a convertir");
        cmbMonedasDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasDeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("A");

        cmbMonedasA.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasA.setForeground(new java.awt.Color(51, 153, 0));
        cmbMonedasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "milla naútica", "milla", "yarda", "pie", "pulgada", "kilómetro", "metro", "centímetro", "milímetro" }));
        cmbMonedasA.setToolTipText("Seleciona el tipo de medida a convertir");
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
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(526, 63));

        txtMontoAConvertir.setBackground(new java.awt.Color(204, 255, 255));
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

        btnConvertir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo\\Downloads\\arrow1_40529.png")); // NOI18N
        btnConvertir.setToolTipText("Convierte los valores ingresados entre las medidas que hayas elegido");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        txtMontoConvertido.setEditable(false);
        txtMontoConvertido.setBackground(new java.awt.Color(204, 204, 204));
        txtMontoConvertido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMontoConvertido.setForeground(new java.awt.Color(0, 153, 51));
        txtMontoConvertido.setToolTipText("Campo donde se muestra el monto convertido");
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
                    .addComponent(txtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvertir)
                    .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
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
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo\\Downloads\\back_icon-icons.com_74430.png")); // NOI18N
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

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel7.setText("                                                                   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
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
                    "Debes ingresar algún valor de la medida a convertir",
                    "Aviso", JOptionPane.OK_OPTION);
            txtMontoAConvertir.requestFocus();
            return;
        }
        String opcionDe = cmbMonedasDe.getSelectedItem().toString();
        String opcionA = cmbMonedasA.getSelectedItem().toString();
        stringMedida = txtMontoAConvertir.getText();
        if (!esNumeroAceptado(stringMedida)) {
            JOptionPane.showMessageDialog(null,
                    "Debes ingresar un valor numérico: positivo y distinto de cero",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtMontoAConvertir.requestFocus();
            txtMontoAConvertir.selectAll();
            return;
        }
// opciones de: 
        switch (opcionDe) {
            case "kilómetro":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirKilometroMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirKilometroMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirKilometroYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirKilometroPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirKilometroPulgada();
                    break;
                }
                if (opcionA == "metro") {
                    convertirKilometroMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirKilometroCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirKilometroMilimetro();
                    break;
                }
                break;

            case "metro":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirMetroMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirMetroMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirMetroYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirMetroPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirMetroPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirMetroKilometro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirMetroCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirMetroMilimetro();
                    break;
                }
                break;

            case "centímetro":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirCentimetroMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirCentimetroMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirCentimetroYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirCentimetroPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirCentimetroPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirCentimetroKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirCentimetroMetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirCentimetroMilimetro();
                    break;
                }
                break;
                
            case "milímetro":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirMilimetroMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirMilimetroMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirMilimetroYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirMilimetroPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirMilimetroPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirMilimetroKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirMilimetroMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirMilimetroCentimetro();
                    break;
                }
                break;
                
                case "milla naútica":
               if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla") {
                    convertirMillaNauticaMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirMillaNauticaYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirMillaNauticaPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirMillaNauticaPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirMillaNauticaKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirMillaNauticaMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirMillaNauticaCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirMillaNauticaMilimetro();
                    break;
                }
           
            case "milla":
               if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirMillaMillaNautica();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirMillaYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirMillaPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirMillaPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirMillaKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirMillaMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirMillaCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirMillaMilimetro();
                    break;
                }
                break;
            
            case "yarda":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirYardaMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirYardaMilla();
                    break;
                }
                if (opcionA == "pie") {
                    convertirYardaPie();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirYardaPulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirYardaKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirYardaMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirYardaCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirYardaMilimetro();
                    break;
                }
                break;
            
            case "pie":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirPieMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirPieMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirPieYarda();
                    break;
                }
                if (opcionA == "pulgada") {
                    convertirPiePulgada();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirPieKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirPieMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirPieCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirPieMilimetro();
                    break;
                }
                break;
            
            case "pulgada":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "milla naútica") {
                    convertirPulgadaMillaNautica();
                    break;
                }
                if (opcionA == "milla") {
                    convertirPulgadaMilla();
                    break;
                }
                if (opcionA == "yarda") {
                    convertirPulgadaYarda();
                    break;
                }
                if (opcionA == "pie") {
                    convertirPulgadaPie();
                    break;
                }
                if (opcionA == "kilómetro") {
                    convertirPulgadaKilometro();
                    break;
                }
                if (opcionA == "metro") {
                    convertirPulgadaMetro();
                    break;
                }
                if (opcionA == "centímetro") {
                    convertirPulgadaCentimetro();
                    break;
                }
                if (opcionA == "milímetro") {
                    convertirPulgadaMilimetro();
                    break;
                }
                break;
        }
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
            dobleMedida = Double.valueOf(stringMedida);
            if (dobleMedida < 0 || dobleMedida == 0) {
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public void finalizarConversion() {
        txtMontoAConvertir.setEditable(false);
        btnConvertir.setEnabled(false);
        stringMedida = "";
        dobleMedida = 0;
    }

    //---- de kilómetros a...
    public void convertirKilometroMillaNautica() {
        //System.out.println("Has elegido convertir: Kilómetros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 1.852;
        jLabel7.setText("Fórmula: kilométro / 1.852");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirKilometroMilla() {
        //System.out.println("Has elegido convertir: Kilómetros a Millas");
        dobleValorFinal = dobleMedida / 1.609;
        jLabel7.setText("Fórmula: kilométro / 1.609");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirKilometroYarda() {
        //System.out.println("Has elegido convertir: Kilómetros a Yardas");
        dobleValorFinal = dobleMedida * 1093.61;
        jLabel7.setText("Fórmula: kilométro * 1093.61");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirKilometroPie() {
        //System.out.println("Has elegido convertir: Kilómetros a Pies");
        dobleValorFinal = dobleMedida * 3280.84;
        jLabel7.setText("Fórmula: kilométro * 3280.84");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirKilometroPulgada() {
        //System.out.println("Has elegido convertir: Kilómetros a Pulgadas");
        dobleValorFinal = dobleMedida * 39370.1;
        jLabel7.setText("Fórmula: kilométro * 39370.1");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirKilometroMetro() {
        //System.out.println("Has elegido convertir: Kilómetros a Metros");
        dobleValorFinal = dobleMedida * 1000;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: kilométro * 1000");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirKilometroCentimetro() {
        //System.out.println("Has elegido convertir: Kilómetros a Centrímetros");
        dobleValorFinal = dobleMedida * 100000;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: kilométro * 100000");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirKilometroMilimetro() {
        //System.out.println("Has elegido convertir: Kilómetros a Milímetros");
        dobleValorFinal = dobleMedida * 1000000;
        System.out.println(dobleValorFinal);
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: kilométro * 1000000 (1e+6)");
        txtMontoConvertido.setText(stringValorFinal);
    }

    //--- de metros a....
    public void convertirMetroMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 1852;
        jLabel7.setText("Fórmula: metro / 1852");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMetroMilla() {
        //System.out.println("Has elegido convertir: Metros a Millas");
        dobleValorFinal = dobleMedida / 1609;
        jLabel7.setText("Fórmula: metro / 1609");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMetroYarda() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida * 1.09361;
        jLabel7.setText("Fórmula: metro * 1.09361");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirMetroPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida * 3.28084;
        jLabel7.setText("Fórmula: metro * 3.28084");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirMetroPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida * 39.3701;
        jLabel7.setText("Fórmula: metro * 39.3701");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    public void convertirMetroKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 1000;
        jLabel7.setText("Fórmula: metro / 1000");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    public void convertirMetroCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida * 100;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: metro * 100");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirMetroMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 1000;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: metro * 1000");
        txtMontoConvertido.setText(stringValorFinal);
    }

    //----- de centímetros a...
    public void convertirCentimetroMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 185200;
        jLabel7.setText("Fórmula: centímetro / 185200");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirCentimetroMilla() {
        //System.out.println("Has elegido convertir: Metros a Millas");
        dobleValorFinal = dobleMedida / 160900;
        jLabel7.setText("Fórmula: centímetro / 160900");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirCentimetroYarda() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida / 91.44;
        jLabel7.setText("Fórmula: centímetro / 91.44");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirCentimetroPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida / 30.48;
        jLabel7.setText("Fórmula: centímetro / 30.48");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirCentimetroPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida / 2.54;
        jLabel7.setText("Fórmula: centímetro / 2.54");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirCentimetroKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 100000;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: centímetro / 100000");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirCentimetroMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida / 100;
        jLabel7.setText("Fórmula: centímetro / 100");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirCentimetroMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 10;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: centímetro * 10");
        txtMontoConvertido.setText(stringValorFinal);
    }

    //----- de milímetros a...
    public void convertirMilimetroMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 1.852e+6;
        jLabel7.setText("Fórmula: milímetro / 1.852e+6");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroMilla() {
        //System.out.println("Has elegido convertir: Metros a Millas");
        dobleValorFinal = dobleMedida / 1.609e+6;
        jLabel7.setText("Fórmula: milímetro / 1.609e+6");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroYarda() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida / 914.4;
        jLabel7.setText("Fórmula: milímetro / 914.4");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida / 304.8;
        jLabel7.setText("Fórmula: milímetro / 304.8");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida / 25.4;
        jLabel7.setText("Fórmula: milímetro / 25.4");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 1000000;
        jLabel7.setText("Fórmula: milímetro / 1000000 (1e+6)");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMilimetroMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida / 1000;
        jLabel7.setText("Fórmula: milímetro / 1000");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    public void convertirMilimetroCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida / 10;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milímetro / 10");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }
    
     //----- de millas naúticas a...
    public void convertirMillaNauticaMilla() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida * 1.15078;
        jLabel7.setText("Fórmula: milla naútica * 1.15078");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirMillaNauticaYarda() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida * 2025.37;
        jLabel7.setText("Fórmula: milla naútica * 2025.37");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirMillaNauticaPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida * 6076.12;
        jLabel7.setText("Fórmula: milla naútica * 6076.12");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirMillaNauticaPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida * 72913.4;
        jLabel7.setText("Fórmula: milla naútica * 72913.4");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirMillaNauticaKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida * 1.852;
        jLabel7.setText("Fórmula: milla naútica * 1.852");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    public void convertirMillaNauticaMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida * 1852;
        jLabel7.setText("Fórmula: milla naútica * 1852");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirMillaNauticaCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 185200;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milla naútica * 185200");
        txtMontoConvertido.setText(stringValorFinal);
    }
    
    public void convertirMillaNauticaMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 1.852;
        jLabel7.setText("Fórmula: milla naútica * 1.852e+6");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }
    
    //----- de millas a...
    public void convertirMillaMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 1.151;
        jLabel7.setText("Fórmula: milla / 1.151");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirMillaYarda() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida * 1760;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milla * 1760");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirMillaPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida * 5280;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milla * 5280");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirMillaPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida * 63360;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milla * 63360");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirMillaKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida * 1.60934;
        jLabel7.setText("Fórmula: milla * 1.60934");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirMillaMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida * 1609.34;
        jLabel7.setText("Fórmula: milla * 1609.34");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

    public void convertirMillaCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 160934;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: milla * 160934");
        txtMontoConvertido.setText(stringValorFinal);
    }
    
    public void convertirMillaMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 1.609;
        jLabel7.setText("Fórmula: milla * 1.609e+6");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    //----- de yardas a...
    public void convertirYardaMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 2025.37;
        jLabel7.setText("Fórmula: yarda / 2025.37");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirYardaMilla() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida / 1760;
        jLabel7.setText("Fórmula: yarda / 1760");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirYardaPie() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida * 3;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: yarda * 3");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirYardaPulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida * 36;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: yarda * 36");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirYardaKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 1094;
        jLabel7.setText("Fórmula: yarda / 1094");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirYardaMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida / 1.094;
        jLabel7.setText("Fórmula: yarda * 1.094");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirYardaCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 91.44;
        jLabel7.setText("Fórmula: yarda * 91.44");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }
    
    public void convertirYardaMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 914.4;
        jLabel7.setText("Fórmula: yarda * 914.4");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }
    
    //----- de pies a...
    public void convertirPieMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 6076.12;
        jLabel7.setText("Fórmula: pie / 6076.12");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPieMilla() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida / 5280;
        jLabel7.setText("Fórmula: pie / 5280");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPieYarda() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida / 3;
        jLabel7.setText("Fórmula: pie / 3");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirPiePulgada() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida * 12;
        stringValorFinal = String.valueOf(dobleValorFinal);
        jLabel7.setText("Fórmula: pie * 12");
        txtMontoConvertido.setText(stringValorFinal);
    }

    public void convertirPieKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 3280.84;
        jLabel7.setText("Fórmula: pie / 3280.84");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPieMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida / 3.28084;
        jLabel7.setText("Fórmula: pie / 3.28084");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirPieCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 30.48;
        jLabel7.setText("Fórmula: pie * 30.48");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }
    
    public void convertirPieMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 304.8;
        jLabel7.setText("Fórmula: pie * 304.8");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }

     //----- de pulgadas a...
    public void convertirPulgadaMillaNautica() {
        //System.out.println("Has elegido convertir: Metros a Millas Naúticas");
        dobleValorFinal = dobleMedida / 729134;
        jLabel7.setText("Fórmula: pulgada / 729134");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPulgadaMilla() {
        //System.out.println("Has elegido convertir: Metros a Yardas");
        dobleValorFinal = dobleMedida / 63360;
        jLabel7.setText("Fórmula: pulgada / 63360");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPulgadaYarda() {
        //System.out.println("Has elegido convertir: Metros a Pies");
        dobleValorFinal = dobleMedida / 36;
        jLabel7.setText("Fórmula: pulgada / 36");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPulgadaPie() {
        //System.out.println("Has elegido convertir: Metros a Pulgadas");
        dobleValorFinal = dobleMedida / 12;
        jLabel7.setText("Fórmula: pulgada / 12");
        txtMontoConvertido.setText(df3.format(dobleValorFinal));
    }

    public void convertirPulgadaKilometro() {
        //System.out.println("Has elegido convertir: Metros a Kilómetros");
        dobleValorFinal = dobleMedida / 393701;
        jLabel7.setText("Fórmula: pulgada / 393701");
        txtMontoConvertido.setText(df4.format(dobleValorFinal));
    }

    public void convertirPulgadaMetro() {
        //System.out.println("Has elegido convertir: Metros a Centrímetros");
        dobleValorFinal = dobleMedida / 39.37;
        jLabel7.setText("Fórmula: pulgada / 39.37");
        txtMontoConvertido.setText(df2.format(dobleValorFinal));
    }

    public void convertirPulgadaCentimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 2.54;
        jLabel7.setText("Fórmula: pulgada * 2.54");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
    }
    
    public void convertirPulgadaMilimetro() {
        //System.out.println("Has elegido convertir: Metros a Milímetros");
        dobleValorFinal = dobleMedida * 25.4;
        jLabel7.setText("Fórmula: pulgada * 25.4");
        txtMontoConvertido.setText(df.format(dobleValorFinal));
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

    //Variables del conversor
    String stringMedida = "";
    double dobleMedida = 0;
    String stringValorFinal = "";
    double dobleValorFinal = 0;
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat df2 = new DecimalFormat("0.0000");
    DecimalFormat df3 = new DecimalFormat("0.000000");
    DecimalFormat df4 = new DecimalFormat("0.000000000");
    

}
