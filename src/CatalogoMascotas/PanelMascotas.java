package CatalogoMascotas;

import CatalogoEspecies.ListaCircularDoble;
import CatalogoPrincipal.*;
import CatalogoPropietarios.ListaDobleEnlazada;
import RegistroUsuarios.LoginVeterinaria;
import RegistroUsuarios.Validar;
import javax.swing.JOptionPane;

public class PanelMascotas extends javax.swing.JFrame {

    public String user;
    private int counterName = 0, counterPropietario = 0, counterEspecie = 0, counterState = 0;
    private String nombrePropietario = "", especie = "", fecha = "", estado = "", nombreMascota = "", posicion = "1";
    Validar validar = new Validar();
    private int auxPosicion = 1;
    String buscarPosicion="";
    boolean editar = false;
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    
    public PanelMascotas() {
        initComponents();
        setLocationRelativeTo(null);
        posicionMascotaField.setVisible(false);
    }

    public PanelMascotas(String user, ListaDobleEnlazada listaDoble, ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble) {
        initComponents();
        this.user = user;
        setLocationRelativeTo(null);
        userTextName.setText(this.user);
        posicionMascotaField.setVisible(false);
        this.listaCircular = listaCircular;
        this.listaDoble = listaDoble;
        this.listaCircularDoble = listaCircularDoble;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        buttonMenu = new javax.swing.JButton();
        buttonCajas = new javax.swing.JButton();
        buttonCitas = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        logoSalir = new javax.swing.JLabel();
        onlineText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        check = new javax.swing.JLabel();
        userTextName = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        addButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        consultarButton = new javax.swing.JButton();
        tituloCatalogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        propietarioField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        especieField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadoField = new javax.swing.JTextField();
        fechaField = new javax.swing.JFormattedTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        posicionMascotaField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(89, 89, 89)
                .addComponent(buttonCajas)
                .addGap(120, 120, 120)
                .addComponent(buttonCitas)
                .addGap(108, 108, 108)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrarSesion)
                .addContainerGap(36, Short.MAX_VALUE))
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

        onlineText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        onlineText.setForeground(new java.awt.Color(36, 47, 65));
        onlineText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onlineText.setText("Online");

        jSeparator1.setForeground(java.awt.Color.gray);

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/online (2).png"))); // NOI18N

        userTextName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userTextName.setForeground(new java.awt.Color(36, 47, 65));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus.png"))); // NOI18N
        addButton.setToolTipText("Agrega una mascota");
        addButton.setFocusable(false);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(addButton);

        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_48px.png"))); // NOI18N
        editarButton.setToolTipText("Modifica una mascota");
        editarButton.setFocusable(false);
        editarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(editarButton);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Remove_48px (1).png"))); // NOI18N
        deleteButton.setToolTipText("Elimina una mascota");
        deleteButton.setFocusable(false);
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteButton);

        consultarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search_48px (1).png"))); // NOI18N
        consultarButton.setToolTipText("Consulta una mascota");
        consultarButton.setFocusable(false);
        consultarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        consultarButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        consultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(consultarButton);

        tituloCatalogo.setBackground(new java.awt.Color(0, 0, 0));
        tituloCatalogo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tituloCatalogo.setForeground(new java.awt.Color(0, 0, 0));
        tituloCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCatalogo.setText("Catalogo de Mascotas");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre del Propietario");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha de Nacimiento");

        propietarioField.setBackground(new java.awt.Color(255, 255, 255));
        propietarioField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        propietarioField.setForeground(new java.awt.Color(51, 51, 51));
        propietarioField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        propietarioField.setText("Inserte el nombre del propietario");
        propietarioField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        propietarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propietarioFieldMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Especie");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Mascota");

        nombreField.setBackground(new java.awt.Color(255, 255, 255));
        nombreField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombreField.setForeground(new java.awt.Color(51, 51, 51));
        nombreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreField.setText("Ingrese el nombre");
        nombreField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nombreField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreFieldMouseClicked(evt);
            }
        });

        especieField.setBackground(new java.awt.Color(255, 255, 255));
        especieField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        especieField.setForeground(new java.awt.Color(51, 51, 51));
        especieField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        especieField.setText("Digite la especie");
        especieField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        especieField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                especieFieldMouseClicked(evt);
            }
        });
        especieField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especieFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estado");

        estadoField.setBackground(new java.awt.Color(255, 255, 255));
        estadoField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        estadoField.setForeground(new java.awt.Color(51, 51, 51));
        estadoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estadoField.setText("Activo/Inactivo");
        estadoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        estadoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoFieldMouseClicked(evt);
            }
        });

        fechaField.setBackground(new java.awt.Color(255, 255, 255));
        fechaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fechaField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            fechaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fechaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fechaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFieldActionPerformed(evt);
            }
        });

        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Limpiar Datos");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        posicionMascotaField.setBackground(new java.awt.Color(255, 255, 255));
        posicionMascotaField.setForeground(new java.awt.Color(51, 51, 51));
        posicionMascotaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        posicionMascotaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicionMascotaFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(propietarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel6)
                                .addGap(105, 105, 105)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(especieField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(posicionMascotaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1))))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addGap(53, 53, 53)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(posicionMascotaField)
                    .addComponent(especieField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(propietarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed
        LoginVeterinaria login = new LoginVeterinaria();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void buttonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitasActionPerformed

    }//GEN-LAST:event_buttonCitasActionPerformed

    private void buttonCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCajasActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed

    }//GEN-LAST:event_buttonMenuActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        agregar();
    }//GEN-LAST:event_addButtonActionPerformed

    private void consultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarButtonActionPerformed
        consultar();
    }//GEN-LAST:event_consultarButtonActionPerformed

    public void agregar() {
        nombreMascota = nombreField.getText();
        nombrePropietario = propietarioField.getText();
        especie = especieField.getText();
        fecha = fechaField.getText();
        estado = estadoField.getText();
        
        // Here we verify if all data are correct
        if (validar.validarNombre(nombrePropietario) && validar.validarEstado(estado) && validar.validarNombre(nombreMascota) && validar.validarNombre(especie)) {
            if (!listaCircular.noRepetirMascota(nombreMascota, nombrePropietario)) {
                if (listaCircularDoble.existeEspecie(especie)) {
                    if (listaDoble.existePropietario(nombrePropietario)) {
                        listaCircular.insertarFinal(new Mascotas(nombreMascota, fecha, estado, especie, nombrePropietario, posicion));
                        auxPosicion++;
                        posicion = Integer.toString(auxPosicion);
                        JOptionPane.showMessageDialog(null, "Mascota registrada correctamente", "Mascota Registrada", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, el propietario no existe", "Error Datos", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Error, la especie no existe", "Error Datos", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, la mascota ya existe en el sistema", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultar() {
        try {
            String nombre = nombreField.getText();
            String propietario = propietarioField.getText();
            if (validar.validarNombre(nombre)) {
                String datos = listaCircular.buscarMascota(nombre, propietario);
                String[] parts = datos.split(",");
                String part1 = parts[0]; // Nombre Mascota
                String part2 = parts[1]; // Propietario
                String part3 = parts[2]; // Especie
                String part4 = parts[3]; // Fecha Nacimiento
                String part5 = parts[4]; // Estado
                String part6 = parts[5]; // Posicion
                // Se ponen los datos en los respectivos campos
                nombreField.setText(part1);
                propietarioField.setText(part2);
                especieField.setText(part3);
                fechaField.setText(part4);
                estadoField.setText(part5);
                posicionMascotaField.setText(part6);
                buscarPosicion = posicionMascotaField.getText();
                editar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Error, debe consultar a través del nombre y teléfono","Error encontrado",JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Error, la lista está vacía","Error encontrado",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarDatosMascota() {
        if (!nulos()) {
            nombrePropietario = propietarioField.getText();
            nombreMascota = nombreField.getText();
            especie = especieField.getText();
            fecha = fechaField.getText();
            estado = estadoField.getText();
            buscarPosicion = posicionMascotaField.getText();
            if (editar) {
                if (listaCircular.editarMascota(buscarPosicion,nombreMascota, fecha, especie, nombrePropietario, estado) == true) {
                    JOptionPane.showMessageDialog(null, "La mascota ha sido editada correctamente", "Mascota Editada", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, la mascota no fue editada correctamente", "Error Modificación", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarDatosMascota() {
        try {
            int borrarDato = Integer.parseInt(buscarPosicion);
            if (!nulos()) {
                if (listaCircular.removerEnPosicion(borrarDato)) {
                    JOptionPane.showMessageDialog(null, "Mascota borrada correctamente", "Mascota borrada", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Indice no valido en la lista", "Error encontrado", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar la mascota", "Error encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar la mascota", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean nulos() {
        if (!nombrePropietario.equals("")||!nombreMascota.equals("")||!especie.equals("")||!fecha.equals("")||!estado.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
    
    public void limpiar() {
        nombreField.setText(null);
        especieField.setText(null);
        propietarioField.setText(null);
        fechaField.setText(null);
        estadoField.setText(null);
    }


    private void nombreFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreFieldMouseClicked
        counterName++;
        if (counterName == 1) {
            nombreField.setText(null);
        }
    }//GEN-LAST:event_nombreFieldMouseClicked

    private void especieFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especieFieldMouseClicked
        counterEspecie++;
        if (counterEspecie == 1) {
            especieField.setText(null);
        }
    }//GEN-LAST:event_especieFieldMouseClicked

    private void propietarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propietarioFieldMouseClicked
        counterPropietario++;
        if (counterPropietario == 1) {
            propietarioField.setText(null);
        }
    }//GEN-LAST:event_propietarioFieldMouseClicked

    private void estadoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoFieldMouseClicked
        counterState++;
        if (counterState == 1) {
            estadoField.setText(null);
        }
    }//GEN-LAST:event_estadoFieldMouseClicked

    private void buttonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseClicked
        PanelPrincipal main = new PanelPrincipal(user,listaDoble, listaCircular,listaCircularDoble);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuMouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void posicionMascotaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicionMascotaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posicionMascotaFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        borrarDatosMascota();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        editarDatosMascota();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void especieFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especieFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especieFieldActionPerformed

    private void fechaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PanelMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PanelMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCitas;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JLabel check;
    private javax.swing.JButton consultarButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JTextField especieField;
    private javax.swing.JTextField estadoField;
    private javax.swing.JFormattedTextField fechaField;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel onlineText;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextField posicionMascotaField;
    private javax.swing.JTextField propietarioField;
    private javax.swing.JLabel tituloCatalogo;
    private javax.swing.JLabel userTextName;
    // End of variables declaration//GEN-END:variables
}
