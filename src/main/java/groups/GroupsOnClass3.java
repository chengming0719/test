package groups;

import org.testng.annotations.Test;

@Test(groups = "tech")
public class GroupsOnClass3 {
    public void tech1(){
        System.out.println("GroupsOnClass33333中的tech1运行");
    }
    public void tech2(){
        System.out.println("GroupsOnClass33333中的tech2运行");
    }
}
