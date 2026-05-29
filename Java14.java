class A1 {
    public final int a;
    public A1(){
        a=1;
    }
    public A1(int b){
        a=b;
    }
}
public class Java14 {
    public static void main(String[] args){
        A1 A = new A1();
        System.out.println(A.a);
    }
}