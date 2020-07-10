package test.extentreports;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Reporter.log("这是自己运行的日志");
        throw new RuntimeException("这是自己抛出的异常");
    }

    @Test
    public void test4(){
        Assert.assertEquals("aaa","aaa");
    }
}
