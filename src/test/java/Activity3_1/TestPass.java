package Activity3_1;

import Activity3_1_Creating_Parameterized_Tests.PasswordChecker;
import org.junit.Test;

public class TestPass {
    @Test
    public void PassTest() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String printPass = passwordChecker
                .combineString("Eghons", "23%&$");

        System.out.println(printPass);
    }
}
