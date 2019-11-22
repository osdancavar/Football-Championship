/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.mysql.fabric.xmlrpc.base.Array;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import servicios.*;

/**
 *
 * @author oscar
 */
public class ctrllEquipo {

    int id;
    String nombre;

    public void insertarEquipo(int id, String nombre) {
        String query = "INSERT INTO equipo VALUES(" + id + ",'" + nombre + "');";
        int resultado;
        conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public String[][] getEquipo() {
        String query = "SELECT * FROM equipo;";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }
}
