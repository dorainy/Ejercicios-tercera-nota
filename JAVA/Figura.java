import java.util.Scanner;
public class Figura {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("ingrese el poligono del cual desea calcular el area: ");
        System.out.println("1. Triangulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Cuadrado");
        int figura = scanner.nextInt();
        switch (figura) {
            case 1:
                System.out.println("Ingrese el valor de la base: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura = scanner.nextDouble();
                double area1 = (base *altura) / 2;
                System.out.println("El area de el triangulo es de: " + area1);

                break;
            case 2: 
                System.out.println("Ingrese el valor de la base: ");
                double base2 = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura: ");
                double altura2 = scanner.nextDouble();
                double area2 = (base2 *altura2);
                System.out.println("El area de el rectangulo es de: " + area2);

            case 3:
                System.out.println("Ingrese el valor de el lado : ");
                double lado = scanner.nextDouble();
                double area3 = lado * lado;
                System.out.println("El area de el cuadrado es de: " + area3);
            default:
                System.out.println("No es valido ");
                break;
        }
    }
}
