package ro.ulbs.paradigme.lab7;
import org.junit.jupiter.api.*;
public class GroupTest
{
    private Group group;
    @BeforeEach // aceasta adnotare determina ca metoda de mai jos sa se execute inaintea fiecarui @Test
    public void setup()
    {
        group = new Group();
    }
    @Test
    public void testNoStudentInGroup()
    {
        Assertions.assertEquals(false, group.areStudentsInGroup());
    }
    @Test
    public void testAddStudent()
    {
        Student st = new Student("Elena", 19);
        group.addStudent(st);
        Assertions.assertTrue(group.getStudent("Elena").equals(st));
    }
    @Test
    public void testRemoveStudentExisting()
    {
        group.addStudent(new Student("Ioan", 21));
        group.addStudent(new Student("Elena", 19));
        group.addStudent(new Student("Mihaela", 22));
        Student stud4 = new Student("Elena", 19);
        boolean result = group.removeStudent(stud4);
        Assertions.assertTrue(result);
        Assertions.assertEquals(group.getStudents().size(), 2);
    }

    @Test
    public void testRemoveStudentNotExisting()
    {
        group.addStudent(new Student("Ioan", 21));
        group.addStudent(new Student("Elena", 19));
        group.addStudent(new Student("Mihaela", 22));
        Student stud4 = new Student("Radu", 20);
        boolean result = group.removeStudent(stud4);
        Assertions.assertFalse(result);
        Assertions.assertEquals(group.getStudents().size(), 3);
    }
    @Test
    public void testNullList()
    {
        group.addStudent(new Student("Ioan", 21));
        group.setStudents(null);
        Exception exception =
                Assertions.assertThrows(NullPointerException.class, () ->
                {
                    group.addStudent(new Student("Elena", 19));
                });
        Assertions.assertNotNull(exception);
    }
    @AfterEach //metoda este executata la sfarsitul fiecarui test
    public void tearDown()
    {
        group = null;
    }
}