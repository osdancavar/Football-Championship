/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class conexion {

    private final static String DB = "PROYECTO_FUT";
    private final static String USER = "root";
    private final static String PASSWORD = "";
    private final static String URL = "jdbc:mysql://localhost:3306/" + DB;

    public static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection connection = null;

    protected void conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Conexion a base de datos " + DB + " ok\n");
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException | SQLException ex) {
            Icon icon = null;
            JOptionPane.showMessageDialog(null, "error al conectar con la BD", "ERROR", JOptionPane.DEFAULT_OPTION, icon);
        }
    }

    protected void disconnected() {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String[][] getQuery(String query) {
        ResultSet result;
        String[][] data = new String[1][1];
        data[0][0] = "not data";
        int rows;
        int columns;

        ResultSetMetaData metaDataResult;

        this.conexion();
        try {
            Statement start = connection.createStatement();
            result = start.executeQuery(query);
            metaDataResult = result.getMetaData();

            columns = metaDataResult.getColumnCount();
            result.last();
            rows = result.getRow();
            result.beforeFirst();
            data = new String[rows][columns];
            int contador = 0;
            while (result.next()) {
                for (int i = 0; i < columns; i++) {
                    data[contador][i] = result.getString(i + 1);
                }
                contador++;
            }
        } catch (SQLException ex) {
            Icon icon = null;
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA", "ERROR", JOptionPane.DEFAULT_OPTION, icon);
        }
        return data;
    }

    public int setQuery(String query) {

        int result = 0;
        this.conexion();
        ResultSet id;

        try {
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            int affectedRows = statement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("no se pudo guardar");
            }
            Icon icon = null;
        JOptionPane.showMessageDialog(null, "DATO INSERTADO", "COMPLETO", JOptionPane.DEFAULT_OPTION, icon);

            id = statement.getGeneratedKeys();
            if (id.next()) {
                result = id.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Icon icon = null;
        JOptionPane.showMessageDialog(null, "LLAVE YA EXISTE", "COMPLETO", JOptionPane.DEFAULT_OPTION, icon);

            try {
                connection.rollback();
            } catch (SQLException exep) {
                System.out.println(exep.getMessage());
            }
        }
        this.disconnected();
        return result;
    }

    public void setQueryUpdate(String query) {
        this.conexion();
        int result = 0;
        ResultSet id;
        try {
            Statement start = connection.createStatement();
            start.executeUpdate(query);
            id = start.getGeneratedKeys();

        } catch (SQLException exep) {
            System.out.println(exep);
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        this.disconnected();
    }
}
