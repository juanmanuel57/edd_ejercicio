import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 suma | 2 resta | 3 multiplicación | 4 potencia");
        int op = sc.nextInt();
        System.out.print("Primer número (-99999..99999): ");
        int a = sc.nextInt();
        System.out.print("Segundo número (-99999..99999): ");
        int b = sc.nextInt();
        if (a < -99999 || a > 99999 || b < -99999 || b > 99999) {
            System.out.println("Número fuera de rango");
            return;
        }
        switch (op) {
            case 1: System.out.println(a + b); break;
            case 2: System.out.println(a - b); break;
            case 3: System.out.println((long) a * b); break;
            case 4: System.out.println(Math.pow(a, b)); break;
            default: System.out.println("Opción no válida");
        }
    }
}