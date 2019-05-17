/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kewen Sorge
 */
public class QuadradoDAO {
    private Connection conexao;
    private PreparedStatement st;
    private ResultSet rs;
    
        public int conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection)
           DriverManager.getConnection("jdbc:mysql://localhost:3306/dados", "root", "");
            return 1;
        } catch(SQLException | ClassNotFoundException ex){
            return 0;
        }
    }
    public int salvarforma(Quadrado q) {
        try{
            String comando = "INSERT INTO `dados`.`Quadrado`(area) VALUES(?)";
            st = (PreparedStatement) this.conexao.prepareStatement(comando);
            st.setDouble(1, q.getArea());
            st.execute();
            return 1;
        } catch(SQLException ex){
            if(ex.getErrorCode()==1062){
                return 2;
            } else {
                return 0;
            }
        }
    }
    
}
