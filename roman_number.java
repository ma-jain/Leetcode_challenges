import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.io.*;


class roman_number{
    int value(char r){ //creating a function to return the integers corresponding to the roman numerals
        if(r=='I')
        return 1;
        if(r=='V')
        return 5;
        if(r=='X')
        return 10;
        if(r=='L')
        return 50;
        if(r=='C')
        return 100;
        if(r=='M')
        return 1000;
        if(r=='D')
        return 500;
        return -1;
    }
int convert(String x){   // a function to convert the roman numeral
    int i, total=0;          //total:to operate on the number in the loop
    for(i=0;i<x.length();i++){   //loop to ron the length of the numeral
        int c1=value(x.charAt(i));  // taking each character of the numeral and getting its value from the function
        if(i+1<x.length()){    //ensuring its in the limit
        int c2=value(x.charAt(i+1)); //taking the next characters value in the numeral
        if(c1<c2){ // condition for IV, IX and so on
            total-=c1;  //decreasing the number if true

        }
        else
        total+=c1;  // adding the value of each roman numeral one by one to get the answer
    }
    else
    total+=c1;    //if there is no IV, IX sort of roman numeral then adding the corresponding value to get the answer
    }
    return total;  // output
}
public static void main(String[] args)
{
roman_number object= new roman_number();
    Scanner scn = new Scanner(System.in); //input
    String rom= scn.next();
    rom= rom.toUpperCase(); //converting to uppercase 
    int ans= object.convert(rom);  // calling the function
    System.out.println(ans);  //output
}
}