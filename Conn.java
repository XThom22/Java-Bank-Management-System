import java.sql. *;
public class Conn {
    Connection c;
    Statement s;
    public Conn () {
        try {
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", ""YOUR_PASSWORD_HERE"");
            s = c.createStatement();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
