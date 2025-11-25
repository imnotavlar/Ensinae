
package com.mycompany.ensinae.views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



//Conexão da Data Base
public class db {
    
    public static Connection mycon() {
        Connection con = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/login", // <-- aqui
                "root",
                ""
            );

        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
        return con;
    
    }
}
