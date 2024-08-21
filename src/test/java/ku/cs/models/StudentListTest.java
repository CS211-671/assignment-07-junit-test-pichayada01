package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("6610456932", "pimmy", 89.5);
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6610457538", "dewwy", 78.5);
        assertEquals(2, studentList.getStudents().size());
    }

    @Test
    void testFindStudentById() {
    }

    @Test
    void testGiveScoreToId() {
    }

    @Test
    void testViewGradeOfId() {
    }

    @Test
    void testGetStudents() {
    }
}