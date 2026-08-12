package dsa.arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[] arr = {2, 120, 4, 1, 6, 5, 10, -9, 250};
        int[] arr2 = {1, 2, 3, 4, 5, 2, 7, 2, 9};
        int[] arr3 = new int[9];

        ArrayReverse(arr);
        IsSortedArray(arr2);
        LinearSearch(arr, -25);
        LinearSearch(arr2, 5);
        CopyArray(arr, arr3);
        printArray(arr3);
        ElementOccurrence(arr2,2);

    }

    //Element occurrence
    static void ElementOccurrence(int[] arr,int k) {
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
        System.out.println(count);
    }

    //Manual copy
    static void CopyArray(int[] arr, int[] arr2) {

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

    }

    //Linear search
    static void LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key at : " + arr[i]);
                return;
            }
        }
        System.out.println("Key not found");
    }

    //Checking sorted array
    static void IsSortedArray(int[] arr) {
        int current = Integer.MIN_VALUE;
        int prev = Integer.MIN_VALUE;
        if (arr[0] < arr[1]) {
            for (int i = 1; i < arr.length; i++) {
                current = arr[i];
                prev = arr[i - 1];
                if (!(current > prev)) {
                    System.out.println("NOT A SORTED ARRAY");
                    return;
                }
            }
        }
        if (arr[0] > arr[1]) {
            for (int i = 1; i < arr.length; i++) {
                current = arr[i];
                prev = arr[i - 1];
                if ((current > prev)) {
                    System.out.println("NOT A SORTED ARRAY");
                    return;
                }
            }
        }

        System.out.println("SORTED ARRAY");
    }

    //Array reverse
    static void ArrayReverse(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        printArray(arr);
    }

    //Print Array
    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
