package J_Collections;

import java.util.HashSet;

public class J_Set {
    //set- hashset (used to remove duplicates) , treeset

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        int one = 1;
        integers.add(2);
        integers.add(3);
        integers.add(one);
        System.out.println(integers);

        for (Integer i : integers) {
            System.out.println(i);

        }


    }
}
