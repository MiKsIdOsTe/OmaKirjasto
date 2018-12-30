/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omamgkirjasto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lentt
 */
public class luoYhteys {

        //Yhdistetään tietokantaan
        String url = "jdbc:derby://localhost:1527/omaTietokanta";
        String userName = "oma";
        String password = "oma";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        
    Connection getConnection() throws ClassNotFoundException, SQLException {
        System.out.println("luoYhteys");
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, userName, password);
        con.setAutoCommit(true);
        System.out.println("luoYhteys get connection");
        return con;
    }
    
    void putData(String sql) throws ClassNotFoundException, SQLException {
       System.out.println("luoYhteys putData1"); 
       Connection con = getConnection();
       System.out.println("luoYhteys putData2");
        Statement state = con.createStatement();
        System.out.println("luoYhteys putData3");
        state.executeUpdate(sql);
        System.out.println("luoYhteys putData4");
        state.close();
       System.out.println("luoYhteys putData5");
    }
    
    public Statement state;
    public ResultSet getData(String sql) throws ClassNotFoundException, SQLException {
        Connection con = getConnection();
        state = con.createStatement();
        ResultSet rset = state.executeQuery(sql);
        System.out.println("luoYhteys getData");
        return rset;
    }
}
