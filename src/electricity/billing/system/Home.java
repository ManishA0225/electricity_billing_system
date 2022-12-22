package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Home extends JFrame implements  ActionListener{
    
    String atype, meter;
    Home(String atype, String meter){
        this.atype = atype;
        this.meter = meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH); //Full screen frame
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/elec1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1920, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
   
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        JMenu dashboard = new JMenu("Dashboard");
        dashboard.setForeground(Color.BLUE);
        
        
        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        dashboard.add(newcustomer);
        
        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerdetails.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(image2));
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        dashboard.add(customerdetails);
        
        
        JMenuItem depositedetails = new JMenuItem("Deposite Details");
        depositedetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        depositedetails.setBackground(Color.WHITE);
        ImageIcon icon3= new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositedetails.setIcon(new ImageIcon(image3));
        depositedetails.setMnemonic('N');
        depositedetails.addActionListener(this);
        depositedetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        dashboard.add(depositedetails);
        
        JMenuItem calculatebill = new JMenuItem("Calcualte Bill");
        calculatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        dashboard.add(calculatebill);
   
        
        JMenu info = new JMenu("Information");
        info.setForeground(Color.MAGENTA);
        
        
        JMenuItem updateinfo = new JMenuItem("Update Information");
        updateinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
        updateinfo.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateinfo.setIcon(new ImageIcon(image5));
        updateinfo.setMnemonic('P'); //adding shortcut key
        updateinfo.addActionListener(this);
        updateinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        info.add(updateinfo);
        
        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("monospaced", Font.PLAIN, 12));
        viewinfo.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(image6));
        viewinfo.setMnemonic('L');
        viewinfo.addActionListener(this);
        viewinfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        info.add(viewinfo);
        
       
        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        
        
        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced", Font.PLAIN, 12));
        paybill.setBackground(Color.WHITE);
        ImageIcon icon7= new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image7 =icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('R');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        billdetails.setBackground(Color.WHITE);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('B');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        
        JMenu report = new JMenu("Report");
        report.setForeground(Color.MAGENTA);
       
        
        JMenuItem generatebill = new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        generatebill.setBackground(Color.WHITE);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        generatebill.setIcon(new ImageIcon(image9));
        generatebill.setMnemonic('G');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
       
        
        JMenuItem notepade = new JMenuItem("Notepade");
        notepade.setFont(new Font("monospaced", Font.PLAIN, 12));
        notepade.setBackground(Color.WHITE);
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepade.setIcon(new ImageIcon(image10));
        notepade.setMnemonic('N');
        notepade.addActionListener(this);
        notepade.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        utility.add(notepade);
        
        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculator.setBackground(Color.WHITE);
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('C');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        utility.add(calculator);
        
        
        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.MAGENTA);
       
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(new Font("monospaced", Font.PLAIN, 12));
        exit.setBackground(Color.WHITE);
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image12 = icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        if (atype.equals("Admin")) {
           mb.add(dashboard);
        } else{
           mb.add(info);
           mb.add(user);
           mb.add(report);
        }
        
           mb.add(utility);
           mb.add(mexit);
        
        setLayout(new FlowLayout());  //Layout for setting menubar
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        //from this command we know that which text is called 
        String msg = ae.getActionCommand();
        if(msg.equals("New Customer")){
            new NewCustomer();
        } else if(msg.equals("Customer Details")) {
            new CustomerDetails();
        } else if(msg.equals("Deposite Details")) {
             new DepositDetails();
        } else if(msg.equals("Calcualte Bill")) {
             new CalculateBill();
      } else if(msg.equals("View Information")){
          new ViewInformation(meter);
      } else if(msg.equals("Update Information")){
          new UpdateInformation(meter);
      } else if(msg.equals("Pay Bill")){
          new PayBill(meter);
      } else if(msg.equals("Generate Bill")){
          new GenerateBill(meter);
      } else if(msg.equals("Bill Details")){
          new BillDetails(meter);
      } else if (msg.equals("Notepade")){
          try{
              Runtime.getRuntime().exec("notepad.exe");
          }catch(Exception e){
              e.printStackTrace();    
          }
      }  else if (msg.equals("Calculator")){
          try{
              Runtime.getRuntime().exec("calc.exe");
          }catch(Exception e){
              e.printStackTrace();    
          }
      } else if (msg.equals("Exit")){
          setVisible(false);
          new Login();
      }
   }

    public static void main(String[]args){
        new Home("", "");
    }   
    
}
