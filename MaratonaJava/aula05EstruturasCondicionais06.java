package academy.devDojo.MaratonaJava;

import java.util.Scanner;

/*
Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
Considerando 1 como domingo
 */
public class aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        /*
        switch (day) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        */

        switch (day){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Inválido");
                break;
        }


    }
}
