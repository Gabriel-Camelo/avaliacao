import java.util.Scanner;

public class Questao5Lista1 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);
        int num_div;
        System.out.println("Insira um número inteiro");
        num_div = _input.nextInt();
        _input.close();
        if (num_div != 0){
            if ((num_div % 2) != 0){
                System.out.println("O número é impar!");
            }else{
                System.out.println("O número é par!");
            }
        }else{
            System.out.println("O número informado foi 0!");
        }
    }
}
