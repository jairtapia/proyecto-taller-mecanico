package taller;

import static java.awt.image.ImageObserver.HEIGHT;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class inicio extends javax.swing.JFrame {

   
    public inicio() throws IOException {
        initComponents();
        
        //myHeader = new Header();
        //myHeader.fromDisk();
        //auxId = myHeader.getUsers();
        
        //idField.setText(String.valueOf(auxId));
    }
    
    private int auxId;
    private usuario newUser;
    private boolean ban = false ;
    private final File myFile = new File();
    private Header myHeader;
     
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
        jPanel4 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("clientes", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

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

    private void writeBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeBtonActionPerformed
        try {
            
           if(ban) {
               
                myFile.writeToDisk();

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
                
                myHeader = new Header();
                
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

                myFile.saveData(newUser);

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
                
                myHeader = new Header();
              
                auxId = Integer.parseInt(searchField.getText());

                newUser = new usuario();
                

                myHeader.setUsers(auxId);

                newUser.setId(auxId);
                
                auxId--;

                myFile.deletData(newUser);

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
                
                newUser.setId(Integer.parseInt(searchField.getText()));

                newUser = myFile.searchInFile(newUser);
                
                if(newUser != null){
                    newUser.setId(Integer.parseInt(searchField.getText()));

                    newUser = myFile.searchInFile(newUser);

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
                   JOptionPane.showMessageDialog(this, "no existe"); 
                }
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

            myFile.editData(newUser);

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
            
            
            if(myFile.isValid(newUser)) {
                
                    JOptionPane.showMessageDialog(this, "Usuario Valido");
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
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lbltxtpwd;
    private javax.swing.JLabel lbltxtuser;
    private javax.swing.JPasswordField logPasWordField;
    private javax.swing.JTextField logUserName;
    private javax.swing.JTextField motherLastNameField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passWordField;
    private javax.swing.JComboBox<String> perfilBox;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField userNameField;
    private javax.swing.JButton writeBton;
    // End of variables declaration//GEN-END:variables
}
