
package CatalogoPrincipal;

import Cajas.Cajas;
import CatalogoEspecies.ListaCircularDoble;
import CatalogoEspecies.PanelEspecies;
import CatalogoMascotas.ListaCircularSimple;
import CatalogoMascotas.PanelMascotas;
import CatalogoPropietarios.ListaDobleEnlazada;
import CatalogoPropietarios.PanelPropietarios;
import Citas.AgendarCitas;
import RegistroUsuarios.LoginVeterinaria;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;


public class PanelPrincipal extends javax.swing.JFrame {
    public static String user;
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    private final String facebook = "https://www.facebook.com/";
    private final String twitter = "https://twitter.com/";
    private final String instagram = "https://www.instagram.com/";
    
    public PanelPrincipal(String user) {
        initComponents();
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(962, 621));
        this.user = user;
        userTextName.setText(this.user);
    }
    
    public PanelPrincipal(String user,ListaDobleEnlazada listaDoble,ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble){
        initComponents();
        this.user = user;
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(962, 621));
        userTextName.setText(this.user);
        this.listaDoble = listaDoble;
        this.listaCircular = listaCircular;
        this.listaCircularDoble = listaCircularDoble;
    }
    
    
    private void abrirFacebook() {
        try {
            Desktop.getDesktop().browse(new URI(facebook));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void abrirTwitter() {
        try {
            Desktop.getDesktop().browse(new URI(twitter));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void abrirInstagram() {
        try {
            Desktop.getDesktop().browse(new URI(instagram));
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Error al abrir link","Error Link",JOptionPane.ERROR_MESSAGE);
        }
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
        jLabel1 = new javax.swing.JLabel();
        buttonInstagram = new javax.swing.JButton();
        buttonTwitter = new javax.swing.JButton();
        buttonFacebook = new javax.swing.JButton();
        onlineText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CatalogoMascotas1 = new javax.swing.JLabel();
        catalogoPropietarios = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CatalogoEspecies = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        check = new javax.swing.JLabel();
        propietariosImage = new javax.swing.JLabel();
        especiesImage = new javax.swing.JLabel();
        mascotasImage1 = new javax.swing.JLabel();
        propietarioText = new javax.swing.JLabel();
        mascotasText = new javax.swing.JLabel();
        especiesText = new javax.swing.JLabel();
        addPropietarios = new javax.swing.JLabel();
        addMascotas = new javax.swing.JLabel();
        addEspecies = new javax.swing.JLabel();
        userTextName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(0, 102, 153));

        buttonMenu.setBackground(new java.awt.Color(36, 47, 65));
        buttonMenu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        buttonMenu.setForeground(new java.awt.Color(255, 255, 255));
        buttonMenu.setText("Principal");
        buttonMenu.setToolTipText("Menú principal");
        buttonMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMenu.setBorderPainted(false);
        buttonMenu.setContentAreaFilled(false);
        buttonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonMenu.setDefaultCapable(false);
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
        buttonCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCitasMouseClicked(evt);
            }
        });
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
                .addGap(106, 106, 106)
                .addComponent(buttonMenu)
                .addGap(142, 142, 142)
                .addComponent(buttonCajas)
                .addGap(124, 124, 124)
                .addComponent(buttonCitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMenu)
                    .addComponent(buttonCajas)
                    .addComponent(buttonCitas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 47, 65));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEGUINOS EN REDES SOCIALES");

        buttonInstagram.setBackground(new java.awt.Color(255, 255, 255));
        buttonInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/instagram (2).png"))); // NOI18N
        buttonInstagram.setToolTipText("Instagram");
        buttonInstagram.setBorder(null);
        buttonInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInstagramActionPerformed(evt);
            }
        });

        buttonTwitter.setBackground(new java.awt.Color(255, 255, 255));
        buttonTwitter.setForeground(new java.awt.Color(255, 255, 255));
        buttonTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gorjeo (2).png"))); // NOI18N
        buttonTwitter.setToolTipText("Twitter");
        buttonTwitter.setBorder(null);
        buttonTwitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwitterActionPerformed(evt);
            }
        });

        buttonFacebook.setBackground(new java.awt.Color(255, 255, 255));
        buttonFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/facebook (2).png"))); // NOI18N
        buttonFacebook.setToolTipText("Facebook");
        buttonFacebook.setBorder(null);
        buttonFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFacebookActionPerformed(evt);
            }
        });

        onlineText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        onlineText.setForeground(new java.awt.Color(36, 47, 65));
        onlineText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onlineText.setText("Online");

        jSeparator1.setForeground(java.awt.Color.gray);

        CatalogoMascotas1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CatalogoMascotas1.setForeground(new java.awt.Color(36, 47, 65));
        CatalogoMascotas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CatalogoMascotas1.setText("Catalogo Mascotas");

        catalogoPropietarios.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        catalogoPropietarios.setForeground(new java.awt.Color(36, 47, 65));
        catalogoPropietarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        catalogoPropietarios.setText("Catalogo Propietarios");

        jSeparator2.setForeground(java.awt.Color.gray);

        CatalogoEspecies.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        CatalogoEspecies.setForeground(new java.awt.Color(36, 47, 65));
        CatalogoEspecies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CatalogoEspecies.setText("Catalogo Especies");

        jSeparator3.setForeground(java.awt.Color.gray);

        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/online (2).png"))); // NOI18N

        propietariosImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/propietario.png"))); // NOI18N

        especiesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Especies.png"))); // NOI18N

        mascotasImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mascotas.jpg"))); // NOI18N

        propietarioText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        propietarioText.setForeground(new java.awt.Color(36, 47, 65));
        propietarioText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        propietarioText.setText("Registrar Propietarios");
        propietarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                propietarioTextMouseClicked(evt);
            }
        });

        mascotasText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        mascotasText.setForeground(new java.awt.Color(36, 47, 65));
        mascotasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mascotasText.setText("Almacenar Mascotas");
        mascotasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mascotasTextMouseClicked(evt);
            }
        });

        especiesText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        especiesText.setForeground(new java.awt.Color(36, 47, 65));
        especiesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        especiesText.setText("Insertar Especies");
        especiesText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                especiesTextMouseClicked(evt);
            }
        });

        addPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        addPropietarios.setToolTipText("Registrar Propietarios");
        addPropietarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPropietariosMouseClicked(evt);
            }
        });

        addMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        addMascotas.setToolTipText("Registrar Mascotas");
        addMascotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMascotasMouseClicked(evt);
            }
        });

        addEspecies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        addEspecies.setToolTipText("Registrar Especies");
        addEspecies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEspeciesMouseClicked(evt);
            }
        });

        userTextName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        userTextName.setForeground(new java.awt.Color(36, 47, 65));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(propietariosImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(addPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(propietarioText)
                                .addGap(129, 129, 129)))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(mascotasImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(352, 352, 352))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(addMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mascotasText)
                                .addGap(350, 350, 350))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catalogoPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CatalogoMascotas1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addComponent(addEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(especiesText))
                                    .addComponent(especiesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CatalogoEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))))
                .addGap(66, 66, 66))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(186, 186, 186)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(buttonTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(buttonInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(buttonFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catalogoPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CatalogoMascotas1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CatalogoEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(propietariosImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(especiesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mascotasImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addMascotas)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(mascotasText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addEspecies))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(especiesText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(propietarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onlineText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void buttonFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFacebookActionPerformed
        abrirFacebook();
    }//GEN-LAST:event_buttonFacebookActionPerformed

    private void buttonTwitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwitterActionPerformed
        abrirTwitter();
    }//GEN-LAST:event_buttonTwitterActionPerformed

    private void buttonInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInstagramActionPerformed
        abrirInstagram();
    }//GEN-LAST:event_buttonInstagramActionPerformed

    private void buttonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarSesionActionPerformed
        LoginVeterinaria login = new LoginVeterinaria();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCerrarSesionActionPerformed

    private void buttonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitasActionPerformed

    }//GEN-LAST:event_buttonCitasActionPerformed

    private void buttonCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajasActionPerformed
        Cajas cajas = new Cajas(user);
        cajas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCajasActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
       
    }//GEN-LAST:event_buttonMenuActionPerformed

    private void propietarioTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_propietarioTextMouseClicked
        // Here we open another window about owns
    }//GEN-LAST:event_propietarioTextMouseClicked

    private void mascotasTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mascotasTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mascotasTextMouseClicked

    private void especiesTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_especiesTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_especiesTextMouseClicked

    private void addPropietariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPropietariosMouseClicked
        PanelPropietarios propietarios = new PanelPropietarios(user,listaDoble,listaCircular,listaCircularDoble);
        propietarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addPropietariosMouseClicked

    private void addMascotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMascotasMouseClicked
        PanelMascotas mascotas = new PanelMascotas(user,listaDoble,listaCircular,listaCircularDoble);
        mascotas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addMascotasMouseClicked

    private void addEspeciesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEspeciesMouseClicked
        PanelEspecies especies = new PanelEspecies(user,listaDoble,listaCircular,listaCircularDoble);
        especies.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addEspeciesMouseClicked

    private void buttonCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCitasMouseClicked
        boolean registrarCita = false;
        AgendarCitas citas = new AgendarCitas(registrarCita,user,listaDoble,listaCircular,listaCircularDoble);
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCitasMouseClicked

   
    
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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatalogoEspecies;
    private javax.swing.JLabel CatalogoMascotas1;
    private javax.swing.JLabel addEspecies;
    private javax.swing.JLabel addMascotas;
    private javax.swing.JLabel addPropietarios;
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCitas;
    private javax.swing.JButton buttonFacebook;
    private javax.swing.JButton buttonInstagram;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JButton buttonTwitter;
    private javax.swing.JLabel catalogoPropietarios;
    private javax.swing.JLabel check;
    private javax.swing.JLabel especiesImage;
    private javax.swing.JLabel especiesText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logoSalir;
    private javax.swing.JLabel mascotasImage1;
    private javax.swing.JLabel mascotasText;
    private javax.swing.JLabel onlineText;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel propietarioText;
    private javax.swing.JLabel propietariosImage;
    private javax.swing.JLabel userTextName;
    // End of variables declaration//GEN-END:variables
}
