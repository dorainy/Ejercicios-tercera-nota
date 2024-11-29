public class solucion1 {
    public static void main(String[] args) {
        // Precios de productos
        double productPrice1 = 100;
        double productPrice2 = 200;
        double productPrice3 = 300;

        // Impuestos para cada producto
        double tax1 = productPrice1 * 0.15;
        double tax2 = productPrice2 * 0.10;
        double tax3 = productPrice3 * 0.05;

        // Precio total de cada producto con impuestos
        double totalProduct1 = productPrice1 + tax1;
        double totalProduct2 = productPrice2 + tax2;
        double totalProduct3 = productPrice3 + tax3;

        // Calcular total general
        double grandTotal = totalProduct1 + totalProduct2 + totalProduct3;

        // Mostrar el total
        System.out.println("Total price for product 1: " + totalProduct1);
        System.out.println("Total price for product 2: " + totalProduct2);
        System.out.println("Total price for product 3: " + totalProduct3);
        System.out.println("Grand total: " + grandTotal);
    }
}