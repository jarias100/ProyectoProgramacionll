package Model;

public class ParticipantesM {

    public int Numero_Curso;
    public int Numero_Grupo;
    public char Alumno;
    public boolean Apto;

    public ParticipantesM(int Numero_Curso, int Numero_Grupo, char Alumno, boolean Apto) {
        this.Numero_Curso = Numero_Curso;
        this.Numero_Grupo = Numero_Grupo;
        this.Alumno = Alumno;
        this.Apto = Apto;
    }

    public void setNumero_Curso(int Numero_Curso) {
        this.Numero_Curso = Numero_Curso;
    }

    public void setNumero_Grupo(int Numero_Grupo) {
        this.Numero_Grupo = Numero_Grupo;
    }

    public void setAlumno(char Alumno) {
        this.Alumno = Alumno;
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

    public char getAlumno() {
        return Alumno;
    }

    public boolean isApto() {
        return Apto;
    }

}
