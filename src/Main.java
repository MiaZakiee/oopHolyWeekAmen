import Arithmetic.*;
import Map.*;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Integer,Float> e = new Arithmetic<>(400,32F);
        e.display();
        System.out.println();
        e.add();
        e.subtract();
        e.multiply();
        e.divide();
        e.getMin();
        e.getMax();

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