package academy.devDojo.src.javaCore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Idade: " + estudante.idade);

        System.out.println("----------");

    }
}
