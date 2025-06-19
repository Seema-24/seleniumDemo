package inheritances;

class InterfaceDemo implements Shape {
    
    void triangle() {
       System.out.println("trianlge own class method"); 
    }
    public void circle() {
       System.out.println("circle - abstract method");  
    }
    
    public static void main(String[] args) {
		
		  InterfaceDemo in = new InterfaceDemo(); 
		  in.circle(); //abstract 
		  in.square();// default 
		  in.triangle(); // own class 
		  Shape.rectangle(); //static method access by interface name
		  
		  System.out.println(length * breadth);
		 
        /*
        Shape in = new InterfaceDemo();
        in.circle(); //abstract
        in.square(); // default
        // in.triangle(); // own class  -- can't access when ref var of Shape
        Shape.rectangle(); //static method access by interface name
        */
    }
}

interface Shape {
    
    int length=3; // final static
    int breadth = 20; //final static
    
    void circle(); //abstract method
    
    default void square() {
        System.out.println("square - default method"); 
    }
    
    static void rectangle() {
        System.out.println("reactangle - static method"); 
    }
}
