import java.io.*;
import java.util.*;

public class stringcompression {

	public static String compression1(String str){ // wil give aabbcccccdddddddddddd in abcd form
		//creating a string ans which will have the string values
        String ans = "";
        for(int i = 0; i<str.length(); i++){
		// why I used while loop here?? it is a interesting question
		/* I used while loop here to increament the value of i to that value after which the same letter not repeats
		for ex aaabbcc - here we will move the i inndex to i- [2] so after that we can have left with only one{a} in our hand and we will print that value
		for the same ex. i will be 2 str at 2 is -> a after which i becomes 3 and same things will happen*/
	
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                i++;
            }
            ans += str.charAt(i);
        
        }
		return ans;
	}

	public static String compression2(String str){ // will give aaabbc in a3b2c form
		

		 String ans = "";
        for(int i = 0; i<str.length(); i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            ans += str.charAt(i);
            if(count>1){
                ans+= count;
            }
        }
		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
