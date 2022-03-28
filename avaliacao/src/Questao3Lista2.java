import java.util.Random;

public class Questao3Lista2 {
    public static void main(String[] args) throws Exception {
        Random num = new Random();
        int[] arrInt = new int[100];
        for (int i = 0; i < (arrInt.length); i++){
            arrInt[i] = num.nextInt(100);
        }
        int ci = (arrInt.length)-1;
        System.out.println("Array gerado:");
        for (int a = 0; a < (arrInt.length); a++){
            System.out.print(arrInt[a] + " ");
        }
        System.out.println("");
        System.out.println("Retorno inverso:");
        for (int a = 0; a < (arrInt.length); a++){
            System.out.print(arrInt[ci] + " ");
            ci = ci - 1;
        }
    }
}
