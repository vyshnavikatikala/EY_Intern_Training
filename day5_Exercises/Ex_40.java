package day5;

public class Ex_40 {
        Ex_40(int i){
		System.out.println("base constructor");
		}
        Ex_40(){
		}
}
class Sup extends Ex_40{
public static void main(String argv[]){
Sup s= new Sup();
//super(10);
}
Sup()
{
super(10);                  
}
public void derived()
{
//Three
}
}