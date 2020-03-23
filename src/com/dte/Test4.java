package com.dte;

public class Test4 {
    public static void main(String[] args){
        Test4 p=new Test4();
        p.foo(false,true);
    }
    public void foo(boolean a,boolean b){
        System.out.println("before");
        if(a) {
            System.out.println("A");
        }
        else if(a &&b ) {
            System.out.println("a&&b");
        }
        else{
            if(!b){
                System.out.println("not B");
            }
            else{
                System.out.println("else");
            }
        }
    }
}
