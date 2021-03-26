package labBookDay05;

class Base {}
class Sub extends Base {}
class Sub2 extends Base {}
public class Ex_17{
public static void main(String argv[]){
Base b=new Base();
Sub s=(Sub) b;
}
}
/*
 * Runtime Exception
 */
