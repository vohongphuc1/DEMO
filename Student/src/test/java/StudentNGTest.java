

import com.mycompany.student.Student;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StudentNGTest {

    @Test
    public void testConstructorAndGetters() {
        Student student = new Student("SV001", "Nguyen Van A", 20);
        assertEquals(student.getStudentId(), "SV001", "Mã sinh viên không đúng.");
        assertEquals(student.getName(), "Nguyen Van A", "Tên không đúng.");
        assertEquals(student.getAge(), 20, "Tuổi không đúng.");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("SV002", "Tran Thi B", 18);
        student.setAge(22);
        assertEquals(student.getAge(), 22, "Cập nhật tuổi không đúng.");
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("SV003", "Le Van C", 19);
        student.updateName("Le Van D");
        assertEquals(student.getName(), "Le Van D", "Cập nhật tên không đúng.");
    }
}
