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
 * @author oscar
 */
public class ctrlPersona {

    int dpi;
    int id;
    int rol;
    String nombre;
    String apellido;
    String fechaNacimiento;

    //para que podas usar las funciones en el main hay que hacerlas estaticas
    public  void insertarPersona(int dpi, int idequipo, int rol, String nombre, String apellido, String fechaNacimiento) {
        String query = "INSERT INTO persona VALUES(" + dpi + "," + idequipo + ","+ rol + ",'" + nombre + "','" + apellido + "','" + fechaNacimiento + "');";
        int resultado;
          conexion con = new conexion();
        resultado = con.setQuery(query);
           }

    public  String[][] getPersona() {
        String query = "SELECT * FROM persona";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }

   
}
