package semesterproject;


import DataBase.*;
import gui.login.LoginFace;


public class SemesterProject {

   
    public static void main(String[] args) {
       
            DBOperations ad = DBOperations.getInstace();
            /*LabReport lr = new LabReport();
            lr.setPID(1);
            lr.setDate(new Date(1992,02,03));
            lr.setDate(Help.getDate(2015, 1, 5));
            lr.setLabReportNo(1);
            lr.setTestType(2);
            lr.setLabTechID(1);
            
            
            for(int i=0;i<16;i++){
                lr.addDataToTheList(""+i);
            }
            new ShowLabReportGUI (lr).setVisible(true);*/
                  
            /*LabReportGUI l=new LabReportGUI();
             l.setVisible(true);*/
                 
             // Check for add patient
             /*Patient patient = new Patient();
             //patient.setPID(0);
             patient.setFirstName("Gayan");
             patient.setFullName("Gayan Perera");
             patient.setLastName("Perera");
             patient.setDateOfBirth(new Date(1992,02,03));
             patient.setGender("M");
             patient.setAddress("ABC");
             patient.setNIC("123456589V");
             //patient.setPatientContactNo(0412222222);
             patient.setNameOfTheGuardian("Akila");
             patient.setGuardianContactNo(0412222222);
             patient.setBloodGroup("B+");
             patient.setAllergies("None");        
             try {
                 ad.addPatient(patient);
             } catch (SQLException ex) {
                 System.out.println(ex);
             }*/
                 //Check for add medical report
                 /*
                 MedicalReport mr = new MedicalReport();
                 mr.setPID(1);
                 mr.setDate(new Date(2001,02,03));
                 mr.setDoctorID(0);
                 mr.setMedicalReportNum(0);
                 mr.setTestTypes("A,B");
                 mr.setTreatmentDescription("ABC");
                 ad.addMedicalReport(mr);*/
               
                //Check for LabReport
            /*     
                 System.out.println(p.getEID());
                 System.out.println(p.getPosition());
                 System.out.println(p.getName());            
                 System.out.println(p.getNIC());
                 System.out.println(p.getUsername());
                 System.out.println(p.getPassword());              
             }
             
             
             /*ArrayList<Date> dateList = ad.getMedicalDates(1);
             System.out.println(dateList.get(0));*/
             /*
             ArrayList<LabReport> labDataList = ad.getLabReports(1,new Date(1992,02,03));
             System.out.println(labDataList.get(0).getPID());
             for(String s:labDataList.get(0).getDataList()){
                 System.out.println(s);
             }
             */
             /*Employee em = ad.getEmplyee(1);
             System.out.println(em.getName());*/
             
             //System.out.println(ad.getLastPID());
             
             /*
             ArrayList<Patient> plist = ad.searchPatients("Saman","");
             System.out.println(plist.size());
             for(Patient p:plist){
                 System.out.println(p.getFullName());
             }
              */
             //ad.deleteEmployee(3);
             /*
             ManagerFace mf = new ManagerFace();
             mf.setVisible(true);*/
             /*
             Employee n = ad.checkEmplyee("S","P");
             System.out.println(n.getPosition());*/
             
             /*ArrayList<Patient>  list = ad.searchPatients("12");
             System.out.println(list.get(0).getFullName());*/
             
             /*Patient pa = ad.getPatient(1);
             pa.setDateOfBirth(Help.getDate(1992,10,5));
             ad.updatePatient(pa);*/
             
             /*MedicalReport r = ad.getMedicalReport(3);
             r.setDate(Help.getDate(1992,10,5));
             ad.updateMedicalReport(r);*/
             
            /* LabReport l = ad.getLastLabReport();
             System.out.println(l.getLabTechID());
             l.setLabTechID(2);
             ad.updateLabReport(l);*/
             /*
             LoginFace face = new LoginFace();
             face.setVisible(true);*/
             /*ChangeLogInSetting c = new ChangeLogInSetting();
             c.setVisible(true);*/
         /*try {    
             System.out.println(ad.getDoctorAvailability(3));
         } catch (SQLException ex) {
             Logger.getLogger(SemesterProject.class.getName()).log(Level.SEVERE, null, ex);
         }*/
            
          
       /*try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (Exception e) {            
        */
       /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

        }
        LoginFace login = new LoginFace();
        login.setVisible(true);*/

       /* try {
             //ad.setRoomAvailability(2,false);
            ArrayList<Room> rooms = ad.getAddmitedRooms();
            for(Room r:rooms){
                System.out.println(r.getRoomNo());
            }
        } catch (SQLException ex) {
            Logger.getLogger(SemesterProject.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        //Help.writeIPandPort("123","123");
        //String[] i = Help.readIPandPort();
        //if(i[0]!=null)
            //System.out.println(i[0]+" "+i[1]);
        System.out.println("sdasdasd  "+Help.getDate(2010,05,06));
    }
}
