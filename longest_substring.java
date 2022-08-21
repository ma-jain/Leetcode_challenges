import java.util.Scanner;

public class longest_substring {
     int lengthOfLongestSubstring(String s) {
        // String str="abcbc";
         int c=0;
         for(int i=0; i<s.length();i++){
             
             boolean[] visited = new boolean[256];
          for(int j=i; j<s.length();j++){
             if (visited[s.charAt(j)] == true)
             break;
             else
             {
                 c = Math.max(c, j - i + 1);
                 visited[s.charAt(j)] = true;
             }
         }
  
         
         visited[s.charAt(i)] = false;
             
         }  
         return c;
         
     }
    
    public static void main(String[] args){
Scanner scn = new Scanner(System.in);
String s= scn.nextLine();
longest_substring as= new longest_substring();
int ans= as.lengthOfLongestSubstring(s);
System.out.println(ans);
        
          
        
}
}
