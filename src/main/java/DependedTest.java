import org.testng.annotations.Test;

public class DependedTest {
    @Test
    public void test1(){
        System.out.print("test1运行");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("test2运行");
    }
}
