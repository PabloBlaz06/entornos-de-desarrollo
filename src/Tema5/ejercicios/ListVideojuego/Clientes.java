package Tema5.ejercicios.ListVideojuego;

public class Clientes {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private int codCliente;

    public Clientes(String nombre, String apellidos, String direccion, String email, int codCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", codCliente=" + codCliente +
                '}';
    }
}
