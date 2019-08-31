package Dao;

import Entity.User;
import Utils.RowUtil;
import Utils.UserUtil;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author As_los
 * @date 2019/8/30  14:56
 */

public class UserDao {

    DruidDataSource dataSource = UserUtil.getDataSource();

    public boolean selectInfo(String info){

        QueryRunner queryRunner = new QueryRunner();
        String sql="select user_name from user where user_name=?";

//        RowProcessor rowProcessor= RowUtil.getRowProcessor();
        Connection conn=null;
        try {
           conn =dataSource.getConnection();
            String result =queryRunner.query(conn,sql,new ScalarHandler<String>(),info);
            return result==null?false:true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(conn);//连接返回给连接池
        }
        return false;
    }

}
