package Tema3.Persona;

public class persona {

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public persona(String nombre) {
        this.nombre = nombre;
        generaDNI();
    }

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);

        if (imc < 20) {
            return -1;
        } else if (imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private char comprobarSexo(char sexo) {
        if (sexo != 'M' || sexo != 'H') {
            return 'H';
        } else {
            return sexo;
        }
    }

    public String toString() {
        return nombre + edad + dni + sexo + peso + altura;
    }

    public void generaDNI() {
        int numeroDNI = (int) (Math.random() * 100000000);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = letras.charAt(numeroDNI % 23);

        this.dni = numeroDNI + "" + letra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
