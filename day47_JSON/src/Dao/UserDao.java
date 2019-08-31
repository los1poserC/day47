package Dao;


import User.User;
import Utils.RowUtil;
import Utils.UserUtil;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author As_los
 * @date 2019/8/30  14:56
 */

public class UserDao {

    DruidDataSource dataSource = UserUtil.getDataSource();

    public List<User> selectInfo(String info){

        QueryRunner queryRunner = new QueryRunner();
        String sql="select user_id,user_name,user_password from user where user_name like ? limit 0,3";

        RowProcessor rowProcessor= RowUtil.getRowProcessor();
        Connection conn=null;
        try {
           conn =dataSource.getConnection();
            List<User> result =queryRunner.query(conn,sql,new BeanListHandler<>(User.class, rowProcessor),info+"%");
            return result==null?null:result;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(conn);//连接返回给连接池
        }
        return null;
    }

}
