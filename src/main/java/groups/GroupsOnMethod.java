package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端测试test1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端测试test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端测试test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端测试test4");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnMethod(){
        System.out.println("在服务端执行之前执行");
    }
    @AfterGroups("server")
    public void afterGroupsOnMethod(){
        System.out.println("在服务端执行之后执行");
    }

}
