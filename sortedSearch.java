11. Sorted SearchJAVA  ALGORITHMIC THINKING  SEARCHING  PUBLIC
Implement function countNumbers that accepts a sorted array of unique integers and, efficiently with respect to time used, counts the number of array elements that are less than the parameter lessThan.

For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.

import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        if (sortedArray == null || sortedArray.length == 0)
            return -1;
        
       
        int[] d = Arrays.stream(sortedArray).filter(x -> x < lessThan).toArray();
        return d.length;
    }
    
    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }
}