package academy.devDojo.MaratonaJava;
import java.util.Scanner;

//idade < 15 categoria infantil
//idade >= 15 && idade <18 categoria juvenil
//idade >= 18 categoria adulto


public class aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if (age < 15 ) {
        System.out.println("Categoria infantil");
    } else if (age >= 15 && age < 18) {
        System.out.println("Categoria juvenil");
    }else {
        System.out.println("Categoria adulto");
        }
    }
}
