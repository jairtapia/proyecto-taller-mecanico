package taller;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class inicio extends javax.swing.JFrame {

   
    public inicio() throws IOException {
        initComponents();
        
        myHeader = new Header();
        myHeader.fromDisk();
        auxId = myHeader.getUsers();
        auxClientId = myHeader.getClients();
        auxVehicleId = myHeader.getVehicles();
        
        
        
        idField.setText(String.valueOf(auxId));
        clienteIdField.setText(String.valueOf(auxClientId));
        IDvehiculoField.setText(String.valueOf(auxVehicleId));
        
        setUsersIdBox(myHeader.getUsersId());
        setClientsIdBox(myHeader.getClientesId());
    }
    
    private int auxId;
    private int auxClientId;
    private int auxVehicleId;
    private usuario newUser;
    private Cliente newCliente;
    private vehiculo newvehiculo;
    private boolean ban = false ;
    private final File myFile = new File("AUX_USUARIO");
    private final File myFileClientes = new File("AUX_CLIENTES");
    private final File myFileVehiculos = new File("AUX_VEHICULOS");
    private Header myHeader;// = new Header();
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        logUserName = new javax.swing.JTextField();
        logPasWordField = new javax.swing.JPasswordField();
        lbltxtuser = new javax.swing.JLabel();
        lbltxtpwd = new javax.swing.JLabel();
        BtnLoggin = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        BtnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        writeBton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        motherLastNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        userNameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        passWordField = new javax.swing.JPasswordField();
        perfilBox = new javax.swing.JComboBox<>();
        BtnCancel1 = new javax.swing.JButton();
        BtnRemove1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        saveClienteBton = new javax.swing.JButton();
        writeClienteBton = new javax.swing.JButton();
        cancelarClienteBton = new javax.swing.JButton();
        editClienteBton = new javax.swing.JButton();
        deleatClienteBton = new javax.swing.JButton();
        suarchClienteBton = new javax.swing.JButton();
        nameClienteField = new javax.swing.JTextField();
        lastNameClienteField = new javax.swing.JTextField();
        lastMotherNameClienteField = new javax.swing.JTextField();
        usuarioIDBox = new javax.swing.JComboBox<>();
        searchClienteField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        clienteIdField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ClienteIDBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        BtnSearchVehiculos = new javax.swing.JButton();
        searchVehiculoField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        FechaVField = new javax.swing.JTextField();
        IDvehiculoField = new javax.swing.JTextField();
        MatriculaVField = new javax.swing.JTextField();
        MarcaVFIeld = new javax.swing.JTextField();
        ModeloVField = new javax.swing.JTextField();
        NuevoVehiculoBtn = new javax.swing.JButton();
        GuardarVehiculoBtn = new javax.swing.JButton();
        CancelarVehiculoBtn = new javax.swing.JButton();
        EditarVehiculoBtn = new javax.swing.JButton();
        RemoverVehiculoBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("inicio");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(234, 231, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logUserName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        jPanel1.add(logUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 310, 45));

        logPasWordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 2, true));
        jPanel1.add(logPasWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 310, 54));

        lbltxtuser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltxtuser.setText("usuario");
        jPanel1.add(lbltxtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        lbltxtpwd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltxtpwd.setText("contraseña");
        jPanel1.add(lbltxtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        BtnLoggin.setBackground(new java.awt.Color(0, 153, 255));
        BtnLoggin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnLoggin.setText("loggin");
        BtnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLoggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, 40));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/grafo.png"))); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 400));

        jTabbedPane1.addTab("loggin", jPanel1);

        jPanel2.setBackground(new java.awt.Color(234, 231, 231));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ingrese id a buscar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 20));

        searchField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 1, true));
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, -1));

        BtnSearch.setText("buscar");
        BtnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 70, 20));

        jLabel2.setText("ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 85, -1, -1));

        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 123, -1, -1));

        jLabel4.setText("Apellido Paterno");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 161, -1, -1));

        jLabel5.setText("Apellido Materno");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 199, -1, -1));

        jLabel6.setText("Telefono");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 230, -1, -1));

        jLabel7.setText("Username");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 261, -1, -1));

        jLabel8.setText("Perfil");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        jLabel9.setText("Direccion");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 230, -1, -1));

        jLabel10.setText("Pasword");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 261, -1, -1));

        BtnSave.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnSave.setText("nuevo");
        BtnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 70, 20));

        BtnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnEdit.setText("editar");
        BtnEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 70, 20));

        writeBton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        writeBton.setText("guardar");
        writeBton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        writeBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBtonActionPerformed(evt);
            }
        });
        jPanel2.add(writeBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 80, 20));

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(204, 204, 204));
        idField.setText("0");
        idField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel2.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 82, 187, -1));

        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 120, 187, -1));

        lastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 158, 185, -1));

        motherLastNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(motherLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 196, 183, -1));

        phoneNumberField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 227, 183, -1));

        userNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 258, 183, -1));

        addressField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 227, 152, -1));

        passWordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel2.add(passWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 258, 152, -1));

        perfilBox.setBackground(new java.awt.Color(204, 204, 204));
        perfilBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "MANAGER", "SECRETARY", "MECHANIC" }));
        perfilBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(perfilBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 150, -1));

        BtnCancel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnCancel1.setText("cancelar");
        BtnCancel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        BtnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancel1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 80, 20));

        BtnRemove1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnRemove1.setText("eliminar");
        BtnRemove1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        BtnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemove1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRemove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 80, 20));

        jTabbedPane1.addTab("usuarios", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Buscar ID");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel12.setText("Usuario ID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel13.setText("Nombre");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel14.setText("Apellido Paterno");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 200, -1, -1));

        jLabel15.setText("Apellido Materno");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        saveClienteBton.setText("Salvar");
        saveClienteBton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saveClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 60, 20));

        writeClienteBton.setText("Guardar");
        writeClienteBton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        writeClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(writeClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 60, 20));

        cancelarClienteBton.setText("Cancelar");
        cancelarClienteBton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cancelarClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(cancelarClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 60, 20));

        editClienteBton.setText("Editar");
        editClienteBton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(editClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 50, 20));

        deleatClienteBton.setText("Eliminar");
        deleatClienteBton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        deleatClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleatClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleatClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 60, 20));

        suarchClienteBton.setText("Buscar");
        suarchClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suarchClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(suarchClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        nameClienteField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        nameClienteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameClienteFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));

        lastNameClienteField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel3.add(lastNameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));

        lastMotherNameClienteField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel3.add(lastMotherNameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, -1));

        usuarioIDBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        usuarioIDBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usuarioIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioIDBoxActionPerformed(evt);
            }
        });
        jPanel3.add(usuarioIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));

        searchClienteField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 1, true));
        jPanel3.add(searchClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 130, -1));

        jLabel23.setText("cliente ID");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        clienteIdField.setEditable(false);
        clienteIdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 1, true));
        clienteIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteIdFieldActionPerformed(evt);
            }
        });
        jPanel3.add(clienteIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 110, -1));

        jTabbedPane1.addTab("clientes", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Seleccione cliente");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ClienteIDBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        ClienteIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteIDBoxActionPerformed(evt);
            }
        });
        jPanel4.add(ClienteIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, -1));

        jLabel17.setText("Ingrese ID a Buscar");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        BtnSearchVehiculos.setText("Buscar");
        BtnSearchVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchVehiculosActionPerformed(evt);
            }
        });
        jPanel4.add(BtnSearchVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        searchVehiculoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 204, 255), 1, true));
        searchVehiculoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchVehiculoFieldActionPerformed(evt);
            }
        });
        jPanel4.add(searchVehiculoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 130, -1));

        jLabel18.setText("Vehiculo ID");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel19.setText("Matricula");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel20.setText("Marca");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel21.setText("Modelo");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel22.setText("Fecha");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        FechaVField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        FechaVField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaVFieldActionPerformed(evt);
            }
        });
        jPanel4.add(FechaVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, -1));

        IDvehiculoField.setEditable(false);
        IDvehiculoField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        IDvehiculoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDvehiculoFieldActionPerformed(evt);
            }
        });
        jPanel4.add(IDvehiculoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, -1));

        MatriculaVField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel4.add(MatriculaVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));

        MarcaVFIeld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel4.add(MarcaVFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, -1));

        ModeloVField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 1, true));
        jPanel4.add(ModeloVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, -1));

        NuevoVehiculoBtn.setText("Nuevo");
        NuevoVehiculoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NuevoVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(NuevoVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 20));

        GuardarVehiculoBtn.setText("Salvar");
        GuardarVehiculoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GuardarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(GuardarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 20));

        CancelarVehiculoBtn.setText("Cancelar");
        CancelarVehiculoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        CancelarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(CancelarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 90, 20));

        EditarVehiculoBtn.setText("Edit");
        EditarVehiculoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(EditarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 60, 20));

        RemoverVehiculoBtn.setText("Remover");
        RemoverVehiculoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        RemoverVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(RemoverVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 20));

        jTabbedPane1.addTab("vehiculos", jPanel4);

        jLabel25.setText("id");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel26.setText("matricula VH");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel27.setText("vehiculo ID");

        jLabel28.setText("Falla");

        jLabel29.setText("Fecha Entrada");

        jLabel30.setText("Fecha Salida");

        jLabel31.setText("pieza");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel32.setText("pieza ID");

        jLabel33.setText("Cantidad");

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, 0, 131, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(jTextField2))))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jComboBox2, 0, 120, Short.MAX_VALUE)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jButton1)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("reparaciones", jPanel5);

        jLabel34.setText("jLabel34");

        jTextField8.setText("jTextField8");

        jLabel35.setText("jLabel35");

        jLabel36.setText("jLabel36");

        jTextField9.setText("jTextField9");

        jTextField10.setText("jTextField10");

        jButton6.setText("jButton6");

        jButton7.setText("jButton7");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(68, 68, 68)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jButton6)
                        .addGap(29, 29, 29)
                        .addComponent(jButton7)
                        .addGap(29, 29, 29)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("piezas", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUsersIdBox(JSONArray myJson ) {
            
          for (int i = 0; i < myJson.length(); i++) {
            
              JSONObject objeto = myJson.getJSONObject(i);
              
              int aux = objeto.getInt("UsuarioId " + String.valueOf(i + 1));
              
              usuarioIDBox.addItem(String.valueOf(aux));
        }
    }
    private void setClientsIdBox(JSONArray myJson ) {
            
          for (int i = 0; i < myJson.length(); i++) {
            
              JSONObject objeto = myJson.getJSONObject(i);
              
              int aux = objeto.getInt("ClienteId " + String.valueOf(i + 1));
              
              ClienteIDBox.addItem(String.valueOf(aux));
        }
    }
    
    private void writeBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeBtonActionPerformed
        try {
            
           if(ban) {
               
                myFile.writeToDisk();
                
                myHeader.toDisk();

                setDefaults();
                
               
           }else{
               
               JOptionPane.showMessageDialog(this, "No Hay Usuarios guardados");
           }
                   
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_writeBtonActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
       
        try {
            
            if(!userNameField.getText().equals("")){
                
                auxId = Integer.parseInt(idField.getText());
                newUser = new usuario();
                
                auxId++;
                
                myHeader.setUsers(auxId);
                
                myHeader.setUsers(auxId);

                newUser.setId(auxId);
                
                newUser.setNombre(nameField.getText());

                newUser.setApellidop(lastNameField.getText());

                newUser.setApellidom(motherLastNameField.getText());

                newUser.setAddress(addressField.getText());

                newUser.setUsermane(userNameField.getText());

                newUser.setTelefono(phoneNumberField.getText());

                newUser.setPerfil(perfilBox.getSelectedItem().toString());

                newUser.setPasword(passWordField.getText());
                
                myHeader.setId(auxId);

                myFile.saveData(newUser.getJson());

                myHeader.toDisk();

                setDefaults();
                
                ban = true;  
            }else {
                
                JOptionPane.showMessageDialog(this, "Faltan UserName o Password");
            
                ban = false;
            
            }
            
           
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancel1ActionPerformed
        
        setDefaults();
        
    }//GEN-LAST:event_BtnCancel1ActionPerformed

    private void BtnRemove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemove1ActionPerformed
        
        try {
            
            if(!(searchField.getText().equals(""))) {
              
                auxId = Integer.parseInt(searchField.getText());

                newUser = new usuario();
                
                myHeader.deleatId(auxId);

                myHeader.setUsers(auxId);

                newUser.setId(auxId);

                myFile.deletData(newUser.getJson());
                
                auxId--;

                myHeader.toDisk();

                setDefaults(); 
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Faltan UserName o Password");
            
            }
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_BtnRemove1ActionPerformed

    private void BtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchActionPerformed
        // TODO add your handling code here:
        
       
        try {
            
            if(!(searchField.getText().equals("")))
            {
                newUser = new usuario();
                JSONObject tempObj = new JSONObject();
                
                newUser.setId(Integer.parseInt(searchField.getText()));

                tempObj = myFile.searchInFile(newUser.getJson());
               
                newUser.setUser(tempObj);
                
                idField.setText(String.valueOf(newUser.getId()));

                nameField.setText(newUser.getNombre());

                lastNameField.setText(newUser.getApellidop());

                motherLastNameField.setText(newUser.getApellidom());

                addressField.setText(newUser.getAddress());

                userNameField.setText(newUser.getUsermane());

                phoneNumberField.setText(newUser.getTelefono());

                passWordField.setText(newUser.getPasword());
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Falta el ID");
            
            }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
        
    }//GEN-LAST:event_BtnSearchActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        try {
            
            
            auxId = Integer.parseInt(idField.getText());
            
            newUser = new usuario();
           
            newUser.setId(auxId);

            newUser.setNombre(nameField.getText());

            newUser.setApellidop(lastNameField.getText());

            newUser.setApellidom(motherLastNameField.getText());

            newUser.setAddress(addressField.getText());

            newUser.setUsermane(userNameField.getText());

            newUser.setTelefono(phoneNumberField.getText());

            newUser.setPerfil(perfilBox.getSelectedItem().toString());

            newUser.setPasword(passWordField.getText());

            myFile.editData(newUser.getJson());

            setDefaults();
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogginActionPerformed
        
        try {
            
            
            newUser = new usuario();
            
            newUser.setUsermane(logUserName.getText());
            
            newUser.setPasword(logPasWordField.getText());
            
            
            if(myFile.isValid(newUser.getJson())) {
                
                    JOptionPane.showMessageDialog(this, "Usuario Valido");
                    jTabbedPane1.setSelectedIndex(1);
            }else{
                
                JOptionPane.showMessageDialog(this, "Usuario Invalido");
            }
            logUserName.setText("");
            logPasWordField.setText("");
            
             
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
        
    }//GEN-LAST:event_BtnLogginActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void suarchClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suarchClienteBtonActionPerformed
        // TODO add your handling code here:
        try {
            
            if( !(searchClienteField.getText().equals("")))
            {
                newCliente = new Cliente();
                
                JSONObject tempObj = new JSONObject();

                newCliente.setClienteId(Integer.parseInt(searchClienteField.getText()));

                tempObj = myFileClientes.searchClientInFile(newCliente.getJson());
                
                nameClienteField.setText(tempObj.getString("Name"));
                
                lastNameClienteField.setText(tempObj.getString("LastName"));
                
                lastMotherNameClienteField.setText(tempObj.getString("LastMotherName"));
                
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Falta el ID");
            
            }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_suarchClienteBtonActionPerformed

    private void usuarioIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioIDBoxActionPerformed

    }//GEN-LAST:event_usuarioIDBoxActionPerformed

    private void setDefaultCliente() {
        
        nameClienteField.setText("");
                
        lastNameClienteField.setText("");
                
        lastMotherNameClienteField.setText("");
        
    }
    private void ClienteIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteIDBoxActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_ClienteIDBoxActionPerformed

    private void saveClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveClienteBtonActionPerformed
        // TODO add your handling code here:
         try {
            
            if(!usuarioIDBox.getSelectedItem().toString().equals("0")){
                
                newCliente = new Cliente();
                
                myHeader.setClienteId(++auxClientId);
                
                myHeader.setClients(auxClientId);
                
                newCliente.setClienteId(auxClientId);
                
                newCliente.setUsuarioId(Integer.parseInt(usuarioIDBox.getSelectedItem().toString()));
                
                newCliente.setName(nameClienteField.getText());
                
                newCliente.setLastName(lastNameClienteField.getText());
                
                newCliente.setLastMotherName(lastMotherNameClienteField.getText());
                
                myFileClientes.saveCliente(newCliente.getJson());
                
                setDefaultCliente();
                clienteIdField.setText(String.valueOf(auxClientId));
                
            }else {
                
                JOptionPane.showMessageDialog(this, "No ha seleccionado un Id Valido");
           
            }
            
           
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_saveClienteBtonActionPerformed

    private void writeClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeClienteBtonActionPerformed
        // TODO add your handling code here:
        try {
            
           if(!usuarioIDBox.getSelectedItem().toString().equals("0")) {
               
                myFileClientes.writeToDiskClientes();
                
                myHeader.toDisk();

                setDefaultCliente();
                   
           }else{
               
               JOptionPane.showMessageDialog(this, "No Hay Usuarios guardados");
           }
                   
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_writeClienteBtonActionPerformed

    private void cancelarClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarClienteBtonActionPerformed
        // TODO add your handling code here:
        setDefaultCliente();
    }//GEN-LAST:event_cancelarClienteBtonActionPerformed

    private void editClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClienteBtonActionPerformed
        // TODO add your handling code here:
       try {
            
            if(!searchClienteField.getText().equals("")){
                
                newCliente = new Cliente();
                
                newCliente.setClienteId(Integer.parseInt(searchClienteField.getText()));
                
                newCliente.setName(nameClienteField.getText());
                
                newCliente.setLastName(lastNameClienteField.getText());
                
                newCliente.setLastMotherName(lastMotherNameClienteField.getText());
                
                myFileClientes.editClient(newCliente.getJson());
                
                setDefaultCliente();
         
            }else {
                
                JOptionPane.showMessageDialog(this, "No ha seleccionado un Id Valido");
            
            }
            
           
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_editClienteBtonActionPerformed

    private void deleatClienteBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleatClienteBtonActionPerformed
        // TODO add your handling code here:
       try {
            
            if(!searchClienteField.getText().equals("")) {
                
                newCliente = new Cliente();
                
                newCliente.setClienteId(Integer.parseInt(searchClienteField.getText()));
                
                myFileClientes.deletCliente(newCliente.getJson());
               
                myHeader.setClients(auxClientId - 1);
                
                myHeader.deleatIdClientes(Integer.parseInt(searchClienteField.getText()));
                
                myHeader.toDisk();
                
                auxClientId --;
                
                setDefaultCliente();
                
            }
            else{
                
                JOptionPane.showMessageDialog(this, "No ha seleccionado un Id Valido");
            
            }
            
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_deleatClienteBtonActionPerformed

    private void nameClienteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameClienteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameClienteFieldActionPerformed

    private void NuevoVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoVehiculoBtnActionPerformed
        // TODO add your handling code here:
        try {
            
            if(!ClienteIDBox.getSelectedItem().toString().equals("0")){
                newvehiculo = new vehiculo();
                myHeader.setVehiculoid(++auxVehicleId);
                myHeader.setVehicles(auxVehicleId);
                newvehiculo.setIDvehiculo(auxVehicleId);
                newvehiculo.setClienteID(Integer.parseInt(ClienteIDBox.getSelectedItem().toString()));
                newvehiculo.setMarca(MarcaVFIeld.getText());
                newvehiculo.setModelo(ModeloVField.getText());
                newvehiculo.setFecha(FechaVField.getText());
                newvehiculo.setMatricula(MatriculaVField.getText());
                myFileVehiculos.saveVehiculo(newvehiculo.getJson());
                setDefaultVehiculo();
                
            }
            
        }catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
        
    }//GEN-LAST:event_NuevoVehiculoBtnActionPerformed

    private void CancelarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarVehiculoBtnActionPerformed
        // TODO add your handling code here:
        setDefaultVehiculo();
    }//GEN-LAST:event_CancelarVehiculoBtnActionPerformed

    private void searchVehiculoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchVehiculoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchVehiculoFieldActionPerformed

    private void IDvehiculoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDvehiculoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDvehiculoFieldActionPerformed

    private void FechaVFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaVFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaVFieldActionPerformed

    private void BtnSearchVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSearchVehiculosActionPerformed
        // TODO add your handling code 
        try{
            int temp = 0;
            if( !(searchVehiculoField.getText().equals("")))
            {
                newvehiculo = new vehiculo();
                JSONObject tempObj = new JSONObject();

                temp = Integer.parseInt(String.valueOf(searchVehiculoField.getText()));
                
                newvehiculo.setIDvehiculo(temp);

                tempObj = myFileVehiculos.SearchVehiculo(newvehiculo.getJson());
                
                if(tempObj != null){
                    IDvehiculoField.setText(String.valueOf(tempObj.getInt("IDVH")));
                    MatriculaVField.setText(tempObj.getString("MATRICULA"));
                    MarcaVFIeld.setText(tempObj.getString("MARCA"));
                    ModeloVField.setText(tempObj.getString("MODELO"));
                    FechaVField.setText(tempObj.getString("FECHA")); 
                    
                }
                
            }
            else{
                
                JOptionPane.showMessageDialog(this, "Falta el ID");
            
            }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_BtnSearchVehiculosActionPerformed

    private void GuardarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarVehiculoBtnActionPerformed
        // TODO add your handling code here:
        try {
            
           if(!ClienteIDBox.getSelectedItem().toString().equals("0")) {
               
                myFileVehiculos.writeToDiskVheiculos();
                
                myHeader.toDisk();

                setDefaultVehiculo();
                
           }
                   
        }catch (Exception ex) {
            
            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
        
    }//GEN-LAST:event_GuardarVehiculoBtnActionPerformed

    private void RemoverVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverVehiculoBtnActionPerformed
        // TODO add your handling code here:
        try{
        
            if( !(searchVehiculoField.getText().equals("")))
            {
                newvehiculo = new vehiculo();
                newvehiculo.setIDvehiculo(Integer.parseInt(searchVehiculoField.getText()));
                myFileVehiculos.deletevehiculo(newvehiculo.getJson());
                myHeader.setVehicles(auxVehicleId-1);
                myHeader.deleatIdVehiculos(Integer.parseInt(searchVehiculoField.getText()));
                myHeader.toDisk();
                auxVehicleId--;
                setDefaultVehiculo();
            }
            else{
                JOptionPane.showMessageDialog(this, "Falta el ID");
            }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
    }//GEN-LAST:event_RemoverVehiculoBtnActionPerformed

    private void EditarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarVehiculoBtnActionPerformed
        // TODO add your handling code here:
        try{
        int temp = 0;
            if( !(searchVehiculoField.getText().equals("")))
            {
                newvehiculo = new vehiculo();
                temp = Integer.parseInt(IDvehiculoField.getText());
                    newvehiculo.setIDvehiculo(Integer.parseInt(IDvehiculoField.getText()));
                    newvehiculo.setMarca(MarcaVFIeld.getText());
                    newvehiculo.setModelo(ModeloVField.getText());
                    newvehiculo.setFecha(FechaVField.getText());
                    newvehiculo.setMatricula(MatriculaVField.getText());
                    myFileVehiculos.editDataV(newvehiculo.getJson());
            }
            else{
                JOptionPane.showMessageDialog(this, "Falta el ID");
            }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
    }//GEN-LAST:event_EditarVehiculoBtnActionPerformed

    private void clienteIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteIdFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void setDefaultVehiculo(){
        searchVehiculoField.setText("");
        IDvehiculoField.setText(String.valueOf(auxVehicleId));
        MatriculaVField.setText("");
        MarcaVFIeld.setText("");
        ModeloVField.setText("");
        FechaVField.setText("");
    }
    
    private void setDefaults() {
        
        searchField.setText("");
        
        idField.setText(String.valueOf(auxId));
        
        nameField.setText("");
        
        lastNameField.setText("");
        
        motherLastNameField.setText("");
        
        addressField.setText("");
        
        userNameField.setText("");
        
        phoneNumberField.setText("");
        
        passWordField.setText("");
        
        ban = false;
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new inicio().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel1;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnLoggin;
    private javax.swing.JButton BtnRemove1;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton BtnSearch;
    private javax.swing.JButton BtnSearchVehiculos;
    private javax.swing.JButton CancelarVehiculoBtn;
    private javax.swing.JComboBox<String> ClienteIDBox;
    private javax.swing.JButton EditarVehiculoBtn;
    private javax.swing.JTextField FechaVField;
    private javax.swing.JButton GuardarVehiculoBtn;
    private javax.swing.JTextField IDvehiculoField;
    private javax.swing.JTextField MarcaVFIeld;
    private javax.swing.JTextField MatriculaVField;
    private javax.swing.JTextField ModeloVField;
    private javax.swing.JButton NuevoVehiculoBtn;
    private javax.swing.JButton RemoverVehiculoBtn;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton cancelarClienteBton;
    private javax.swing.JTextField clienteIdField;
    private javax.swing.JButton deleatClienteBton;
    private javax.swing.JButton editClienteBton;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lastMotherNameClienteField;
    private javax.swing.JTextField lastNameClienteField;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lbltxtpwd;
    private javax.swing.JLabel lbltxtuser;
    private javax.swing.JPasswordField logPasWordField;
    private javax.swing.JTextField logUserName;
    private javax.swing.JTextField motherLastNameField;
    private javax.swing.JTextField nameClienteField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JComboBox<String> perfilBox;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveClienteBton;
    private javax.swing.JTextField searchClienteField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField searchVehiculoField;
    private javax.swing.JButton suarchClienteBton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JComboBox<String> usuarioIDBox;
    private javax.swing.JButton writeBton;
    private javax.swing.JButton writeClienteBton;
    // End of variables declaration//GEN-END:variables
}
