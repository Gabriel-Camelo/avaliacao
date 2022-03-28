import java.util.Scanner;

public class Questao3Lista1 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);
        int base_M, base_m, alt, area;
        System.out.println("Insira a medida da base maior (em cm): ");
        base_M = _input.nextInt();
        System.out.println("Insira a medida da base menor (em cm): ");
        base_m = _input.nextInt();
        System.out.println("Insira a altura do trapézio (em cm): ");
        alt = _input.nextInt();
        if (base_M != base_m){
        area = (((base_M + base_m) * alt) / 2);
        System.out.println("A área do trapézio, em cm2, é de: "+area);
        }else{
            System.out.println("As medidas da base maior e base menor não podem ser iguais!");
        }
        _input.close();
    }
}
