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
        MyMap<String,String> myMap = new MyMap<>();
        myMap.put("Hello","World");
        myMap.put("iMiss","You");
        myMap.display();
        System.out.println(myMap.get("iMiss"));
        System.out.println(myMap.remove("Hello"));
        myMap.display();
    }
}