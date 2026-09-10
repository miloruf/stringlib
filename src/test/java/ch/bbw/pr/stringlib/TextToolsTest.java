package ch.bbw.pr.stringlib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TextToolsTest {

    private final TextTools tools = new TextTools();

    @Test
    void reverse_turnsWordAround() {
        assertEquals("olleh", tools.reverse("hello"));
    }

    @Test
    void isPalindrome_detectsPalindrome() {
        assertTrue(tools.isPalindrome("Anna"));
        assertFalse(tools.isPalindrome("Test"));
    }

    @Test
    void shout_upperCasesAndAddsMark() {
        assertEquals("HALLO!", tools.shout("hallo"));
    }
}
