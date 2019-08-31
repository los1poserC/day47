import Dao.UserDao;
import User.User;

import java.util.List;

/**
 * @author As_los
 * @date 2019/8/30  18:52
 */

public class Test {
UserDao userDao=new UserDao();



@org.junit.Test
public void Test(){
    List<User> list = userDao.selectInfo("张");
    for (User user : list) {
        System.out.println(user.getUserName());
    }
}


}
