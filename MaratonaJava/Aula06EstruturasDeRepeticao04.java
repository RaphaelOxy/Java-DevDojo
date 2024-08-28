package academy.devDojo.MaratonaJava;

//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
//Condição é que valorParcela >= 1000

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
               break;
            }

            //if (valorParcela >=1000){
                System.out.printf("Parcela %d: R$ %.2f\n", parcela, valorParcela);
            //}else {


        }

    }
}
