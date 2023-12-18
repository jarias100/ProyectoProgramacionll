package Controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.ProfesoresM;
        
public class ProfesoresC {
     public Object[][] CargarTablaProfesor() {
        ConexionController con = new ConexionController();
        con.crearConexion();
        ArrayList<String> Profesores = new ArrayList<String>();

        try {
            Statement profesores = con.conexion.createStatement();
            String query = "select DNI,NISS, Nombre, Apellido1, Apellido2, Domicilio, Ciudad, Provincia, CP, Email, Telefono from Tb_Profesores";
            ResultSet resultado = profesores.executeQuery(query);

            while (resultado.next()) {
                Profesores.add(resultado.getString("DNI"));
                Profesores.add(resultado.getString("NISS"));
                Profesores.add(resultado.getString("Nombre"));
                Profesores.add(resultado.getString("Apellido1"));
                Profesores.add(resultado.getString("Apellido2"));
                Profesores.add(resultado.getString("Domicilio"));
                Profesores.add(resultado.getString("Ciudad"));
                Profesores.add(resultado.getString("Provincia"));
                Profesores.add(resultado.getString("CP"));
                Profesores.add(resultado.getString("Email"));
                Profesores.add(resultado.getString("Telefono"));
            }
        } catch (Exception e) {
        }
        Object[][] caract = new Object[Profesores.size() / 11][11];

        for (char j = 0; j < Profesores.size() / 11; j++) {
            for (char i = 0; i < 11; i++) {
                caract[j][i] = Profesores.get(i + (j * 11));
            }
        }
        return caract;
    }

    public char RegistrarProfesores(String DNI, String NISS, String Nombre, String Apellido1, String Apellido2, String Domicilio, String Ciudad, String Provincia, String CP, String Email, String Telefono) throws SQLException {
        ConexionController con = new ConexionController();
        char dni = 0;
        con.crearConexion();
        String query = "insert into Tb_Profesores (DNI, NISS, Nombre, Apellido1, Apellido2, Domicilio, Ciudad, Provincia, CP, Email, Telefono ) values ('" + DNI + "'," + NISS + ",'" + Nombre + "','" + Apellido1 + "','" + Apellido2 + "','" + Domicilio + "','" + Ciudad + "','" + Provincia + "','" + CP + "','" + Email + "','" + Telefono + "')";
        try (PreparedStatement rProfesores = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {
            rProfesores.executeUpdate();
            try (ResultSet generateKeys = rProfesores.getGeneratedKeys()) {
                if (generateKeys.next()) {
                    dni = (char) generateKeys.getLong(1);
                } else {
                    throw new SQLException("Error al generar el curso");
                }
            }
            con.cerrarConexion();
            return dni;
        }
    }
}
