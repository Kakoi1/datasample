/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import guiinternal.settings;
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
    
    public void deleteData(int id, String tables, String table_id) {
    try {
       
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM `"+tables+"`WHERE`"+table_id+"`=?");
        stmt.setInt(1, id);
       
        int rowsDeleted = stmt.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println( " deleted succesfully.");
        } else {
            System.out.println("No rows were deleted.");
        }
       
       
        stmt.close();

       
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
             pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return num;
    }
     
//    public void loginData(String sql,String user){
//      
//        int num=0;
//
//            try{
//                
//         ResultSet rs;
//         PreparedStatement pstmt = connection.prepareStatement(sql);
//         pstmt.setString(1,user);
////         pstmt.setString(2, pass);
//        rs = pstmt.executeQuery();
//         
//          if(rs.next()) {
//                System.out.println("Login successfully!");
//                num = 1;    
//            } else {
//                System.out.println("log in failed!");
//                num=0;
//            }
//          pstmt.close();
//           }catch(SQLException e){
//                System.out.println("Connection Error: "+e);
//    }
//
//}
//    public int infoData(String sql,String uname){
//          settings set = new settings();
//          
//        int num =0;
//        
//          try {
//         PreparedStatement pstmt = connection.prepareStatement(sql);
//          ResultSet rs;
//          pstmt.setString(1,uname);
//           rs = pstmt.executeQuery();
//         
//          if(rs.next()) {
//              String n = rs.getString("c_name");
//              System.out.println(rs.getString("c_name"));
//               System.out.println(rs.getString("c_contact_no."));
//               System.out.println(rs.getString("c_address"));
//                System.out.println("Data updated successfully!");
//                
//              
//                
//            } else {
//                System.out.println("Data update failed!");
//                num=0;
//            }
//          pstmt.close();
//           }catch(SQLException e){
//                System.out.println("Connection Error: "+e);
//    }
//    return num;
//}
//    
      public int checkUsername(String sql,String username)
    {

  int num=0;

         try{
                
         ResultSet rs;
         PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, username);
            
            rs = pstmt.executeQuery();
              if(rs.next())
            {
                num=1;
            }
          pstmt.close();
          }catch(SQLException e){
                System.out.println("Connection Error: "+e);
    }
       return num;  
}
}
