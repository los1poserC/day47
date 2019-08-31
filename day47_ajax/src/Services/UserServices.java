package Services;

import Dao.UserDao;

/**
 * @author As_los
 * @date 2019/8/30  15:03
 */

public class UserServices {
    UserDao userDao=new UserDao();

    public boolean select(String name){
        return userDao.selectInfo(name);
    }

}
