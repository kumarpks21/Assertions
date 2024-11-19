package Demo.Assertions;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCoubtDemo {
	@Test(invocationCount=5)
public void testMethod1(ITestContext context) {
	int currentInvocation=	context.getAllTestMethods()[0].getCurrentInvocationCount();
	System.out.println("Current invocation count is : " +currentInvocation);
	System.out.println("I am first method");
}

@Test(invocationCount=3)
public void testMethod2(ITestContext context) {
	int currInvo= context.getAllTestMethods()[1].getCurrentInvocationCount();
	System.out.println("Current invocation count is :" +currInvo);
	System.out.println("I am second method");
}
}
