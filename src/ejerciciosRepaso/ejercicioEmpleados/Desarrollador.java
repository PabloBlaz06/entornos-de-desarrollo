package ejerciciosRepaso.ejercicioEmpleados;

public class Desarrollador extends Empleado{
    private String lenguajePrincipal;

    public Desarrollador(String nombre, int id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.1);
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "lenguajePrincipal='" + lenguajePrincipal + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
