package com.dte;

public class Test5 {
    public static void main(String... args){
        int a=20,b=10;
        if(a<b && b++<25){
            System.out.println("This is");
        }
        System.out.println(b);

        if(1+1+1+1+1==5){
            System.out.println("true");
        }
        else
            System.out.println("false");
        System.out.println("before new ");
        System.out.print(""=="");
        System.out.print(" ");
        System.out.print("A"=="A");
        System.out.print(" ");
        System.out.println("a==A");
        int x=42; double y=42.25;
        System.out.println((x%10)+" "+(y%10)); //returns reminder
        int p=5;
        p*=3+7;
        System.out.println(p);
        int a1=5,b1=6,c1=7;
        System.out.println("value is"+b1+c1);
        System.out.println(a1+b1+c1);
        System.out.println("string "+(b1+c1));
                int z=5;
                System.out.println(z++);
        System.out.println(z);
        System.out.println(++z);
        System.out.println(++z+z++);
    }
}
