import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("smallest: " + smallest(values));
        
        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        
        int[] value = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(value, 1));
        System.out.println(indexOfTheSmallestStartingFrom(value, 2));
        System.out.println(indexOfTheSmallestStartingFrom(value, 4));
        
        System.out.println( Arrays.toString(values) );

        swap(values, 1, 0);
        System.out.println( Arrays.toString(values) );

        swap(values, 0, 3);
        System.out.println( Arrays.toString(values) );
        
        int[] values2 = {8, 3, 7, 9, 1, 2, 4};
        sort(values2);
 
    }
    
    public static int smallest(int[] array) {
        int smallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == 0 && i == 0) smallest = array[i];
            smallest = Math.min(smallest, array[i]);
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int smallestIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if (smallest(array) == array[i]) {
                smallestIndex = i;
                break;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int toreturn = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] == smallest(Arrays.copyOfRange(array, index, array.length))) {
                toreturn = i;
                break;
            }
        }
        return toreturn;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int value1 = array[index1];
        int value2 = array[index2];
        array[index1] = value2;
        array[index2] = value1;
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

}
