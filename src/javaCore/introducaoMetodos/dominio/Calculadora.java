package academy.devDojo.src.javaCore.introducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {

        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {

        System.out.println(21-2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){

        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

        public double divideDoisNumeros2(double num1, double num2){
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }
    public void imprimeDivisaoDoisNumeros02(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
        }else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + numero1);
        System.out.println("num2 " + numero2);


    }
    //Aula 52
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //No VarArgs, em caso de mais de 1 atributo, o que será o array/VarArgs, deverá ser o último
    public void somaVarArgs (double valor, int...numeros){
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
