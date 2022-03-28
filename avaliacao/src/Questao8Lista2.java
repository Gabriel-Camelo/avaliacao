public class Questao8Lista2 {
    public static void main(String[] args) throws Exception {
        SRandom num = new Random();
        int[] arr = new int[100];
        int som = 0;
        
        for (int i = 0; i < 100; i++){
            arr[i] = num.nextInt(100);
            som = som + arr[i];
        }
        System.out.println("Array gerado:");
        for (int z = 0; z < arr.length; z++){
            System.out.print(arr[z] + " ");
        }
        System.out.println("Media aritimetica: " + (som / 100));
    }
}
