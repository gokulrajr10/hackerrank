import java.util.Scanner;

public class OnlineGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the list
        int num = sc.nextInt();
        int[] arr = new int[num];

        // Read the values of the list
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Arrange odd numbers after even numbers
        int left = 0;
        int right = num - 1;

        while (left < right) {
            // Move left pointer until it points to an odd number
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            
            // Move right pointer until it points to an even number
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            
            // Swap arr[left] and arr[right] if left points to an odd number and right points to an even number
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the arranged list
        System.out.println("Array after Segregation");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
