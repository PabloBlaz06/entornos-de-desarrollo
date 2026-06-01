package ejerciciosRepaso.ejercicioEmpleados;

public class Gerente extends Empleado{
    private double bonoProyectos;

    public Gerente(String nombre, int id, double salarioBase, double bonoProyectos) {
        super(nombre, id, salarioBase);
        this.bonoProyectos = bonoProyectos;
    }

    @Override
    public double calcularSalario() {
        return salarioBase  + bonoProyectos;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonoProyectos=" + bonoProyectos +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", salarioBase=" + salarioBase +
                '}';
    }


}
