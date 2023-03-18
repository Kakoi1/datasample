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
import java.sql.SQLException;

/**
 *
 * @author SCC COMPLAB
 */
public class dbconnect {
   private Connection connection;
    
    public dbconnect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_fish", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
    }
    
    public ResultSet getData(String sql) throws SQLException {
        java.sql.Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        return resultSet;
    }
    
    public void deleteData(int id) {
    try {
       
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM tbl_fish WHERE f_code = ?");
        stmt.setInt(1, id);
       
        int rowsDeleted = stmt.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println(rowsDeleted + " rows were deleted.");
        } else {
            System.out.println("No rows were deleted.");
        }
       
       
        stmt.close();
        connection.close();
       
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e.getMessage());
    }
}
    
    public void insertData(String sql){
//    String sql = "INSERT INTO customers (name, email) VALUES ('John Smith', 'john@example.com')";
            try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            
            pstmt.executeUpdate();
            System.out.println("Inserted Successfully!");
            pstmt.close();
            }catch(SQLException e){
                System.out.println("Connection Error: "+e);
            }
    }
     public int updateData(String sql){
        int num = 0;
        try {
       
            String query = sql;
            PreparedStatement pstmt = connection.prepareStatement(query);
            int rowsUpdated = pstmt.executeUpdate();
            if(rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
                num = 1;
            } else {
                System.out.println("Data update failed!");
                num = 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return num;
    }
    
}
