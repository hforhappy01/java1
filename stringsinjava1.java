import java.io.*;
import java.util.*;

public class stringsinjava1 {
    



 
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         String s1 = "hello world";
        // String s2 = scn.next(); 
         // scn.next select abc from abc xyz not the complete line
         // for complete line we use scn.nextLine();
         String a = scn.nextLine();
         // this how to take i/p from the scanner
         System.out.println(a.length()); // string mai length function hota h

         //char chofname = a.charAt(2); //this is how to get the character from the string
         //System.out.println(chofname);
         // print all the characters of string
         for (int i = 0; i < a.length(); i++) {
             char chofname = a.charAt(i);
             System.out.println(chofname);


         }
        // we can take out the character from the string but cant set a character inside a stringing
        
        //substring to string
        // s = "abcd"
        //0-1 = a
        //0-2 = ab
        //0-3 = abc
        //0-4 = abcd
        
       String str = "abcd";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(1)); // bcd
          
      //to print all the substring
        
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                System.out.println(str.substring(i,j));
            }
        
        }
        //spliting  
          
          String y = "abc, def, ghi, jkl mno";
          String[] parts = y.split(",");
          for(int i = 0; i < parts.length; i++){
              System.out.print(parts[i]);
                

          }

     }

    
} 

