import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void testIsDoingMBKM(){
        Student student = new Student();
        Assertions.assertTrue(student.isDoingMBKM(6, true));
        Assertions.assertFalse(student.isDoingMBKM(4, true));
    }
}
