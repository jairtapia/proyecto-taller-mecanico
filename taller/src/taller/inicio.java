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
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
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
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(logUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 121, 310, 45));

        logPasWordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(logPasWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 198, 310, 54));

        lbltxtuser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltxtuser.setText("usuario");
        jPanel1.add(lbltxtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        lbltxtpwd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbltxtpwd.setText("contraseña");
        jPanel1.add(lbltxtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        BtnLoggin.setBackground(new java.awt.Color(204, 204, 204));
        BtnLoggin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnLoggin.setText("loggin");
        BtnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogginActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLoggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 40));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 660, 40));

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

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        jTabbedPane1.addTab("loggin", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ingrese id a buscar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 20));
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 190, -1));

        BtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-icon.png"))); // NOI18N
        BtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSearchActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 50, 50));

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
        BtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/list.png"))); // NOI18N
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(BtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 50, 50));

        BtnEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Text-Edit-icon.png"))); // NOI18N
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });
        jPanel2.add(BtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 50, 50));

        writeBton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        writeBton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-icon.png"))); // NOI18N
        writeBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBtonActionPerformed(evt);
            }
        });
        jPanel2.add(writeBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 50, 50));

        idField.setEditable(false);
        idField.setText("0");
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel2.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 82, 187, -1));
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 120, 187, -1));
        jPanel2.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 158, 185, -1));
        jPanel2.add(motherLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 196, 183, -1));
        jPanel2.add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 227, 183, -1));
        jPanel2.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 258, 183, -1));
        jPanel2.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 227, 152, -1));
        jPanel2.add(passWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 258, 152, -1));

        perfilBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "MANAGER", "SECRETARY", "MECHANIC" }));
        jPanel2.add(perfilBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 150, -1));

        BtnCancel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Windows-Close-Program-icon.png"))); // NOI18N
        BtnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancel1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 50, 50));

        BtnRemove1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BtnRemove1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-icon.png"))); // NOI18N
        BtnRemove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemove1ActionPerformed(evt);
            }
        });
        jPanel2.add(BtnRemove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 50, 50));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 660, 20));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 20));

        jTabbedPane1.addTab("usuarios", jPanel2);

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
        saveClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        writeClienteBton.setText("Guardar");
        writeClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(writeClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        cancelarClienteBton.setText("Cancelar");
        cancelarClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(cancelarClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        editClienteBton.setText("Editar");
        editClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(editClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        deleatClienteBton.setText("Eliminar");
        deleatClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleatClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(deleatClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        suarchClienteBton.setText("Buscar");
        suarchClienteBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suarchClienteBtonActionPerformed(evt);
            }
        });
        jPanel3.add(suarchClienteBton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        nameClienteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameClienteFieldActionPerformed(evt);
            }
        });
        jPanel3.add(nameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, -1));
        jPanel3.add(lastNameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, -1));
        jPanel3.add(lastMotherNameClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, -1));

        usuarioIDBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        usuarioIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioIDBoxActionPerformed(evt);
            }
        });
        jPanel3.add(usuarioIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));
        jPanel3.add(searchClienteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 130, -1));

        jLabel23.setText("cliente ID");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        clienteIdField.setEditable(false);
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

        FechaVField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaVFieldActionPerformed(evt);
            }
        });
        jPanel4.add(FechaVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, -1));

        IDvehiculoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDvehiculoFieldActionPerformed(evt);
            }
        });
        jPanel4.add(IDvehiculoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, -1));
        jPanel4.add(MatriculaVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));
        jPanel4.add(MarcaVFIeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, -1));
        jPanel4.add(ModeloVField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, -1));

        NuevoVehiculoBtn.setText("Nuevo");
        NuevoVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(NuevoVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        GuardarVehiculoBtn.setText("Salvar");
        GuardarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(GuardarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        CancelarVehiculoBtn.setText("Cancelar");
        CancelarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(CancelarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 100, -1));

        EditarVehiculoBtn.setText("Edit");
        EditarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(EditarVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 60, -1));

        RemoverVehiculoBtn.setText("Remover");
        RemoverVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverVehiculoBtnActionPerformed(evt);
            }
        });
        jPanel4.add(RemoverVehiculoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jTabbedPane1.addTab("vehiculos", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("reparaciones", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("piezas", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

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
        try {
            newvehiculo = new vehiculo();
            if(!ClienteIDBox.getSelectedItem().toString().equals("0")){

                int temp = 0;

                JSONObject tempObj = new JSONObject();

                temp = Integer.parseInt(ClienteIDBox.getSelectedItem().toString());

                newvehiculo.setIDvehiculo(temp);

                tempObj = myFileVehiculos.SearchVehiculo(newvehiculo.getJson());
                
                if(tempObj != null){
                    IDvehiculoField.setText(String.valueOf(tempObj.getInt("ID")));

                    MatriculaVField.setText(tempObj.getString("MATRICULA"));

                    MarcaVFIeld.setText(tempObj.getString("MARCA"));

                    ModeloVField.setText(tempObj.getString("MODELO"));

                    FechaVField.setText(tempObj.getString("FECHA")); 
                }
            }else {
            newvehiculo.setIDvehiculo(Integer.parseInt(IDvehiculoField.getText()));
            newvehiculo.setMarca(MarcaVFIeld.getText());
            newvehiculo.setModelo(ModeloVField.getText());
            newvehiculo.setFecha(FechaVField.getText());
            newvehiculo.setMatricula(MatriculaVField.getText());
            }
            myFileVehiculos.saveVehiculo(newvehiculo.getJson());
        }catch (Exception ex) {

            JOptionPane.showMessageDialog(this, ex, "ERROR", HEIGHT);
        }
        
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
            newvehiculo = new vehiculo();
            if(!ClienteIDBox.getSelectedItem().toString().equals("0")){

                int temp = 0;

                JSONObject tempObj = new JSONObject();

                temp = Integer.parseInt(ClienteIDBox.getSelectedItem().toString());

                newvehiculo.setIDvehiculo(temp);

                tempObj = myFileVehiculos.SearchVehiculo(newvehiculo.getJson());
                
                if(tempObj != null){
                    IDvehiculoField.setText(String.valueOf(tempObj.getInt("ID")));

                    MatriculaVField.setText(tempObj.getString("MATRICULA"));

                    MarcaVFIeld.setText(tempObj.getString("MARCA"));

                    ModeloVField.setText(tempObj.getString("MODELO"));

                    FechaVField.setText(tempObj.getString("FECHA")); 
                }
            }else {
            newvehiculo.setIDvehiculo(Integer.parseInt(IDvehiculoField.getText()));
            myHeader.setVehiculoid(newvehiculo.getIDvehiculo());
            newvehiculo.setMarca(MarcaVFIeld.getText());
            newvehiculo.setModelo(ModeloVField.getText());
            newvehiculo.setFecha(FechaVField.getText());
            newvehiculo.setMatricula(MatriculaVField.getText());
            }
            myFileVehiculos.saveVehiculo(newvehiculo.getJson());
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
                
               
           }else{
               
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
        int temp = 0;
            if( !(searchVehiculoField.getText().equals("")))
            {
                newvehiculo = new vehiculo();
                JSONObject tempObj = new JSONObject();

                temp = Integer.parseInt(String.valueOf(searchVehiculoField.getText()));
                
                newvehiculo.setIDvehiculo(temp);
                myFileVehiculos.deletevehiculo(newvehiculo.getJson());
                myHeader.deleatIdVehiculos(temp);
                myHeader.toDisk();
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
    
    private void setDefaultVehiculo(){
        searchVehiculoField.setText("");
        IDvehiculoField.setText("");
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
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
