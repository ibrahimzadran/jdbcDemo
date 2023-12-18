import java.sql.*;

public class JdbcExample {

    // Java Code; JDBC(APi) -> database
    // Java Database Connectivity
    // 1= The driver that has JDBC
    // SQl mysql
    // 2- Link to database
    // username,password
    //

    public static void main(String[] args) {
        String dbUrl= "jdbc:mysql://localhost:3306/demo_db";
        String username = "root";
        String password ="Raihan@5079";
        Statement statement= null;
        ResultSet resultSet= null;
        Connection conn = null;

        try {
             conn = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Connected to database successfully");
             statement= conn.createStatement();
             resultSet= statement.executeQuery("SELECT * FROM employees");
                       statement=conn.createStatement();


            statement.execute("INSERT INTO employees VALUES(NULL, 'Jack',44)");



            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String name= resultSet.getNString("name");
                int age =resultSet.getInt("age");
                System.out.println("ID: "+id+ " Name:"+name+" ,Age:"+age);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Execute the sql statements


}
