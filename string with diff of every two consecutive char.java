import java.util.*;
import java.io.*;

public class Main{

public static String solution(String str){

          StringBuilder sb = new StringBuilder();
          for(int i = 0; i<str.length; i++){
              

                if(i == str.length() - 1){  // if the character is last character of string enter enter inside the statement
                    
                    char chi = str.charAt(i);  // last character found at index i
                    sb.append(chi);  // put that character into the stringbuilder


                }

                else{


              
              char chi  = str.charAt(i);  // char at i char at 0 at 1 at 2 at 3 upto the i
               char charatiplus1  = str.charAy(i+1);  // character at i+1 
               sb.append(chi); // append the char at i 
               sb.append(charatiplus1-chi); // will append the difference of askai value of (i+1 and i)
            }


          }

          return sb.toString(); // return stringbuilder in the form of string
}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
}

}