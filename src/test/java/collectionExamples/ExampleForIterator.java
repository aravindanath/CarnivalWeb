package collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class ExampleForIterator {

	public static void main(String[] args) {

 
		
		Collection<Object> val = new ArrayList();
		val.add("Arvind");
		val.add("Teju");
		val.add(123);
		val.add(100.21);
		val.add("Arvind");
		val.add("Teju");
		val.add(123);
		val.add(100.21);
		val.add("Arvind");
		val.add("Teju");
		val.add(123);
		val.add(100.21);
	 
		
//		for (Object object : val) {
//			System.out.println(object);
//		}	
		Iterator it = val.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		while(it.hasNext()) {
			 System.out.println(it.next());
			
		}
		System.out.println("Out of loop..");
		
 

//		Iterator it =  val.iterator();
////		System.out.println(it.next());
////		System.out.println(it.next());
////		System.out.println(it.next());
////		System.out.println(it.next());
////		System.out.println(it.hasNext());
////		System.out.println(it.next());
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	}

}
