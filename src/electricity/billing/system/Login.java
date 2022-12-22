package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, cancel,signup;  //declaring buttons globally
    JTextField username;
    JPasswordField password;
    Choice logginin;
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(300, 20, 100, 20); //x-coordinate, y-coordinate(top), Label(width AND height)
        add(lblusername);
        
        username = new JTextField();
        username.setBounds(400, 20, 150, 20);
        add(username);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(300, 60, 150, 20); // x-coordinate, y-coordinate(top), Label(width AND height)
        add(lblpassword);
        
        password = new JPasswordField();
        password.setBounds(400, 60, 150, 20);
        add(password);
       
        
        JLabel loggininnas = new JLabel("Loggin in as");
        loggininnas.setBounds(300, 100, 100, 20); // x-coordinate, y-coordinate(top), Label(width AND height)
        add(loggininnas);
        
        logginin = new Choice(); //Jcombobox--AWT, Choice--Swing
        logginin.add("Admin");
        logginin.add("Customer");
        logginin.setBounds(400, 100, 150, 20);
        add(logginin);
 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT); //calling Image class for scaling the image 
        login = new JButton("Login",new ImageIcon(i2)); 
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.jpg"));
        Image i4 = i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT); 
        cancel = new JButton("Cancle",new ImageIcon(i4));
        cancel.setBounds(450, 160, 100, 20);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT); 
        signup = new JButton("Signup",new ImageIcon(i6)); // for passing i6 we have to make ImageIcon object
        signup.setBounds(380, 200, 100, 20);
        signup.addActionListener(this);
        add(signup);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT); 
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(0, 0, 250, 250);
        add(image);
        
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
        //catching the on click of the both the buttons
    public void actionPerformed(ActionEvent ae){
        //getting all values the given by user
        if(ae.getSource() == login){
            String susername = username.getText();
            String spassword = password.getText();
            String user = logginin.getSelectedItem();
            
            try{
                Conn c = new Conn();
                String query= "select * from login where username= '"+susername+"'and password= '"+spassword+"' and user='"+user+"'"; //DDL
                
                ResultSet rs= c.s.executeQuery(query); //return object of rs
               
                if(rs.next()){
                    String meter = rs.getString("meter_no");
                   setVisible(false);
                   new Home(user, meter);
                       
                   }else{
                   JOptionPane.showMessageDialog(null, "Invalid login");
                   //After click on ok textfield will be empty on login frame
                   username.setText("");
                   password.setText("");
                   
               }
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
        } else if(ae.getSource() == cancel) {
            setVisible(false);
        }else if(ae.getSource() == signup){
            setVisible(false);
            
            new Signup(); //creating connection between one class to another class for that we have to call another class object
        }
    }
     public static void main(String[] args) {
        new Login();
    }
    
}
