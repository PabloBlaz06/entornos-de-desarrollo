package ejerciciosRepaso.catalogo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EscrituraPrintWriter {
  //  String.format("%-20s %-10.2f€ %-10d", "Nombre", 5.2, 4);
  static void main(String[] args) {
      Producto[] productos = new Producto[2];
      productos[0] = new Producto("Teclado mecánico", 89.99, 15);
      productos[1] = new Producto("Ratón inalámbrico", 34.50, 8);

      Producto[] catalogo = {
              new Producto("Teclado mecánico", 89.99, 15),
              new Producto("Ratón inalámbrico", 34.50, 8)
      };

      String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

      double totalInventario = 0;

      for(Producto producto : productos) {
          totalInventario  += producto.getPrecio() * producto.getStock();
      }

      try(PrintWriter pw = new PrintWriter(new FileWriter("catalogo.txt"))){
          pw.println("================================================");
          pw.println("CATALOGO DE PRODUCTOS");
          pw.println("Fecha: " + fecha);
          pw.println("================================================");

          pw.println(String.format("%-20s %-12s %-10s", "Nombre", "Precio", "Stock"));
          pw.println("-------------------------------------------------");

          for (Producto producto : productos) {
              pw.println(String.format("%-20s %-11.2f€ %-10d", producto.getNombre(), producto.getPrecio(), producto.getStock()));
          }

          pw.println("-------------------------------------------------");
          pw.println("Total productos: " +  productos.length);
          pw.println(String.format("Valor total inventario: %.2f€", totalInventario));
          pw.println("================================================");

          System.out.println("Catalogo creado");
      } catch (IOException e) {
          System.err.println("Error al escribir el archivo");
      }

  }
}
