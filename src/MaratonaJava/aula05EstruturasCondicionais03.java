package academy.devDojo.MaratonaJava;

import java.util.Scanner;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        String mensagemDoar = "Eu vou doar $500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(resultado);

    }
}
