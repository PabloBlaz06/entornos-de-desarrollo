package Tema7.practicaClase.pais;

public class Ciudad {
    private int id;
    private String nombre;
    private int poblacion;
    private int id_pais;

    public Ciudad(int id, String nombre, int poblacion, int id_pais) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.id_pais = id_pais;
    }

    public Ciudad() {
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

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
}
