package Model;

public class GruposM {

    public int Numero_Curso;
    public int Numero_Grupo;
    public String Fecha_Inicio;
    public String Fecha_Fin;
    public char Horario;
    public char Dias_Imparticion;
    public char Lugar_Imparticion;
    public boolean Apto;

    public GruposM(int Numero_Curso, int Numero_Grupo, String Fecha_Inicio, String Fecha_Fin, char Horario, char Dias_Imparticion, char Lugar_Imparticion, boolean Apto) {
        this.Numero_Curso = Numero_Curso;
        this.Numero_Grupo = Numero_Grupo;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.Horario = Horario;
        this.Dias_Imparticion = Dias_Imparticion;
        this.Lugar_Imparticion = Lugar_Imparticion;
        this.Apto = Apto;
    }

    public void setNumero_Curso(int Numero_Curso) {
        this.Numero_Curso = Numero_Curso;
    }

    public void setNumero_Grupo(int Numero_Grupo) {
        this.Numero_Grupo = Numero_Grupo;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public void setFecha_Fin(String Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public void setHorario(char Horario) {
        this.Horario = Horario;
    }

    public void setDias_Imparticion(char Dias_Imparticion) {
        this.Dias_Imparticion = Dias_Imparticion;
    }

    public void setLugar_Imparticion(char Lugar_Imparticion) {
        this.Lugar_Imparticion = Lugar_Imparticion;
    }

    public void setApto(boolean Apto) {
        this.Apto = Apto;
    }

    public int getNumero_Curso() {
        return Numero_Curso;
    }

    public int getNumero_Grupo() {
        return Numero_Grupo;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public String getFecha_Fin() {
        return Fecha_Fin;
    }

    public char getHorario() {
        return Horario;
    }

    public char getDias_Imparticion() {
        return Dias_Imparticion;
    }

    public char getLugar_Imparticion() {
        return Lugar_Imparticion;
    }

    public boolean isApto() {
        return Apto;
    }

}
