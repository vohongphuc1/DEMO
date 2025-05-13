

import employeemanagement.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// Lớp kiểm thử cho lớp Employee
public class EmployeeTest {
    // Kiểm thử phương thức getEmployeeId() của lớp Employee
    @Test
    public void testGetEmployeeId() {
        // Tạo một đối tượng Employee với ID là "E001"
        Employee employee = new Employee("E001", "John Doe", 5000.0);
        // Kiểm tra xem phương thức getEmployeeId() có trả về đúng "E001" không
        assertEquals("E001", employee.getEmployeeId());
    }
    // Kiểm thử phương thức setSalary() và getSalary() của lớp Employee
    @Test
    public void testSetSalary() {
        // Tạo một đối tượng Employee với lương ban đầu là 5000.0
        Employee employee = new Employee("E001", "John Doe", 5000.0);
        // Cập nhật mức lương mới cho nhân viên
        employee.setSalary(5500.0);    
        // Kiểm tra xem mức lương đã được cập nhật đúng chưa (dung sai 0.001)
        assertEquals(5500.0, employee.getSalary(), 0.001);
    }
}
