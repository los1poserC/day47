package Utils;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.RowProcessor;

/**
 * @author As_los
 * @date 2019/8/29  15:39
 */

public class RowUtil {

/*
*   将数据库属性命名转换成驼峰式命名工具类
*
* */
    public static RowProcessor getRowProcessor(){
        GenerousBeanProcessor beanProcessor=new GenerousBeanProcessor();
        BasicRowProcessor rowProcessor=new BasicRowProcessor(beanProcessor);
        return rowProcessor;
    }

}
