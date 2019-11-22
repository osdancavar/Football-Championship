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
public class ctrlCancha {

    int id_cancha;
    String nombre;
    String estado;

    public  void insertarCancha(int id_cancha, String nombre,int estado) {
        String query = "INSERT INTO cancha VALUES(" + id_cancha + ",'" + nombre + "',"+ estado + ");";
        int resultado;
          conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public  String[][] getCancha() {
        String query = "SELECT * FROM cancha";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }
  
}
