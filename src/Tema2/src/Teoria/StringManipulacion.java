package Tema2.src.Teoria;

public class StringManipulacion {
    public static void main(String[] args) {

        String texto = "java es facil";
        System.out.println(texto.toUpperCase());
        System.out.println(texto.replace("facil", "poderoso"));
        System.out.println(texto.substring(0, 4));
        String invertida = new StringBuilder(texto).reverse().toString();
    }
}
