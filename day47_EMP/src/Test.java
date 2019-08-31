import Dao.EmpDao;
import Entity.Emp;
import Utils.UserUtil;

import java.sql.SQLException;

/**
 * @author As_los
 * @date 2019/8/29  15:18
 */

public class Test {
    UserUtil us=new UserUtil();
    EmpDao empDao=new EmpDao();
    Emp emp=new Emp(6,"zhan",18,"0",3000,"张三","123456");

    @org.junit.Test
    public void test(){

        try {
            System.out.println(us.getDataSource().getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @org.junit.Test
    public void test1(){
        int id=4;
        int i = empDao.deleteInfo(id);
        System.out.println(i);
    }

    @org.junit.Test
    public void test2(){
      Emp emp=  empDao.toSelect(4);
        System.out.println(emp);
    }

    @org.junit.Test
    public void test3(){
        int i = empDao.updateInfo(emp);
        System.out.println(i);
    }

    @org.junit.Test
    public void test4(){
        String i = empDao.selectNameInfo("zhaoyun");
        System.out.println(i);
    }



}
