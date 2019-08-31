package Dao;

import Entity.Emp;
import Utils.RowUtil;
import Utils.UserUtil;
import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @author As_los
 * @date 2019/8/29  15:25
 */

public class EmpDao {

    public List<Emp> selectAll(){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="select `emp_id`, `emp_name`, `emp_salary`, `emp_age`, `emp_sex`, `emp_real_name`, `emp_password` from emp";
        RowProcessor rowProcessor= RowUtil.getRowProcessor();
        try {
            List<Emp> emps = queryRunner.query(sql, new BeanListHandler<>(Emp.class, rowProcessor));
            return emps;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return null;
    }

    public int addInfo(Emp emp){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="INSERT INTO `emp`(`emp_name`, `emp_salary`, `emp_age`, `emp_sex`, `emp_real_name`, `emp_password`) VALUES (?,?,?,?,?,?)";
        Object[] objects=new Object[]{emp.getEmpName(),emp.getEmpSalary(),emp.getEmpAge(),emp.getEmpSex(),emp.getEmpRealName(),emp.getEmpPassword()};
        try {
          int result=  queryRunner.update(sql,objects);
          return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return 0;
    }

    public int deleteInfo(int id){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="delete from emp where emp_Id=?";
        try {
            int result=queryRunner.update(sql,id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return 0;
    }


    public Emp toSelect(int id){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="select  `emp_id`,`emp_name`, `emp_salary`, `emp_age`, `emp_sex`, `emp_real_name`, `emp_password` from emp where emp_Id=?";
        RowProcessor rowProcessor= RowUtil.getRowProcessor();
        try {
            Emp emp =(Emp)queryRunner.query(sql, new BeanHandler(Emp.class,rowProcessor),id);
            return emp;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return null;
    }

    public int updateInfo(Emp emp){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="UPDATE `emp` SET `emp_name` =?, `emp_salary` =?, `emp_age`=?, `emp_sex` =?, `emp_real_name` = ?, `emp_password` =? WHERE `emp_id` =?";
        Object[] params=new Object[]{emp.getEmpName(),emp.getEmpSalary(),emp.getEmpAge(),emp.getEmpSex(),emp.getEmpRealName(),emp.getEmpPassword(),emp.getEmpId()};
        try {
            int result=  queryRunner.update(sql,params);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return 0;
    }

    public Emp loginInfo(Emp emp){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="select `emp_id`, `emp_name`, `emp_salary`, `emp_age`, `emp_sex`, `emp_real_name`, `emp_password` from emp where emp_name=? and emp_password=?";
        RowProcessor rowProcessor= RowUtil.getRowProcessor();
        try {
            Emp emp1 =(Emp)queryRunner.query(sql, new BeanHandler(Emp.class,rowProcessor),emp.getEmpName(),emp.getEmpPassword());
            return emp1;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            UserUtil.close(dataSource);
        }
        return null;
    }

    public String selectNameInfo(String name){
        DruidDataSource dataSource = UserUtil.getDataSource();
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql="select `emp_name` from emp where emp_name=?";
        try {
            String result = queryRunner.query(sql, new ScalarHandler<String>(), name);
            return result==null?null:result;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
