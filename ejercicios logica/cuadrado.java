import java.util.Scanner;
public class cuadrado {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for( int i = 1; i <= number; i++){
            for(int j= 1; j <= number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
