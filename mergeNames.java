// 2. Merge NamesJAVA  ARRAYS  PUBLIC  NEW
// Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.

// For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) should return an array containing Ava, Emma, Olivia, and Sophia in any order.


import java.util.*;

public class MergeNames {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	List<String> copy = new ArrayList<String>();
        
        for (String arrElement : names1) {
            if(!copy.contains(arrElement))
                copy.add(arrElement);
        }
        
        for (String arrElement : names2) {
            if(!copy.contains(arrElement))
                copy.add(arrElement);
        }
        String[] arr = copy.toArray(new String[copy.size()]);
        
        return arr;
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}