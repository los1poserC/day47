package Entity;

/**
 * @author As_los
 * @date 2019/8/29  11:44
 */

public class Emp {
    private int empId;
    private String empName;
    private int empAge;
    private String empSex;
    private double empSalary;
    private String empRealName;
    private String empPassword;

    public Emp() {
    }

    public Emp(String empName, int empAge, String empSex, double empSalary, String empRealName, String empPassword) {
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.empSalary = empSalary;
        this.empRealName = empRealName;
        this.empPassword = empPassword;
    }

    public Emp(int empId, String empName, int empAge, String empSex, double empSalary, String empRealName, String empPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSex = empSex;
        this.empSalary = empSalary;
        this.empRealName = empRealName;
        this.empPassword = empPassword;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpRealName() {
        return empRealName;
    }

    public void setEmpRealName(String empRealName) {
        this.empRealName = empRealName;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge='" + empAge + '\'' +
                ", empSex='" + empSex + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
