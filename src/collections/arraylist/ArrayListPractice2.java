package collections.arraylist;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(41);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(3);
        list.sort(null);

        FindOccurrence(list, 30);
        FindFirstOccurrenceIndex(list, 30);
        RemoveOccurrences(list, 30);
        NewArrayList(list);
        System.out.println(list.get(list.size() - 2));
        System.out.println(list);
        ReverseArrayList(list);
    }

    //Reversing a arraylist
    static void ReverseArrayList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }

        System.out.println(list);
    }


    //New Arraylist with evens
    static void NewArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        System.out.println(newList);
    }

    //Remove Occurrences
    static void RemoveOccurrences(ArrayList<Integer> list, int k) {
        list.removeIf(e -> e.equals(k));
        list.forEach(System.out::println);
    }

    //Find first occurrence index of an element
    static void FindFirstOccurrenceIndex(ArrayList<Integer> list, int k) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == k) {
                System.out.println(i);
                return;
            }
        }
    }

    //Find Occurrence of an element
    static void FindOccurrence(ArrayList<Integer> list, Integer k) {
        int counter = 0;
        for (Integer i : list) {
            if (i.equals(k)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}