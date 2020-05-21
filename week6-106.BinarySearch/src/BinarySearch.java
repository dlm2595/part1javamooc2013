public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        
        int previousmiddle = -1;
        int middle;
        while (beginning <= end) {
            
            middle = (beginning + end) / 2;
            if (middle == previousmiddle) break;
            
            
            if (array[middle] == searchedValue) {
                return true;
            }
            
            // restrict the search area 
            if (array[middle] < searchedValue) {
                beginning = middle + 1;
            } else if (array[middle] > searchedValue) {
                end = middle;
            }
            
            previousmiddle = middle;
        }
        return false;
    }
}
