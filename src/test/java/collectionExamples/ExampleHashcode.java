package collectionExamples;

public class ExampleHashcode



{


    public static void main(String arg[]){

        String name = "Vetri";
        String name2 = "vetri";

        System.out.println(name2.hashCode());
        System.out.println(name.equalsIgnoreCase("vetri"));
        System.out.println(name.equals("Vetri"));
        System.out.println(name == name2);

    }
}
