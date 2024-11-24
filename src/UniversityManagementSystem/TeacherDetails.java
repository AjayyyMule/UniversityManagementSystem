package UniversityManagementSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class TeacherDetails extends JFrame implements ActionListener {

    Choice choiceEmpId;
    JTable table;

    JButton search, print, update, add, cancel;

    TeacherDetails(){

        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Search By Employee Id");
        heading.setBounds(20, 20, 150, 20);
        add(heading);

        choiceEmpId = new Choice();
        choiceEmpId.setBounds(180, 20, 150, 20);
        add(choiceEmpId);

        try{
            Conn con = new Conn();
            ResultSet resultSet = con.statement.executeQuery("SELECT * FROM employee;");
            while (resultSet.next()){
                choiceEmpId.add(resultSet.getString("employeeId"));
            }
        }catch (SQLException sqe){
            System.out.println("SQL Exception occuring while fetching Employee Id's");
        }


        table = new JTable();
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(1, 100, 900, 600);
        add(jsp);

        try{
            Conn con = new Conn();
            ResultSet resultSet = con.statement.executeQuery("SELECT * FROM employee;");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (SQLException sqe){
            System.out.println("SQL Exception occoring while fetching student roll nos");
        }

        search = new JButton("Search");
        search.setBounds(20, 70, 80, 20);
        add(search);
        search.addActionListener(this);

        print = new JButton("Print");
        print.setBounds(120, 70, 80, 20);
        add(print);
        print.addActionListener(this);

        update = new JButton("Update");
        update.setBounds(220, 70, 80, 20);
        add(update);
        update.addActionListener(this);

        add = new JButton("Add");
        add.setBounds(320, 70, 80, 20);
        add(add);
        add.addActionListener(this);

        cancel = new JButton("Cancel");
        cancel.setBounds(420, 70, 80, 20);
        add(cancel);
        cancel.addActionListener(this);









    }


    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==search){

            String query = "SELECT * FROM employee WHERE employeeId = '"+ choiceEmpId.getSelectedItem()+"';";

            try{
                Conn conn = new Conn();
                ResultSet resultSet = conn.statement.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

            }catch (Exception e){
                System.out.println("Some problem is occuring during fetching rollNo data ");
                e.printStackTrace();
            }

        }else if (ae.getSource()== print){
            try{
                table.print();

            }catch (Exception e){
                e.getMessage();
            }
        } else if (ae.getSource()== add) {
            setVisible(false);
            new AddTeacher();

        } else if (ae.getSource()== update) {
            setVisible(false);

            new UpdateTeacher();

        } else {
            setVisible(false);

        }
    }




    public static void main(String[] args) {
        new TeacherDetails();
    }
}
