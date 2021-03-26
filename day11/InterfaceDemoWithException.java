package day11;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Scanner;
public class InterfaceDemoWithException {
	public static void main(String[] args) {
		StanelyAlopathyMC stanley=new StanelyAlopathyMC();//1954
		Human shoiab=new Human();//1974
		shoiab.doCry();
		//in 2021 I decided to become a doctor...
		//Now I pray the real Object oriented God
		//he will suggest me to go do medical college and study there
		//I subject myself to a medical college and at the end I come out as a doctor...
		//implementation and subjection
		Object obj=Proxy.newProxyInstance
			(Human.class.getClassLoader(), new Class[] {Doctor.class},
					new InterfaceDemoWithException.MyInvocationHandler(new Object[] {stanley}));
		
		Doctor doctorShoiab=(Doctor)obj;
		//doctorShoiab.doCure();
		
		obj=Proxy.newProxyInstance
				(Human.class.getClassLoader(),
				new Class[] {Doctor.class,Pilot.class},
				new InterfaceDemoWithException.MyInvocationHandler(new Object[] {stanley,new JetAcademy()}));
		
		doctorShoiab=(Doctor)obj;
		doctorShoiab.doCure();
		
		Pilot pilot=(Pilot)obj;
		pilot.doFly();
		
	}
	static class MyInvocationHandler implements InvocationHandler{
		Object obj[];
		public MyInvocationHandler(Object obj[]) {
			this.obj=obj;
		}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object returnObject=null;
			for(Object o:obj) {
				Method m[]=o.getClass().getDeclaredMethods();
				for(Method met:m) {
					if(met.getName().equals(method.getName())) {
						met.setAccessible(true);
						returnObject=method.invoke(o, args);
					}
				}										
				}
			return returnObject;
			}
	}
}
class Human{
	public void doCry() {
		System.out.println("Human crying....");
	}
}
interface Doctor{
	public void doCure();
}
class StanelyAlopathyMC implements Doctor{
	@Override
	public void doCure() {
		System.out.println("Curing medicine is given as per Alopathy....");
	}
}
class AnnaUnaniMC implements Doctor{
	@Override
	public void doCure() {
		System.out.println("Curing medicine is given as per unani medicine....");
	}
}
interface Pilot{
	public void doFly();
}
interface Steward{
	public void doServe();
}
class JetAcademy implements Pilot,Steward{
	@Override
	public void doFly() {
		System.out.println("Flying aeroplace is implemented here...");
	}
	@Override
	public void doServe() {
		System.out.println("serving passenger is taught here....");		
	}
}