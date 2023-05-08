package Citas;


import Cajas.Cajas;
import CatalogoEspecies.ListaCircularDoble;
import CatalogoMascotas.ListaCircularSimple;
import CatalogoPrincipal.PanelPrincipal;
import CatalogoPropietarios.ListaDobleEnlazada;
import RegistroUsuarios.LoginVeterinaria;
import RegistroUsuarios.Validar;
import javax.swing.JOptionPane;

public class AgendarCitas extends javax.swing.JFrame {
    private String nombrePropietario = "", nombreMascota = "", fecha = "",hora = "", veterinario = "",gestion="",fechaActual="";
    private int monto;
    private String montoFinal;
    private int posicion = 1, auxPosicion;
    private static String nom;
    private boolean editar = false;
    private int buscarPosicion;
    private int counterOwn,counterPet,counterDate,counterHour,counterDoctor,counterType,counterRecentDate;
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    private boolean registrarCita;
    Arbol arbol = new Arbol();
    Validar validar = new Validar();
    
    public AgendarCitas(String nombre) {
        initComponents();
        this.nom = nombre;
        setLocationRelativeTo(null); // This is to put the window in center
        posicionField.setVisible(false);
    }
    
    public AgendarCitas(boolean registrarCita,String nombre,ListaDobleEnlazada listaDoble,ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble) {
        initComponents();
        this.nom = nombre;
        this.registrarCita = registrarCita;
        this.listaDoble = listaDoble;
        this.listaCircular = listaCircular;
        this.listaCircularDoble = listaCircularDoble;
        setLocationRelativeTo(null); // This is to put the window in center
        posicionField.setVisible(false);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        buttonMenu = new javax.swing.JButton();
        buttonCajas = new javax.swing.JButton();
        buttonCitas = new javax.swing.JButton();
        buttonCerrarSesion = new javax.swing.JButton();
        logoSalir = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        separator = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        gestionField = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        titleOrder = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        totalPagar = new javax.swing.JTextField();
        labelPago = new javax.swing.JLabel();
        fechaFacturaField = new javax.swing.JFormattedTextField();
        panelMenu1 = new javax.swing.JPanel();
        buttonMenu1 = new javax.swing.JButton();
        buttonCajas1 = new javax.swing.JButton();
        buttonCitas1 = new javax.swing.JButton();
        buttonCerrarSesion1 = new javax.swing.JButton();
        logoSalir1 = new javax.swing.JLabel();
        titleOrder1 = new javax.swing.JLabel();
        mailLabel1 = new javax.swing.JLabel();
        fechaField = new javax.swing.JFormattedTextField();
        mailLabel2 = new javax.swing.JLabel();
        horaField = new javax.swing.JFormattedTextField();
        lastNameLabel1 = new javax.swing.JLabel();
        propietarioField = new javax.swing.JTextField();
        lastNameLabel2 = new javax.swing.JLabel();
        veterinarioField = new javax.swing.JTextField();
        lastNameLabel3 = new javax.swing.JLabel();
        mascotaField = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        posicionField = new javax.swing.JTextField();
        limpiarField = new javax.swing.JCheckBox();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(36, 47, 65));
        nameLabel.setText("Tipo Gestión");

        gestionField.setBackground(new java.awt.Color(255, 255, 255));
        gestionField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        gestionField.setForeground(new java.awt.Color(51, 51, 51));
        gestionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gestionField.setText("Digite la gestión a realizar");
        gestionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        gestionField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gestionFieldMouseClicked(evt);
            }
        });
        gestionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionFieldActionPerformed(evt);
            }
        });

        mailLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailLabel.setForeground(new java.awt.Color(36, 47, 65));
        mailLabel.setText("Fecha");

        titleOrder.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleOrder.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder.setText("Datos de la Factura");

        addButton1.setBackground(new java.awt.Color(0, 102, 153));
        addButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("Ir al Pago");
        addButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        totalPagar.setBackground(new java.awt.Color(255, 255, 255));
        totalPagar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        totalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPago.setBackground(new java.awt.Color(255, 255, 255));
        labelPago.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelPago.setForeground(new java.awt.Color(36, 47, 65));
        labelPago.setText("Monto a pagar");

        fechaFacturaField.setBackground(new java.awt.Color(255, 255, 255));
        fechaFacturaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        fechaFacturaField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            fechaFacturaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fechaFacturaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaFacturaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fechaFacturaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaFacturaFieldMouseClicked(evt);
            }
        });

        panelMenu1.setBackground(new java.awt.Color(0, 102, 153));

        buttonMenu1.setBackground(new java.awt.Color(36, 47, 65));
        buttonMenu1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMenu1.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu1.setText("Principal");
        buttonMenu1.setBorderPainted(false);
        buttonMenu1.setContentAreaFilled(false);
        buttonMenu1.setDefaultCapable(false);
        buttonMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMenu1MouseClicked(evt);
            }
        });
        buttonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMenu1ActionPerformed(evt);
            }
        });

        buttonCajas1.setBackground(new java.awt.Color(36, 47, 65));
        buttonCajas1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCajas1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCajas1.setText("Cajas");
        buttonCajas1.setBorderPainted(false);
        buttonCajas1.setContentAreaFilled(false);
        buttonCajas1.setDefaultCapable(false);
        buttonCajas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCajas1ActionPerformed(evt);
            }
        });

        buttonCitas1.setBackground(new java.awt.Color(36, 47, 65));
        buttonCitas1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCitas1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCitas1.setText("Citas");
        buttonCitas1.setBorderPainted(false);
        buttonCitas1.setContentAreaFilled(false);
        buttonCitas1.setDefaultCapable(false);
        buttonCitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCitas1ActionPerformed(evt);
            }
        });

        buttonCerrarSesion1.setBackground(new java.awt.Color(36, 47, 65));
        buttonCerrarSesion1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonCerrarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCerrarSesion1.setText("Cerrar Sesión");
        buttonCerrarSesion1.setBorderPainted(false);
        buttonCerrarSesion1.setContentAreaFilled(false);
        buttonCerrarSesion1.setDefaultCapable(false);
        buttonCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarSesion1ActionPerformed(evt);
            }
        });

        logoSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/user (2).png"))); // NOI18N

        javax.swing.GroupLayout panelMenu1Layout = new javax.swing.GroupLayout(panelMenu1);
        panelMenu1.setLayout(panelMenu1Layout);
        panelMenu1Layout.setHorizontalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(buttonMenu1)
                .addGap(76, 76, 76)
                .addComponent(buttonCajas1)
                .addGap(102, 102, 102)
                .addComponent(buttonCitas1)
                .addGap(114, 114, 114)
                .addComponent(logoSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCerrarSesion1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelMenu1Layout.setVerticalGroup(
            panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenu1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCerrarSesion1)
                    .addGroup(panelMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonMenu1)
                        .addComponent(buttonCajas1)
                        .addComponent(buttonCitas1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenu1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(logoSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        titleOrder1.setBackground(new java.awt.Color(36, 47, 65));
        titleOrder1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleOrder1.setForeground(new java.awt.Color(36, 47, 65));
        titleOrder1.setText("Agendar Cita");

        mailLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailLabel1.setForeground(new java.awt.Color(36, 47, 65));
        mailLabel1.setText("Fecha de la Cita");

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
        fechaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaFieldMouseClicked(evt);
            }
        });

        mailLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mailLabel2.setForeground(new java.awt.Color(36, 47, 65));
        mailLabel2.setText("Hora de la Cita");

        horaField.setBackground(new java.awt.Color(255, 255, 255));
        horaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        horaField.setForeground(new java.awt.Color(51, 51, 51));
        try {
            horaField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        horaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        horaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        horaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                horaFieldMouseClicked(evt);
            }
        });

        lastNameLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameLabel1.setForeground(new java.awt.Color(36, 47, 65));
        lastNameLabel1.setText("Nombre Veterinario");

        propietarioField.setBackground(new java.awt.Color(255, 255, 255));
        propietarioField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        propietarioField.setForeground(new java.awt.Color(51, 51, 51));
        propietarioField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        propietarioField.setText("Ingresar Propietario");
        propietarioField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        propietarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propietarioFieldMouseClicked(evt);
            }
        });
        propietarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propietarioFieldActionPerformed(evt);
            }
        });

        lastNameLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameLabel2.setForeground(new java.awt.Color(36, 47, 65));
        lastNameLabel2.setText("Nombre Propietario");

        veterinarioField.setBackground(new java.awt.Color(255, 255, 255));
        veterinarioField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        veterinarioField.setForeground(new java.awt.Color(51, 51, 51));
        veterinarioField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        veterinarioField.setText("Nombre Veterinario");
        veterinarioField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        veterinarioField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                veterinarioFieldMouseClicked(evt);
            }
        });
        veterinarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veterinarioFieldActionPerformed(evt);
            }
        });

        lastNameLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lastNameLabel3.setForeground(new java.awt.Color(36, 47, 65));
        lastNameLabel3.setText("Nombre Mascota");

        mascotaField.setBackground(new java.awt.Color(255, 255, 255));
        mascotaField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mascotaField.setForeground(new java.awt.Color(51, 51, 51));
        mascotaField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mascotaField.setText("Insertar Mascota");
        mascotaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        mascotaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mascotaFieldMouseClicked(evt);
            }
        });
        mascotaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mascotaFieldActionPerformed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus.png"))); // NOI18N
        jButton1.setToolTipText("Agrega una cita");
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
        jButton2.setToolTipText("Modifica una cita");
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
        jButton3.setToolTipText("Elimina una cita");
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
        jButton4.setToolTipText("Consulta una cita");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        posicionField.setBackground(new java.awt.Color(255, 255, 255));
        posicionField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        limpiarField.setText("Limpiar");
        limpiarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(lastNameLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(veterinarioField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(lastNameLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(propietarioField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                        .addComponent(mailLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mailLabel2)
                                            .addComponent(lastNameLabel3))
                                        .addGap(34, 34, 34)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mascotaField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(horaField)))
                                    .addComponent(posicionField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(nameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gestionField))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(mailLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(fechaFacturaField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelPago)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                                .addGap(99, 99, 99)
                                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addComponent(titleOrder, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarField)
                        .addGap(109, 109, 109)
                        .addComponent(titleOrder1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiarField))))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(propietarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mascotaField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veterinarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posicionField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gestionField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFacturaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPago, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void gestionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionFieldActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        veterinario = veterinarioField.getText();
        gestion = gestionField.getText();
        montoFinal = totalPagar.getText();
        fechaActual = fechaFacturaField.getText();
        if (!nulosFactura()) {
            PagoCitas pago = new PagoCitas(listaDoble, listaCircular, listaCircularDoble, nom, fechaActual, veterinario, gestion, montoFinal);
            pago.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Antes de pagar debe llenar los datos de la factura", "Error Factura", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButton1ActionPerformed

    private void buttonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseClicked

    }//GEN-LAST:event_buttonMenuMouseClicked

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed

    }//GEN-LAST:event_buttonMenuActionPerformed

    public void reservar() {
        if (registrarCita) {
            nombrePropietario = propietarioField.getText();
            nombreMascota = mascotaField.getText();
            fecha = fechaField.getText();
            hora = horaField.getText();
            // Here we verify if all data are correct
            if (validar.validarNombre(nombrePropietario) && validar.validarNombre(nombreMascota)) {
                if (listaCircular.existeMascota(nombreMascota)) {
                    if (listaDoble.existePropietario(nombrePropietario)) {
                        arbol.insertar(new Citas(nombreMascota, nombrePropietario, fecha, hora, posicion));
                        auxPosicion = posicion;
                        posicion++;
                        JOptionPane.showMessageDialog(null, "Cita reservada correctamente", "Cita Reservada", JOptionPane.INFORMATION_MESSAGE);
                        limpiar();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Error, el propietario no existe en el sistema", "Error Datos", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Error, la mascota no existe en el sistema", "Error Datos", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Error, la cita debe ser pagada por adelantado", "Error Debe Pagar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void consultar() {
        try {
            String mascotaBuscar = mascotaField.getText();
            if (validar.validarNombre(mascotaBuscar)) {
                NodoArbol dato = arbol.buscarCita(mascotaBuscar);
                String datos = dato.toString();
                String[] parts = datos.split(",");
                String part1 = parts[0]; // Nombre Mascota
                String part2 = parts[1]; // Propietario
                String part3 = parts[2]; // Fecha 
                String part4 = parts[3]; // Hora
                String part5 = parts[4]; // Posicion
                // Se ponen los datos en los respectivos campos
                mascotaField.setText(part1);
                propietarioField.setText(part2);
                fechaField.setText(part3);
                horaField.setText(part4);
                posicionField.setText(part5);
                int aux = Integer.valueOf(posicionField.getText());
                buscarPosicion = aux;
                editar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Error, debe consultar a través del nombre de la mascota","Error encontrado",JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Error, el árbol está vacío","Error encontrado",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificar() {
        if (!nulos()) {
            nombrePropietario = propietarioField.getText();
            nombreMascota = mascotaField.getText();
            fecha = fechaField.getText();
            hora = horaField.getText();
            int aux = Integer.valueOf(posicionField.getText());
            buscarPosicion = aux;
            if (editar) {
                if (arbol.editarCita(posicion, nombreMascota, nombrePropietario, fecha, hora)) {
                    JOptionPane.showMessageDialog(null, "La cita ha sido editada correctamente", "Cita Editada", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, la cita no fue editada correctamente", "Error Modificación", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    
    public boolean nulos() {
        if (!mascotaField.equals("")||!propietarioField.equals("")||!fechaField.equals("")||!horaField.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
    
    public boolean nulosFactura() {
        veterinario = veterinarioField.getText();
        gestion = gestionField.getText();
        montoFinal = totalPagar.getText();
        fechaActual = fechaFacturaField.getText();
        if (!veterinario.equals("")||!gestion.equals("")||!montoFinal.equals("")||!fechaActual.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
    
    public void limpiar() {
        propietarioField.setText(null);
        mascotaField.setText(null);
        fechaField.setText(null);
        veterinarioField.setText(null);
        horaField.setText(null);
        gestionField.setText(null);
        fechaFacturaField.setText(null);
        totalPagar.setText(null);
    }
    
    private void buttonCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCajasActionPerformed

    private void buttonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitasActionPerformed

    }//GEN-LAST:event_buttonCitasActionPerformed

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed

    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void buttonMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenu1MouseClicked

    }//GEN-LAST:event_buttonMenu1MouseClicked

    private void buttonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenu1ActionPerformed
        PanelPrincipal main = new PanelPrincipal(nom,listaDoble,listaCircular,listaCircularDoble);
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonMenu1ActionPerformed

    private void buttonCajas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajas1ActionPerformed
        Cajas cajas = new Cajas(nom);
        cajas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCajas1ActionPerformed

    private void buttonCitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitas1ActionPerformed

    }//GEN-LAST:event_buttonCitas1ActionPerformed

    private void buttonCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesion1ActionPerformed
        LoginVeterinaria login = new LoginVeterinaria();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCerrarSesion1ActionPerformed

    private void propietarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propietarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_propietarioFieldActionPerformed

    private void veterinarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veterinarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_veterinarioFieldActionPerformed

    private void mascotaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mascotaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotaFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reservar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //cancelar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        consultar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpiarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarFieldActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarFieldActionPerformed

    private void propietarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propietarioFieldMouseClicked
        counterOwn++;
        if (counterOwn == 1) {
            propietarioField.setText(null);
        }
    }//GEN-LAST:event_propietarioFieldMouseClicked

    private void veterinarioFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_veterinarioFieldMouseClicked
        counterDoctor++;
        if (counterDoctor == 1) {
            veterinarioField.setText(null);
        }
    }//GEN-LAST:event_veterinarioFieldMouseClicked

    private void mascotaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotaFieldMouseClicked
        counterPet++;
        if (counterPet == 1) {
            mascotaField.setText(null);
        }
    }//GEN-LAST:event_mascotaFieldMouseClicked

    private void fechaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaFieldMouseClicked
        counterDate++;
        if (counterDate == 1) {
            fechaField.setText(null);
        }
    }//GEN-LAST:event_fechaFieldMouseClicked

    private void horaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_horaFieldMouseClicked
        counterHour++;
        if (counterHour == 1) {
            horaField.setText(null);
        }
    }//GEN-LAST:event_horaFieldMouseClicked

    private void gestionFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gestionFieldMouseClicked
        counterType++;
        if (counterType == 1) {
            gestionField.setText(null);
        }
    }//GEN-LAST:event_gestionFieldMouseClicked

    private void fechaFacturaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaFacturaFieldMouseClicked
        counterRecentDate++;
        if (counterRecentDate == 1) {
            fechaFacturaField.setText(null);
        }
    }//GEN-LAST:event_fechaFacturaFieldMouseClicked

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
            java.util.logging.Logger.getLogger(AgendarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarCitas(nom).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCajas1;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCerrarSesion1;
    private javax.swing.JButton buttonCitas;
    private javax.swing.JButton buttonCitas1;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonMenu1;
    private javax.swing.JFormattedTextField fechaFacturaField;
    private javax.swing.JFormattedTextField fechaField;
    private javax.swing.JTextField gestionField;
    private javax.swing.JFormattedTextField horaField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelPago;
    private javax.swing.JLabel lastNameLabel1;
    private javax.swing.JLabel lastNameLabel2;
    private javax.swing.JLabel lastNameLabel3;
    private javax.swing.JCheckBox limpiarField;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JLabel logoSalir1;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel mailLabel1;
    private javax.swing.JLabel mailLabel2;
    private javax.swing.JTextField mascotaField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenu1;
    private javax.swing.JTextField posicionField;
    private javax.swing.JTextField propietarioField;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrder1;
    private javax.swing.JTextField totalPagar;
    private javax.swing.JTextField veterinarioField;
    // End of variables declaration//GEN-END:variables
}
