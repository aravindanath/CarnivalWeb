package collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DiffBwMapTable {




   public  static void main(String arg[]){

       Map<String, String > m1 = new HashMap<String, String>();

       m1.put("101","Arvind");
       m1.put("102",null);
       m1.put(null,"Jyothi");
       m1.put("101","issac");


       System.out.println(m1);

       Map<String, String > m2 = new Hashtable<String, String>();
        m2.put("102","Vetri");
        m2.put(null,null);
        m2.put(null,"Arvind");
       m2.put("102","issac");
       System.out.println(m2);



   }
}
