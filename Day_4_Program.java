import java.util.Scanner;

public class Day_4_Program {
    public static int sumDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumDigits(number / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();  

        int result = sumDigits(number);  
        System.out.println("The sum of digits of " + number + " is: " + result);
        
        scanner.close();  
    }
}
