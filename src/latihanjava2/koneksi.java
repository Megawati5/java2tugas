/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjava2;

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class koneksi {

    public Connection bukakoneksi(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/dbjava2","root","");
            System.out.println("Berhasil");
            return con;
        }
        catch (Exception e){
            System.out.println("gagal");
            return null;
        }
    }
    public static void main (String args[]){
        new koneksi().bukakoneksi();
    }
}
