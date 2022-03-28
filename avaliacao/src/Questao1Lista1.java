import java.util.Scanner;

public class Questao1Lista1 {
    public static void main(String[] args) throws Exception {
        Scanner _input = new Scanner(System.in);

        int _int = 0;
        long _long = 0l;
        float _float = 0f;

        System.out.println("Insira um número do tipo int:");
        _int = _input.nextInt();

        System.out.println("Insira um número do tipo long:");
        _long = _input.nextLong();

        System.out.println("Insira um número do tipo float:");
        _float = _input.nextFloat();

        System.out.println("O número INT digitado foi "+_int);
        System.out.println("O número LONG digitado foi "+_long);
        System.out.println("O número FLOAT digitado foi "+_float);

        _input.close();
    }
}
