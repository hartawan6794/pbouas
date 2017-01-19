/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juli
 */
public class Koneksi {
    public Connection con;
    public Statement s;
    String url = "jdbc:mysql://localhost/db_uas__14312092";
    String user = "root";
    String pass = "12345678";
    
    public void koneksiDB(){
        try{
            con = DriverManager.getConnection(url,user,pass);
            s = con.createStatement();
        }catch(SQLException e){
            System.err.println(""+e.getMessage());
        }
    }
}
