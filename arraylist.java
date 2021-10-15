
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        /* array list
        ArrayList in Java is used to store dynamically sized collection of elements. ...
         An ArrayList is a re-sizable array, also called a dynamic array. 
        It grows its size to accommodate new elements and shrinks the size when the elements are removed.
         ArrayList internally uses an array to store the elements.
         */

         
         //1 declaration of array_list and definig of array_list

         ArrayList<Integer> list = new ArrayList<Integer>();
         System.out.println(list.size()+" -> "+ list); 
         // o/p - 0  ->  []

         // adding elements into the list

         list.add(10);
         list.add(20);
         list.add(30);
         
         // now printing the array ArrayList

         System.out.println(list.size()+" -> "+ list);
         // o/p - 3 -> [10,20,30]
            
         // set another value at any place
         list.set(1,200); //set 200 at place 1 in array list
         
         System.out.println(list.size()+" -> "+ list);
         // o/p ->  3 -> [10,200,30]
         // adding the any value at any place
         list.add(1,200000) // adding 200000 at place 1
         System.out.println(list.size()+" -> "+ list);
         // o/p ->  4  -- [10,200000,30,40]

         // get the element from the list

         int val = list.get(1);
         System.out.println(val);
         //o/p - 200000 

         for (int i = 0; i <list.size(); i++) {
             int val2 = list.get(i);
             System.out.println(val2);
         }

         // o/p -> 10 200000 30 40
         // below given code do the same work as above one

         for(int val2: list){
             System.out.println(val2);  
         }

         
    }
}