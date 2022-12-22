package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class NewCustomer extends JFrame implements ActionListener{
    JTextField ftname, ftaddress, ftcity, ftstate, ftemail, ftphone;
    JLabel lblmeter;
    JButton next, cancel;
    
    NewCustomer(){
        
        setSize(700,500);
        setLocation(400,200);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(255, 239, 213));
        add(p);
        
        JLabel heading = new JLabel("New Customer");
        heading.setBounds(180, 10, 200, 25);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        p.add(heading);
        
        JLabel lblname = new JLabel("Customer Name");
        lblname.setBounds(100, 80, 100, 20);
        p.add(lblname);
        
        
        ftname = new JTextField();
        ftname.setBounds(240, 80, 200, 20);
        p.add(ftname);
        
        JLabel lblmeterno = new JLabel("Meter Number");
        lblmeterno.setBounds(100, 120, 100, 20);
        p.add(lblmeterno);
        
        lblmeter = new JLabel("");
        lblmeter.setBounds(240, 120, 200, 20);
        p.add(lblmeter);
        
        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        lblmeter.setText(""+Math.abs(number));
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(100, 160, 100, 20);
        p.add(lbladdress);
        
        ftaddress = new JTextField();
        ftaddress.setBounds(240, 160, 200, 20);
        p.add(ftaddress);
        
        
        JLabel lblcity = new JLabel("City");
        lblcity.setBounds(100, 200, 100, 20);
        p.add(lblcity);
        
        ftcity = new JTextField();
        ftcity.setBounds(240, 200, 200, 20);
        p.add(ftcity);
    
        
        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(100, 240, 100, 20);
        p.add(lblstate);
        
        ftstate = new JTextField();
        ftstate.setBounds(240, 240, 200, 20);
        p.add(ftstate);
        
    
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(100, 280, 100, 20);
        p.add(lblemail);
        
        ftemail = new JTextField();
        ftemail.setBounds(240, 280, 200, 20);
        p.add(ftemail);
        
        
        JLabel lblphone = new JLabel("Phone Number");
        lblphone.setBounds(100, 320, 100, 20);
        p.add(lblphone);
        
        ftphone = new JTextField();
        ftphone.setBounds(240, 320, 200, 20);
        p.add(ftphone);
        
        next = new JButton("Next");
        next.setBounds(120, 390, 100, 25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        p.add(next);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(250, 390, 100, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        p.add(cancel);
        
        setLayout(new BorderLayout());
        
        add(p, "Center");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
        String name=ftname.getText();
        String meter = lblmeter.getText();
        String address = ftaddress.getText();
        String city = ftcity.getText();
        String state = ftstate.getText();
        String email = ftemail.getText();
        String phone = ftphone.getText();
        
        String query1 = "insert into customer values('"+name+"', '"+meter+"', '"+address+"', '"+city+"', '"+state+"', '"+email+"', '"+phone+"')";
        String query2 = "insert into login values('"+meter+"', '' , '"+name+"', '', '')";
        
        try{
            Conn c = new Conn();
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            
            JOptionPane.showMessageDialog(null, "Customer Details Added Sucessfully");
            setVisible(false);
            
            //new meter
            new MeterInfo(meter);
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[]args){
        new NewCustomer();
    }
}
