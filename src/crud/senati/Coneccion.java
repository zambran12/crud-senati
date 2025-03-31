/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud.senati;
import java.sql.*;
/**
 *
 * @author Alumno-ETI
 */
public class Coneccion {
    public Connection conectar(){
        String url = "jdbc:mysql://localhost:3308/senati_crud?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1234";
        Connection cn = null;
       try{
         cn = DriverManager.getConnection(url, user, password);
         if (cn != null){
             System.out.println("No conectao :(");
         }
       }catch(SQLException e){
           System.out.println(e);
       }
        
        return cn;
    }
}
