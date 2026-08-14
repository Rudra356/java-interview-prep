package collections.arraylist;

import java.util.ArrayList;

public class ArrayListPractice3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(41);
        list2.add(50);

        FindSecondLargest(list);
        FindSecondSmallest(list);
        RemoveDuplicates(list);
        CheckEqual(list, list2);
        PrintDuplicates(list);
    }

    //Check Equal
    static void CheckEqual(ArrayList<Integer> list, ArrayList<Integer> list2) {
        if (list.size() != list2.size()) {
            System.out.println("False");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != list2.get(i)) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }

    // Remove Duplicate
    static void RemoveDuplicates(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        list.forEach(System.out::println);
    }

    // Find second smallest
    static void FindSecondSmallest(ArrayList<Integer> list) {

        int min = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);

            if (current < min) {
                secondSmallest = min;
                min = current;

            } else if (current > min && current < secondSmallest) {
                secondSmallest = current;
            }
        }

        System.out.println("Smallest: " + min);
        System.out.println("Second smallest: " + secondSmallest);
    }

    //FInd second largest
    static void FindSecondLargest(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (current > max) {
                secondLargest = max;
                max = current;
            } else if (current > secondLargest && current < max) {
                secondLargest = current;
            }
        }
        System.out.println(secondLargest);
        System.out.println(max);
    }

    //Print Duplicates
    static void PrintDuplicates(ArrayList<Integer> list) {

    }
}
