public class Store {
    public static void main(String[] args) {
        int[] productos = {15, 10, 5};
        int[] precios = {2, 3, 4};
        
        
        int totalSales = 0;
        for(int i = 0; i <productos.length; i++){
            totalSales += productos[i] * precios[i];
        }

        System.out.println(totalSales);

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
