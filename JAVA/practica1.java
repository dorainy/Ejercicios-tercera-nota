public class practica1 {
    public static void main(String[] args) {
        // Precios de productos
        double[] productPrice = {100, 200, 300};
        final int NUM_PRODUCT = 3;
       
        double[] tax = {0.15, 0.10, 0.05};
        double totalGeneral = 0;
        double[] totalProducts = new double[NUM_PRODUCT];
        for(int i=0; i<NUM_PRODUCT; i++){
            double totalTax = productPrice[i] * tax[i];
            totalProducts[i] = productPrice[i] + totalTax;
            totalGeneral += totalProducts[i];
        }
        for(int i=0; i< NUM_PRODUCT; i++ ){
            System.out.println("El total de el impuesto "+(i + 1) + " es " + totalProducts[i]);
            
        }
        System.out.println("El total general es " + totalGeneral);
     }
       
}

