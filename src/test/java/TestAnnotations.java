import org.testng.annotations.*;

public class TestAnnotations {
    // Order of execution
//     BS -BT -BC -BM - Test - AM - AC - AT - AS

    // There are around 9 annotations in TESTNG:
    // 1. BeforeSuite --> Gets executed before the start of the Suite execution
    // Killing all existing browsers , setting up all the required connections.
    // AfterSuite - > Gets executed after the completion of the Test Suite
    // Generation of excel reports,Summarized Reports,Triggering an email about the execution

    // BeforeTest -> very rarely used - Set of activites that are required , before triggering the testsuite from the XML file
    // AfterTest -> very rarely used - Set of activites that are required ,After Completion of the testsuite from the XML file

    // BeforeClass -> executed before the start of the testcase in class.
    // setting upp of the browser driver , setting up framework objects
    // AfterClass -> Executed after the end of the testcase in class.
//     generating allure reports , updating results to execel file

    // BeforeMethod -> Gets executed before the start of each and every testcase
    // Launch application , Logging into the Application
    // AfterMethod -> Gets executed after each and every testcase .
    // Logout , closing application

    // Test -> where we write actual business of the application.

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Executing before the execution of TestSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Executing after the execution of the TestSuite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Executing before the execution of the testcase in the current class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Executing after the execution of the testcase in the current class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Executing before each and every testcase");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Executing after each and every testcase");
    }

    @Test
    public void test1(){
        System.out.println("Executing test1");
    }

    @Test
    public void test2(){
        System.out.println("Executing test2");
    }

    @Test
    public void test3(){
        System.out.println("Executing test3");
    }


}
