package fi.kajstrom.datastructuresalgorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BraceLinterTest {
    @Test
    void testLint_CalledWithValidString_ErrorIsNull()
    {
        BraceLinter linter = new BraceLinter();

        linter.lint("[()[]{}]");

        assertNull(linter.getError());
    }

    @Test
    void testLint_CalledWithUnclosedBrace_HasError()
    {
        BraceLinter linter = new BraceLinter();

        linter.lint("([]{}");

        assertEquals("Unclosed (.", linter.getError());
    }

    @Test
    void testLint_CalledWithBraceWithNoOpeningBrace_HasError()
    {
        BraceLinter linter = new BraceLinter();

        linter.lint("[{}])");

        assertEquals("Unmatched ) at index 4", linter.getError());
    }

    @Test
    void testLint_CalledWithJsCode_IgnoresOtherCharacters()
    {
        BraceLinter linter = new BraceLinter();

        linter.lint("const a = [1, 2 3];");

        assertNull(linter.getError());
    }
}
