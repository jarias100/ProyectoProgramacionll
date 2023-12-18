package Controladores;

import java.sql.*;

public class ConexionController {

    public Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProyectoFinal", "root", "Aa1122$$");

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {

            System.out.println("Error de Conexión");
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean ejecutarSQL(String sql) {
        this.crearConexion();
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {

            ex.printStackTrace();
            return false;
        }
        this.cerrarConexion();
        return true;
    }
}
