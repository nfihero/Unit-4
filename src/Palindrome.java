import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a word:");
        String word = input.nextLine();

        System.out.println("The word is a palindrome: " + isPalindrome(word) );


    }

    public static boolean isPalindrome(String text) {
        String word = reverse(text);
        if (text.equals(word)) {
            return true;
        } else return false;

    }
    public static String reverse(String rev) {
        String str = rev;
        char character;
        String fin = "";

        for (int i=0; i < str.length(); i++) {
            character = str.charAt(i);
            fin = character + fin;
        }
        return fin;
    }
}
