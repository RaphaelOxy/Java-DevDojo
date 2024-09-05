package academy.devDojo.src.javaCore.AintroducaoClasses.teste;

import academy.devDojo.src.javaCore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante= new Estudante();
        Estudante estudante2= new Estudante();
       //variáveis do tipo reference não precisa necessáriamente ser inicializada

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);

    }
}
