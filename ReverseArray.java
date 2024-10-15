import java.util.Scanner;
public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int First = 0;
        int Last = arr.length - 1;

        while (First < Last) {
            int temp = arr[First];
            arr[First] = arr[Last];
            arr[Last] = temp;

            First++;
            Last--;
        }
    }

    /**
      @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        reverseArray(numbers);

        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
