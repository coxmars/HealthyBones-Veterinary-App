
package CatalogoPropietarios;

import CatalogoEspecies.ListaCircularDoble;
import CatalogoMascotas.ListaCircularSimple;
import CatalogoPrincipal.*;
import RegistroUsuarios.LoginVeterinaria;
import RegistroUsuarios.Validar;
import javax.swing.JOptionPane;


public class PanelPropietarios extends javax.swing.JFrame {
    public static String user;
    private int counterName = 0,counterLastName1=0,counterLastName2=0,counterEmail=0,counterPhone=0,counterState=0,counterAddress=0,counterCity=0;
    private boolean terms = false, validatePasswd = false, validateState = false;
    private int auxPosicion = 1;
    private String nombrePropietario = "", apellido1 = "", apellido2 = "",ciudad = "", direccion = "",correo="",telefono="",estado="",posicion="1";
    Validar validar = new Validar();
    boolean editar = false;
    String decidir = "";
    String buscarPosicion="";
    Propietarios propietarios;
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    
    public PanelPropietarios(String user) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        setLocationRelativeTo(null);
        userTextName.setText(this.user);
        posicionField.setVisible(false);
    }
    
    public PanelPropietarios(String user,ListaDobleEnlazada listaDoble,ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble){
        initComponents();
        this.user = user;
        setLocationRelativeTo(null);
        userTextName.setText(this.user);
        posicionField.setVisible(false);
        this.listaDoble = listaDoble;
        this.listaCircular = listaCircular;
        this.listaCircularDoble = listaCircularDoble;
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaField = new javax.swing.JFormattedTextField();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tituloCatalogo = new javax.swing.JLabel();
        direccionField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ciudadField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        correoField = new javax.swing.JTextField();
        apellido1Field = new javax.swing.JTextField();
        apellido2Field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JFormattedTextField();
        limpiarField = new javax.swing.JCheckBox();
        posicionField = new javax.swing.JTextField();

        fechaField.setBackground(new java.awt.Color(255, 255, 255));
        fechaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fechaField.setForeground(new java.awt.Color(102, 102, 102));
        try {
            fechaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fechaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));

        buttonMenu.setBackground(new java.awt.Color(36, 47, 65));
        buttonMenu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Principal");
        buttonMenu.setToolTipText("Menú principal");
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
        buttonCajas.setToolTipText("Ir a cajas");
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
        buttonCitas.setToolTipText("Agendar cita");
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
        buttonCerrarSesion.setToolTipText("Cerrar sesión");
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus.png"))); // NOI18N
        jButton1.setToolTipText("Agrega un propietario");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/edit_48px.png"))); // NOI18N
        jButton2.setToolTipText("Modifica un propietario");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Remove_48px (1).png"))); // NOI18N
        jButton3.setToolTipText("Elimina un propietario");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/search_48px (1).png"))); // NOI18N
        jButton4.setToolTipText("Consulta un propietario");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        tituloCatalogo.setBackground(new java.awt.Color(0, 0, 0));
        tituloCatalogo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tituloCatalogo.setForeground(new java.awt.Color(0, 0, 0));
        tituloCatalogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCatalogo.setText("Catalogo de Propietarios");

        direccionField.setBackground(new java.awt.Color(255, 255, 255));
        direccionField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        direccionField.setForeground(new java.awt.Color(51, 51, 51));
        direccionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccionField.setText("Digite la dirección");
        direccionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        direccionField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                direccionFieldMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ciudad");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Primer apellido");

        ciudadField.setBackground(new java.awt.Color(255, 255, 255));
        ciudadField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ciudadField.setForeground(new java.awt.Color(51, 51, 51));
        ciudadField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ciudadField.setText("Inserte la ciudad");
        ciudadField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ciudadField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadFieldMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Segundo apellido");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Correo");

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

        correoField.setBackground(new java.awt.Color(255, 255, 255));
        correoField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        correoField.setForeground(new java.awt.Color(51, 51, 51));
        correoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        correoField.setText("Ingrese el correo");
        correoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        correoField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoFieldMouseClicked(evt);
            }
        });

        apellido1Field.setBackground(new java.awt.Color(255, 255, 255));
        apellido1Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        apellido1Field.setForeground(new java.awt.Color(51, 51, 51));
        apellido1Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido1Field.setText("Ingrese primer apellido");
        apellido1Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        apellido1Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellido1FieldMouseClicked(evt);
            }
        });

        apellido2Field.setBackground(new java.awt.Color(255, 255, 255));
        apellido2Field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        apellido2Field.setForeground(new java.awt.Color(51, 51, 51));
        apellido2Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido2Field.setText("Ingrese segundo apellido");
        apellido2Field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        apellido2Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellido2FieldMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dirección");

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

        telefonoField.setBackground(new java.awt.Color(255, 255, 255));
        telefonoField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        telefonoField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            telefonoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonoField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        limpiarField.setForeground(new java.awt.Color(51, 51, 51));
        limpiarField.setText("Limpiar Datos");
        limpiarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarFieldActionPerformed(evt);
            }
        });

        posicionField.setBackground(new java.awt.Color(255, 255, 255));
        posicionField.setForeground(new java.awt.Color(51, 51, 51));
        posicionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(posicionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(limpiarField))))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8)
                                        .addComponent(ciudadField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                                    .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(direccionField)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(124, 124, 124))
                                            .addComponent(estadoField)))
                                    .addComponent(jLabel5)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(apellido1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(apellido2Field, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiarField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(apellido1Field)
                    .addComponent(apellido2Field)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(posicionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ciudadField)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onlineText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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

    public void agregar() {
        nombrePropietario = nombreField.getText();
        apellido1 = apellido1Field.getText();
        apellido2 = apellido2Field.getText();
        ciudad = ciudadField.getText();
        direccion = direccionField.getText();
        correo = correoField.getText();
        telefono = telefonoField.getText();
        estado = estadoField.getText();
        
        // Here we verify if all data are correct
        if (validar.validarNombre(nombrePropietario) && validar.validarEstado(estado) && validar.validarCorreo(correo) && validar.validarApellido(apellido1) && validar.validarApellido(apellido2)
            && validar.validarCiudad(ciudad) && validar.validarDireccion(direccion) && validar.validarTelefono(telefono)) {
            listaDoble.insertarFinal(new Propietarios(nombrePropietario,apellido1,apellido2,ciudad,direccion,telefono,correo,estado,posicion));
            auxPosicion++;
            posicion = Integer.toString(auxPosicion);
            JOptionPane.showMessageDialog(null, "Propietario registrado correctamente", "Propietario Registrado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void consultar() {
        try {
            String nombre = nombreField.getText();
            String telefono = telefonoField.getText();
            if (validar.validarNombre(nombre)) {
                String datos = listaDoble.buscarPropietario(nombre, telefono);
                String[] parts = datos.split(",");
                String part1 = parts[0]; // Nombre
                String part2 = parts[1]; // Apellido1
                String part3 = parts[2]; // Apellido2
                String part4 = parts[3]; // Ciudad
                String part5 = parts[4]; // Direccion
                String part6 = parts[5]; // Correo
                String part7 = parts[6]; // Telefono
                String part8 = parts[7]; // Estado
                String part9 = parts[8]; // Posicion
                // Se ponen los datos en los respectivos campos
                nombreField.setText(part1);
                apellido1Field.setText(part2);
                apellido2Field.setText(part3);
                ciudadField.setText(part4);
                direccionField.setText(part5);
                correoField.setText(part6);
                telefonoField.setText(part7);
                estadoField.setText(part8);
                posicionField.setText(part9);
                buscarPosicion = posicionField.getText();
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
    
    public void borrarDatos() {
        try {
            int borrarDato = Integer.parseInt(buscarPosicion);
            if (!nulos()) {
                if (listaDoble.removerEnPosicion(borrarDato)) {
                    JOptionPane.showMessageDialog(null, "Propietario borrado correctamente", "Propietario borrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Indice no valido en la lista", "Error encontrado", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar el propietario", "Error encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar el propietario", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void limpiar() {
        nombreField.setText(null);
        apellido1Field.setText(null);
        apellido2Field.setText(null);
        ciudadField.setText(null);
        direccionField.setText(null);
        correoField.setText(null);
        telefonoField.setText(null);
        estadoField.setText(null);
    }
    
    
    public void editarDatos() {
        if (!nulos()) {
            nombrePropietario = nombreField.getText();
            apellido1 = apellido1Field.getText();
            apellido2 = apellido2Field.getText();
            ciudad = ciudadField.getText();
            direccion = direccionField.getText();
            correo = correoField.getText();
            telefono = telefonoField.getText();
            estado = estadoField.getText();
            buscarPosicion = posicionField.getText();
            if (editar) {
                if (listaDoble.editarPropietario(buscarPosicion,nombrePropietario, apellido1, apellido2, ciudad, direccion, telefono, correo, estado) == true) {
                    JOptionPane.showMessageDialog(null, "El propietario ha sido editado correctamente", "Propietario Editado", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, el propietario no fue editado correctamente", "Error Modificación", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public boolean nulos() {
        if (!nombrePropietario.equals("")||!apellido1.equals("")||!apellido2.equals("")||!ciudad.equals("")||!direccion.equals("")||!correo.equals("")||!telefono.equals("")||!estado.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void nombreFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreFieldMouseClicked
        counterName++;
        if (counterName == 1) {
            nombreField.setText(null);
        }
    }//GEN-LAST:event_nombreFieldMouseClicked

    private void apellido1FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido1FieldMouseClicked
        counterLastName1++;
        if (counterLastName1 == 1) {
            apellido1Field.setText(null);
        }
    }//GEN-LAST:event_apellido1FieldMouseClicked

    private void apellido2FieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellido2FieldMouseClicked
        counterLastName2++;
        if (counterLastName2 == 1) {
            apellido2Field.setText(null);
        }
    }//GEN-LAST:event_apellido2FieldMouseClicked

    private void ciudadFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadFieldMouseClicked
        counterCity++;
        if (counterCity == 1) {
            ciudadField.setText(null);
        }
    }//GEN-LAST:event_ciudadFieldMouseClicked

    private void direccionFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionFieldMouseClicked
        counterAddress++;
        if (counterAddress == 1) {
            direccionField.setText(null);
        }
    }//GEN-LAST:event_direccionFieldMouseClicked

    private void correoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoFieldMouseClicked
        counterEmail++;
        if (counterEmail == 1) {
            correoField.setText(null);
        }
    }//GEN-LAST:event_correoFieldMouseClicked

    private void estadoFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoFieldMouseClicked
        counterState++;
        if (counterState == 1) {
            estadoField.setText(null);
        }
    }//GEN-LAST:event_estadoFieldMouseClicked

    private void buttonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseClicked
        PanelPrincipal main = new PanelPrincipal(user,listaDoble,listaCircular,listaCircularDoble);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenuMouseClicked

    private void limpiarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarFieldActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        borrarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(PanelPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPropietarios(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido1Field;
    private javax.swing.JTextField apellido2Field;
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCitas;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JLabel check;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JTextField correoField;
    private javax.swing.JTextField direccionField;
    private javax.swing.JTextField estadoField;
    private javax.swing.JFormattedTextField fechaField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JCheckBox limpiarField;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel onlineText;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JTextField posicionField;
    private javax.swing.JFormattedTextField telefonoField;
    private javax.swing.JLabel tituloCatalogo;
    private javax.swing.JLabel userTextName;
    // End of variables declaration//GEN-END:variables
}
