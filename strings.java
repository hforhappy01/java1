import java.util.*; 
public class strings {
    public static void main(String[] args) {
      //  String s = "";     // making of string
       StringBuilder sb = new StringBuilder(); // - creating string builder as string builder is muttable

        long start = System.currentTimeMillis();
        for (int i = 0; i <1000; i++){
          //   s = s+i; // for string we write this 
          sb.append(i);  // for string builder we use append
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(s + " " + duration);

        // output will be the same for both string and string builder 
    }
}
