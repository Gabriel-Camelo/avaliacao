public class Questao5Lista2 {
    public static void main(String[] args) throws Exception {
        Random num = new Random();
        int[] arr = new int[100];
        
        for (int i = 0; i < 100; i++){
            arr[i] = num.nextInt(100);
        }
        System.out.println("Array gerado:");
        for (int z = 0; z < arr.length; z++){
            System.out.print(arr[z] + " ");
        }
        System.out.println();
        System.out.println("Elementos ímpares:");
        for (int j = 0; j < (arr.length); j++){
            if (arr[j] % 2 != 0){
                System.out.print(arr[j] + " ");
            }
        }
    }
}
