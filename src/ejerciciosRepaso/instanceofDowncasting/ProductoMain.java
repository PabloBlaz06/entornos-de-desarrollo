package ejerciciosRepaso.instanceofDowncasting;

public class ProductoMain {
    public static void main(String[] args) {
        Producto [] inventario ={
                new Producto("Teclado", 20),
                new ProductoDescontado("Ratón", 10, 0.2),
        };
        double total = calcularValorTotal(inventario);
        System.out.println("Total: " + total);
    }

    private static double calcularValorTotal(Producto[] inventario) {
        double total = 0;
        for (Producto p : inventario) {
            if(p instanceof ProductoDescontado){
                ProductoDescontado pd = (ProductoDescontado) p;
                total += pd.getPrecio() * (1 - pd.getDescuento());
            }else{
                total += p.getPrecio();
            }
        }
        return total;
    }
}
