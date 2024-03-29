import Arithmetic.*;
import Map.*;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer,Double> e = new Arithmetic<>(400,32.43);
        e.display();
        System.out.println(e.add());
        System.out.println(e.subtract());
        System.out.println(e.multiply());
        System.out.println(e.divide());
        System.out.println(e.getMin());
        System.out.println(e.getMax());

//        Map
        Map<String,String> map = new Map<String, String>();
        map.put("Hello","World");
        map.put("iMiss","You");
        map.display();
        System.out.println(map.get("iMiss"));
        System.out.println(map.remove("Hello"));
        map.display();
    }
}