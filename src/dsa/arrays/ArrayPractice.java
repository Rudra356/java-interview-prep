package dsa.arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = {2, 120, 4, 1, 6, 5, 10, -9, 250};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sumOfAll = 0;
        int oddCount = 0;
        int evenCount = 0;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Length: " + arr.length);

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            // Q1: Find maximum
            max = Math.max(max, current);

            // Q2: Find minimum
            min = Math.min(min, current);

            // Q3: Find sum
            sumOfAll += current;

            // Q5: Count even and odd
            if (current % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Q6: Find largest and second largest
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // Q4: Find average
        double avgOfAll = (double) sumOfAll / arr.length;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Sum: " + sumOfAll);
        System.out.println("Average: " + avgOfAll);
        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);
        System.out.println("Largest: " + largest);
        System.out.println("Second largest: " + secondLargest);
    }
}