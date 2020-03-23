package com.dte;

public class Test9 {
    public static void main(String[] args){
        int i,j=1;
        i= (j>1)?2:1;
        switch(i){
            case 0: System.out.println(0);break;
            case 1: System.out.println(1);break;
            case 2: System.out.println(2);break;
            case 3: System.out.println(3);break;
            //case 0: System.out.println(0);break;
        }
        int x=0,y=2;
        do{
            x=++x;
            y--;
        }while(y>0);
        System.out.println(x);
        System.out.println(x);
    }
}
