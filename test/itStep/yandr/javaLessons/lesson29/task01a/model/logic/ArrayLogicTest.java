package itStep.yandr.javaLessons.lesson29.task01a.model.logic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayLogicTest {

    @Test
    public void testCountNonZeroElementsBasic() {
        int[] array = {2, 3, -4, 0, 5, 0, 6, 0, -22};
        int expected = 6;
        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithoutZeroElement() {
        int[] array = {2, 3, -4, 5, 6, -22};
        int expected = array.length;
        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithAllZeroElements() {
        int[] array = {0, 0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithNull() {
        int expected = -1;
        int actual = ArrayLogic.countNonZeroElements(null);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithEmptyObject() {
        int expected = -1;
        int actual = ArrayLogic.countNonZeroElements(new int[0]);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountNonZeroElementsWithOneZeroElement() {
        int[] array = {0};
        int expected = 0;
        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }


    @Test
    public void testCountNonZeroElementsWithOneNonZeroElement() {
        int[] array = {2};
        int expected = 1;
        int actual = ArrayLogic.countNonZeroElements(array);
        assertEquals(expected, actual);
    }
}


