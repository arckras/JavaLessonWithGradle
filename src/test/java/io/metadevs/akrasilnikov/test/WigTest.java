package io.metadevs.akrasilnikov.test;

import io.metadevs.akrasilnikov.main.Wig;
import org.junit.Test;
import static org.junit.Assert.*;
public class WigTest {

    @Test
    public void testEquals() {
        Wig wig1 = new Wig("Коса", 1, false, "Постижерные изделия");
        Wig wig2 = new Wig("Коса", 1, false, "Постижерные изделия");
        assertEquals(wig1, wig2);
    }

    @Test
    public void testHashCode() {
        Wig wig1 = new Wig("Коса", 1, false, "Постижерные изделия");
        Wig wig2 = new Wig("Коса", 1, false, "Постижерные изделия");
        assertEquals(wig1.hashCode(), wig2.hashCode());
    }

    @Test
    public void testNotEquals() {
        Wig wig1 = new Wig("Коса", 1, false, "Постижерные изделия");
        Wig wig2 = new Wig("Коса", 1, true, "Постижерные изделия");
        assertNotEquals(wig1, wig2);
    }

}