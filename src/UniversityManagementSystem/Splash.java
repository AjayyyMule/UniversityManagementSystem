package UniversityManagementSystem;



import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Splash extends JFrame implements Runnable {

    Thread t;
    Splash(){

        try {
            ImageIcon firstImage  = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
            Image i2 = firstImage.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            add(image);
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }

        t = new Thread(this);
        t.start();

        setVisible(true);

        int x = 1;
        for (int i = 2; i <= 600; i+=4, x+=1) {
            setLocation(600 - ((i + x)/2), 350 - (i/2));
            setSize(i + 3*x, i + x/2);

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }


    public void run() {
        try {
            Thread.sleep(5000);
            setVisible(false);

//             Next Frame
            new Login();
        } catch (Exception e) {

        }
    }



    public  static void main(String[] args){
        new Splash();
    }
}
