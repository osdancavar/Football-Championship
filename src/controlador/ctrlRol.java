/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.Icon;
import javax.swing.JOptionPane;
import servicios.*;

/**
 *
 * @author josel
 */
public class ctrlRol {

    int id;
    String nombre;

    public  void insertarRol(int id, String nombre) {
        String query = "INSERT INTO rol VALUES(" + id + ",'" + nombre + "');";
        int resultado;
           conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public  String[][] getRol() {
        String query = "SELECT * FROM rol";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }
}
