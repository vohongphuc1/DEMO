package employeemanagement;
public class Employee {
    // Các biến thành viên của lớp Employee
    private String employeeId;  // ID của nhân viên
    private String employeeName;  // Tên của nhân viên
    private double salary;  // Mức lương của nhân viên
    // Constructor (Hàm tạo) dùng để khởi tạo đối tượng Employee
    public Employee(String employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;  // Gán giá trị cho ID của nhân viên
        this.employeeName = employeeName;  // Gán giá trị cho tên của nhân viên
        this.salary = salary;  // Gán giá trị cho mức lương của nhân viên
    }
    // Getter method để lấy giá trị của employeeId
    public String getEmployeeId() {
        return employeeId;  // Trả về ID của nhân viên
    }

    // Getter method để lấy giá trị của employeeName
    public String getEmployeeName() {
        return employeeName;  // Trả về tên của nhân viên
    }
    // Getter method để lấy giá trị của salary
    public double getSalary() {
        return salary;  // Trả về mức lương của nhân viên
    }
    // Setter method để thay đổi mức lương của nhân viên
    public void setSalary(double salary) {
        this.salary = salary;  // Cập nhật mức lương mới cho nhân viên
    }
    // Phương thức main - điểm bắt đầu của chương trình
    public static void main(String[] args) {
        // Tạo một đối tượng Employee để thử nghiệm
        Employee emp = new Employee("E001", "John Doe", 5000.0);  
        // In ra thông tin của nhân viên
        System.out.println("Employee ID: " + emp.getEmployeeId());  // In ID nhân viên
        System.out.println("Employee Name: " + emp.getEmployeeName());  // In tên nhân viên
        System.out.println("Employee Salary: " + emp.getSalary());  // In mức lương nhân viên
    }
}
