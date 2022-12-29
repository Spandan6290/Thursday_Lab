public class Duplicate_Number_Array {
    public static void main(String[] args) {
        int [] arr5 = {41,15,2,88,41,23,2,88};
        int duplicate = 0;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr5[i]==arr5[j]){
                    duplicate++;
                }
            }
        }
        System.out.println("Number of duplicate numbers are in the array: "+duplicate);
    }
}
