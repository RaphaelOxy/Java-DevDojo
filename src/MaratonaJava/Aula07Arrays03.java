package academy.devDojo.src.MaratonaJava;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Alana";
        nomes[1] = "Raphael";
        nomes[2] = "Filó";
        nomes[3] = "Jubiscleison";

        //nomes.length - retorna automaticamente o tamanho do array
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // alterar o tamanho

        nomes = new String[2];
        nomes[0] = "Romeu";
        nomes[1] = "Julieta";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
