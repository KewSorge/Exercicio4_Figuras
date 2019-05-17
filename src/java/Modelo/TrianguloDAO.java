/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kewen Sorge
 */
public class TrianguloDAO {

    private Connection conexao;
    private PreparedStatement st;
    private ResultSet rs;

    public int conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dados", "root", "");
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            return 0;
        }
    }

    public void desconectar() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(RetanguloDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int salvarforma(Triangulo tri) {
        try {
            String comando = "INSERT INTO `dados`.`triangulo`(`area`) VALUES(?)";
            st = (PreparedStatement) this.conexao.prepareStatement(comando);
            st.setDouble(1, tri.getArea());
            st.execute();
            return 1;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                return 2;
            } else {
                return 0;
            }
        }
    }

}
