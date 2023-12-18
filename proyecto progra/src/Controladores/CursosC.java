package Controladores;

import java.sql.*;
import java.util.ArrayList;
import Model.CursosM;

public class CursosC {

    public Object[][] CargarTablaCursos() {
        ConexionController con = new ConexionController();
        con.crearConexion();
        ArrayList<String> cursos = new ArrayList<String>();

        try {
            Statement curso = con.conexion.createStatement();
            String query = "select Numero_Curso,Denominacion, Horas_lectivas, Modalidad, Objetivos, Contenidos from Tb_Cursos";
            ResultSet resultado = curso.executeQuery(query);

            while (resultado.next()) {
                cursos.add(resultado.getString("Numero_Curso"));
                cursos.add(resultado.getString("Denominacion"));
                cursos.add(resultado.getString("Horas_lectivas"));
                cursos.add(resultado.getString("Modalidad"));
                cursos.add(resultado.getString("Objetivos"));
                cursos.add(resultado.getString("Contenidos"));
            }
        } catch (Exception e) {
        }
        Object[][] caract = new Object[cursos.size() / 6][6];

        for (int j = 0; j < cursos.size() / 6; j++) {
            for (int i = 0; i < 6; i++) {
                caract[j][i] = cursos.get(i + (j * 6));
            }
        }
        return caract;
    }

    public int RegistrarCurso(String Denominacion, int Horas, String Modalidad, String Objetivos, String Contenidos) throws SQLException {
        ConexionController con = new ConexionController();
        int num_curso = 0;
        con.crearConexion();
        String query = "insert into Tb_Cursos (Denominacion, Horas_lectivas, Modalidad, Objetivos, Contenidos) values ('" + Denominacion + "'," + Horas + ",'" + Modalidad + "','" + Objetivos + "','" + Contenidos + "')";
        try (PreparedStatement rcurso = con.conexion.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);) {
            rcurso.executeUpdate();
            try (ResultSet generateKeys = rcurso.getGeneratedKeys()) {
                if (generateKeys.next()) {
                    num_curso = (int) generateKeys.getLong(1);
                } else {
                    throw new SQLException("Error al generar el curso");
                }
            }
            con.cerrarConexion();
            return num_curso;
        }
    }
}
