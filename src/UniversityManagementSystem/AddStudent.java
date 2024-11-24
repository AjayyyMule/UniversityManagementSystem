package UniversityManagementSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;

public class AddStudent extends JFrame implements ActionListener {


    JTextField studentNameField, studentFatherNameField, studentAddressField, studentPhoneNumberField, studentEmailIDField, studentXPercentageField, studentXIIPercentageField, studentAadharNumberField ;
    JLabel studentRollNumber;

    JDateChooser dcDOB;

    JComboBox cbCourse, cbBranch;

    JButton submitButton, cancelButton;

    Random random = new Random();
    long firstFour = Math.abs((random.nextLong() % 9000L) + 1000L);

    AddStudent(){

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);


//        Student Details

        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        add(heading);
        heading.setFont(new Font("serif", Font.BOLD, 30));

        // Student Name label
        JLabel studentName = new JLabel("Student Name ");
        studentName.setBounds(50, 150, 200, 30);
        studentName.setFont(new Font("serif", Font.BOLD, 20));
        add(studentName);

        // Field for user to write Student Name
        studentNameField = new JTextField();
        studentNameField.setBounds(200, 155, 170, 25);
        add(studentNameField);



//        Father's Details

        // Student's father Name label
        JLabel studentFatherName = new JLabel("Father's Name ");
        studentFatherName.setBounds(400, 150, 200, 30);
        studentFatherName.setFont(new Font("serif", Font.BOLD, 20));
        add(studentFatherName);

        // Field for user to write Student's Father Name
        studentFatherNameField = new JTextField();
        studentFatherNameField.setBounds(600, 155, 170, 25);
        add(studentFatherNameField);



//        Roll Number


        JLabel studentRollNO = new JLabel("Roll Number");
        studentRollNO.setBounds(50, 200, 200, 30);
        studentRollNO.setFont(new Font("serif", Font.BOLD, 20));
        add(studentRollNO);

        studentRollNumber = new JLabel("1533"+ firstFour);
        studentRollNumber.setBounds(200, 200, 200, 30);
        studentRollNumber.setFont(new Font("serif", Font.BOLD, 20));
        add(studentRollNumber);


        // Date of Birth
        JLabel studentDateOfBirth = new JLabel("Date of Birth");
        studentDateOfBirth.setBounds(400, 200, 200, 30);
        studentDateOfBirth.setFont(new Font("serif", Font.BOLD, 20));
        add(studentDateOfBirth);

        dcDOB = new JDateChooser();
        dcDOB.setBounds(600, 200,150, 30);
        add(dcDOB);


        //Address

        JLabel studentAddress = new JLabel("Address");
        studentAddress.setBounds(50, 250, 200, 30);
        studentAddress.setFont(new Font("serif", Font.BOLD, 20));
        add(studentAddress);

        // Field for user to write Student Name
        studentAddressField = new JTextField();
        studentAddressField.setBounds(200, 255, 170, 25);
        add(studentAddressField);


//      Phone Number
        JLabel studentPhoneNumber = new JLabel("Phone Number");
        studentPhoneNumber.setBounds(400, 250, 200, 30);
        studentPhoneNumber.setFont(new Font("serif", Font.BOLD, 20));
        add(studentPhoneNumber);

        // Field for user to write Student's Phone Number
        studentPhoneNumberField = new JTextField();
        studentPhoneNumberField.setBounds(600, 255, 170, 25);
        add(studentPhoneNumberField);

//      Student's emailId
        JLabel studentEmailID = new JLabel("Email-Id");
        studentEmailID.setBounds(50, 300, 200, 30);
        studentEmailID.setFont(new Font("serif", Font.BOLD, 20));
        add(studentEmailID);

        // Field to write student's emailId
        studentEmailIDField = new JTextField();
        studentEmailIDField.setBounds(200, 305, 170, 25);
        add(studentEmailIDField);


//       Class 10th percentage
        JLabel studentXPercentage = new JLabel("10th Percentage ");
        studentXPercentage.setBounds(400, 300, 200, 30);
        studentXPercentage.setFont(new Font("serif", Font.BOLD, 20));
        add(studentXPercentage);

        // Field for user to write Student's 10th Percentage
        studentXPercentageField = new JTextField();
        studentXPercentageField.setBounds(600, 305, 170, 25);
        add(studentXPercentageField);



        //        12th Percentage
        JLabel studentXIIPercentage = new JLabel("12th Percentage");
        studentXIIPercentage.setBounds(400, 350, 200, 30);
        studentXIIPercentage.setFont(new Font("serif", Font.BOLD, 20));
        add(studentXIIPercentage);

        // Field to write student's 12th percentage
        studentXIIPercentageField = new JTextField();
        studentXIIPercentageField.setBounds(600, 355, 170, 25);
        add(studentXIIPercentageField);



//        Student's Aadhar number
        JLabel studentAadharNumber = new JLabel("Aadhar Number");
        studentAadharNumber.setBounds(50, 350, 200, 30);
        studentAadharNumber.setFont(new Font("serif", Font.BOLD, 20));
        add(studentAadharNumber);

        // Field to write student's Aadhar number
        studentAadharNumberField = new JTextField();
        studentAadharNumberField.setBounds(200, 355, 170, 25);
        add(studentAadharNumberField);





//      Course Name

        JLabel studentCourseName = new JLabel("Course Name");
        studentCourseName.setBounds(50, 400, 200, 30);
        studentCourseName.setFont(new Font("serif", Font.BOLD, 20));
        add(studentCourseName);

//        Dropdown to choose course name

        String course[] = {"B-Tech", "B-Pharm", "B-Com", "BCS", "BCA", "MCA", "BA", "BBA", "MBA","BSC"};
        cbCourse = new JComboBox(course);
        cbCourse.setBounds(200,400,150,30);
        add(cbCourse);
        cbCourse.setBackground(Color.WHITE);
//        cbCourse.setForeground(Color.WHITE);





//        Course Branch

        JLabel studentCourseBranch = new JLabel("Course Branch");
        studentCourseBranch.setBounds(400, 400, 200, 30);
        studentCourseBranch.setFont(new Font("serif", Font.BOLD, 20));
        add(studentCourseBranch);

//        Dropdown to choose course name

        String branch[] = {"Information-Technology", "Computer Science", "Mechanical", "Civil", "Electrical", "E&TC", "AIDS", "Chemical"};
        cbBranch = new JComboBox(branch);
        cbBranch.setBounds(600, 405, 170, 25);
        add(cbBranch);
        cbBranch.setBackground(Color.WHITE);



        submitButton  = new JButton("Submit");
        submitButton.setBounds(200,550,200,30);
        add(submitButton);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);
        submitButton.addActionListener(this);

        cancelButton  = new JButton("Cancel");
        cancelButton.setBounds(450, 550, 200, 30);
        add(cancelButton);
        cancelButton.setBackground(Color.BLACK);
        cancelButton.setForeground(Color.WHITE);
        cancelButton.addActionListener(this);




        setVisible(true);



    }


    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == submitButton){
            String name = studentNameField.getText();
            String fName = studentFatherNameField.getText();
            String rollNO = studentRollNumber.getText();
            String dob = ((JTextField)dcDOB.getDateEditor().getUiComponent()).getText();
            String address = studentAddressField.getText();
            String phone = studentPhoneNumberField.getText();
            String email = studentEmailIDField.getText();
            String x = studentXPercentageField.getText();
            String xii = studentXIIPercentageField.getText();
            String aadhar = studentAadharNumberField.getText();
            String course = cbCourse.getSelectedItem().toString();
            String branch = cbBranch.getSelectedItem().toString();


            try{
                String query = "INSERT INTO student  VALUES('"+ name +"', '"+fName+"', '"+rollNO+"' , '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"');";

                Conn con = new Conn();
                con.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully ");
                setVisible(false);
            }catch (Exception e){
                System.out.println("SQL Exception occured");
                e.printStackTrace();

            }




        }else {
            setVisible(false);
        }

    }



    public static void main(String[] args) {

        new AddStudent();


    }
}
