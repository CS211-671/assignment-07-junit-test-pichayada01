package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
        studentList.addNewStudent("6610456932", "pimmy", 89.5);
    }

    @Test
    @DisplayName("Add new student")
    void testAddNewStudent() {
//        studentList.addNewStudent("6610456932", "pimmy", 89.5);
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6610457538", "dewwy", 78);
        assertEquals(2, studentList.getStudents().size());
    }

    @Test
    @DisplayName("Find student by ID")
    void testFindStudentById() {
//        studentList.addNewStudent("6610456932", "pimmy", 89.5);
        assertEquals("pimmy", studentList.findStudentById("6610456932").getName());
    }

    @Test
    @DisplayName("Give score to ID")
    void testGiveScoreToId() {
        studentList.giveScoreToId("6610456932", 10);
        assertEquals(99.5, studentList.findStudentById("6610456932").getScore());
    }

    @Test
    @DisplayName("View grade of ID")
    void testViewGradeOfId() {
        assertEquals("A", studentList.viewGradeOfId("6610456932"));
    }

    @Test
    @DisplayName("Get students")
    void testGetStudents() {
        assertEquals("pimmy", studentList.getStudents().get(0).getName());
    }
}