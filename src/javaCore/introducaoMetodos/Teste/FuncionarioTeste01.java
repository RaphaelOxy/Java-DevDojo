package academy.devDojo.src.javaCore.introducaoMetodos.Teste;

import academy.devDojo.src.javaCore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String... args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Raphael");
        funcionario.setIdade(29);
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});

        funcionario.imprime();
        System.out.println("Média " + funcionario.getMedia());
    }
}
