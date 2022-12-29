public class Merge_Two_Array {
    public static void main(String[] args) {
        int [] arr2 = {41,15,62,88};//Created an array number 1
        int [] arr3 = {1,5,2,8};// Created an array number 2
        int [] arr4 = new int[arr2.length+arr3.length];// Created an array number 3
        for (int i = 0; i < arr2.length; i++) {//First I have done for loop to put all elements of arr2 to arr4
                    arr4[i]=arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {//Then I have done for loop to put all elements of arr3 to arr4 and increases the size
            arr4[arr2.length+i] = arr3[i];
        }

        System.out.println();
        for (int i = 0; i < arr4.length; i++) {//Then i have print the arr4 array
            System.out.println(arr4[i]);
        }
    }
}
