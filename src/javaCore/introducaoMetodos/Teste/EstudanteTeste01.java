package academy.devDojo.src.javaCore.introducaoMetodos.Teste;

import academy.devDojo.src.javaCore.introducaoMetodos.dominio.Estudante;
import academy.devDojo.src.javaCore.introducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Midorya";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);



    }
}
