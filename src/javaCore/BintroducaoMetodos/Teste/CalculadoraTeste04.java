package academy.devDojo.src.javaCore.BintroducaoMetodos.Teste;

import academy.devDojo.src.javaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println("num1 " + a);
        System.out.println("num2 " + b);

    }
}
