public class Sort_Array {
    public static void main(String[] args) {
        int [] arr2 = {41,15,62,88,48,23,2,85};
        int temp;
        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr2[i]>arr2[j]){
                    temp = arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
            System.out.println(arr2[i]);
        }
    }
}
