import org.testng.annotations.*;

public class mianTest {
    @Test
    public void testCase1() {
        System.out.print("这是测试用例1");
    }
    @Test
    public void testCase2() {
        System.out.print("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.print("beforeMethod是测试用例执行前执行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("afterMethod是测试用例执行后执行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.print("beforeClass是类执行前执行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.print("afterClass是类执行后执行的");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.print("beforeSuit是测试套件执行前执行的");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.print("afterSuit是测试套件执行后执行的");
    }
}
