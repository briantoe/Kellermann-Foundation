package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import model.Error;

public class ErrorDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    static DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;

    public static void Error_Add(Error custom_error)
            throws SQLException {

        try {
            Connection con;

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bwindihospital_reduced";
            con = DriverManager.getConnection(url, "root", "t00r");

            PreparedStatement ps = con.prepareStatement("insert into error_log(Controller_Name,Method_Name,Error,Record_Date) values(?,?,?,?)");

            ps.setString(1, custom_error.getController_Name());
            ps.setString(2, custom_error.getMethod_Name());
            ps.setString(3, custom_error.getError());
            ps.setString(4, custom_error.getError_date().format(dateFormatter));
            
            ps.executeUpdate();
            
            con.close();
            
        } catch (Exception ex) {
            System.out.println("Error in Error_Add() -->" + ex.getMessage());
        }
    }
}