package inheritances;

public class MultipleInheritance extends C implements A,B {
	    
	    public void m1() {
	       System.out.println(a+" m1() method"); 
	    }
	    public void m2() {
	       System.out.println(b+" m2() method");  
	    }
	    
	    public static void main(String[] args) {
	    	MultipleInheritance in = new MultipleInheritance();
	        in.m1();
	        in.m2();
	        System.out.println(a);
	        in.m3();
	    }
}

	    
interface A {
	int a=3;
	public void m1();
}
interface B {
	int b = 20;
	public void m2(); 
}

class C {
	void m3() {
	        System.out.println("m3() method");
	 }
}	

