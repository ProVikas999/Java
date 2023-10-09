package classes_and_objects;

public class Test {
//	 static int a = 10; 
//	    int b = 20; 
//	    static void fun1() 
//	    { 
//	        a = 20;                             //Line 1
//	        b = 10;                             //Line 2
//	        fun2();                             //Line 3
//	        System.out.print(this.b);           //Line 4
//	    } 
//	    void fun2() 
//	    {     
//	        System.out.println("from m2"); 
//	    }
	   static int marks;
	    void set_marks(int marks)
	    {
	        this.marks=marks;               //Line 1
	    }
	    int a; 
	    int b; 
	    Test() 
	    {   
	        this(10, 20);   
	        System.out.print("constructor one "); 
	    } 
	    Test(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	        System.out.print("constructor two "); 
	    } 
	    

}
