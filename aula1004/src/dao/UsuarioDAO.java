/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author CAMARGO
 */
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome, cpf, email, telefone, tel_fixo, nascimento, estado_civil, genero;
    
    public UsuarioDAO(){
    this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
    String sql = "insert into usuario(nome, cpf, email, telefone, tel_fixo, nascimento, estado_civil, genero) values(?,?,?,?,?,?,?,?)";
    
    try{
    PreparedStatement stmt = connection.prepareStatement(sql);
    stmt.setString(1, usuario.getNome());
    stmt.setString(2, usuario.getCpf());
    stmt.setString(3, usuario.getEmail());
    stmt.setString(4, usuario.getTelefone());
    stmt.setString(5, usuario.getTel_fixo());
    stmt.setString(6, usuario.getNascimento());
    stmt.setString(7, usuario.getEstado_civil());
    stmt.setString(8, usuario.getGenero());
    
    
    stmt.execute();
    stmt.close();
    }catch(SQLException u){
    throw new RuntimeException(u);
    }
    }
}
