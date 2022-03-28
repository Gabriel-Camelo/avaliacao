import java.util.Scanner;

public class Questao2Lista2 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Insira o " + (i+1) + " número inteiro:");
            nums[i] = _input.nextInt();
        }
        _input.close();
        System.out.println("Entrada inversa:");
        int ci = 9;
        for (int a = 0; a < (nums.length); a++){
            System.out.println(nums[ci]);
            ci = ci - 1;
        }
    }
}
