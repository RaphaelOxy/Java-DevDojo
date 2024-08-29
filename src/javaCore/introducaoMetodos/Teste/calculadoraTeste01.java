package academy.devDojo.src.javaCore.introducaoMetodos.Teste;

import academy.devDojo.src.javaCore.introducaoMetodos.dominio.Calculadora;

public class calculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando soma");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando subtração");
    }
}
