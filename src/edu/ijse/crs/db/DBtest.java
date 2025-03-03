/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class DBtest {
     public static void main(String[] args) {
        try {
            DBconnection db = DBconnection.getInstance();
            Connection conn = db.getConnection();
            
            if (conn != null) {
                System.out.println("Database connection successful!");
            } else {
                System.out.println("Database connection failed!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
