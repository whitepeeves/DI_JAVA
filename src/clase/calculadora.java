package clase;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {


        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Selecciona una opción:");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Sumar:");
                System.out.print("Numero1: ");
                int num1 = sc.nextInt();
                System.out.print("Numero2: ");
                int num2 = sc.nextInt();

                int resultado = num1 + num2;

                System.out.println("El resultado es "+ resultado);

                break;


            case 2:
                System.out.println("Restar:");
                System.out.print("Numero1: ");
                int num3 = sc.nextInt();
                System.out.print("Numero2: ");
                int num4 = sc.nextInt();

                int resultado2 = num3 - num4;

                System.out.println("El resultado es "+ resultado2);
            break;
            case 3:
                System.out.print("Multiplicar:");
                System.out.print("Numero1: ");
                
                int num5 = sc.nextInt();
                System.out.print("Numero2: ");
                int num6 = sc.nextInt();
                int resultado3 = num5 * num6;

                System.out.println("El resultado es "+ resultado3);
                break;

            case 4:
                System.out.println("Division:");
                System.out.print("Numero1: ");
                int num7 = sc.nextInt();
                System.out.print("Numero2: ");
                int num8 = sc.nextInt();
                int resultado4 = num7 / num8;

                System.out.println("El resultado es "+ resultado4);
                break;



            case 5:
                System.out.println("Saliste del programa");
                break;


        }


    }









}
