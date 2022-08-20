import java.util.*;
public class integer_to_roman {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();
       int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String[] roman= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

       StringBuilder str= new StringBuilder();
       int i=0;
       for(i=0;i<value.length;i++){

           while(num>=value[i]){
               num-=value[i];
               str.append(roman[i]);
            }
       }
System.out.println(str.toString());
    }

}
