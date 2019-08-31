package Services;

import Dao.EmpDao;
import Entity.Emp;

import java.util.List;

/**
 * @author As_los
 * @date 2019/8/29  16:06
 */

public class EmpService {

    EmpDao empDao=new EmpDao();

    public List<Emp> select(){
        return empDao.selectAll();
    }

    public int add(Emp emp){
        return empDao.addInfo(emp);
    }

    public int delete(int id){
        return empDao.deleteInfo(id);
    }

    public Emp toSelect(int id){
        return empDao.toSelect(id);
    }

    public int update(Emp emp){
        Emp emp1=new Emp();
        emp1.setEmpId(emp.getEmpId());
        emp1.setEmpName(emp.getEmpName());
        emp1.setEmpAge(emp.getEmpAge());
        emp1.setEmpSex(emp.getEmpSex());
        emp1.setEmpSalary(emp.getEmpSalary());
        emp1.setEmpRealName(emp.getEmpRealName());
        emp1.setEmpPassword(emp.getEmpPassword());
        return empDao.updateInfo(emp1);
    }

    public Emp login(Emp emp){
        Emp emp1=new Emp();
        emp1.setEmpName(emp.getEmpName());
        emp1.setEmpPassword(emp.getEmpPassword());
        return empDao.loginInfo(emp);
    }

    public String setlectName(String name){
        return empDao.selectNameInfo(name);
    }


}
