
package Framework;

import java.util.*;

public class Hashmap{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 10);
        map.put(1,20);
        map.put(2,30);

        System.out.println(map.get(0));
        map.remove(0);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(30));
        
    }
}