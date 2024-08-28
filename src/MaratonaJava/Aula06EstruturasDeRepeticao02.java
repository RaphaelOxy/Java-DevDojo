package academy.devDojo.MaratonaJava;

// Imprimir todos os números pares de 0 até 1000000

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {


        for (int number = 0; number <= 1000000; number++) {

            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

    }
}
