    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1 || n > 5 && n < 21){
                ans = "Weird";
            } else if (n > 0) {
              ans = "Not Weird";        
            }

            System.out.println(ans);
            
        }
    }
