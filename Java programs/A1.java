import java.util.*;

public class A1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the number of elements in the array
    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    // Create an array of size n
    int[] arr = new int[n];

    // Prompt the user to enter each element of the array
    for (int i = 1; i < n; i++) {
      System.out.print("Enter element " + (i+1) + ": ");
      arr[i] = scanner.nextInt();
    }

    // Print the array
    System.out.print("The array is: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
