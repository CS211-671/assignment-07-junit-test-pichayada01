package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void init() {
        user = new User("Ferin", "pichyferin");
    }

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Get username")
    void testGetUsername() {
        assertEquals("Ferin", user.getUsername());
    }

    @Test
    @DisplayName("Is username test")
    void testIsUsername() {
        assertTrue(user.isUsername("Ferin"));
        assertFalse(user.isUsername(""));
    }


    @Test
    @DisplayName("Password validation and setting password")
    void testValidatePassword() {
        user.setPassword("1234");
        assertTrue(user.validatePassword("1234"));
    }

}