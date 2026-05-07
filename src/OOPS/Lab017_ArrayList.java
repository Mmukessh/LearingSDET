package OOPS;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Lab017_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList=new ArrayList();
        arrayList.add("mukesh");
        arrayList.add("Dhage");
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l=new ArrayList();
        l.add("1");
        l.add("2");
        l.add(3);

        System.out.println(l);

        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));
        }
    }
}
