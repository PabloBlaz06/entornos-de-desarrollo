package ejerciciosRepaso.jdbcPreparedStatement;

public class Alumno {
    private int id;
    private String nombre;
    private String curso;
    private double nota;

    public Alumno(int id, String nombre, String curso, double nota) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    public Alumno(String nombre, String curso, double nota) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
