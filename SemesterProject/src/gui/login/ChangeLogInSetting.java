/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.login;

import DataBase.ConnectionTimeOutException;
import DataBase.DBOperations;
import Domain.Employee;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Asus
 */
public class ChangeLogInSetting extends javax.swing.JFrame {

    
    private DBOperations dataBase;
    private int empId;
    private Employee changeEmp ;
    private JFrame loginFace;
    
    /**
     * Creates new form LoginFace
     */
    
    public ChangeLogInSetting() {
        initComponents();        
        this.loginFace = null;
    }
    public ChangeLogInSetting(JFrame loginFace) {
        initComponents();        
        this.loginFace = loginFace;
    }
    
    public void getPreviousData(int eid) throws SQLException{   
        dataBase = DBOperations.getInstace();
        empId = eid;
        try {
            changeEmp = dataBase.getEmplyee(eid);
        } catch (SQLException ex) {
            
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.txtUserName.setText(changeEmp.getUsername());    
    }
    private boolean checkUserName(String userName){
        dataBase = DBOperations.getInstace();
        try {
            return dataBase.checkUserName(userName);
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);                       
        }
        return false;
    }
    private boolean checkPassword(String pass){
        dataBase = DBOperations.getInstace();
        try {
            return dataBase.checkPassword(pass);
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pswdPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pswdNewPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pswdConfirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtNewUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnChange = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Change Settings"));

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        jLabel3.setText("New Password");

        jLabel5.setText("Confirm Password");

        jLabel6.setText("New User Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswdNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNewUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20))
        );

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/login/Secound5.png"))); // NOI18N

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/page_edit.png"))); // NOI18N
        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButActionPerformed(evt);
            }
        });

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/manager/remove.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(exitBtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButActionPerformed
        // TODO add your handling code here:
        dataBase = DBOperations.getInstace();
        
        Employee employee = null;
        
        try {
            
            employee = dataBase.checkEmplyee(txtUserName.getText(),String.valueOf(pswdPassword.getPassword()));
           
        } catch (ConnectionTimeOutException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(employee!=null){
            String uName = txtNewUserName.getText();
            String pass = new String(pswdNewPassword.getPassword()); 
            if(checkUserName(uName)){
                JOptionPane.showMessageDialog(null,"The UserName already exist");
                txtNewUserName.setText("");
            }else if(Arrays.equals(pswdNewPassword.getPassword(), pswdConfirmPassword.getPassword())){
                if(!uName.equals(""))                    
                    employee.setUsername(uName);
                if(!pass.equals(""))
                    employee.setPassword(pass);
                try {
                    dataBase.updateEmployeeUserNamePassWord(employee);
                    JOptionPane.showMessageDialog(null,"The UserName and the Password are succesfully changed");
                    txtUserName.setText("");
                    txtNewUserName.setText("");
                    pswdPassword.setText("");
                    pswdNewPassword.setText("");
                    pswdConfirmPassword.setText("");
                } catch (SQLException ex) {
                    
                } catch (ConnectionTimeOutException ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);                  
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error! Password field and Confirm password field do not match.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Invalid username or password");
        }
    }//GEN-LAST:event_changeButActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(loginFace!=null)
            loginFace.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        if(loginFace!=null)
            loginFace.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeLogInSetting().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pswdConfirmPassword;
    private javax.swing.JPasswordField pswdNewPassword;
    private javax.swing.JPasswordField pswdPassword;
    private javax.swing.JTextField txtNewUserName;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}