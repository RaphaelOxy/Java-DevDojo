package academy.devDojo.MaratonaJava;

/*
Dado um determinado salário eu quero saber qual o valor que eu tenho que pagar.
 */

import java.util.Scanner;

public class aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioAnual = sc.nextDouble();
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68.507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);



    }


}
