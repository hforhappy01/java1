public class palindrome {
    
    public static void main(String[] args) {
        String s = " abcc";
        for (int i = 0; i <s.length(); i++) {
            for(int j = i+1; j<=s.length(); j++) {
                String ss = s.substring(i,j);
                if(isplanidrome(ss)==true) {
                    System.out.println(ss);
                }
            }
        }

    }
     
    public static boolean isplanidrome(String s) {
        for(int i=0 ,  j= s.length()-1; i<=j; i++, j--){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1!=c2) {
                return false;
            }

        }
        return true;

    }

}
