package Services;

import Dao.UserDao;
import User.User;

import java.util.List;

/**
 * @author As_los
 * @date 2019/8/30  15:03
 */

public class UserServices {
    UserDao userDao=new UserDao();

    public List<User> select(String name){
        return userDao.selectInfo(name);
    }

}
