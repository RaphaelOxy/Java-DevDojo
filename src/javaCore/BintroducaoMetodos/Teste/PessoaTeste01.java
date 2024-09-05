package academy.devDojo.src.javaCore.BintroducaoMetodos.Teste;

import academy.devDojo.src.javaCore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Raphael");
        pessoa.setIdade(36);

        pessoa.imprime();
        System.out.println("############");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }



}
