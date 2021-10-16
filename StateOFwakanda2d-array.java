import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // no of rows 
    int m = scn.nextInt(); // no of columns
    
    // creating two d-array
    
    int[][]arr = new int [n][m];
    
    for(int i = 0; i<arr.length; i++){
        
        for(int j =0; j<arr[0].length; j++){
            
            arr[i][j] = scn.nextInt();
            
        }
        
    }
    

     // lets print each rows of every single column 
     
     // we will start with columns
     
     for(int j = 0; j<arr[0].length; j++){
         /* as we see in the question it is mentioned that 
         for even columns rows are increasing and for odd columns 
         rows are decreasin*/
         
         
         if(j%2==0){  // for even columns 
             for(int i = 0; i<arr.length; i++){
                 
                 System.out.println(arr[i][j]);
             }
         } 
         
         else{ // for odd rows 
         
             for(int i = arr.length-1; i>=0; i--){
                 System.out.println(arr[i][j]);
             }
         }
         
     }
     
    
    
    
 }

}