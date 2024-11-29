import java.util.Arrays;
import java.util.Scanner;
public class Anagrama {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("ingrese la primera palabra ");
       String palabra1 = scanner.nextLine();
       System.out.println("ingrese la segunda palabra ");
       String palabra2 = scanner.nextLine();

       palabra1 = palabra1.toLowerCase();
       palabra2 = palabra2.toLowerCase();
       
       System.out.println(palabra1);
       System.out.println(palabra2);

       char[] pala1 = palabra1.toCharArray();
       char[] pala2 = palabra2.toCharArray();
       Arrays.sort(pala1);
       Arrays.sort(pala2);

       boolean isAnagrama = Arrays.equals(pala1, pala2);

       System.out.println("Es un anagrama?: "+ isAnagrama);

    }
}
