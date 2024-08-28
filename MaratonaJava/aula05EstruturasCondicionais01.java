package academy.devDojo.MaratonaJava;

import java.util.Scanner;

public class aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual a sua idade?");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não está autorizado");
        }

    }

}
