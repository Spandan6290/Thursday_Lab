public class Put_Element_Array {
    public static void main(String[] args) {
        int [] arr2 = {41,15,62,88};//Created an array
        int element = 23;//The element which I am going to put into the array
        int index = 2;// The index the number
        int [] arr3 = new int[arr2.length+1];//The new array
//        int length = arr2.length;
        for (int i = 0; i < arr3.length; i++) {//The for loop to take the arr2[]
            if(i<index-1){//And in this I am puting the elements into the arr3[]
                arr3[i]=arr2[i];
            }
            else if(i==index-1){//And in this I am putting the element into the index of arr3[]
                arr3[i]=element;
            }
            else {
                arr3[i]=arr2[i-1];
            }
            System.out.println(arr3[i]);
        }
    }
}
