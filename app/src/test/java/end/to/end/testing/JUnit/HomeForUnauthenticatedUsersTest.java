package end.to.end.testing.JUnit;

import end.to.end.testing.PageObjects.HomeForUnauthenticatedUsers;
import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HomeForUnauthenticatedUsersTest {

    private HomeForUnauthenticatedUsers homeForUnauthenticatedUsers;

    @BeforeEach
    public void setUp() {
        this.homeForUnauthenticatedUsers = new HomeForUnauthenticatedUsers();
        this.homeForUnauthenticatedUsers.before();
    }

    @AfterEach
    public void tearDown() {
        this.homeForUnauthenticatedUsers.after();
    }

    @Test
    public void go_to_registration_Page() {
        this.homeForUnauthenticatedUsers.clickRegister();
    }

    @Test
    public void go_to_login_page() {
        this.homeForUnauthenticatedUsers.clickLogin();
    }
}
