import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */


public class ArrayListAssignment {

        ArrayList<Integer> arl = new ArrayList<Integer>(3);

 
    public ArrayListAssignment(){
        for(int i = 10; i <20; i++)
         arl.add(i -10, i);
    }


    public void displayArrayList(ArrayList<Integer> list) {
        for(Integer num: list)
         System.out.println(num + " ");
   }

   public void addElement(int number){
    arl.add(0, number);
          System.out.println( arl + "adding element");
   }

   
   public void removeElement(int number){
    arl.remove(number);
   }

    public void reverseArrayList(){
     ArrayList<Integer>  arl2 = new ArrayList<>(arl.size());
     for(int i =arl.size() -1; i >=0; i--)
        arl2.add(arl.get(i));

         System.out.println( arl2);
   }

    public void findSum(){
        int total = 0;
          for(Integer num: arl){
            total += num;      
          }
         System.out.println( total);
   }

    public void findMaximum(){
        int max = 0;
          for(Integer num: arl)
           if(num > max) max = num;
 
         System.out.println( max);
   }
    public void findMinimum(){
        int max = Integer.MAX_VALUE;
          for(Integer num: arl)
           if(num < max) max = num;
 
         System.out.println( max);
   }

       public void sortArrayList(){
   
        Collections.sort(arl);   
        
         System.out.println( arl);
   }

     public void  findElement (int num){
 
          System.out.println(arl.indexOf(num));
 
   }

    public void removeDuplicates(){
     ArrayList<Integer> arl2 = new ArrayList<Integer>(arl);
     int toremove;
          for(int j=0; j < arl.size(); j++){
            toremove = arl.get(j);
            for(int i= j +1 ; i< arl.size(); i++){
                if(arl.get(i) == toremove) arl.remove(j);
            }
          }
           
 
         System.out.println( arl);
   }


}
