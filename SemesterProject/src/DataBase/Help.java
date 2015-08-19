package DataBase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Help {
    public static Date getDate(int year,int month,int day){
        if(!(isValidDate(String.valueOf(year)+"-"+String.valueOf(month)+"-"+String.valueOf(day))))
            return null;
        Date newDate = new Date(year-1900,month-1,day);
        Date today = new Date(System.currentTimeMillis());
        Date minimumDate = new Date(1900-1900,01-1,01);
        if(!(newDate.compareTo(today)<1&&newDate.compareTo(minimumDate)>-1))            
            return null;        
        return newDate;
    }
    public static int getYear(Date date){
        return date.getYear()+1900;
    }
    public static int getMonth(Date date){
        return date.getMonth()+1;
    }
    public static int getDay(Date date){
        return date.getDate();
    }
    public static void writeIPandPort(String ip,String port){
        String text = ip+"\n"+port;
        BufferedWriter output = null;
        try {
            File file = new File("example.itcope");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);            
        } catch ( IOException e ) {
            //e.printStackTrace();
        } finally {
            if ( output != null ) try {
                output.close();                
            } catch (IOException ex) {
                //Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static String [] readIPandPort(){
        BufferedReader br = null;
        String []ipAndPort = new String[2];
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("example.itcope"));
            int i = 0;
            while ((sCurrentLine = br.readLine()) != null) {                
                ipAndPort[i++] = sCurrentLine;
            }

        } catch (IOException e) {                
        
        }catch(Exception ex){
        } finally {
                try {
                    if (br != null)br.close();
                } catch (IOException ex) {
                    //ex.printStackTrace();
                }
        }
        return ipAndPort;
    }
    
    public static boolean isValidDate(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());           
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
    
}
