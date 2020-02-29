package collectionExamples;

public class Arrayexample3



{


    public static void main(String arg[]){

        Object [] names = new Object[4];

        names[3]="Issac";
        names[1]=83456423;
        names[2]=true;
        names[0]=345.00;

        for(Object obj : names){
            System.out.println(obj);
        }





    }
}


