package OOPS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab018_Linklist {
    public static void main(String[] args) {

        List l =new LinkedList();

        l.add(1234);
        l.add("gfhg");
        System.out.println(l);

        Iterator iterator=l.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
