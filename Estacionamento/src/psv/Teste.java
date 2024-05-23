/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;
import java.sql.*; 
import java.util.*;

/**
 *
 * @author CAMARGO
 */
public class Teste {
    public static void main(String[] args) { 
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean(); 
        CarroDAO cd = new CarroDAO(con);
        
        cb.setPlaca("JKK1900"); 
        cb.setCor("Azul"); 
        cb.setDescricao("Carro 1"); 
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("KLS1562"); 
        cb.setCor("Preto"); 
        cb.setDescricao("Carro 2"); 
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("AWK6785"); 
        cb.setCor("Preto"); 
        cb.setDescricao("Carro 2"); 
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("AWK6785"); 
        cb.setCor("Amarelo"); 
        cb.setDescricao("Carro 3"); 
        System.out.println(cd.alterar(cb));
        
        cb.setPlaca("JKK1900"); 
        System.out.println(cd.excluir(cb));
        
        List<CarroBean> lista = cd.listarTodos(); 
        if(lista != null){ 
        for(CarroBean carro : lista){ 
        System.out.println("Placa: "+carro.getPlaca()); 
        System.out.println("Cor: "+carro.getCor()); 
        System.out.println("Descrição:"+carro.getDescricao());
       
        } 
 }


        
        

 }
    
}
