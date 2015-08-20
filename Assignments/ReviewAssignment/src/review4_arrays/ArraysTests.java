package review4_arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTests
{

    @Test
    public void testFillNewArray()
    {
        assertArrayEquals("New array of length 4 and initial value 8",
                new int[] { 8, 8, 8, 8 }, Arrays.fillNewArray(8, 4));
        assertArrayEquals("New array of length 1 and initial value 3",
                new int[] { 3 }, Arrays.fillNewArray(3, 1));
        assertArrayEquals("New array of length 0 and initial value 4",
                new int[] {}, Arrays.fillNewArray(4, 0));
    }

    @Test
    public void testFindInt()
    {
        assertEquals("Finding 8 in array {4, 2, 9, 8, 4}", 3,
                Arrays.findInt(new int[] { 4, 2, 9, 8, 4 }, 8));
        assertEquals("Finding 8 in array {4, 2, 9, 8, 4, 8, 3}", 3,
                Arrays.findInt(new int[] { 4, 2, 9, 8, 4, 8, 3 }, 8));
        assertEquals("Finding 3 in array {4, 2, 9, 8, 4}", -1,
                Arrays.findInt(new int[] { 4, 2, 9, 8, 4 }, 3));
    }

    @Test
    public void testFindLargestNumber()
    {
        assertEquals("Finding largest number in array {1, 2, 3, 4, 5}", 5,
                Arrays.findLargestNumber(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals("Finding largest number in array {3, 2, 5, 9, 3, 1}", 9,
                Arrays.findLargestNumber(new int[] { 3, 2, 5, 9, 3, 1 }));
        assertEquals("Finding largest number in array {3, 9, 5, 9, 3, 1}", 9,
                Arrays.findLargestNumber(new int[] { 3, 9, 5, 9, 3, 1 }));
    }

    @Test
    public void testFindIndexOfLargestNumber()
    {
        assertEquals("Finding largest number in array {1, 2, 3, 4, 5}", 4,
                Arrays.findIndexOfLargestNumber(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals("Finding largest number in array {3, 2, 5, 9, 3, 1}", 3,
                Arrays.findIndexOfLargestNumber(new int[] { 3, 2, 5, 9, 3, 1 }));
        assertEquals("Finding largest number in array {3, 9, 5, 9, 3, 1}", 1,
                Arrays.findIndexOfLargestNumber(new int[] { 3, 9, 5, 9, 3, 1 }));
    }

    @Test
    public void testFillNew2dArray()
    {
        assert2dArrayEquals(
                "New array of dimensions (3, 3) with initial value 3",
                new int[][] { { 3, 3, 3 }, { 3, 3, 3 }, { 3, 3, 3 } },
                Arrays.fillNew2dArray(3, 3, 3));

        assert2dArrayEquals(
                "New array of dimensions (3, 0) with initial value 8",
                new int[][] { {}, {}, {} }, Arrays.fillNew2dArray(8, 3, 0));

        assert2dArrayEquals(
                "New array of dimensions (0, 0) with initial value 5",
                new int[][] {}, Arrays.fillNew2dArray(5, 0, 0));
    }

    @Test
    public void testFindLargest2dNumber()
    {
        assertEquals("Finding largest number in {{1, 2, 3}, {2, 3, 4}}", 4,
                Arrays.findLargest2dNumber(
                        new int[][] { { 1, 2, 3 }, { 2, 3, 4 } }));
        
        assertEquals("Finding largest number in {{2, 4, 3}, {8, 4, 2}}", 8,
                Arrays.findLargest2dNumber(
                        new int[][] {{2, 4, 3}, {8, 4, 2}}));
    }
    
    @Test
    public void testPartialCollatz() {
        assertArrayEquals("First 5 steps, starting with 6", new int[] {6, 3, 10, 5, 16}, Arrays.partialCollatz(6, 5));
        assertArrayEquals("First 4 steps, starting with 11", new int[] {11, 34, 17, 52}, Arrays.partialCollatz(11, 4));
        assertArrayEquals("First 8 steps, starting with 27", new int[] {27, 82, 41, 124, 62, 31, 94, 47}, Arrays.partialCollatz(27, 8));
    }
    
    @Test
    public void testFindLuckyNumbers() {
        assertArrayEquals("First 2 lucky numbers", new int[] {111, 222}, Arrays.findLuckyNumbers(2));
        assertArrayEquals("First 7 lucky numbers", new int[] {111, 222, 333, 444, 555, 666, 777}, Arrays.findLuckyNumbers(7));
    }

    private void assert2dArrayEquals(String message, int[][] expected,
            int[][] actual)
    {
        assertEquals(
                message + ": arrays differed in length of first dimension.",
                expected.length, actual.length);
        for (int dim1 = 0; dim1 < expected.length; dim1++)
        {
            assertEquals(
                    message + ": arrays differed in length of second dimension (index "
                            + dim1 + ").",
                    expected[dim1].length, actual[dim1].length);
        }

        for (int dim1 = 0; dim1 < expected.length; dim1++)
        {
            for (int dim2 = 0; dim2 < expected[dim1].length; dim2++)
            {
                assertEquals(
                        message + ": arrays differed in values at position ("
                                + dim1 + ", " + dim2 + ")",
                        expected[dim1][dim2], actual[dim1][dim2]);
            }
        }
    }

}
