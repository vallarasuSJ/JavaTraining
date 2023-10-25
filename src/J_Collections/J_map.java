package J_Collections;

import java.util.HashMap;
import java.util.Map;

public class J_map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"hi");
        map.put(3,"world");

        for(String n:map.values()){
            System.out.println(n);
        }

    }
}
