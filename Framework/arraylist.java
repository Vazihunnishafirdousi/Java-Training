package Framework;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        //non primitive data type
        ArrayList<Integer> list= new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(10);
        System.out.println(list);
        System.out.println(list.get(1));

        list.set(1, 4);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(4));
        
    }
    
}