package io.metadevs.akrasilnikov.test;

import io.metadevs.akrasilnikov.main.Computer;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void testEquals() {
        Computer computer1 = new Computer("Оса", 2, 2, "Домашний компьютер");
        Computer computer2 = new Computer("Оса", 2, 2, "Домашний компьютер");
        assertEquals(computer1, computer2);
    }

    @Test
    public void testHashCode() {
        Computer computer1 = new Computer("Оса", 2, 2, "Домашний компьютер");
        Computer computer2 = new Computer("Оса", 2, 2, "Домашний компьютер");
        assertEquals(computer1.hashCode(), computer2.hashCode());
    }

    @Test
    public void testNotEquals() {
        Computer computer1 = new Computer("Оса", 2, 2, "Домашний компьютер");
        Computer computer2 = new Computer("Оса", 2, 4, "Домашний компьютер");
        assertNotEquals(computer1, computer2);
    }
}