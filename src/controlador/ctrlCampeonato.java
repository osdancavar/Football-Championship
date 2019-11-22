/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import servicios.*;

/**
 *
 * @author josel
 */
public class ctrlCampeonato {

    int id_campeonato;
    String nombre;
    String FechaInicio;
    String FechaFinalizado;

    public void insertarCampeonato(int id_campeonato, String nombre, String FechaInicio, String FechaFinalizacion) {
        String query = "INSERT INTO CAMPEONATO values(" + id_campeonato + ",'" + nombre + "','" + FechaInicio + "','" + FechaFinalizacion + "');";
        int resultado;
        conexion con = new conexion();
        resultado = con.setQuery(query);
    }

    public String[][] getCampeonato() {
        String query = "SELECT * FROM campeonato";
        conexion con = new conexion();
        String[][] result = con.getQuery(query);
        return result;
    }

}
