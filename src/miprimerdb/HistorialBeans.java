/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerdb;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class HistorialBeans {
    Basededatos db;
    
        public HistorialBeans() throws SQLException {
        db=new Basededatos("localhost:3306","root","root","Carros");
        db.ConectarDB();

    }
    
      public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    } 
    
        public void Consultar_Historial() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT c.ID_Carro, cl.ID_Cliente, cl.Nombre, c.NombreCarro, c.ModeloCarro, a.NombreAgencia FROM Carro c INNER JOIN Cliente cl ON c.ID_Carro = cl.ID_Cliente INNER JOIN Agencia a ON c.ID_Carro = a.ID_Agencia;");
    while (rs.next()) {
        System.out.print(rs.getInt(1) + " ");
        System.out.print(rs.getString(2) + " ");
        System.out.print(rs.getString(3) + " ");
        System.out.print(rs.getString(4) + " ");
        System.out.print(rs.getString(5) + " ");
        System.out.print(rs.getString(6) + " ");
        System.out.println("");
    }
    }
}
