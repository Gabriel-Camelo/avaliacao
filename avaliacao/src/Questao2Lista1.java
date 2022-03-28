import java.util.Scanner;

public class Questao2Lista1 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);

        float peso = 0f;
        float altura = 0f;

        System.out.println("Insira o peso:");
        peso = _input.nextFloat();

        System.out.println("Insira a altura:");
        altura = _input.nextFloat();

        float resultado = peso / (altura * altura);

        System.out.println("O seu IMC é de "+resultado);

        _input.close();
    }
}