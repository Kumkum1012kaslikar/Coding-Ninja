package LinkedList;

import java.util.ArrayList;

public class LL11 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 80);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
    }
}
