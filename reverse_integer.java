import java.io.*;
public class reverse_integer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int o = Integer.parseInt(in.readLine());
        // System.out.println(o);
        int temp = o;
        int ans = 0;
            while (temp != 0) {

                ans = ans*10 + (temp % 10);
                temp=temp/10;
                // Overflow condition check so that the value remains under 32 bit
                if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&(mod>7)))
                // return 0;
                if(ans<Integer.MIN_VALUE/10||(ans==Integer.MIN_VALUE/10&&(mod<-8)))
                // return 0;
            }

        
           
        
        System.out.println(ans);
    }
}
