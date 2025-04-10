import org.mockito.internal.invocation.InvocationComparator;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGAttribute {

    // Only one main method can be present in class
    // In TestNG we can have many / multiple testcases
    // They are executed in the ASCII order of method names
    //If we want to change the order of the executions we can use the priority attribute
    //priority ranges from -n to n
    //By default the priority of testcase is 0
    // execution will happen in the ascending order of the priority

    //Description attribute show the description of the test case
// Suitename - Which Suite the test belongs

    // Invocationcount This testcase will execute this many times
// invocationTimeout this gives in how many Ms testcase should be
// completed and it works in conjunction with Invocation count
    // timeout - How many ms can testcase run .
    //Ignore
    //Enabled
    //DependsonMethod

    //Alwaysrun
    // ExpectedException it is used when the testcase is prone to failure
//    suppose if the testcase is working as expected and we are using expectedexception then the testcase will fail
// SkipFailedInvocation - It is used to skip the failed testcase , by default it is false used in conjuction to Invocation count
// ignoremissingdependencies - If we use an depends on method which is not present then using this
    @Test(priority = 0,description = "First",suiteName = "Smoke",invocationCount = 5,invocationTimeOut = 2000)
    public void Testcase1() throws InterruptedException {

        System.out.println("First Testcase");
    }

    @Test(priority = -2,description = "Second",suiteName = "Regression",timeOut = 3000)
    public void Testcase2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("First Testcase");
    }

    @Test(priority = 1,description = "Third",suiteName = "Smoke",enabled = false)
    public void Testcase3(){
        System.out.println("First Testcase");
    }
@Ignore
    @Test(priority = 3,description = "fourth",suiteName = "Sanity",enabled = true,expectedExceptions = RuntimeException.class)
    public void Testcase4(){
        System.out.println("First Testcase");
    }
@Ignore
    @Test(priority = 4,description = "Fifth",suiteName = "Regression")
    public void Testcase5(){
        System.out.println("First Testcase");
    }

    @Test(priority = 400,description = "Sixth",suiteName = "Regression",invocationCount = 5,skipFailedInvocations = true)
    public void Testcase6(){
        System.out.println("First Testcase");
       throw new RuntimeException();
    }


}
