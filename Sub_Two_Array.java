public class Sub_Two_Array {
    public static void main(String[] args) {
        int arr1[][]= {{1,2},{4,5}};
        int arr2[][]= {{3,6},{7,8}};
        int arr3[][] = new int [arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j]=arr2[i][j]-arr1[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
