public class Questao7Lista2 {
    public static void main(String[] args) throws Exception {
        Random num = new Random();
        int[] arr = new int[100];
        int menor = 200;
        int maior = 0;
        
        for (int i = 0; i < 100; i++){
            arr[i] = num.nextInt(100);
            if (arr[i] < menor){
                menor = arr[i];
            }
            if (arr[i] > maior){
                maior = arr[i];
            }
        }
        System.out.println("Array gerado:");
        for (int z = 0; z < arr.length; z++){
            System.out.print(arr[z] + " ");
        }
        System.out.println();
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);        
    }
}
