package Model;

public class ProfesoresM {

    public String DNI;
    public String NISS;
    public String Nombre;
    public String Apellido1;
    public String Apellido2;
    public String Domicilio;
    public String Ciudad;
    public String Provincia;
    public String CP;
    public String Email;
    public String Telefono;

    public ProfesoresM(String DNI, String NISS, String Nombre, String Apellido1, String Apellido2, String Domicilio, String Ciudad, String Provincia, String CP, String Email, String Telefono) {
        this.DNI = DNI;
        this.NISS = NISS;
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Domicilio = Domicilio;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.CP = CP;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNISS(String NISS) {
        this.NISS = NISS;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNISS() {
        return NISS;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public String getCP() {
        return CP;
    }

    public String getEmail() {
        return Email;
    }

    public String getTelefono() {
        return Telefono;
    }
}
