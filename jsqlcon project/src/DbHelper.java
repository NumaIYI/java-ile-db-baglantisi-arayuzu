import java.sql.*;
public class DbHelper {
    private String userName = "root";
    private String password = "111672";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useSSl=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException e){
        System.out.println("Error : "+e.getMessage());
        System.out.println("Error : "+e.getErrorCode());
    }  
}
