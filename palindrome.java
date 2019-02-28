// 3. PalindromeJAVA  STRINGS  PUBLIC
// A palindrome is a word that reads the same backward or forward.

// Write a function that checks if a given word is a palindrome. Character case should be ignored.

// For example, isPalindrome("Deleveled") should return true as character case should be ignored, resulting in "deleveled", which is a palindrome since it reads the same backward and forward.


// Result 

import java.lang.StringBuilder;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        return word.toLowerCase().equals(new StringBuilder(word).reverse().toString().toLowerCase());
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}