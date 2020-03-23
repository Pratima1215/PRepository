package com.dte;

import javax.swing.*;

public class Test6 {
    public static void main(String[] args){
        boolean b1= true;
        boolean b2= false;
        boolean b3= true;
        if(b1&b2|b2&b3|b2)
            System.out.println("Ok");
        if(b1&b2|b2&b3|b2|b1)
            System.out.println("dokey");
        int x=0;
//        x++;
//        x=x+1;
//        x+=1;
        x=+ 1;
        System.out.println(x);
        double var1=1+5;
        double var2=var1/4;
        int var3=1+5;
        int var4=var3/4;
        System.out.println(var2+" "+var4);
        double a=25.64;
        int b=25;
        a=a%10;
        b=b%10;
        System.out.println(a+" "+b);
        int g=3;
        System.out.println(++g*8);
        int f=1;
//        if(f) {
//            System.out.println("odd");
//        }
//        else
//            System.out.println("even");
  int q;
  for(q=1;q<6;q++){
      if(q>3)
          continue;
  }
  System.out.println(q);
  int r=0,s=5;
  for(;r<3 && s++<10;r++){
      System.out.print(" "+r+" "+s);
  }
  System.out.print(" "+r+" "+s);
  int l=7;
  if(l==2);
  System.out.println("number seven");
  System.out.println("not seven");
  int m,n;
  for(m=0,n=0;m<10;m++) n+=m;
  System.out.println(n+" "+m);
  int d=10,e=0;
//  if(d&&e){
//      System.out.println("true");
//  }
//  else{
//      System.out.println("false");
//  }
    }
}
