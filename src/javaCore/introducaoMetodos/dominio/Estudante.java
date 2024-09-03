package academy.devDojo.src.javaCore.introducaoMetodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;


    //Não inserir parâmetro, pois não é necessário, visto que o método está dentro do meu objeto e o mesmo
    //tem acesso a todos os atributos que está aqui dentro, neste caso, basta usar o "this".
    // ***Neste caso é possível realizar o comando também sem o uso do "this".
    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println("##########");

    }
}
