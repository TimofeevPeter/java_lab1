import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this);
    }

    @Override
    public String toString() {
        if (department != null && department.getBoss() == this) {
            return name + " начальник отдела " + department.getName();
        } else if (department != null) {
            return name + " работает в отделе " + department.getName()
                    + ", начальник которого " + department.getBoss().getName();
        } else {
            return name + " без отдела";
        }
    }

    public List<Employee> getDepartmentEmployees() {
        if (department != null) {
            return department.getEmployees();
        }
        return null;
    }
}