package OOPS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab019_NestedArraylist {
    public static void main(String[] args) {

        List l1=new ArrayList();
        l1.add("ghj");
        l1.add("fghj");

        List<Integer> l2=new ArrayList();
        l2.add(456);
        l2.add(8765);

        List all =new ArrayList();
        all.add(l1);
        all.add(l2);

        Iterator iterator=all.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next());
        }

        System.out.println(all.get(0));

    }
}
