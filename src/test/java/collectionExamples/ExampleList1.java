package collectionExamples;

import java.util.*;

public class ExampleList1 {


    public static void main(String arg[]){

        ArrayList<String> car = new ArrayList<String>();
        car.add("seltos");
        car.add("hector");
        car.add("harrier");
        ArrayList<String> sc = new ArrayList<String>();
        sc.add("Whitefield");
        sc.add("Marathllo");
        sc.addAll(car);


        ArrayList<String> empty = new ArrayList<String>();

        Collections.sort(sc);

        for(String str : sc){
             empty.add(str);
             System.out.println(empty);
        }

        System.out.println("Count of " + empty.size());





    }



}
