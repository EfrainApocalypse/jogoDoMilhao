/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import java.sql.*;
import javax.swing.*;

public class JConnectorDB {
    
    String[] conectar = {"jdbc:mysql://localhost/quizztec?useSSL=false", "root", ""};
    
    public void ManipularDados(String query){
        try {
            Connection con =  (Connection) DriverManager.getConnection(conectar[0], conectar[1], conectar[2]);
            String sql = query;
            PreparedStatement grava = (PreparedStatement) con.prepareStatement(sql);
            grava.execute();        
            grava.close();
            con.close();
        } 
        catch (SQLException ex){
            System.out.println("Erro " + ex);
        }
    }   
    public String[] Consulta(String consulta) {
        String dados[] = new String[6];
        try {
            Connection con =  (Connection) DriverManager.getConnection(conectar[0], conectar[1], conectar[2]);
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(consulta);
            banco.execute();
            ResultSet resultado = banco.executeQuery(consulta);
            while(resultado.next()) {
                dados[0] = resultado.getString("pergunta");
                dados[1] = resultado.getString("alternativa_correta");
                dados[2] = resultado.getString("alternativa_errada1");
                dados[3] = resultado.getString("alternativa_errada2");
                dados[4] = resultado.getString("alternativa_errada3");
                dados[5] = resultado.getString("id_pergunta");
            } 
            banco.close();
            con.close();
        }
        catch (SQLException ex) {
            System.out.println("o erro foi " +ex);
        }
        return dados;
    }
    public String[][] ConsultaRank(String consulta) {
        String[][] dados = new String[15][2];
        try {
            Connection con =  (Connection) DriverManager.getConnection(conectar[0], conectar[1], conectar[2]);
            PreparedStatement banco = (PreparedStatement)con.prepareStatement(consulta);
            banco.execute();
            ResultSet resultado = banco.executeQuery(consulta);
            int i =0;
            while(resultado.next()) {
                dados[i][0] = resultado.getString("nome");
                dados[i][1] = resultado.getString("pontos");
                i++;
            } 
            banco.close();
            con.close();
        }
        catch (SQLException ex) {
            System.out.println("o erro foi " +ex);
        }
        return dados;
    }
}
