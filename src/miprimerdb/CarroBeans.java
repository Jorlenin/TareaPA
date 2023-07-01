/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerdb;
import java.sql.*;
public class CarroBeans {
    private int ID_Carro;
    private String NombreCarro; 
    private String ModeloCarro; 
    private String TipoCarro; 
    private String Observacion;
    Basededatos db;


    public CarroBeans() throws SQLException {
        db=new Basededatos("localhost:3306","root","root","Carros");
        db.ConectarDB();

    }

    public void setID_Carro(int ID_Carro) {
        this.ID_Carro = ID_Carro;
    }

    public void setNombreCarro(String NombreCarro) {
        this.NombreCarro = NombreCarro;
    }

    public void setModeloCarro(String ModeloCarro) {
        this.ModeloCarro = ModeloCarro;
    }

    public void setTipoCarro(String TipoCarro) {
        this.TipoCarro = TipoCarro;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public int getID_Carro() {
        return ID_Carro;
    }

    public String getNombreCarro() {
        return NombreCarro;
    }

    public String getModeloCarro() {
        return ModeloCarro;
    }

    public String getTipoCarro() {
        return TipoCarro;
    }

    public String getObservacion() {
        return Observacion;
    }
    
        public int Incremento_Carro() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = db.ConsultaDB("SELECT MAX(ID_Carro) AS num FROM Carro;");
        if (rs.next()) {
            inc = rs.getInt("num") + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Carro() throws SQLException {
        String cadena = "INSERT INTO Carro VALUES ('" + Incremento_Carro() + "', '" + getNombreCarro() + "', '" + getModeloCarro() + "', '" + getTipoCarro() + "', '" + getObservacion() + "')";
        db.ActualizarDB(cadena);
    }
    
    public void Actualizar_Carro(){
        
    }
    
    public void Eliminar_Carro(){
        
    }
    public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    }
    
    public void Consultar_Carro() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT * FROM Carro");
    while (rs.next()) {
        System.out.print(rs.getInt(1) + " ");
        System.out.print(rs.getString(2) + " ");
        System.out.print(rs.getString(3) + " ");
        System.out.print(rs.getString(4) + " ");
        System.out.print(rs.getString(5) + " ");
        System.out.println("");
    }
    }
}
 