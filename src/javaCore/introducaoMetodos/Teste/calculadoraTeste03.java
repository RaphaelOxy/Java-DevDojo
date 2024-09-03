package academy.devDojo.src.javaCore.introducaoMetodos.Teste;

import academy.devDojo.src.javaCore.introducaoMetodos.dominio.Calculadora;

public class calculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);
        double result2 = calculadora.divideDoisNumeros2(20, 0);
        System.out.println(result2);
        System.out.println("----------------");
        calculadora.imprimeDivisaoDoisNumeros02(20,0);
    }
}
