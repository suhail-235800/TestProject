package Array;

import java.io.*;
import java.util.*;



public class DecimalCheck {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter wr = new PrintWriter(System.out);
            int T = Integer.parseInt(br.readLine().trim());
            for(int t_i = 0; t_i < T; t_i++)
            {
                String N = br.readLine();



               String out_ = Check_Integer(N);
                System.out.println(out_);
                
             }



            wr.close();
             br.close();
        }
        static String Check_Integer(String N){
           
        String result;
         double d=Double.parseDouble(N);
         int s=Integer.parseInt(N);
         if(d==s){
        	 
        	 result="YES";
        	 
         }
         else {
        	 result="NO";
         }


           return result;
        
        }
}