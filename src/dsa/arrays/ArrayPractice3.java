package dsa.arrays;

public class ArrayPractice3 {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 2, 4, 2, 5, 6, 3, 1, 0, 1};
        int[] arr2 = {6, 8, 9, 10, 11};

        FindDuplicate(arr);
        FirstOccurrence(arr);
        ZeroToEnd(arr);
        MissingNumber(arr2);
        CommonElements(arr, arr2);


    }

    //Common element
    static void CommonElements(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println("\n" + arr[i]);
                    break;
                }
            }
        }
    }

    //Missing number
    static void MissingNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 < arr[i + 1]) {
                int mid = (int) (arr[i] + arr[i + 1]) / 2;
                System.out.println();
                System.out.println(mid);
                return;
            }
        }
    }

    //Zero end
    static void ZeroToEnd(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != 0) {
                start++;
            } else if (arr[end] == 0) {
                end--;
            } else {
                temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;

                start++;
                end--;
            }


        }
        PrintArray(arr);
    }

    //First occurrence counter
    static void FirstOccurrence(int[] arr) {
        int current;
        for (int i = 0; i < arr.length; i++) {
            current = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (current == arr[j]) {
                    System.out.println(current);
                    return;
                }
            }
        }
    }

    //Multi-occurrence counter
    static void FindDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int counter = 1;
            boolean found = false;
            int current = arr[i];

            for (int k = 0; k < i; k++) {
                if (arr[k] == current) {
                    found = true;
                }
            }

            if (found) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {
                if (current == arr[j]) {
                    counter++;
                }
            }
            if (counter > 1) {
                System.out.println("e -> " + current + " occured -> " + counter);
            }
        }
    }

    //Print array func
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
