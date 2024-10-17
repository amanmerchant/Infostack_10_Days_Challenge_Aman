import java.util.Scanner;

public class Day_3_Palindrome {
    public static boolean isPalindrome(String str) {
        String clear = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) { 
                clear += Character.toLowerCase(ch);
            }
        }

        int start = 0;
        int end = clear.length() - 1;

        while (start < end) {
            if (clear.charAt(start) != clear.charAt(end)) {
                return false; 
            }
            start++;
            end--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t\t\t Java Program...\n");
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("False(Not Palindrome)");
        }

        scanner.close();
    }
}
