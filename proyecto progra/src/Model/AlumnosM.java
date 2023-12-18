package Model;

public class AlumnosM {

    public char DNI;
    public char Nombre;
    public char Apellido1;
    public char Apellido2;
    public char Domicilio;
    public char Ciudad;
    public char Provincia;
    public char CP;
    public char Email;
    public char Telefono;

    public AlumnosM(char DNI, char Nombre, char Apellido1, char Apellido2, char Domicilio, char Ciudad, char Provincia, char CP, char Email, char Telefono) {
        this.DNI = DNI;
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

    public void setDNI(char DNI) {
        this.DNI = DNI;
    }

    public void setNombre(char Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido1(char Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public void setApellido2(char Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public void setDomicilio(char Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setCiudad(char Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void setProvincia(char Provincia) {
        this.Provincia = Provincia;
    }

    public void setCP(char CP) {
        this.CP = CP;
    }

    public void setEmail(char Email) {
        this.Email = Email;
    }

    public void setTelefono(char Telefono) {
        this.Telefono = Telefono;
    }

    public char getDNI() {
        return DNI;
    }

    public char getNombre() {
        return Nombre;
    }

    public char getApellido1() {
        return Apellido1;
    }

    public char getApellido2() {
        return Apellido2;
    }

    public char getDomicilio() {
        return Domicilio;
    }

    public char getCiudad() {
        return Ciudad;
    }

    public char getProvincia() {
        return Provincia;
    }

    public char getCP() {
        return CP;
    }

    public char getEmail() {
        return Email;
    }

    public char getTelefono() {
        return Telefono;
    }
}
