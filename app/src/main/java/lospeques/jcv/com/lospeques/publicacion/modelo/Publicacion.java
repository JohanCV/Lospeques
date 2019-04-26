package lospeques.jcv.com.lospeques.publicacion.modelo;

import java.util.Date;
import java.util.Timer;
import java.util.zip.DataFormatException;

public class Publicacion {
    int foto;
    String nombre;
    String fecha;
    String hora;
    String mensaje;

    public Publicacion(int foto, String nombre, String fecha, String hora, String mensaje) {
        this.foto = foto;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.mensaje = mensaje;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
