package UniversityManagementSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project extends JFrame implements ActionListener {

    Project(){

        setSize(1920, 1080);


        try {
            ImageIcon firstImage  = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
            Image i2 = firstImage.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel image = new JLabel(i3);
            add(image);
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }


        // Creating MenuBar
        JMenuBar menuBar = new JMenuBar();



        // New Information
        JMenu newInformation = new JMenu("New Information");
        menuBar.add(newInformation);

        //New Faculty Information
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        newInformation.add(facultyInfo);
        facultyInfo.setBackground(Color.black);
        facultyInfo.setForeground(Color.WHITE);
        facultyInfo.addActionListener(this);


//      New Student Information
        menuBar.add(newInformation);
        JMenuItem studentInfo = new JMenuItem("New Student Information");
        newInformation.add(studentInfo);
        studentInfo.setBackground(Color.black);
        studentInfo.setForeground(Color.WHITE);
        studentInfo.addActionListener(this);






        // Details
        JMenu details = new JMenu("Details");
        menuBar.add(details);

        //Faculty Information
        JMenuItem facultyDetails = new JMenuItem("View Faculty Details");
        details.add(facultyDetails);
        facultyDetails.setBackground(Color.black);
        facultyDetails.setForeground(Color.WHITE);
        facultyDetails.addActionListener(this);

//      Student Details
        JMenuItem studentDetails = new JMenuItem("View Student Details");
        details.add(studentDetails);
        studentDetails.setBackground(Color.black);
        studentDetails.setForeground(Color.WHITE);
        studentDetails.addActionListener(this);




        // Apply for Leave
        JMenu leave = new JMenu("Apply For Leave");
        menuBar.add(leave);

        //Faculty Leave
        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        leave.add(facultyLeave);
        facultyLeave.setBackground(Color.black);
        facultyLeave.setForeground(Color.WHITE);
        facultyLeave.addActionListener(this);

//        Student Leave
        JMenuItem studentLeave = new JMenuItem("Student Leave");
        leave.add(studentLeave);
        studentLeave.setBackground(Color.black);
        studentLeave.setForeground(Color.WHITE);
        studentLeave.addActionListener(this);



        // Leave Details
        JMenu leaveDetails = new JMenu("View Leave Details");
        menuBar.add(leaveDetails);

        //Faculty Leave
        JMenuItem facultyLeaveDetails = new JMenuItem("Faculty Leave Details");
        leaveDetails.add(facultyLeaveDetails);
        facultyLeaveDetails.setBackground(Color.black);
        facultyLeaveDetails.setForeground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);

//        Student Leave
        JMenuItem studentLeaveDetails = new JMenuItem("Student Leave Details");
        leaveDetails.add(studentLeaveDetails);
        studentLeaveDetails.setBackground(Color.black);
        studentLeaveDetails.setForeground(Color.WHITE);
        studentLeaveDetails.addActionListener(this);





        // Examination Details
        JMenu exam = new JMenu("Examination");
        menuBar.add(exam);

        //Examination Results
        JMenuItem examinationResults = new JMenuItem("Examination Results");
        exam.add(examinationResults);
        examinationResults.setBackground(Color.black);
        examinationResults.setForeground(Color.WHITE);
        examinationResults.addActionListener(this);

//      Enter Marks
        JMenuItem enterMarks = new JMenuItem("Enter Marks");
        exam.add(enterMarks);
        enterMarks.setBackground(Color.black);
        enterMarks.setForeground(Color.WHITE);
        enterMarks.addActionListener(this);




        // Update Info
        JMenu updateInfo = new JMenu("Update Information");
        menuBar.add(updateInfo);


        JMenuItem facultyInfoUpdate = new JMenuItem("Update Faculty Information");
        updateInfo.add(facultyInfoUpdate);
        facultyInfoUpdate.setBackground(Color.black);
        facultyInfoUpdate.setForeground(Color.WHITE);
        facultyInfoUpdate.addActionListener(this);


        JMenuItem studentInfoUpdate = new JMenuItem("Update Student Information");
        updateInfo.add(studentInfoUpdate);
        studentInfoUpdate.setBackground(Color.black);
        studentInfoUpdate.setForeground(Color.WHITE);
        studentInfoUpdate.addActionListener(this);





        // Fees

        JMenu fee = new JMenu("Fees");
        menuBar.add(fee);

        //Examination Results
        JMenuItem feeStructure = new JMenuItem("View Fee Structure");
        fee.add(feeStructure);
        feeStructure.setBackground(Color.black);
        feeStructure.setForeground(Color.WHITE);
        feeStructure.addActionListener(this);

//      Enter Marks
        JMenuItem studentFeeForm = new JMenuItem("Fees Form");
        fee.add(studentFeeForm);
        studentFeeForm.setBackground(Color.black);
        studentFeeForm.setForeground(Color.WHITE);
        studentFeeForm.addActionListener(this);




        // Utility
        JMenu utility = new JMenu("Utility");
        menuBar.add(utility);


        JMenuItem notepad = new JMenuItem("Notepad" );
        utility.add(notepad);
        notepad.setBackground(Color.black);
        notepad.setForeground(Color.WHITE);
        notepad.addActionListener(this);

//
        JMenuItem calculator = new JMenuItem("Calculator");
        utility.add(calculator);
        calculator.setBackground(Color.black);
        calculator.setForeground(Color.WHITE);
        calculator.addActionListener(this);;


        JMenu ab = new JMenu("About");
        menuBar.add(ab);

        JMenuItem about = new JMenuItem("About" );
        ab.add(about);
        about.setBackground(Color.black);
        about.setForeground(Color.WHITE);
        about.addActionListener(this);






//        // Exit
        JMenu exit = new JMenu("Exit");
        menuBar.add(exit);

        JMenuItem ex = new JMenuItem("Log Out" );
        exit.add(ex);
        ex.setBackground(Color.black);
        ex.setForeground(Color.red);
        ex.addActionListener(this);

//










        setJMenuBar(menuBar);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){
        String message = ae.getActionCommand();

        if(message.equals("Log Out")) {
            setVisible(false);
        } else if (message.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");

            }catch (Exception e){
                System.out.println("There is an problem while fetching calculator");
            }

        }else if (message.equals("Notepad")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");

            }catch (Exception e){
                System.out.println("There is an problem while fetching notepad");
            }

        } else if (message.equals("New Faculty Information")) {
            new AddTeacher();

        } else if (message.equals("View Faculty Details")) {
            new TeacherDetails();

        }else if (message.equals("New Student Information")) {
            new AddStudent();

        }else if (message.equals("View Student Details")) {
            new StudentDetails();

        }else if (message.equals("Faculty Leave")) {
            new TeacherLeave();
        }
        else if (message.equals("Student Leave")) {
            new StudentLeave();

        }else if (message.equals("Student Leave Details")) {
            new StudentLeaveDetails();

        }else if (message.equals("Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }else if (message.equals("Update Faculty Information")) {
            new UpdateTeacher();

        }else if (message.equals("Enter Marks")) {
            new EnterMarks();

        }else if (message.equals("Examination Results")) {
            new ExaminationDetails();

        }else if (message.equals("View Fee Structure")) {
            new FeeStructure();

        }else if (message.equals("About")) {
            new About();

        }else if (message.equals("Fees Form")) {
            new StudentFeeForm();

        }

    }



    public static void main(String[] args){
        new Project();





    }
}
