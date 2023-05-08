
package CatalogoEspecies;


import CatalogoMascotas.ListaCircularSimple;
import CatalogoPrincipal.*;
import CatalogoPropietarios.ListaDobleEnlazada;
import RegistroUsuarios.LoginVeterinaria;
import RegistroUsuarios.Validar;
import java.awt.Dimension;
import javax.swing.JOptionPane;



public class PanelEspecies extends javax.swing.JFrame {
    public String user;
    private String nombreEspecie = "", caracteristicas = "", estado = "",posicion = "1";
    private int counterName = 0, counterCara = 0, counterState = 0;
    private int auxPosicion = 1;
    boolean editar = false;
    String buscarPosicion="";
    Validar validar = new Validar();
    ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
    ListaDobleEnlazada listaDoble = new ListaDobleEnlazada();
    ListaCircularSimple listaCircular = new ListaCircularSimple();
    
    public PanelEspecies() {
        initComponents();
        this.setLocationRelativeTo(null);
        posicionEspecieField.setVisible(false);
        this.setMinimumSize(new Dimension(472,862));
    }
    
    public PanelEspecies(String user,ListaDobleEnlazada listaDoble,ListaCircularSimple listaCircular,ListaCircularDoble listaCircularDoble){
        initComponents();
        this.user = user;
        setLocationRelativeTo(null);
        userTextName.setText(this.user);
        posicionEspecieField.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tituloCatalogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caracteristicasField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        estadoField = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        posicionEspecieField = new javax.swing.JTextField();

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/plus.png"))); // NOI18N
        jButton1.setToolTipText("Agrega una especie");
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
        jButton2.setToolTipText("Modifica una especie");
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
        jButton3.setToolTipText("Elimina una especie");
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
        jButton4.setToolTipText("Consulta una especie");
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
        tituloCatalogo.setText("Catalogo de Especies");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Caractéristicas");

        caracteristicasField.setBackground(new java.awt.Color(255, 255, 255));
        caracteristicasField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        caracteristicasField.setForeground(new java.awt.Color(51, 51, 51));
        caracteristicasField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caracteristicasField.setText("Digite las carácteristicas de la especie");
        caracteristicasField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        caracteristicasField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caracteristicasFieldMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Especie");

        nombreField.setBackground(new java.awt.Color(255, 255, 255));
        nombreField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nombreField.setForeground(new java.awt.Color(51, 51, 51));
        nombreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreField.setText("Ingrese el nombre especie");
        nombreField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        nombreField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreFieldMouseClicked(evt);
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

        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Limpiar Datos");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        posicionEspecieField.setBackground(new java.awt.Color(255, 255, 255));
        posicionEspecieField.setForeground(new java.awt.Color(51, 51, 51));
        posicionEspecieField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(posicionEspecieField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox1))))
                            .addGap(108, 108, 108)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelLayout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addGap(36, 36, 36)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onlineText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(caracteristicasField, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(tituloCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(posicionEspecieField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caracteristicasField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userTextName, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onlineText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
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

    public void limpiar() {
        nombreField.setText(null);
        caracteristicasField.setText(null);
        estadoField.setText(null);
    }
    
    public void agregar() {
        nombreEspecie = nombreField.getText();
        caracteristicas = caracteristicasField.getText();
        estado = estadoField.getText();
        // Here we verify if all data are correct
        if (validar.validarNombre(nombreEspecie) && validar.validarEstado(estado) && validar.validarCaracteristicas(caracteristicas)) {
            listaCircularDoble.insertarFinal(new Especies(nombreEspecie,caracteristicas,estado,posicion));
            auxPosicion++;
            posicion = Integer.toString(auxPosicion);
            JOptionPane.showMessageDialog(null, "Especie registrada correctamente", "Especie Registrada", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void consultar() {
        try {
            String nombre = nombreField.getText();
            if (validar.validarNombre(nombre)) {
                String datos = listaCircularDoble.buscarEspecie(nombre);
                String[] parts = datos.split(",");
                String part1 = parts[0]; // Nombre Especie
                String part2 = parts[1]; // Estado
                // FALTA CORREGIR ESTA PARTE SOLO TOMA UNA PALABRA Y NO TODAS (SENCILLO)
                String part3 = parts[2]; // Posicion
                String part4 = parts[3]; // Caracteristicas
                // Se ponen los datos en los respectivos campos
                nombreField.setText(part1);
                estadoField.setText(part2);
                caracteristicasField.setText(part4);
                posicionEspecieField.setText(part3);
                buscarPosicion = posicionEspecieField.getText();
                editar = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error, hay algunos datos con formato o valores no permitidos", "Error Datos", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Error, debe consultar a través del nombre","Error encontrado",JOptionPane.ERROR_MESSAGE);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Error, la lista está vacía","Error encontrado",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void borrarDatosEspecie() {
        try {
            int borrarDato = Integer.parseInt(buscarPosicion);
            if (!nulos()) {
                if (listaCircularDoble.removerEnPosicion(borrarDato)) {
                    JOptionPane.showMessageDialog(null, "Especie borrada correctamente", "Especie borrada", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Indice no valido en la lista", "Error encontrado", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar la especie", "Error encontrado", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe hacer una consulta y luego si lo desea borrar la especie", "Error encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void editarDatosEspecie() {
        if (!nulos()) {
            nombreEspecie = nombreField.getText();
            caracteristicas = caracteristicasField.getText();
            estado = estadoField.getText();
            buscarPosicion = posicionEspecieField.getText();
            if (editar) {
                if (listaCircularDoble.editarEspecie(buscarPosicion,nombreEspecie, caracteristicas, estado) == true) {
                    JOptionPane.showMessageDialog(null, "La especie ha sido editada correctamente", "Especie Editada", JOptionPane.INFORMATION_MESSAGE);
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error, la especie no fue editada correctamente", "Error Modificación", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public boolean nulos() {
        if (!nombreEspecie.equals("")||!caracteristicas.equals("")||!estado.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
    
    private void buttonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCitasActionPerformed

    }//GEN-LAST:event_buttonCitasActionPerformed

    private void buttonCajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCajasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCajasActionPerformed

    private void buttonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMenuActionPerformed
        
    }//GEN-LAST:event_buttonMenuActionPerformed

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

    private void caracteristicasFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caracteristicasFieldMouseClicked
        counterCara++;
        if (counterCara == 1) {
            caracteristicasField.setText(null);
        }
    }//GEN-LAST:event_caracteristicasFieldMouseClicked

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        editarDatosEspecie();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        borrarDatosEspecie();
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
            java.util.logging.Logger.getLogger(PanelEspecies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelEspecies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelEspecies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelEspecies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PanelEspecies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCajas;
    private javax.swing.JButton buttonCerrarSesion;
    private javax.swing.JButton buttonCitas;
    private javax.swing.JButton buttonMenu;
    private javax.swing.JTextField caracteristicasField;
    private javax.swing.JLabel check;
    private javax.swing.JTextField estadoField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JTextField posicionEspecieField;
    private javax.swing.JLabel tituloCatalogo;
    private javax.swing.JLabel userTextName;
    // End of variables declaration//GEN-END:variables
}
