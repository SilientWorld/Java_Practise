package ATM.ATM;

//新增员工类
public class Employee {
    String employeeId;
    String employeeName;
    String employeePassword;

    public Employee(String id, String name, String password) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeePassword = password;
    }

    public void changePassword(String newPassword) throws Exception {
        if (newPassword.equals(this.employeePassword)) {
            throw new Exception("新密码不能与旧密码相同");
        }
        if (newPassword.equals("")) {
            throw new Exception("密码不能为空");
        }
        this.employeePassword = newPassword;
    }
}
