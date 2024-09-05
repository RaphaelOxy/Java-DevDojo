package academy.devDojo.src.javaCore.BintroducaoMetodos.Teste;

import academy.devDojo.src.javaCore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    //É possível também trocar a sintaxe do psvm da mesma forma que o VarArgs
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        System.out.println("##########");

        //Do array para o VarArg, muda apenas a sintaxe, para passar vários elementos do mesmo tipo para um elemento

        calculadora.somaVarArgs(1,2,3,4,5,6,7 );
    }
}
