package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void greetShouldReturnExpectedMessage() {
        assertEquals("Hello, Anton!", stringUtils.greet("Anton"));
    }

    @Test
    void toUpperShouldConvertLowercase() {
        assertEquals("HELLO", stringUtils.toUpper("hello"));
    }

    @Test
    void reverseShouldWork() {
        assertEquals("olleh", stringUtils.reverse("hello"));
    }

    @Test
    void blankStringShouldReturnTrue() {
        assertTrue(stringUtils.isBlank("   "));
    }

    @Test
    void nullShouldReturnTrue() {
        assertTrue(stringUtils.isBlank(null));
    }

    @Test
    void normalStringShouldReturnFalse() {
        assertFalse(stringUtils.isBlank("abc"));
    }

    @Test
    void lengthShouldReturnCorrectValue() {
        assertEquals(5, stringUtils.length("hello"));
    }

    @Test
    void repeatShouldDuplicateString() {
        assertEquals("ababab", stringUtils.repeat("ab", 3));
    }

    @Test
    void repeatZeroTimesShouldReturnEmptyString() {
        assertEquals("", stringUtils.repeat("ab", 0));
    }

    @Test
    void repeatNegativeTimesShouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> stringUtils.repeat("ab", -1));
    }
}