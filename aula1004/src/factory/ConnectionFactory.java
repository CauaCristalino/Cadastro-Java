/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author CAMARGO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection(){
    try {
    return
            DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "");
}
    catch(SQLException excecao){
    throw new RuntimeException(excecao);
}
}
}
