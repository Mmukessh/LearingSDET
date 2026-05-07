package OOPS;

import java.util.*;

public class Lab022_Map {
    public static void main(String[] args) {

        Map hashMap=new HashMap();
        hashMap.put("name","Mukesh");
        hashMap.put("mob","9876543210");
        hashMap.put("roll",1);

        System.out.println(hashMap);

        Map treeMap=new TreeMap();
        treeMap.put("name","Mukesh");
        treeMap.put("mob","9876543210");
        treeMap.put("roll",1);

        System.out.println(treeMap);

        Map linkedHashMap=new LinkedHashMap();

        linkedHashMap.put("name","Mukesh");
        linkedHashMap.put("mob","9876543210");
        linkedHashMap.put("roll",1);
        System.out.println(linkedHashMap);

       Map<String,Object> m1=new HashMap<>();
       m1.put("name","Mukesh");
       m1.put("mob",987654);

       for (Map.Entry<String,Object> item:m1.entrySet())
       {
           System.out.println(item.getKey()+"----"+item.getValue());
       }


    }
}
