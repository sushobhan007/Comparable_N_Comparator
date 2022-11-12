package comparator;

public class EmpDetails {
    private String empName;
    private String phone;
    private int empID;

    public EmpDetails(String empName, String phone, int empID) {
        this.empName = empName;
        this.phone = phone;
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    @Override
    public String toString() {
        return "EmpDetails{" +
                "empName='" + empName + '\'' +
                ", phone='" + phone + '\'' +
                ", empID=" + empID +
                '}';
    }
}
