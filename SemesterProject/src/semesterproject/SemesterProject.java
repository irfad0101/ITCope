package semesterproject;


import DataBase.*;
import gui.login.LoginFace;


public class SemesterProject {

   
    public static void main(String[] args) {
                 
            try {
                 for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                     if ("Nimbus".equals(info.getName())) {
                         javax.swing.UIManager.setLookAndFeel(info.getClassName());
                         break;
                     }
                 }
             } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

             }
             LoginFace login = new LoginFace();
             login.setVisible(true);            
            
    }
}
