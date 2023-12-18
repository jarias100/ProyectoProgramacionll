package Model;

public class CursosM {

    public int NumeroCurso;
    public String Denominacion;
    public int Horas;
    public String Modalidad;
    public String Objetivos;
    public String Contenidos;

    public CursosM(int NumeroCurso, String Denominacion, int horas, String Modalidad, String Objetivos, String Contenidos) {
        this.NumeroCurso = NumeroCurso;
        this.Denominacion = Denominacion;
        this.Horas = horas;
        this.Modalidad = Modalidad;
        this.Objetivos = Objetivos;
        this.Contenidos = Contenidos;
    }

    public void setNumeroCurso(int NumeroCurso) {
        this.NumeroCurso = NumeroCurso;
    }

    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
    }

    public void setHoras(int horas) {
        this.Horas = horas;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public void setObjetivos(String Objetivos) {
        this.Objetivos = Objetivos;
    }

    public void setContenidos(String Contenidos) {
        this.Contenidos = Contenidos;
    }

    public int getNumeroCurso() {
        return NumeroCurso;
    }

    public String getDenominacion() {
        return Denominacion;
    }

    public int getHoras() {
        return Horas;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public String getObjetivos() {
        return Objetivos;
    }

    public String getContenidos() {
        return Contenidos;
    }
}
