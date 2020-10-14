package hw3;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int array[] = {4,7,-30,40,1,0};
 for(int i= 0; i<array.length; i++){
     System.out.print(array[i]+ " ");
 }
        System.out.println();
 Arrays.sort(array);
        for(int i= 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }

    }
}
