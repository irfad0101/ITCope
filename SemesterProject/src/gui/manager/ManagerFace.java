/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manager;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import DataBase.Help;
import Domain.Employee;
import Domain.EmployeeFactory;
import gui.login.ChangeLogInSetting;
import gui.login.LoginFace;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Asus
 */
public class ManagerFace extends javax.swing.JFrame {

    /**
     * Creates new form ManegerFace
     */
    DBOperations empDB ;
    int searchID;
    Employee emp;
    EmployeeFactory emfac;
    public ManagerFace() {
        initComponents();
         this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to log out?","Log out",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){                
                setVisible(false);
                LoginFace logWindow = new LoginFace();
                logWindow.setVisible(true);
                }
                
            }    
                });
        nameLabel.setEnabled(false);
        posLabel.setEnabled(false);
        nicLabel.setEnabled(false);
        emfac = new EmployeeFactory();
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        eidText = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        posLabel = new javax.swing.JLabel();
        nicLabel = new javax.swing.JLabel();
        removeBtn = new javax.swing.JButton();
        eListBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        unameText = new javax.swing.JTextField();
        passText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        conPassText = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        posComboBox = new javax.swing.JComboBox();
        nicText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        changeIdText = new javax.swing.JTextField();
        changeBtn = new javax.swing.JButton();
        getEmpListBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setName(""); // NOI18N

        jLabel6.setText("EID");

        eidText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eidTextKeyTyped(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        nameLabel.setText(".");

        posLabel.setText(".");

        nicLabel.setText(".");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(posLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nameLabel)
                .addGap(53, 53, 53)
                .addComponent(posLabel)
                .addGap(56, 56, 56)
                .addComponent(nicLabel)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        removeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/user_remove.png"))); // NOI18N
        removeBtn.setText("Remove");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        eListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/users.png"))); // NOI18N
        eListBtn.setText("Get Employee List");
        eListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(eidText, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(SearchBtn)
                        .addGap(38, 38, 38)
                        .addComponent(eListBtn))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeBtn)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(eidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn)
                    .addComponent(eListBtn))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(removeBtn)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Remove Employee", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Employee deails"));

        jLabel1.setText("Name");

        jLabel2.setText("UserName");

        jLabel3.setText("Password");

        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTextKeyTyped(evt);
            }
        });

        jLabel4.setText("Confirm Password");

        jLabel5.setText("Position");

        posComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Reception", "LabTechniciant", "DataEntryClerk" }));

        nicText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicTextActionPerformed(evt);
            }
        });
        nicText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicTextKeyTyped(evt);
            }
        });

        jLabel7.setText("NIC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nicText)
                    .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(conPassText)
                    .addComponent(unameText)
                    .addComponent(passText)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(posComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(posComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nicText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(unameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(conPassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/user_add.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/remove.png"))); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBtn)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add new Employee", jPanel2);

        changeIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeIdTextActionPerformed(evt);
            }
        });
        changeIdText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                changeIdTextKeyTyped(evt);
            }
        });

        changeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/page_edit.png"))); // NOI18N
        changeBtn.setText("Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        getEmpListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/users.png"))); // NOI18N
        getEmpListBtn.setText("Get Employee List");
        getEmpListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmpListBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("EID");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(changeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(changeBtn)
                .addGap(35, 35, 35)
                .addComponent(getEmpListBtn)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getEmpListBtn)
                    .addComponent(changeBtn)
                    .addComponent(changeIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit data", jPanel5);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/login/Secound5.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(37, 37, 37))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Remove Employee");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        if(!"".equals(eidText.getText())){       
            empDB = DBOperations.getInstace();
            nameLabel.setEnabled(true);
            posLabel.setEnabled(true);
            nicLabel.setEnabled(true);
            searchID = Integer.parseInt(eidText.getText());
            try {
                emp = empDB.getEmplyee(searchID);
                if(emp==null){
                    JOptionPane.showMessageDialog(null, "Invalid employee ID", "Error! ", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    nameLabel.setText("Name :  " + emp.getName());
                    posLabel.setText("Position :  " + emp.getPosition());
                    nicLabel.setText("NIC :  " + emp.getNIC());
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(NullPointerException exN){
              //  Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, exN);
            } catch (ConnectionTimeOutException ex) {
                 JOptionPane.showMessageDialog(null,ex.toString());
                return;
             }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter an EID. You can check the employee list to find an ID", "Enter an ID ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(!((nameText.getText()=="")||(nicText.getText()=="")||(unameText.getText()=="")||(passText.getPassword().length==0))){
                 
            EmployeeFactory empFac = new EmployeeFactory();        
            empDB = DBOperations.getInstace();
            String name = nameText.getText();
            String position = posComboBox.getSelectedItem().toString();

            Employee emp1 = emfac.getEmployee(position);
            String nic = nicText.getText();        
            String userName = unameText.getText();
            char[] password = passText.getPassword();
            char[] conPassword = conPassText.getPassword();
            try {
                if(!(empDB.checkEmployeeNIC(nic))){
                    if(!(empDB.checkUserName(userName))){
                        if((Arrays.equals(password, conPassword))){
                            if(Help.isValidNIC(nic)){
                                emp1.setName(name);
                                emp1.setNIC(nic);
                                emp1.setPassword(Arrays.toString(password));
                                emp1.setUsername(userName);
                                try {
                                    empDB.addEmployee(emp1);

                                } catch (SQLException ex) {
                                    Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (ConnectionTimeOutException ex) {
                                    JOptionPane.showMessageDialog(null,ex.toString());
                                    return;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Please enter a valid NIC.", "Invalid NIC ", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }

                        else{
                            JOptionPane.showMessageDialog(null, "Sorry! Your password and confirm password fields doesn't match.", "Password mismatch ", JOptionPane.INFORMATION_MESSAGE);
                        }
                }
                    else{
                        JOptionPane.showMessageDialog(null, "Sorry! This username already exists. Please choose another.", "Invalid username ", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sorry! This NIC already exists. Please check again.", "NIC mismatch ", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ConnectionTimeOutException ex) {
                System.out.println("timeout!!!!");
            }

            }
        else{
        JOptionPane.showMessageDialog(null, "Please fill all the required fields.", "Enter required data ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
       
        if(searchID!=0 ){
            try {
                empDB = DBOperations.getInstace();
                emp = empDB.getEmplyee(searchID);
                if(emp==null){
                    JOptionPane.showMessageDialog(null, "Invalid employee ID", "Error! ", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog (null, "Are you sure you want to remove this employee?","Remove Employee",dialogButton);
                if(dialogResult == JOptionPane.YES_OPTION){
                    try {
                        empDB.deleteEmployee(searchID);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ConnectionTimeOutException ex) {
                        JOptionPane.showMessageDialog(null,ex.toString());
                        return;
                    }
                }   }
            }catch (SQLException ex) {
                Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ConnectionTimeOutException ex) {
                Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
            
        
        else{        
        JOptionPane.showMessageDialog(null, "Please enter an EID. You can check the employee list to find an ID", "Enter an ID ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_removeBtnActionPerformed

    private void eidTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eidTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_eidTextKeyTyped

    private void nameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nameTextKeyTyped

    private void nicTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicTextKeyTyped
        
        char c = evt.getKeyChar();
        String nic = nicText.getText();
        if(nic.length()==10){
            evt.consume();
        }
        if(nic.length()==9){
            if(((c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE)||(c==KeyEvent.VK_V))||(c==KeyEvent.VK_X)){
        } else {
            evt.consume();
        }
        }
        else if((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nicTextKeyTyped

    private void eListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eListBtnActionPerformed
        
        EmployeeList elist = new EmployeeList();
        empDB = DBOperations.getInstace();
        try {           
            elist.empList = empDB.loadEmplyee();
             
        } catch (SQLException ex) {
            Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConnectionTimeOutException ex) {
             JOptionPane.showMessageDialog(null,ex.toString());
            return;
        }
        for(Employee em : elist.empList){
            elist.addRow(em.getEID(), em.getName(),em.getPosition(), em.getNIC());
        }
        elist.setVisible(true);
                
    }//GEN-LAST:event_eListBtnActionPerformed

    private void getEmpListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmpListBtnActionPerformed
        
          EmployeeList elist = new EmployeeList();
          empDB = DBOperations.getInstace();
        try {
            elist.empList = empDB.loadEmplyee();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ConnectionTimeOutException ex) {
             JOptionPane.showMessageDialog(null,ex.toString());
            return;
        }
        for(Employee em : elist.empList){
            elist.addRow(em.getEID(), em.getName(),em.getPosition(), em.getNIC());
        }
        elist.setVisible(true);
    }//GEN-LAST:event_getEmpListBtnActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        // TODO add your handling code here:
        empDB = DBOperations.getInstace();
        if(!"".equals(changeIdText.getText()))
        {
            int eid = Integer.parseInt(changeIdText.getText());
            try {
                emp = empDB.getEmplyee(eid);
            } catch (SQLException ex) {
                Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ConnectionTimeOutException ex) {
                Logger.getLogger(ManagerFace.class.getName()).log(Level.SEVERE, null, ex);
            }
                if(emp==null){
                    JOptionPane.showMessageDialog(null, "Invalid employee ID", "Error! ", JOptionPane.INFORMATION_MESSAGE);
                }
            else{

            ChangeLogInSetting changeEmpLog = new ChangeLogInSetting();
            try {
                changeEmpLog.getPreviousData(eid);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid EID. You can check the employee list to find an ID", "Enter an ID ", JOptionPane.INFORMATION_MESSAGE);
            }
            changeEmpLog.setVisible(true);
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter an EID. You can check the employee list to find an ID", "Enter an ID ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_changeBtnActionPerformed

    private void nicTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nicTextActionPerformed

    private void changeIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeIdTextActionPerformed

    private void changeIdTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changeIdTextKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((Character.isDigit(c)||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_changeIdTextKeyTyped

    
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
            java.util.logging.Logger.getLogger(ManagerFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerFace().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JTextField changeIdText;
    private javax.swing.JPasswordField conPassText;
    private javax.swing.JButton eListBtn;
    private javax.swing.JTextField eidText;
    private javax.swing.JButton getEmpListBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel nicLabel;
    private javax.swing.JTextField nicText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JComboBox posComboBox;
    private javax.swing.JLabel posLabel;
    private javax.swing.JButton removeBtn;
    private javax.swing.JTextField unameText;
    // End of variables declaration//GEN-END:variables
}
