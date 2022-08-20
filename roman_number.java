import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.io.*;


class roman_number{
    int value(char r){
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
int convert(String x){
    int i, total=0;
    for(i=0;i<x.length();i++){
        int c1=value(x.charAt(i));
        if(i+1<x.length()){
        int c2=value(x.charAt(i+1));
        if(c1<c2){
            total-=c1;

        }
        else
        total+=c1;
    }
    else
    total+=c1;
    }
    return total;
}
public static void main(String[] args)
{
roman_number object= new roman_number();
    Scanner scn = new Scanner(System.in);
    String rom= scn.next();
    rom= rom.toUpperCase();
    int ans= object.convert(rom);
    System.out.println(ans);
}
}