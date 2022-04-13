
public class Demo {

	public void m1() {
	System.out.println("Method m1");	
	}
	public void m2() {
		System.out.println("Method m2");	
		}
	public void m() {
		System.out.println("Method m");	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Hello Git");
		Demo d=new Demo();
		d.m1();
		System.out.println("i am imported project from github");
		d.m1();
		System.out.println("another change");
		d.m2();
		System.out.println("End");	
	}

}
