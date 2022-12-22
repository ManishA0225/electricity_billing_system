package electricity.billing.system;
import java.sql.*;

public class Conn {
    //Register the driver
    //Create Connection
    //Create statement
    //Exxcute query
    //close Connection
    Connection c;
    Statement s;
    Conn(){
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql:///ebs", "root", "root");
             s=c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[]args){
        new Conn();
    }
}
