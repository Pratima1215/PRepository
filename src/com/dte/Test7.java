package com.dte;

public class Test7 {
     static public void main(String[] args){
        int x=3,y=4;
        switch(x+3){
            case 6: y=0;
           // System.out.println(y);
            case 7: y=1;
                //System.out.println(y);
            default: y+=1;
              //  System.out.println(y);
        }
        System.out.println(y);
        char ch='a';
        switch(ch){
            case 'a':
            case 'A' : System.out.println(ch); break;
            case 'b':
            case 'B' : System.out.println(ch); break;
            case 'c':
            case 'C' : System.out.println(ch); break;
            case 'd':
            case 'D' : System.out.println(ch);
        }
        int count=0;
        do{
            System.out.println("Welcome");
            count++;
        }while(count<10);
        double sum=0;
        for(double d=0;d<10;){
            d+=0.1;
            System.out.println(" "+d);
            sum+=sum+d;
            System.out.println(" "+sum);
            }
        System.out.println(" "+sum);
        int i,j;
//        for(i=0;i<3;i++){
//            for(j=1;j<4;j++){
//                i%=j;
//                System.out.println(j);
//            }
//        }
        int[] a={0,2,4,1,3}; int l;
        for(l=0;l<a.length;l++) {
            a[l] = a[(a[l] + 3) % a.length];
            System.out.println(a[l]);
        }


    }
}
