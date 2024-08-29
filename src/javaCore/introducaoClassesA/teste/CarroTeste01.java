package academy.devDojo.src.javaCore.introducaoClassesA.teste;

import academy.devDojo.src.javaCore.introducaoClassesA.dominio.Carro;

public class CarroTeste01 {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.Nome = "Pulse";
        carro1.ano = 2024;
        carro1.Modelo = "TR4";

        carro2.Nome = "Mustang";
        carro2.ano = 1967;
        carro2.Modelo = "GT500";

        //Só é possível realizar com objetos do mesmo tipo*
        carro3 = carro1;
        carro1 = carro2;


        System.out.println("\nNome do carro: " + carro1.Nome + "\nAno: " + carro1.ano + "\nModelo: " + carro1.Modelo);
        System.out.println("--------------------------");
        System.out.println("Nome do carro: " + carro2.Nome + "\nAno: " + carro2.ano + "\nModelo: " + carro2.Modelo);
        System.out.println("--------------------------");
        System.out.println("Nome do carro: " + carro3.Nome + "\nAno: " + carro3.ano + "\nModelo: " + carro3.Modelo);

    }
}
