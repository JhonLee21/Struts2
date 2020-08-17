
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * *
 * * @author ASUS
 */
public class ConexionSQL {
    private static final String user="updstarea";
    private static final String password="123";
    
    
    
    public static Connection getConnection()throws SQLException{
        
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        
    }catch (ClassNotFoundException e){
        e.printStackTrace();
        
    }
    
    //Primera pcion
    //jdbc:sqlserver://localhost:1433;databaseName=Login
    String url="jdbc:sqlserver://localhost:1433;databaseName=dblogin";
    //String url="jdbc:sqlserver://"+ ipAddress +"\\SQL;databaseName=" + dbname;
    return DriverManager.getConnection(url, user, password);
    
    }
    
    public static void main(String[]args) throws SQLException{
        Connection con=ConexionSQL.getConnection();
        if(con !=null){
            System.err.println("Conexion exitosa");
        }
    }
    
}