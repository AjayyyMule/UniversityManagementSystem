package UniversityManagementSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDateChooserBeanInfo;

public class AddTeacher extends JFrame implements ActionListener {


    JTextField empNameField, empFatherNameField, empAddressField, empPhoneNumberField, empEmailIDField, empXPercentageField, empXIIPercentageField, empAadharNumberField ;
    JLabel empIdfield, empDateOfBirth;

    JDateChooser dcDOB;

    JComboBox cbQualification, cbDepartment;

    JButton submitButton, cancelButton;

    Random random = new Random();
    long firstFour = Math.abs((random.nextLong() % 9000L) + 1000L);

    AddTeacher(){

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);


//        Student Details

        JLabel heading = new JLabel("New Employee Details");
        heading.setBounds(310, 30, 500, 50);
        add(heading);
        heading.setFont(new Font("serif", Font.BOLD, 30));

        // Student Name label
        JLabel empName = new JLabel("Employee Name ");
        empName.setBounds(50, 150, 200, 30);
        empName.setFont(new Font("serif", Font.BOLD, 20));
        add(empName);

        // Field for user to write Student Name
        empNameField = new JTextField();
        empNameField.setBounds(200, 155, 170, 25);
        add(empNameField);



//        Father's Details

        // Student's father Name label
        JLabel empFatherName = new JLabel("Father's Name ");
        empFatherName.setBounds(400, 150, 200, 30);
        empFatherName.setFont(new Font("serif", Font.BOLD, 20));
        add(empFatherName);

        // Field for user to write Student's Father Name
        empFatherNameField = new JTextField();
        empFatherNameField.setBounds(600, 155, 170, 25);
        add(empFatherNameField);



//        Roll Number


        JLabel empId = new JLabel("Employee Id");
        empId.setBounds(50, 200, 200, 30);
        empId.setFont(new Font("serif", Font.BOLD, 20));
        add(empId);

        empIdfield = new JLabel("1533"+ firstFour);
        empIdfield.setBounds(200, 200, 200, 30);
        empIdfield.setFont(new Font("serif", Font.BOLD, 20));
        add(empIdfield);


        // Date of Birth
        empDateOfBirth = new JLabel("Date of Birth");
        empDateOfBirth.setBounds(400, 200, 200, 30);
        empDateOfBirth.setFont(new Font("serif", Font.BOLD, 20));
        add(empDateOfBirth);

        dcDOB = new JDateChooser();
        dcDOB.setBounds(600, 200,150, 30);
        add(dcDOB);


        //Address

        JLabel empAddress = new JLabel("Address");
        empAddress.setBounds(50, 250, 200, 30);
        empAddress.setFont(new Font("serif", Font.BOLD, 20));
        add(empAddress);

        // Field for user to write Student Name
        empAddressField = new JTextField();
        empAddressField.setBounds(200, 255, 170, 25);
        add(empAddressField);


//      Phone Number
        JLabel empPhoneNumber = new JLabel("Phone Number");
        empPhoneNumber.setBounds(400, 250, 200, 30);
        empPhoneNumber.setFont(new Font("serif", Font.BOLD, 20));
        add(empPhoneNumber);

        // Field for user to write Student's Phone Number
        empPhoneNumberField = new JTextField();
        empPhoneNumberField.setBounds(600, 255, 170, 25);
        add(empPhoneNumberField);

//      Student's emailId
        JLabel empEmailID = new JLabel("Email-Id");
        empEmailID.setBounds(50, 300, 200, 30);
        empEmailID.setFont(new Font("serif", Font.BOLD, 20));
        add(empEmailID);

        // Field to write student's emailId
        empEmailIDField = new JTextField();
        empEmailIDField.setBounds(200, 305, 170, 25);
        add(empEmailIDField);


//       Class 10th percentage
        JLabel empXPercentage = new JLabel("10th Percentage");
        empXPercentage.setBounds(400, 300, 200, 30);
        empXPercentage.setFont(new Font("serif", Font.BOLD, 20));
        add(empXPercentage);

        // Field for user to write Student's 10th Percentage
        empXPercentageField = new JTextField();
        empXPercentageField.setBounds(600, 305, 170, 25);
        add(empXPercentageField);



        // 12th Percentage
        JLabel studentXIIPercentage = new JLabel("12th Percentage");
        studentXIIPercentage.setBounds(400, 350, 200, 30);
        studentXIIPercentage.setFont(new Font("serif", Font.BOLD, 20));
        add(studentXIIPercentage);

        // Field to write student's 12th percentage
        empXIIPercentageField = new JTextField();
        empXIIPercentageField.setBounds(600, 355, 170, 25);
        add(empXIIPercentageField);



//        Student's Aadhar number
        JLabel empAadharNumber = new JLabel("Aadhar Number");
        empAadharNumber.setBounds(50, 350, 200, 30);
        empAadharNumber.setFont(new Font("serif", Font.BOLD, 20));
        add(empAadharNumber);

        // Field to write student's Aadhar number
        empAadharNumberField = new JTextField();
        empAadharNumberField.setBounds(200, 355, 170, 25);
        add(empAadharNumberField);





//      Course Name

        JLabel empQualification = new JLabel("Qualification");
        empQualification.setBounds(50, 400, 200, 30);
        empQualification.setFont(new Font("serif", Font.BOLD, 20));
        add(empQualification);

//        Dropdown to choose course name

        String qualificaton[] = {"B-Tech", "B-Pharm", "B-Com", "BCS", "BCA", "MCA", "BA", "BBA", "MBA","BSC"};
        cbQualification = new JComboBox(qualificaton);
        cbQualification.setBounds(200,400,150,30);
        add(cbQualification);
        cbQualification.setBackground(Color.WHITE);
//        cbCourse.setForeground(Color.WHITE);





//        Course Branch

        JLabel empDepatment = new JLabel("Department");
        empDepatment.setBounds(400, 400, 200, 30);
        empDepatment.setFont(new Font("serif", Font.BOLD, 20));
        add(empDepatment);

//        Dropdown to choose course name

        String dept[] = {"Information-Technology", "Computer Science", "Mechanical", "Civil", "Electrical", "E&TC", "AIDS", "Chemical"};
        cbDepartment = new JComboBox(dept);
        cbDepartment.setBounds(600, 405, 170, 25);
        add(cbDepartment);
        cbDepartment.setBackground(Color.WHITE);



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
            String name = empNameField.getText();
            String fName = empFatherNameField.getText();
            String employeeId = empIdfield.getText();
            String dob = ((JTextField)dcDOB.getDateEditor().getUiComponent()).getText();
            String address = empAddressField.getText();
            String phone = empPhoneNumberField.getText();
            String email = empEmailIDField.getText();
            String x = empXPercentageField.getText();
            String xii = empXIIPercentageField.getText();
            String aadhar = empAadharNumberField.getText();
            String qualification = cbQualification.getSelectedItem().toString();
            String department = cbDepartment.getSelectedItem().toString();


            try{
                String query = "INSERT INTO employee  VALUES('"+ name +"', '"+fName+"', '"+employeeId+"' , '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+qualification+"', '"+department+"');";

                Conn con = new Conn();
                con.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Employee Details Inserted Successfully ");
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

        new AddTeacher();


    }
}
