public class Ejercicios{
    
    public static void main(String[] args) {
        // en un for se recorren los numeros, con el modulo se miran si son multiplos
        for(int i = 1; i <= 100; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " " + "Fizzbuzz");
            } else if (i % 5 == 0){
                System.out.println(i + " " + "buzz");
               } else if ( i % 3 == 0 ) {
                System.out.println(i + " " + "fizz");
               }else{
                System.out.println(i);
               }

               
            }
        }
    }
