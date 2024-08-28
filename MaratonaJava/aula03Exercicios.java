package academy.devDojo.MaratonaJava;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salário de <salario>, a data <data>
 */
public class aula03Exercicios {
    public static void main(String[] args) {

        String name = "Raphael";
        String adress = "Minas";
        double remuneration = 9569.33;
        int day = 5;
        int month = 10;
        int year = 2025;
        String text = "Eu "+name+", morando no endereço "+adress+", confirmo que recebi o salario de " + remuneration+ ", na data " +day+"/"+month+"/"+year;

        System.out.println(text);
    }
}
