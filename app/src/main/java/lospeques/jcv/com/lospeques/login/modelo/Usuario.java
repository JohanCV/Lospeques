package lospeques.jcv.com.lospeques.login.modelo;

public class Usuario {
    String nombre;
    String apellido;
    String email;
    String dni;
    String celular;
    String direccion;

    public Usuario(String nombre, String apellido, String email, String dni, String celular, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
