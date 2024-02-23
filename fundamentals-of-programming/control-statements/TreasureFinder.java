import java.util.Scanner;

public class TreasureFinder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int box1 = sc.nextInt();
    int box2 = sc.nextInt();
    int box3 = sc.nextInt();
    // Find the second largest number
    int largest = Math.max(box1, Math.max(box2, box3));
    int secondLargest;
    if (largest == box1) {
      secondLargest = Math.max(box2, box3);
    } else if (largest == box2) {
      secondLargest = Math.max(box1, box3);
    } else {
      secondLargest = Math.max(box1, box2);
    }
    // Find the largest number that divides all three numbers
    int code = 1;
    for (int i = 2; i <= secondLargest; i++) {
      if (box1 % i == 0 && box2 % i == 0 && box3 % i == 0) {
        code = i;
      }
    }
    // Determine the box with the treasure and print the result
    if (secondLargest == box1) {
      System.out.println("The treasure is in the box which has the number " + box1);
    } else if (secondLargest == box2) {
      System.out.println("The treasure is in the box which has the number " + box2);
    } else {
      System.out.println("The treasure is in the box which has the number " + box3);
    }
    System.out.println("The code to open the box is " + code);
    sc.close();
  }
}