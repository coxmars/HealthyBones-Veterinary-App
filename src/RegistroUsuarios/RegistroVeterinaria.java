
package RegistroUsuarios;

// Here we import complements

import java.awt.Dimension;
import javax.swing.JOptionPane;


public class RegistroVeterinaria extends javax.swing.JFrame {
    private boolean terms = false, validatePasswd = false, validateState = false;
    private int posicion = 0;
    private int counter = 0,counterName=0,counterPasswd=0,counterEmail=0,counterCard=0;
    private String user = "",passwd = "",state = "",name = "", newPassword = "";
    private int contLetraMay = 0, contLetraMin = 0, contSignos = 0, contNumero = 0;
    ListaSimple lista = new ListaSimple();
    
    public RegistroVeterinaria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        nameText = new javax.swing.JTextField();
        userField = new javax.swing.JTextField();
        condiciones = new javax.swing.JCheckBox();
        mail = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        volverInicio = new javax.swing.JButton();
        tarjetaName = new javax.swing.JLabel();
        stateField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        guardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGeneral.setBackground(new java.awt.Color(36, 47, 65));

        panel2.setBackground(new java.awt.Color(0, 102, 153));

        nombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("NOMBRE");

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

        nameText.setBackground(new java.awt.Color(0, 102, 153));
        nameText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(255, 255, 255));
        nameText.setText("Ingrese su nombre ");
        nameText.setBorder(null);
        nameText.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        nameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextMouseClicked(evt);
            }
        });

        userField.setBackground(new java.awt.Color(0, 102, 153));
        userField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setText("Digite su usuario");
        userField.setBorder(null);
        userField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        userField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFieldFocusGained(evt);
            }
        });
        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
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

        mail.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setText("USUARIO");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        volverInicio.setBackground(new java.awt.Color(255, 255, 255));
        volverInicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        volverInicio.setForeground(new java.awt.Color(0, 0, 0));
        volverInicio.setText("Regresar Inicio");
        volverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverInicioActionPerformed(evt);
            }
        });

        tarjetaName.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tarjetaName.setForeground(new java.awt.Color(255, 255, 255));
        tarjetaName.setText("ESTADO");

        stateField.setBackground(new java.awt.Color(0, 102, 153));
        stateField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        stateField.setForeground(new java.awt.Color(255, 255, 255));
        stateField.setText("Inserte su estado (activo-inactivo)");
        stateField.setBorder(null);
        stateField.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        stateField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateFieldFocusGained(evt);
            }
        });
        stateField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stateFieldMouseClicked(evt);
            }
        });
        stateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateFieldActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clinica (1).png"))); // NOI18N

        guardarDatos.setBackground(new java.awt.Color(255, 255, 255));
        guardarDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        guardarDatos.setForeground(new java.awt.Color(0, 0, 0));
        guardarDatos.setText("Guardar Datos");
        guardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tarjetaName)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(condiciones)
                    .addComponent(nombre)
                    .addComponent(jSeparator1)
                    .addComponent(stateField)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(guardarDatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volverInicio)))
                .addGap(0, 107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tarjetaName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(condiciones)
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volverInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panelGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldActionPerformed

    private void stateFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_stateFieldFocusGained

    private void volverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverInicioActionPerformed
        LoginVeterinaria login = new LoginVeterinaria(lista);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverInicioActionPerformed

    private void condicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionesActionPerformed
        counter++;
        if (counter % 2 != 0) {
            terms = true;
        }
        else {
            terms = false;
        }
    }//GEN-LAST:event_condicionesActionPerformed

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

    private void userFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusGained
        counterEmail++;
        if (counterEmail == 1) {
            userField.setText(null);
        }
    }//GEN-LAST:event_userFieldFocusGained

    private void nameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextMouseClicked
        counterName++;
        if (counterName == 1) {
            nameText.setText(null);
        }
    }//GEN-LAST:event_nameTextMouseClicked

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        counterPasswd++;
        if (counterPasswd == 1) {
            passwordField.setText(null);
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void stateFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stateFieldMouseClicked
        counterCard++;
        if (counterCard == 1) {
            stateField.setText(null);
        }
    }//GEN-LAST:event_stateFieldMouseClicked

    private void guardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarDatosActionPerformed
        // Here we import the other classes
        Validar validar = new Validar();
        // Obtenemos los caracteres de la password como String
        int tamano;
        name = nameText.getText();
        for (int i = 0; i < passwordField.getPassword().length; i++) {
            passwd += passwordField.getPassword()[i];
        }
        
        user = userField.getText();
        state = stateField.getText();
        
        
        // Here we verify if all data are correct
        if (terms) {
            if (validar.validarPassword(passwd) && validar.validarNombre(name) && validar.validarUsuario(user) && validar.validarEstado(state)) {
                lista.insertEnd(new Usuario(name,user,validar.getNewPassword(),state,posicion));
                posicion++;
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Usuario Registrado", JOptionPane.INFORMATION_MESSAGE);
            }     
            else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, debe aceptar los términos y condiciones", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_guardarDatosActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(RegistroVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistroVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox condiciones;
    private javax.swing.JButton guardarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField stateField;
    private javax.swing.JLabel tarjetaName;
    private javax.swing.JTextField userField;
    private javax.swing.JButton volverInicio;
    // End of variables declaration//GEN-END:variables
}
