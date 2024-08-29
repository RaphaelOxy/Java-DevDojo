package academy.devDojo.src.javaCore.introducaoClassesA.teste;

import academy.devDojo.src.javaCore.introducaoClassesA.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        //Sempre para criar objetos é necessário utilizar "new" seguido do nome do objeto que eu quero utilizar.
        Estudante estudante = new Estudante();
        estudante.nome = "Alana";
        //estudante.idade = 22;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
