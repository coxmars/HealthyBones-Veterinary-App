
package RegistroUsuarios;

// Here we import complements

import CatalogoPrincipal.PanelPrincipal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;





public class LoginVeterinaria extends javax.swing.JFrame {
    private boolean terms = false;
    private String userName = "", validarUsuario = "", validarPasswd = "";
    private int counter = 0,counterName=0,counterPasswd=0,counterEmail=0;
    private ListaSimple lista;
    
    public LoginVeterinaria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public LoginVeterinaria(ListaSimple lista) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lista = lista;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        LogoRestaurante = new javax.swing.JLabel();
        Detail = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        userText = new javax.swing.JTextField();
        condiciones = new javax.swing.JCheckBox();
        sesionBoton = new javax.swing.JButton();
        registrarseBoton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGeneral.setBackground(new java.awt.Color(36, 47, 65));
        panelGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel1MouseDragged(evt);
            }
        });
        panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel1MouseClicked(evt);
            }
        });
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 220, 10));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        panel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 270, 10));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        LogoRestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pacific Blue Veterinary Logo (2) (1).png"))); // NOI18N
        panel1.add(LogoRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 280));

        Detail.setBackground(new java.awt.Color(0, 0, 0));
        Detail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Detail.setForeground(new java.awt.Color(102, 102, 102));
        Detail.setText("Bienvenido a la mejor veterinaria");
        panel1.add(Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 360, 300, 60));

        footer.setForeground(new java.awt.Color(102, 102, 102));
        footer.setText("© 2021 Healthy Bones | Todos los derechos reservados");
        panel1.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 320, 30));

        panelGeneral.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        panel2.setBackground(new java.awt.Color(0, 102, 153));

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Iniciar Sesión o Registrarse");

        nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("USUARIO");

        password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("CONTRASEÑA");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        passwordField.setBackground(new java.awt.Color(0, 102, 153));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("jPasswordField1");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });

        userText.setBackground(new java.awt.Color(0, 102, 153));
        userText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setText("Ingrese su nombre usuario");
        userText.setBorder(null);
        userText.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTextMouseClicked(evt);
            }
        });

        condiciones.setBackground(new java.awt.Color(0, 102, 153));
        condiciones.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        condiciones.setForeground(new java.awt.Color(255, 255, 255));
        condiciones.setText("Estoy de acuerdo con términos y condiciones");
        condiciones.setBorder(null);
        condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionesActionPerformed(evt);
            }
        });

        sesionBoton.setBackground(new java.awt.Color(255, 255, 255));
        sesionBoton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sesionBoton.setForeground(new java.awt.Color(0, 0, 0));
        sesionBoton.setText("Iniciar Sesión");
        sesionBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionBotonActionPerformed(evt);
            }
        });

        registrarseBoton1.setBackground(new java.awt.Color(255, 255, 255));
        registrarseBoton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registrarseBoton1.setForeground(new java.awt.Color(0, 0, 0));
        registrarseBoton1.setText("Registrarse");
        registrarseBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseBoton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addComponent(nombre)
                    .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(sesionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarseBoton1))
                        .addComponent(condiciones, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(titulo)
                .addGap(78, 78, 78)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(password)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(condiciones)
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarseBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sesionBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelGeneral.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 420, 550));

        getContentPane().add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 842, 551));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void condicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionesActionPerformed
        counter++;
        if (counter % 2 != 0) {
           terms = true; 
        }
        else {
            terms = false;
        }
    }//GEN-LAST:event_condicionesActionPerformed

    private void userTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMouseClicked
        counterName++;
        if (counterName == 1) {
            userText.setText(null);
        }
    }//GEN-LAST:event_userTextMouseClicked

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        counterPasswd++;
        if (counterPasswd == 1) {
            passwordField.setText(null);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel1MouseClicked

    private void panel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel1MouseDragged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_panel1MouseDragged

    private void sesionBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionBotonActionPerformed
        validarUsuario = userText.getText();
        // Obtenemos password
        for (int i = 0; i < passwordField.getPassword().length; i++) {
            validarPasswd += passwordField.getPassword()[i];
        }
        
        if (!terms) {
            JOptionPane.showMessageDialog(null, "Error, debe aceptar los términos y condiciones", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                // Validamos que los datos coincidan en la lista 
                lista.verifyUser(validarUsuario, validarPasswd);
                lista.loginMessage();
                PanelPrincipal principal = new PanelPrincipal(validarUsuario);
                principal.setVisible(true);
                this.dispose();
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Error, el usuario o contraseña no coinciden con los almacenados", "Login Invalido", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_sesionBotonActionPerformed

    private void registrarseBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseBoton1ActionPerformed
        RegistroVeterinaria registro = new RegistroVeterinaria();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarseBoton1ActionPerformed

    
    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage()
                .getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
    
    
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
            java.util.logging.Logger.getLogger(LoginVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Detail;
    private javax.swing.JLabel LogoRestaurante;
    private javax.swing.JCheckBox condiciones;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registrarseBoton1;
    private javax.swing.JButton sesionBoton;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
