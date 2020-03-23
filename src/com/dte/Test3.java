package com.dte;

public class Test3 {
    public static void main(String[] args){
        Test3 p=new Test3();
        p.start();
    }
    void start(){
        boolean b1=false;
        boolean b2=fix(b1);
        System.out.print(b1+" "+b2);
    }
    boolean fix(boolean b3){
        b3=true;
        return b3;
    }
}
