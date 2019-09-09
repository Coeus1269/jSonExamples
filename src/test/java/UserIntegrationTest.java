
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserIntegrationTest {

@Test
public void givenAnnotatedUser_thenHasGettersAndSetters() {
    User user = new User();
    user.setFirstName("Test");
    assertEquals(user.getFirstName(), "Test");
    }

@Getter @Setter
class User {
    private String firstName;
    }
}