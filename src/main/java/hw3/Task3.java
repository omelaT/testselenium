package hw3;
/*
3. Write a program which finds minimal number from int array
 */
public class Task3 {
    public static void main(String[] args) {
        int[] ints = {0,2,40,6,8,10};

        int minVal = Integer.MAX_VALUE;

        for(int i=0; i < ints.length; i++){
            if(ints[i] < minVal){
                minVal = ints[i];
            }
        }

        System.out.println("minVal = " + minVal);

   }
}
