package Citas;

import CatalogoEspecies.ListaCircularDoble;
import CatalogoMascotas.ListaCircularSimple;
import CatalogoPrincipal.CrearArchivos;
import CatalogoPrincipal.PanelPrincipal;
import CatalogoPropietarios.ListaDobleEnlazada;
import RegistroUsuarios.Validar;
import javax.swing.JOptionPane;

public class PagoCitas extends javax.swing.JFrame {
   
    private String cantidad, nom,expiracion,nombre,tarjeta,code;
    private int counterName;
    private String veterinario,gestion,montoTotal,fecha;
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    private boolean registrarCita = false;
    CrearArchivos archivos = new CrearArchivos();
    
    public PagoCitas() {
        initComponents();
        setLocationRelativeTo(null); // This is to put the window in center
    }
    
    public PagoCitas (ListaDobleEnlazada listaDoble,ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble,String nom,String fecha,String veterinario,String gestion,String montoTotal) {
        this.nom = nom;
        this.listaDoble = listaDoble;
        this.listaCircular = listaCircular;
        this.listaCircularDoble = listaCircularDoble;
        this.veterinario = veterinario;
        this.gestion = gestion;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        initComponents();
        setLocationRelativeTo(null); // This is to put the window in center
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        titleOrder = new javax.swing.JLabel();
        visaImage = new javax.swing.JLabel();
        mastercardImage = new javax.swing.JLabel();
        titleOrder2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        securityField = new javax.swing.JLabel();
        simboloSeguridad = new javax.swing.JLabel();
        titleOrder3 = new javax.swing.JLabel();
        titleOrder4 = new javax.swing.JLabel();
        buttonPayCard = new javax.swing.JButton();
        tarjetaField = new javax.swing.JFormattedTextField();
        expiracionField = new javax.swing.JFormattedTextField();
        seguridadField = new javax.swing.JFormattedTextField();
        panelMenu = new javax.swing.JPanel();
        buttonMenu = new javax.swing.JButton();
        buttonCajas = new javax.swing.JButton();
        buttonCitas = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        logoSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        titleOrder.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder.setText("SELECCIONE SU MÉTODO DE PAGO");

        visaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Visa (1).png"))); // NOI18N

        mastercardImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mastercard (1).png"))); // NOI18N

        titleOrder2.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder2.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder2.setText("NOMBRE");

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(51, 51, 51));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setText("Ingrese su nombre completo");
        nameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        securityField.setBackground(new java.awt.Color(36, 47, 65));
        securityField.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        securityField.setForeground(new java.awt.Color(36, 47, 65));
        securityField.setText("CÓDIGO SEGURIDAD");

        simboloSeguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/info (1).png"))); // NOI18N
        simboloSeguridad.setToolTipText("Revisar el dorso de la tarjeta");

        titleOrder3.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder3.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder3.setText("NÚMERO TARJETA");

        titleOrder4.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        titleOrder4.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder4.setText("FECHA EXPIRACIÓN");

        buttonPayCard.setBackground(new java.awt.Color(0, 102, 153));
        buttonPayCard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonPayCard.setForeground(new java.awt.Color(255, 255, 255));
        buttonPayCard.setText("Pagar");
        buttonPayCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPayCardMouseClicked(evt);
            }
        });
        buttonPayCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPayCardActionPerformed(evt);
            }
        });

        tarjetaField.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tarjetaField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            tarjetaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tarjetaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tarjetaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        expiracionField.setBackground(new java.awt.Color(255, 255, 255));
        expiracionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        expiracionField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            expiracionField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        expiracionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expiracionField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        seguridadField.setBackground(new java.awt.Color(255, 255, 255));
        seguridadField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        seguridadField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            seguridadField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        seguridadField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seguridadField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));

        buttonMenu.setBackground(new java.awt.Color(36, 47, 65));
        buttonMenu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Principal");
        buttonMenu.setBorderPainted(false);
        buttonMenu.setContentAreaFilled(false);
        buttonMenu.setDefaultCapable(false);
        buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMenuMouseClicked(evt);
            }
        });
        buttonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenuActionPerformed(evt);
            }
        });

        buttonCajas.setBackground(new java.awt.Color(36, 47, 65));
        buttonCajas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCajas.setForeground(new java.awt.Color(255, 255, 255));
        buttonCajas.setText("Cajas");
        buttonCajas.setBorderPainted(false);
        buttonCajas.setContentAreaFilled(false);
        buttonCajas.setDefaultCapable(false);
        buttonCajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCajasActionPerformed(evt);
            }
        });

        buttonCitas.setBackground(new java.awt.Color(36, 47, 65));
        buttonCitas.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCitas.setForeground(new java.awt.Color(255, 255, 255));
        buttonCitas.setText("Citas");
        buttonCitas.setBorderPainted(false);
        buttonCitas.setContentAreaFilled(false);
        buttonCitas.setDefaultCapable(false);
        buttonCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCitasActionPerformed(evt);
            }
        });

        buttonCerrarSesion.setBackground(new java.awt.Color(36, 47, 65));
        buttonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        buttonCerrarSesion.setText("Cerrar Sesión");
        buttonCerrarSesion.setBorderPainted(false);
        buttonCerrarSesion.setContentAreaFilled(false);
        buttonCerrarSesion.setDefaultCapable(false);
        buttonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarSesionActionPerformed(evt);
            }
        });

        logoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user (2).png"))); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(buttonMenu)
                .addGap(105, 105, 105)
                .addComponent(buttonCajas)
                .addGap(104, 104, 104)
                .addComponent(buttonCitas)
                .addGap(108, 108, 108)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrarSesion)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCerrarSesion)
                    .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonMenu)
                        .addComponent(buttonCajas)
                        .addComponent(buttonCitas)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(visaImage)
                .addGap(64, 64, 64)
                .addComponent(mastercardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleOrder2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(seguridadField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simboloSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(securityField)
                        .addGap(110, 110, 110))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleOrder))
                .addGap(334, 334, 334))
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(buttonPayCard)
                .addGap(163, 163, 163)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarjetaField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleOrder3))
                .addGap(34, 34, 34)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleOrder4)
                    .addComponent(expiracionField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(titleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mastercardImage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(titleOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(securityField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(seguridadField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(simboloSeguridad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(visaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarjetaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(expiracionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPayCard, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        counterName++;
        if (counterName == 1) {
            nameField.setText(null);
        }
    }//GEN-LAST:event_nameFieldMouseClicked

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    public void clearFields() {
        expiracionField.setText(null);
        nameField.setText(null);
        seguridadField.setText(null);
        tarjetaField.setText(null);
    }
    
    
    private void buttonPayCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPayCardActionPerformed
        Validar validar = new Validar();
        expiracion = expiracionField.getText();
        nombre = nameField.getText();
        code = seguridadField.getText();
        tarjeta = tarjetaField.getText();

        try {
            if (validar.validarTarjeta(tarjeta) && validar.validarNombre(nombre) && validar.validarCodigo(code) && validar.validarFechaExpiracion(expiracion)) {
                JOptionPane.showMessageDialog(null, "Pago realizado satisfactoriamente", "Datos Correctos", JOptionPane.INFORMATION_MESSAGE);
                archivos.menuArchivos(fecha,veterinario, gestion, montoTotal);
                clearFields(); // Limpiamos los campos
                registrarCita=true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, hay datos incorrectos vuelva a intentarlo", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
            }

        } catch (StringIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar los datos en los campos seleccionados", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, asegurese de ingresar los datos correctamente", "Error Encontrado", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buttonPayCardActionPerformed

    private void buttonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseClicked
        
    }//GEN-LAST:event_buttonMenuMouseClicked

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed

    }//GEN-LAST:event_buttonMenuActionPerformed

    private void buttonCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCajasActionPerformed

    private void buttonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitasActionPerformed
        AgendarCitas citas = new AgendarCitas(registrarCita,nom,listaDoble,listaCircular,listaCircularDoble);
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCitasActionPerformed

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed
        
    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void buttonPayCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPayCardMouseClicked

    }//GEN-LAST:event_buttonPayCardMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCitas;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonPayCard;
    private javax.swing.JFormattedTextField expiracionField;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JLabel mastercardImage;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel securityField;
    private javax.swing.JFormattedTextField seguridadField;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel simboloSeguridad;
    private javax.swing.JFormattedTextField tarjetaField;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrder2;
    private javax.swing.JLabel titleOrder3;
    private javax.swing.JLabel titleOrder4;
    private javax.swing.JLabel visaImage;
    // End of variables declaration//GEN-END:variables
}
