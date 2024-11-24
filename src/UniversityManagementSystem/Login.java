package UniversityManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {


    JButton loginButton, cancelButton;
    JTextField inputUserName;
    JPasswordField inputPassword;



    Login(){

        getContentPane().setBackground(Color.WHITE);  // Set color of the login page
        setLayout(null);

        JLabel userName = new JLabel("Username");
        userName.setBounds(40, 40, 100, 20);
        add(userName);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 70, 100, 20);
        add(password);


        inputUserName = new JTextField();
        inputUserName.setBounds(150, 40, 170, 20 );
        add(inputUserName);


        inputPassword = new JPasswordField();
        inputPassword.setBounds(150, 70, 170, 20 );
        add(inputPassword);




//      Creating Login Button and Cancel Button
        loginButton  = new JButton("Login");
        loginButton.setBounds(40, 120, 120, 30);
        add(loginButton);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);

        loginButton.addActionListener(this);


        cancelButton  = new JButton("Cancel");
        cancelButton.setBounds(200, 120, 120, 30);
        add(cancelButton);
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);

        cancelButton.addActionListener(this);


        try {
            ImageIcon firstImage  = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
            Image i2 = firstImage.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            image.setBounds(350, 0, 200, 200);
            add(image);
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }





        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == loginButton ){

            String username = inputUserName.getText();
            String password = inputPassword.getText();

            String query = "SELECT * FROM login WHERE username = '"+ username + "' AND password = '"+ password +"' ;";


            try{

                Conn c = new Conn();
                c.statement.executeQuery(query);

                ResultSet rs = c.statement.executeQuery(query);

                if (rs.next()){
                    setVisible(false);
                    new Project();
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    setVisible(false);
                }

            }catch (Exception e){
                System.out.println("Some Error in executing query");
            }

        }else if(ae.getSource() == cancelButton){
            setVisible(false);

        }


}



    public static void main(String[] args){

        new Login();


        }
    }




















