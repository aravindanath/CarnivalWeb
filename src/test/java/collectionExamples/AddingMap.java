package collectionExamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class AddingMap {




   public  static void main(String arg[]){

       Map<String, String > m1 = new HashMap<String, String>();

    m1.put("101","Arvind");
    m1.put("102","Jyothi");


//       System.out.println(m1);

       Map<String, String > m2 = new Hashtable<String, String>();
    m2.putAll(m1);
    m2.put("103","Shashi");
       System.out.println(m2.get("102"));



   }
}
