import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
    }
    
    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) copy[i] = array[i];
        return copy;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) copy[array.length-1-i] = array[i];
        return copy;
    }
    
}
