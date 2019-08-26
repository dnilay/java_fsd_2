import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;

public class TestMyClass extends TestCase {

	@Test
	public void testAdd() {
		System.out.println("test add");
		int x=10;
		int y=20;
		MyClass instance=new MyClass();
		assertEquals(30, instance.add(x, y));
	}

	@Test
	public void testMultiply() {
		
	}

	@Test
	public void testSubtract() {
		
	}
	
	public static void main(String args[])
	{
		TestRunner.run(TestMyClass.class);
	}
	

}
