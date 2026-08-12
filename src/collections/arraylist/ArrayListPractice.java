package collections.arraylist;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        double avg = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int oddCount = 0, evenCount = 0;

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(41);
        list.add(20);
        list.add(60);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(3));

        //list.remove(2);
        //list.add(2, 100);
        list.set(2, 100);
        list.forEach(System.out::println);
        list.removeIf(e -> e.equals(40));
        list.remove(4);
        System.out.println(list.contains(60));
        System.out.println(list.size());

        for (Integer i : list) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Predicate<Integer> predicate = e-> e%2==0;
        for (Integer i : list) {
            max = Math.max(i, max);
            min = Math.min(i, min);

            if(predicate.test(i)){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        avg = (double) sum / list.size();
        System.out.println("\n" + max);
        System.out.println("\n" + min);
        System.out.println("\n" + avg);
        System.out.println("\n" + oddCount);
        System.out.println("\n" + evenCount);
    }
}
