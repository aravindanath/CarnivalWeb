package collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExampleForIterator2


{


    public static void main(String[] args) {


        ArrayList<Object> val = new ArrayList<Object>();
        val.add("Arvind");
        val.add("Teju");
        val.add(123);
        val.add(100.21);
        val.add("Arvind");
        val.add("Teju");
        val.add(123);

       Iterator it = val.iterator();



       while (it.hasNext()){
           System.out.println(it.next());
       }
    }
}
