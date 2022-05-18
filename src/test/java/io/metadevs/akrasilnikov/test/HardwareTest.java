package io.metadevs.akrasilnikov.test;

import io.metadevs.akrasilnikov.main.Hardware;
import org.junit.Test;

import static org.junit.Assert.*;

public class HardwareTest {

    @Test
    public void testEquals() {
        Hardware hardware1 = new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент");
        Hardware hardware2 = new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент");
        assertEquals(hardware1, hardware2);
    }

    @Test
    public void testHashCode() {
        Hardware hardware1 = new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент");
        Hardware hardware2 = new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент");
        assertEquals(hardware1.hashCode(), hardware2.hashCode());
    }
    @Test
    public void testNotEquals() {
        Hardware hardware1 = new Hardware("Коса", 2, "У8", "Сельскохозяйственный инструмент");
        Hardware hardware2 = new Hardware("Коса", 2, "У7", "Сельскохозяйственный инструмент");
        assertNotEquals(hardware1, hardware2);
    }
}