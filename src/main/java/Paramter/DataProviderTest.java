package Paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.print("name=" + name + ";  age=" + age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30},
        };
        return  o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.print("test1111运行： " + "name=" + name + ";  age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.print("test2222运行： " + "name=" + name + ";  age=" + age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"xiaoxiao",18}
            };

        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"dada", 66}
            };

        }
        return result;
    }
}
