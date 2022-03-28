import java.util.Scanner;

public class Questao4Lista1 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Insira um número inteiro:");
        num1 = _input.nextInt();
        System.out.println("Insira mais um número inteiro:");
        num2 = _input.nextInt();
        _input.close();

        if (num1 < num2){
            System.out.println("O maior número é: "+num2);
        }else{
            if (num2 < num1){
                System.out.println("O maior número é: "+num1);
            }else{
                System.out.println("Os números são iguais!");
            }
        }
    }
}
