package OOPS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab021_Set {
    public static void main(String[] args) {

        Set hashSets=new HashSet();
        hashSets.add("Mukesh");
        hashSets.add("Dhage");

        System.out.println(hashSets);

        Set treeSet=new TreeSet();
        treeSet.add("Mukesh");
        treeSet.add("Dhage");

        System.out.println(treeSet);

        Set linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("Mukesh");
        linkedHashSet.add("Dhage");

        System.out.println(linkedHashSet);


    }
}
