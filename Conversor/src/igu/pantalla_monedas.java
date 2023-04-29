package igu;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.ConexionScraping;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author Eduardo
 */
public class pantalla_monedas extends javax.swing.JFrame {

    public pantalla_monedas() throws IOException {
        initComponents();
        JOptionPane.showMessageDialog(null,
                "Aguarde un instante: acualizando "
                + "datos de cotizaciones online...");
        obtnerCotizaciones();
        txtMontoAConvertir.requestFocus();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtMontoAConvertir = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JToggleButton();
        txtMontoConvertido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(526, 426));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Conversor de Monedas");

        jLabel6.setText("Cotización del tipo de cambio actualizado online");

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setPreferredSize(new java.awt.Dimension(526, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("De");

        cmbMonedasDe.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasDe.setForeground(new java.awt.Color(0, 0, 255));
        cmbMonedasDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "u$s dolar USD", "€ euro", "£ libra esterlina GBP", "¥ yen japonés JPY", "w won surcoreano KRW", "$ peso ARS" }));
        cmbMonedasDe.setToolTipText("Seleciona el tipo de moneda de entrada a convertir");
        cmbMonedasDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasDeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("A");

        cmbMonedasA.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        cmbMonedasA.setForeground(new java.awt.Color(51, 153, 0));
        cmbMonedasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$ peso ARS", "w won surcoreano KRW", "¥ yen japonés JPY", "£ libra esterlina GBP", "€ euro", "u$s dolar USD" }));
        cmbMonedasA.setToolTipText("Seleciona el tipo de moneda de salida de la conversion / cambio");
        cmbMonedasA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMonedasAActionPerformed(evt);
            }
        });

        jLabel7.setText("                                                              ");

        jLabel8.setText("                                                                                             ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMonedasDe, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbMonedasA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 255, 204));
        jPanel11.setPreferredSize(new java.awt.Dimension(526, 63));

        txtMontoAConvertir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtMontoAConvertir.setForeground(new java.awt.Color(0, 51, 255));
        txtMontoAConvertir.setToolTipText("Campo para ingresar el monto a convertir");
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
        btnConvertir.setToolTipText("Convierte los valores ingresados a las monedas seleccionada");
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
        jLabel9.setText("Ingrese aquí el monto a convertir");

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
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConvertir)))
                .addGap(15, 15, 15)
                .addComponent(jLabel9))
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 204));
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
                .addGap(96, 96, 96)
                .addComponent(jLabel10)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(45, 45, 45))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel6)))
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
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMonedasDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonedasDeActionPerformed

    }//GEN-LAST:event_cmbMonedasDeActionPerformed

    private void cmbMonedasAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMonedasAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMonedasAActionPerformed

    private void txtMontoAConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoAConvertirActionPerformed

    }//GEN-LAST:event_txtMontoAConvertirActionPerformed

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
        jLabel8.setText("                                                                          ");
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

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (txtMontoAConvertir.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Debes ingresar algún valor del monto a convertir",
                    "Aviso", JOptionPane.OK_OPTION);
            return;
        }
        String opcionDe = cmbMonedasDe.getSelectedItem().toString();
        String opcionA = cmbMonedasA.getSelectedItem().toString();
        stringMoneda = txtMontoAConvertir.getText();
        if (!esNumeroAceptado(stringMoneda)) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor numérico: positivo y distinto de cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtMontoAConvertir.requestFocus();
            txtMontoAConvertir.selectAll();
            return;
        }
// opciones de: 
        switch (opcionDe) {
            case "u$s dolar USD":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "$ peso ARS") {
                    convertirDolarPeso();
                    break;
                }
                if (opcionA == "w won surcoreano KRW") {
                    convertirDolarWon();
                    break;
                }
                if (opcionA == "¥ yen japonés JPY") {
                    convertirDolarYen();
                    break;
                }
                if (opcionA == "£ libra esterlina GBP") {
                    convertirDolarLibra();
                    break;
                }
                if (opcionA == "€ euro") {
                    convertirDolarEuro();
                    break;
                }
                break;

            case "€ euro":
                //code...
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "$ peso ARS") {
                    convertirEuroPeso();
                    break;
                }
                if (opcionA == "w won surcoreano KRW") {
                    convertirEuroWon();
                    break;
                }
                if (opcionA == "¥ yen japonés JPY") {
                    convertirEuroYen();
                    break;
                }
                if (opcionA == "£ libra esterlina GBP") {
                    convertirEuroLibra();
                    break;
                }
                if (opcionA == "u$s dolar USD") {
                    convertirEuroDolar();
                    break;
                }
                break;

            case "£ libra esterlina GBP":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "$ peso ARS") {
                    convertirLibraPeso();
                    break;
                }
                if (opcionA == "w won surcoreano KRW") {
                    convertirLibraWon();
                    break;
                }
                if (opcionA == "¥ yen japonés JPY") {
                    System.out.println("Convertir Libra a Yen");
                    convertirLibraYen();
                    break;
                }
                if (opcionA == "€ euro") {
                    convertirLibraEuro();
                    break;
                }
                if (opcionA == "u$s dolar USD") {
                    convertirLibraDolar();
                    break;
                }
                break;

            case "¥ yen japonés JPY":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "$ peso ARS") {
                    convertirYenPeso();
                    break;
                }
                 if (opcionA == "w won surcoreano KRW") {
                    convertirYenWon();
                    break;
                }
                if (opcionA == "£ libra esterlina GBP") {
                    convertirYenLibra();
                    break;
                }
                if (opcionA == "€ euro") {
                    convertirYenEuro();
                    break;
                }
                if (opcionA == "u$s dolar USD") {
                    convertirYenDolar();
                    break;
                }
                break;

            case "w won surcoreano KRW":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "$ peso ARS") {
                    convertirWonPeso();
                    break;
                }
                 if (opcionA == "¥ yen japonés JPY") {
                    convertirWonYen();
                    break;
                }
                if (opcionA == "£ libra esterlina GBP") {
                    convertirWonLibra();
                    break;
                }
                if (opcionA == "€ euro") {
                    convertirWonEuro();
                    break;
                }
                if (opcionA == "u$s dolar USD") {
                    convertirWonDolar();
                    break;
                }
                break;

            case "$ peso ARS":
                if (opcionDe == opcionA) {
                    txtMontoConvertido.setEnabled(true);
                    txtMontoConvertido.setText(txtMontoAConvertir.getText());
                    break;
                }
                if (opcionA == "w won surcoreano KRW") {
                    convertirPesoWon();
                    break;
                }
                 if (opcionA == "¥ yen japonés JPY") {
                    convertirPesoYen();
                    break;
                }
                if (opcionA == "£ libra esterlina GBP") {
                    convertirPesoLibra();
                    break;
                }
                if (opcionA == "€ euro") {
                    convertirPesoEuro();
                    break;
                }
                if (opcionA == "u$s dolar USD") {
                    convertirPesoDolar();
                    break;
                }
                break;
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtMontoAConvertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAConvertirKeyTyped
    }//GEN-LAST:event_txtMontoAConvertirKeyTyped

    public void obtnerCotizaciones() {
        //------cotizacion dólar -----------
        webPageDolar = "https://www.cotizacion-dolar.com.ar/cotizacion-hoy.php";
        ConexionScraping conexion = new ConexionScraping();
        conexion.setWebPage(webPageDolar);
        try {
            conexion.setHtml(Jsoup.connect(conexion.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web"
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc = Jsoup.parse(conexion.getHtml());
        conexion.setClaseElementos("dolar_num ahorrovalor");
        Elements elementos = doc.getElementsByClass(conexion.getClaseElementos());
        ArrayList<String> capturas = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos.forEach((cadena) -> {
            capturas.add(cadena.text());
        });

        //System.out.println(capturas);
        cotizacionMoneda = capturas.get(7);
        char[] depuraDato = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato[i])) {
                stringMoneda += depuraDato[i];
            }
        }
        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 1000;
        stringMoneda = String.valueOf(dobleMoneda);
        stringDolar = stringMoneda;
        dobleDolar = dobleMoneda;

// ------------ cotización Euro -----------------------
        webPageEuro = "https://www.cotizacion-dolar.com.ar/cotizacion-hoy.php";
        ConexionScraping conexion2 = new ConexionScraping();
        conexion2.setWebPage(webPageEuro);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion2.setHtml(Jsoup.connect(conexion2.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web"
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc2 = Jsoup.parse(conexion2.getHtml());
        conexion2.setClaseElementos("dolar_num ahorrovalor");
        Elements elementos2 = doc2.getElementsByClass(conexion2.getClaseElementos());
        ArrayList<String> capturas2 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos2.forEach((cadena) -> {
            capturas2.add(cadena.text());
        });

        //System.out.println(capturas2);
        cotizacionMoneda = capturas2.get(11);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato2 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato2[i])) {
                stringMoneda += depuraDato2[i];
            }
        }

        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 100;
        stringMoneda = String.valueOf(dobleMoneda);
        stringEuro = stringMoneda;
        dobleEuro = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;

// ------------ cotización Libra -----------------------
        webPageLibra = "https://es.investing.com/currencies/gbp-ars";
        ConexionScraping conexion3 = new ConexionScraping();
        conexion3.setWebPage(webPageLibra);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion3.setHtml(Jsoup.connect(conexion3.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web"
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc3 = Jsoup.parse(conexion3.getHtml());
        conexion3.setClaseElementos("text-2xl");
        Elements elementos3 = doc3.getElementsByClass(conexion3.getClaseElementos());
        ArrayList<String> capturas3 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos3.forEach((cadena) -> {
            capturas3.add(cadena.text());
        });

        //System.out.println(capturas3);
        cotizacionMoneda = capturas3.get(2);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato3 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato3[i])) {
                stringMoneda += depuraDato3[i];
            }
        }

        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 10000;
        stringMoneda = String.valueOf(dobleMoneda);
        stringLibra = stringMoneda;
        dobleLibra = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;
        // ------------ cotización Yen -----------------------
        webPageYen = "https://es.investing.com/currencies/jpy-ars";
        ConexionScraping conexion4 = new ConexionScraping();
        conexion4.setWebPage(webPageYen);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion4.setHtml(Jsoup.connect(conexion4.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web "
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc4 = Jsoup.parse(conexion4.getHtml());
        conexion4.setClaseElementos("text-2xl");
        Elements elementos4 = doc4.getElementsByClass(conexion4.getClaseElementos());
        ArrayList<String> capturas4 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos4.forEach((cadena) -> {
            capturas4.add(cadena.text());
        });

        //System.out.println(capturas3);
        cotizacionMoneda = capturas4.get(2);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato4 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato4[i])) {
                stringMoneda += depuraDato4[i];
            }
        }

        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 10000;
        stringMoneda = String.valueOf(dobleMoneda);
        stringYen = stringMoneda;
        dobleYen = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;

        // ------------ cotización Won Surcoreano-----------------------
        webPageWon = "https://es.investing.com/currencies/ars-krw";
        ConexionScraping conexion5 = new ConexionScraping();
        conexion5.setWebPage(webPageWon);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion5.setHtml(Jsoup.connect(conexion5.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale mal, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web "
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc5 = Jsoup.parse(conexion5.getHtml());
        conexion5.setClaseElementos("text-2xl");
        Elements elementos5 = doc5.getElementsByClass(conexion5.getClaseElementos());
        ArrayList<String> capturas5 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos5.forEach((cadena) -> {
            capturas5.add(cadena.text());
        });

        //System.out.println(capturas3);
        cotizacionMoneda = capturas5.get(2);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato5 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato5[i])) {
                stringMoneda += depuraDato5[i];
            }
        }

        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 100;
        //como la cotización es a la iversa es decir de Peso a Won---
        //System.out.println("Cotizacion de Peso a Won: " + dobleMoneda);
        dobleMoneda = 1 / dobleMoneda;
        //System.out.println("Resultado después de la división: " + dobleMoneda);
        //si algo sale aml, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
        stringMoneda = String.valueOf(dobleMoneda);
        stringWon = stringMoneda;
        dobleWon = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;

        //----------- Extras Dólar y Euro a Peso: valor Internacional
        //------------ para realizar cálculos entre monedas

        //------------ Dólar a Peso cotización Internacional---------
        webPageDolar2 = "https://es.investing.com/currencies/usd-ars";
        ConexionScraping conexion6 = new ConexionScraping();
        conexion6.setWebPage(webPageDolar2);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion6.setHtml(Jsoup.connect(conexion6.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale mal, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web "
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc6 = Jsoup.parse(conexion6.getHtml());
        conexion6.setClaseElementos("text-2xl");
        Elements elementos6 = doc6.getElementsByClass(conexion6.getClaseElementos());
        ArrayList<String> capturas6 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos6.forEach((cadena) -> {
            capturas6.add(cadena.text());
        });

        //System.out.println(capturas6);
        cotizacionMoneda = capturas6.get(2);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato6 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato6[i])) {
                stringMoneda += depuraDato6[i];
            }
        }
        
        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 10000;
        stringMoneda = String.valueOf(dobleMoneda);
        stringDolar2 = stringMoneda;
        dobleDolar2 = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;

        //------------ Euro a Peso cotización Internacional---------
        webPageEuro2 = "https://es.investing.com/currencies/eur-ars";
        ConexionScraping conexion7 = new ConexionScraping();
        conexion7.setWebPage(webPageEuro2);
        cotizacionMoneda = "";
        stringMoneda = "";
        dobleMoneda = 0;
        try {
            conexion7.setHtml(Jsoup.connect(conexion7.getWebPage()).userAgent("Mozilla/5.0").timeout(100000).get().html());
            //con esto hago el scraping para obstener la cotizacion del dólar en la web
        } catch (IOException ex) {
            //si algo sale mal, capturo la excepción, muestro el mensaje de error y salgo de esta pantalla
            System.out.println("Excepción al obtener datos desde la web " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "No se ha podido obtener datos desde la web "
                    + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            pantalla_inicial abrir = new pantalla_inicial();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
            this.setVisible(false);
        }
        Document doc7 = Jsoup.parse(conexion7.getHtml());
        conexion7.setClaseElementos("text-2xl");
        Elements elementos7 = doc7.getElementsByClass(conexion7.getClaseElementos());
        ArrayList<String> capturas7 = new ArrayList<>();
        //creo un array para gusrdar los datos capturados y trabajar sobre ellos
        elementos7.forEach((cadena) -> {
            capturas7.add(cadena.text());
        });

        //System.out.println(capturas7);
        cotizacionMoneda = capturas7.get(2);
        //System.out.println("Cotizacion Euro (dato crudo): " + cotizacionMoneda);
        char[] depuraDato7 = cotizacionMoneda.toCharArray();
        for (int i = 0; i < cotizacionMoneda.length(); i++) {
            if (Character.isDigit(depuraDato7[i])) {
                stringMoneda += depuraDato7[i];
            }
        }
        dobleMoneda = Double.valueOf(stringMoneda);
        dobleMoneda /= 10000;
        stringMoneda = String.valueOf(dobleMoneda);
        stringEuro2 = stringMoneda;
        dobleEuro2 = dobleMoneda;
        stringMoneda = "";
        dobleMoneda = 0;
        //-------------- muestro en consola para saber si se hacen 
        //las cotizaciones en línea de todas las monedas
        System.out.println("Cotización Dólar a Peso: " + dobleDolar);
        System.out.println("Cotización Euro a Peso: " + dobleEuro);
        System.out.println("Cotización Libra a Peso: " + dobleLibra);
        System.out.println("Cotización Yen a Peso: " + dobleYen);
        System.out.println("Cotización Won a Peso: " + dobleWon);
        System.out.println("Cotización(internacional) Dólar a Peso: " + dobleDolar2);
        System.out.println("Cotización(internacional) Euro a Peso: " + dobleEuro2);

    }
// Sector métodos de conversión por orden de aparición en pantalla de la App
        
    public void convertirDolarPeso() {
        jLabel7.setText("Cotizacion Dólar: $ " + df.format(dobleDolar) + " (*) - Fuente: " + webPageDolar);
        jLabel8.setText("(*)Dolar ahorro: dedes sumarle 65% (impuesto país + ganancias (deducible))");
        valorFinal = dobleDolar * dobleMoneda;
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirDolarWon() {
        dobleAuxiliar = dobleDolar2 / dobleWon;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Dólar: w " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirDolarYen() {
        dobleAuxiliar = dobleDolar2 / dobleYen;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Dólar: ¥ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                      ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirDolarLibra() {
        dobleAuxiliar = dobleLibra / dobleDolar2;
        dobleAuxiliar = 1 / dobleAuxiliar;
        //System.out.println("resultado neto D->L: " + dobleAuxiliar);
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Dólar: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                    ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirDolarEuro() {
        dobleAuxiliar = dobleEuro2 / dobleDolar2;
        dobleAuxiliar = 1 / dobleAuxiliar;
        //System.out.println("resultado neto D->E: " + dobleAuxiliar);
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Dólar: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirEuroPeso() {
        valorFinal = dobleEuro * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: $ " + df.format(dobleEuro) + " - Fuente: " + webPageEuro);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
        
    public void convertirEuroWon() {
        dobleAuxiliar = dobleEuro2 / dobleWon;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: w " + df.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirEuroYen() {
        dobleAuxiliar = dobleEuro2 / dobleYen;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: ¥ " + df.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirEuroLibra() {
        dobleAuxiliar = dobleLibra / dobleEuro2;
        dobleAuxiliar = 1 / dobleAuxiliar; 
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirEuroDolar() {
        dobleAuxiliar = dobleEuro2 / dobleDolar2;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Euro: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
     public void convertirLibraPeso() {
        valorFinal = dobleLibra * dobleMoneda;
        jLabel7.setText("Cotizacion Libra: $ " + df2.format(dobleLibra) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }    
       
    public void convertirLibraWon() {
        dobleAuxiliar = dobleLibra / dobleWon;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Libra: w " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirLibraYen() {
        dobleAuxiliar = dobleLibra / dobleYen;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Libra: ¥ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirLibraEuro() {
        dobleAuxiliar = dobleLibra / dobleEuro2;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Libra: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirLibraDolar() {
        dobleAuxiliar = dobleLibra / dobleDolar2;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Libra: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirYenPeso() {
        valorFinal = dobleYen * dobleMoneda;
        jLabel7.setText("Cotizacion Yen: $ " + df2.format(dobleYen) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }    
       
    public void convertirYenWon() {
        dobleAuxiliar = dobleYen / dobleWon;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Yen: w " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirYenLibra() {
        dobleAuxiliar = dobleLibra / dobleYen;
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Yen: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirYenEuro() {
        dobleAuxiliar = dobleEuro2 / dobleYen;
        dobleAuxiliar = 1 / dobleAuxiliar; 
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Yen: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirYenDolar() {
        dobleAuxiliar = dobleDolar2 / dobleYen;
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Yen: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirWonPeso() {
        valorFinal = dobleWon * dobleMoneda;
        jLabel7.setText("Cotizacion Won: $ " + df2.format(dobleWon) + " - Fuente: " + webPageWon);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }    
       
    public void convertirWonYen() {
        dobleAuxiliar = dobleYen / dobleWon;
        dobleAuxiliar = 1 / dobleAuxiliar; 
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Won: ¥ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageWon);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirWonLibra() {
        dobleAuxiliar = dobleLibra / dobleWon;
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Won: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageWon);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirWonEuro() {
        dobleAuxiliar = dobleEuro2 / dobleWon;
        dobleAuxiliar = 1 / dobleAuxiliar; 
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Won: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageWon);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirWonDolar() {
        dobleAuxiliar = dobleDolar2 / dobleWon;
        dobleAuxiliar = 1 / dobleAuxiliar;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Won: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar2);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoWon() {
        dobleAuxiliar = 1 / dobleWon;  
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Peso: w " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageWon);
        jLabel8.setText("                                                                         ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }    
       
    public void convertirPesoYen() {
        dobleAuxiliar = 1 / dobleYen;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Peso: ¥ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageYen);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoLibra() {
        dobleAuxiliar = 1 / dobleLibra;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Peso: £ " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageLibra);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoEuro() {
        dobleAuxiliar = 1 / dobleEuro;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Peso: € " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageEuro);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    public void convertirPesoDolar() {
        dobleAuxiliar = 1 / dobleDolar;
        valorFinal = dobleAuxiliar * dobleMoneda;
        jLabel7.setText("Cotizacion Peso: u$s " + df2.format(dobleAuxiliar) + " - Fuente: " + webPageDolar);
        jLabel8.setText("                                                                                          ");
        txtMontoConvertido.setText(df2.format(valorFinal));
        finalizarConversion();
    }
    
    //método o función para cumplir con las reglas de negocio:
    //dato numérico, no negativo, y distinto de cero.
    public boolean esNumeroAceptado(String s) {
        try {
            dobleMoneda = Double.valueOf(stringMoneda);
            if (dobleMoneda < 0 || dobleMoneda == 0) {
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
        stringMoneda = "";
        dobleMoneda = 0;
        dobleAuxiliar = 0;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtMontoAConvertir;
    public static javax.swing.JTextField txtMontoConvertido;
    // End of variables declaration//GEN-END:variables

    //Variables del conversor
    String webPageDolar = "";
    String webPageDolar2 = "";
    String webPageEuro = "";
    String webPageEuro2 = "";
    String webPageLibra = "";
    String webPageYen = "";
    String webPageWon = "";
    DecimalFormat df = new DecimalFormat("0.00");
    DecimalFormat df2 = new DecimalFormat("0.0000");
    boolean validacion;
    String cotizacionMoneda = "";
    String stringMoneda = "";
    double dobleMoneda = 0;
    double valorFinal = 0;
    String stringDolar = "";
    double dobleDolar = 0;
    String stringDolar2 = "";
    double dobleDolar2 = 0;
    String stringDolar3 = "";
    double dobleDolar3 = 0;
    String stringEuro = "";
    double dobleEuro = 0;
    String stringEuro2 = "";
    double dobleEuro2 = 0;
    String stringEuro3 = "";
    double dobleEuro3 = 0;
    String stringLibra = "";
    double dobleLibra = 0;
    String stringYen = "";
    double dobleYen = 0;
    String stringWon = "";
    double dobleWon = 0;
    String stringPeso = "";
    double doblePeso = 0;
    double calculo = 0;
    double dobleAuxiliar = 0;
}
