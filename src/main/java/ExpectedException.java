import org.testng.annotations.Test;

/**
 *这是个成功的异常测试
 */

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedException(){
        System.out.print("这是个成功的异常测试");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExpectedException2(){
        System.out.print("这是个成功的异常测试2");
        throw new RuntimeException();
    }
}
