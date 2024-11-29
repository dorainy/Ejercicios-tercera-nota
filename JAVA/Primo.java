public class Primo {
    public static void main(String[] args) {
        // Recorre los números del 100 al 1
        for(int i = 100; i > 0; i--) {
            int suma = 0; // Reiniciar la cuenta de divisores para cada número

            // Verifica cuántos divisores tiene el número "i"
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    suma++; // Aumenta si el número "i" es divisible por "j"
                }
            }

            // Si el número tiene exactamente 2 divisores, es primo
            if(suma == 2) {
                System.out.println(i); // Imprime el número primo
            }
        }
    }
}

