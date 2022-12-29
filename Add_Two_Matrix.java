public class Add_Two_Matrix {
    public static void main(String[] args) {
        int arr1[][]= {{1,2},{4,5}};//First I have created 2 two dimentional array
        int arr2[][]= {{3,6},{7,8}};//First I have created 2 two dimentional array
        int arr3[][] = new int [arr1.length][arr2.length];//And then anothon two dimentional array with size of first two array
        for (int i = 0; i < arr1.length; i++) {//This is the first loop
            for (int j = 0; j < arr2.length; j++) {//This is the second loop
                    arr3[i][j]=arr2[i][j]+arr1[i][j];//And then I have sum the elements and put them into the arr3[][]
                    System.out.print(arr3[i][j] + " ");//And then printed it
            }
            System.out.println();
        }
    }
}
