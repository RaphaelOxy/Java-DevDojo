package academy.devDojo.src.javaCore.BintroducaoMetodos.Teste;

import academy.devDojo.src.javaCore.BintroducaoMetodos.dominio.Calculadora;

public class calculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração");
    }
}
