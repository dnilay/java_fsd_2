package comm.example.test.undown;

import junit.framework.*;

public class TestComputeClass extends TestCase {
	
    public TestComputeClass(String name) {
        super(name);
    }
    
    // Initialize common test data
    int x;
    int y;
    
   
    
    @Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("initialize method");
		x=5;
		y=7;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("clean-up method");
		x=0;
		y=0;
	}

	/**
     * Test of add method, of class ComputeClass.
     */
    public void testAdd() {
        System.out.println("add");
        
        ComputeClass instance = new ComputeClass();
        
        int expResult = 12;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of multiply method, of class ComputeClass.
     */
    public void testMultiply() {
        System.out.println("multiply");
        
        ComputeClass instance = new ComputeClass();
        
        int expResult = 35;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of subtract method, of class ComputeClass.
     */
    public void testSubtract() {
        System.out.println("subtract");
        
        ComputeClass instance = new ComputeClass();
        
        int expResult = 2;
        int result = instance.subtract(x, y);
        assertEquals(expResult, result);
        
    }
    
    public static void main(String[] args){
        
        System.out.println("Running the test using junit.textui.TestRunner.run() method...");
        junit.textui.TestRunner.run(TestComputeClass.class);
        
    }
}