package semesterproject;


import DataBase.*;
import gui.login.LoginFace;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemesterProject {

   
    public static void main(String[] args) {
       
            DBOperations ad = DBOperations.getInstace();
            

           
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

            
             //Help.writeIPandPort("123","123");
             //String[] i = Help.readIPandPort();
             //if(i[0]!=null)
                 //System.out.println(i[0]+" "+i[1]);
             //System.out.println("sdasdasd  "+Help.getDate(2010,05,06));*/
        /*try {
            System.out.println(ad.checkLabTecID("4"));
        } catch (ConnectionTimeOutException ex) {
            Logger.getLogger(SemesterProject.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
