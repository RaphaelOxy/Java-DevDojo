package academy.devDojo.src.javaCore.introducaoMetodos.Teste;

import academy.devDojo.src.javaCore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String... args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Raphael";
        funcionario.idade = 29;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();

    }
}
