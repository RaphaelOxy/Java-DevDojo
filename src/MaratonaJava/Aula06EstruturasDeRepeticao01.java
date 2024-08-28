package academy.devDojo.MaratonaJava;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        Scanner sc = new Scanner(System.in);

        int count = 20;
         //int count = sc.nextInt();
         //while(count <= count + 10){
        while (count < 10){
            System.out.println(++count);
            //count = count + 1;
        }

        do {
            System.out.println("dentro do do-while");
        } while (count<10 );

        for (count = 0; count < 10; count++) {
            System.out.println("For "+count);
        }
        
    }
}
