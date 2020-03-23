public class ObjTest {
    int b=100;
    public static void main(String[] args){
        ObjTest b=new ObjTest();
        ObjTest c=b;
        System.out.println(b.b+"/t"+c.b);
        new ObjTest().b= 1000;
        System.out.println(b.b+"/t"+c.b);
    }
}
