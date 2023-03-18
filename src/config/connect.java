/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author SCC COMPLAB
 */
public class connect {
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
   
   
    public Connection getConnection(){  
            try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aquatic_recording", "root", "");
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    }
                        return con;
                }
}
