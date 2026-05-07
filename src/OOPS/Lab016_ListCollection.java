package OOPS;

import java.util.List;

public class Lab016_ListCollection {
    public static void main(String[] args) {

        List fruit=List.of("Mango","Watermelon",123,"Watermelon");
        System.out.println(fruit);
       // fruit.add("123");  CRUD operation not allowed in List because List is interface and has incomplete method.
       // System.out.println(fruit);
    }
}
