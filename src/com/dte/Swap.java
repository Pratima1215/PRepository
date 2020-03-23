public class Swap {
    public static void main(String[] args){
        Swap s=new Swap();
        s.swapTwo(10,20);
        s.swapThree(10,20,30);
        s.swapFour(10,20,30,40);
        s.swapTwoTemp(10,20);
        s.swapThreeTemp(10,20,30);
        s.swapFourTemp(10,20,30,40);
    }

void swapTwo(int a,int b){
    a = a+b;
    b=a-b;
    a=a-b;
    System.out.println("a value:"+a+" "+ "b value:"+b);
    }
    void swapThree(int a,int b,int c){
        a = a + b + c;
        b = a - (b+c);
        c = a - (b+c);
        a = a - (b+c);
        System.out.println("a value:"+a+" "+ "b value:"+b +" "+"c value"+c);

    }
    void swapFour(int a,int b,int c,int d){
        a = a + b;
        b = a - b;
        a = a - b;

        b = b + c;
        c = b - c;
        b = b - c;

        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println("a value:"+a+" "+ "b value:"+b +" "+"c value"+c +" "+"d value"+d);
    }
    void swapTwoTemp(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a value:"+a+" "+ "b value:"+b);
    }
    void swapThreeTemp(int a,int b,int c){

        int temp = b;
         b = a;
         a = c;
         c = temp;
        System.out.println("a value:"+a+" "+ "b value:"+b +" "+"c value"+c);
    }
    void swapFourTemp(int a,int b,int c,int d){
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;
        System.out.println("a value:"+a+" "+ "b value:"+b +" "+"c value"+c +" "+"d value"+d);
    }
}

