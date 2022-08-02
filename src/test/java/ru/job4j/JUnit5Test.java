package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class JUnit5Test {

    @Test
    void jUnit5TestFunction() {
        int left = 1;
        int right = 2;
        int expected = 3;
        int actual = JUnit5.jUnit5TestFunction(left, right);
        assertThat(actual).isEqualTo(expected);
    }
}