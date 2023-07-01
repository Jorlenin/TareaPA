/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miprimerdb;

import java.sql.*;
/**
 *
 * @author Usuario
 */
public class AgenciaBeans {
    private int ID_Agencia;
    private String NombreAgencia; 
    private String Ubicacion; 
    private String Telefono; 

    Basededatos db;


    public AgenciaBeans() throws SQLException {
        db=new Basededatos("localhost:3306","root","root","Carros");
        db.ConectarDB();

    }

    public void setID_Agencia(int ID_Agencia) {
        this.ID_Agencia = ID_Agencia;
    }

    public void setNombreAgencia(String NombreAgencia) {
        this.NombreAgencia = NombreAgencia;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getID_Agencia() {
        return ID_Agencia;
    }

    public String getNombreAgencia() {
        return NombreAgencia;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public String getTelefono() {
        return Telefono;
    }
    
        public int Incremento_Agencia() throws SQLException {
        int inc = 0;
        ResultSet rs;
        rs = db.ConsultaDB("SELECT MAX(ID_Agencia) AS num FROM Agencia;");
        if (rs.next()) {
            inc = rs.getInt("num") + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Agencia() throws SQLException {
        String cadena = "INSERT INTO Agencia VALUES ('" + Incremento_Agencia() + "', '" + getNombreAgencia() + "', '" + getUbicacion() + "', '" + getTelefono() + "')";
        db.ActualizarDB(cadena);
    }
    
    public void Actualizar_Agencia(){
        
    }
    
    public void Eliminar_Agencia(){
        
    }
    public ResultSet ConsultarTabla(String sql)throws SQLException{
        return db.ConsultaDB(sql);

    }
    
    public void Consultar_Agencia() throws SQLException {
    ResultSet rs;
    rs = db.ConsultaDB("SELECT * FROM Agencia");
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