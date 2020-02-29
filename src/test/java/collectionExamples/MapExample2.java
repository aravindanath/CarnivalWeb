package collectionExamples;


import java.util.*;
public class MapExample2 {


    public static void main(String arg []){

        Map<String, String> std = new HashMap<String,String>();
        std.put("Name","Arvind");
        std.put("Subject","Python");
//        System.out.println(std.get("Name"));
        Map<String,List<String>> stdList = new HashMap<String, List<String>>();
        ArrayList<String> array = new ArrayList<String>();

        array.add("Issac");
        array.add("Chetan");
        array.add("Jyothi");
        array.add("Kaveri");
        array.add("Vetri");



        stdList.put("Names",array);


        System.out.println(stdList.get("Names"));





    }



}
