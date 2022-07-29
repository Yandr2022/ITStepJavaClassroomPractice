package itStep.yandr.javaLessons.lesson29.task02f.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;


public class ArraySorterTest {
    private final int[] ARRAY = {5, 9, 2, 4, 0, 7, 5, 1, 0, 8};

    @Test
    public void testSortBeforeFirstZeroElement() {
        int[] expected = {2, 4, 5, 9, 0, 7, 5, 1, 0, 8};

        ArraySorter.sortBeforeFirstZeroElement(ARRAY);
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElement() {
        int[] expected = {0, 1, 2, 4, 5, 5, 7, 9, 0, 8};

        ArraySorter.sortBeforeLastZeroElement(ARRAY);
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test
    public void testSortBeforeLastZeroElementWithoutZeroElements() {
        int[] array = {5, 9, 2, 4, 7, 5, 1, 8};
        int[] expected = {5, 9, 2, 4, 7, 5, 1, 8};
        ArraySorter.sortBeforeLastZeroElement(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortBeforeFirstZeroElementWithoutZeroElements() {
        int[] array = {5 , 9, 2, 4, 7, 5, 1, 8};
        int[] expected = {5, 9, 2, 4, 7, 5, 1, 8};
        ArraySorter.sortBeforeFirstZeroElement(array);
        assertArrayEquals(expected, array);
    }
}
