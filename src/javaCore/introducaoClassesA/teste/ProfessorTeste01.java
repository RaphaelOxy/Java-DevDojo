package academy.devDojo.src.javaCore.introducaoClassesA.teste;

import academy.devDojo.src.javaCore.introducaoClassesA.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Raphael";
        professor.idade = 29;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
