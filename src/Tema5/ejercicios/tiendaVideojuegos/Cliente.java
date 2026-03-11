package Tema5.ejercicios.tiendaVideojuegos;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String direccion;
    private String email;
    private int codCliente;

    public Cliente(String nombre, String apellidos, String direccion, String email, int codCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
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
