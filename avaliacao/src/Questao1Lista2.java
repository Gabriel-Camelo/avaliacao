import java.util.Scanner;

public class Questao1Lista2 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);
        Double[] notas = new Double[5];
        int len = notas.length;
        for (int a = 0; a < len; a++){
            System.out.println("Insira a " + (a+1) + " nota:");
            notas[a] = _input.nextDouble();
        }
        _input.close();
        Double media = 0.0;
        for (int i = 0; i < len; i++){
            media = media + notas[i];
        }
        media = media / len;
        System.out.println("A media das notas informadas é: "+media);
    }
}
