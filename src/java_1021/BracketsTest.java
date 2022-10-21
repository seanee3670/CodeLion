import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracketsTest {

    @Test
    @DisplayName("괄호의 짝이 맞는지 확인")
    void solution() {
        Brackets bt = new Brackets();

        assertTrue(bt.Solution("()()"));
        assertTrue(bt.Solution("(())()"));
        assertFalse(bt.Solution("(())()"));
        assertFalse(bt.Solution("(()("));




    }

}