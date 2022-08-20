import java.util.*;
public class integer_to_roman {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num= scn.nextInt();   //Taking input
       int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};   //creating a array in decreasing order for loop
       String[] roman= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};      // creating a similar array for the corresponding roman values

       StringBuilder str= new StringBuilder();  // creating a stringbuilder to store the roman number
       int i=0;
       for(i=0;i<value.length;i++){    //loop to assign values accordingly

           while(num>=value[i]){  //another loop to decrease the number after assigning the first roman alphabet
               num-=value[i];     //decreasing the number by the roman numeral that is being appended
               str.append(roman[i]);  // appending the roman numeral 
            }
       }
System.out.println(str.toString());  //output
    }

}
