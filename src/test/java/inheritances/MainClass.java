package inheritances;

public class MainClass {

	public static void main(String[] args) {
		
		Adder ad = new Adder();
		ad.print();
		int sum = ad.add(4, 56);
		
		System.out.println("My superclass is : "+ ad.getClass().getSuperclass().getSimpleName());
		System.out.println(sum);
		
		
	}

}
