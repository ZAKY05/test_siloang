
package siloang.com;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class koneksi {
    private String url = "jdbc:mysql://localhost/apk_siloang";
    private String username = "root";
    private String password = "";
    private Connection con;
    
    public void connect(){
        try {
            con = DriverManager.getConnection(url, username,password);
            System.out.println("konek berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Connection getCon(){
        return con;
    }
}
