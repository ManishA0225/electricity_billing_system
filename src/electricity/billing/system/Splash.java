
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements  Runnable{
    Thread t;
    
    //constructor of the class
    Splash(){  
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg")); 
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT); //calling Image class for scaling the image 
        ImageIcon i3 = new ImageIcon(i2); // for passing image object we use imageicon class 
        JLabel image = new JLabel(i3);
        add(image);
        
        
        setVisible(true);
        int x=1; //
        for (int i=2; i<510;i+=4, x+=1) {
        setSize(i + x, i++);//setting length and width of the frame
        setLocation(870-((i + x)/2),400-(i/2));
        try{
            Thread.sleep(5); //The arguments 10 are in milliseconds
        }catch(Exception e) {
            e.printStackTrace();
        }
        }
        
          t=new Thread(this);
          t.start();
        
         setVisible(true);
    }
    
    public void run() { //method overriding
        try{
            Thread.sleep(7000);
            setVisible(false);
            
            //login frame
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        new Splash(); //class object(we can not make object of abstract class)
    }

   
    
}
