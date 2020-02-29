package collectionExamples;

import java.util.*;

public class MapExample {



    public static void main(String arg []){

        Map<Integer, String> map =  new HashMap<Integer, String>();

        map.put(101,"Arvind");
        map.put(102,"Kaveri");
        map.put(103,"issac");
        map.put(104,"Vetri");


        System.out.println(map.get(101));

        for (Map.Entry ref : map.entrySet()) {
            System.out.println(ref.getKey()+" " + ref.getValue());

        }


    }
}
