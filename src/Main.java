
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import javax.swing.plaf.synth.SynthTextAreaUI;
import com.example.Calculadora;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o numero:");
        int num1 = scanner.nextInt();
        System.out.print("digite o numero:");
        int num2= scanner.nextInt();
        System.out.printf("Numeros: %d  numero2: %d", num1, num2);
        Calculadora calculadora = new Calculadora();
        System.out.printf("\nsoma: %d", calculadora.somar(num1, num2));
        System.out.printf("\nsoma: %d", calculadora.expoente(4, 3));


    }
}