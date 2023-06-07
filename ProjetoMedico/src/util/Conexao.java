package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexao {
    
    public static Connection con = null;
    static Statement stmt = null;
    
    public static void ConectBD() {
        try {
            String dsn = "bdmedico";
            String user = "postgres";
            String senha = "123456";
            
            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5432/"+dsn;
            
            con = DriverManager.getConnection(url, user, senha);
            stmt = con.createStatement();
            
            if (con == null){
                System.out.println("Erro ao abrir o banco!");
            } else {
                System.out.println("Banco Aberto");
            }
        } catch (Exception e) {
            System.out.println("Problema na abertura de dados "+e.getMessage());
        }
    }
    
    public static void CloseBD() {
        try {
            stmt.close();
            con.close();
            System.out.println("Banco fechado!");
        } catch (Exception e) {
            System.out.println("Problema ao fechar a conexao " + e.getMessage());
        }
    }
}
