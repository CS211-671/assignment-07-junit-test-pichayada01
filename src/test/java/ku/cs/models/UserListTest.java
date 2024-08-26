package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;

    @BeforeEach
    void init() {
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Ferin", "pichyferin");
        userList.addUser("Moonky", "jongjong");
        userList.addUser("Pimmy", "npnan");

        // TODO: find one of them
        String expected = "Ferin";
        User user = userList.findUserByUsername("Ferin");
        String actual = user.getUsername();

        // TODO: assert that UserList found User
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Ferin", "pichyferin");
        userList.addUser("Moonky", "jongjong");
        userList.addUser("Pimmy", "npnan");

        // TODO: change password of one user
        User user = userList.findUserByUsername("Ferin");
        boolean actual;
        actual = userList.changePassword("Ferin", "pichyferin", "1234");

        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Ferin", "pichyferin");
        userList.addUser("Moonky", "jongjong");
        userList.addUser("Pimmy", "npnan");

        // TODO: call login() with correct username and password
        User actual = userList.login("Ferin", "pichyferin");

        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Ferin");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Ferin", "pichyferin");
        userList.addUser("Moonky", "jongjong");
        userList.addUser("Pimmy", "npnan");

        // TODO: call login() with incorrect username or incorrect password
        User actual;
        actual = userList.login("Ferin", "pichyferin");

        // TODO: assert that the method return null
         assertNull(actual);
    }

}