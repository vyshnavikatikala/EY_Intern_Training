package day6;

public class PaintDemo {
	public static void main(String[] args)throws Exception {
		PaintBrush brush=Container.getBrush(args[0]);                // to run - paintdemo.RedPaint as argument
		brush.doPaint();		
	} 	
}

//the job of the container is to bring loose coupling
//this creates new objects dynamically and inject the dependencies and return the fully
//created objects
class Container{
	public static PaintBrush getBrush(String paintClass) throws Exception{
		PaintBrush brush=new PaintBrush();
		Paint paint=(Paint)Class.forName(paintClass).newInstance();
		//dependency injection
		brush.paint=paint;
		return brush;
	}
}
//The paintbrush code is open for modification...
class BadPaintBrush{
	public void doPaint(int i) {
		if(i==1) {
			System.out.println("Red colour...");
		}
		else if(i==2) {
			System.out.println("blue colour...");
		}
	}
}
/* Where ever you find if-else-if ladder, and the code is dynamic (ever changing)then
* 1. Convert the condition to classes.
* 2. Group them under a hierarchy
* 3. Create a association between the using class and the hierarchial class...
*/
class PaintBrush{
	Paint paint;
	public void doPaint() {
		System.out.println(paint);
	}
}
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
