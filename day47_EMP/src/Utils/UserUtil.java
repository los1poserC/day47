package Utils;

import com.alibaba.druid.pool.DruidDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author As_los
 * @date 2019/8/27  19:10
 */

public class UserUtil {
    static Properties props =null;
    static {
        props=new Properties();
        InputStream in=UserUtil.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static DruidDataSource getDataSource(){
        DruidDataSource ds=new DruidDataSource();
        ds.configFromPropety(props);
        return ds;
    }

    public static Connection getConnection(){
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn){
        if(conn!=null){
            try {
                if(!conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(DruidDataSource dataSource){
        dataSource.close();
    }






}
