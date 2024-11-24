package UniversityManagementSystem;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Connection connection;
    Statement statement;


    private static final String url = "jdbc:mysql://localhost:3306/universitymanagementsystem";
    private static final String userName ="root";
    private static final String password = "root";



    Conn(){


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Drivers loaded Successfully ");

        }catch (Exception e){
            System.out.println("failed to load drivers");
            e.printStackTrace();
        }



        try{
            connection = DriverManager.getConnection(url, userName, password);
//            System.out.println("Connection Established successfully ");

            statement = connection.createStatement();

        }catch (SQLException e){
            System.out.println("Failed to Establish Connection ");
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {
        Conn obj = new Conn();


    }

}
