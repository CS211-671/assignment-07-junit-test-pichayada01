package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("6610450110", "moonkey");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 50.5 คะแนน")
    void testAddsScore() {
        Student s1 = new Student("6610450110", "ferin");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 85 คะแนน และให้  Object คำนวนเกรดออกมา")
    void testCalculateGrade() {
        Student s1 = new Student("6610450110", "ferin");
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }

    @Test
    @DisplayName("Change Name")
    void testChangeName() {
        s1.changeName("moonkey");
        assertEquals("moonkey", s1.getName());
    }

    @Test
    @DisplayName("เช็คว่า id ตรงกันมั้ย")
    void testIsId() {
        s1.isId("6610450110");
        assertTrue(s1.isId("6610450110"));
    }

    @Test
    @DisplayName("Get ID")
    void testGetId() {
        assertEquals("6610450110", s1.getId());
    }

    @Test
    @DisplayName("Get Name")
    void testGetName() {
        assertEquals("moonkey", s1.getName());
    }

    @Test
    @DisplayName("Get score")
    void testGetScore() {
        s1.addScore(85);
        assertEquals(85, s1.getScore());

    }

    @Test
    @DisplayName("สรุปการทำงาน")
    void testToString() {
        assertEquals("{id: '6610450110', name: 'moonkey', score: 0.0}", s1.toString());
    }
}