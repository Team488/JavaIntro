package review6_algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgorithmsTests
{

    @Test
    public void testBubbleSort()
    {
        assertArrayEquals("Bubble sort for array {1, 2, 3, 4, 5}", new int[] {5, 4, 3, 2, 1}, Algorithms.bubbleSort(new int[] {1, 2, 3, 4, 5}));
        assertArrayEquals("Bubble sort for array {8, 2, 4, 10, 3, 6, 9}", new int[] {10, 9, 8, 6, 4, 3, 2}, Algorithms.bubbleSort(new int[] {8, 2, 4, 10, 3, 6, 9}));
        assertArrayEquals("Bubble sort for array {8, 2, 4, 10, 3, 6, 9, 2}", new int[] {10, 9, 8, 6, 4, 3, 2, 2}, Algorithms.bubbleSort(new int[] {8, 2, 4, 10, 3, 6, 9, 2}));
    }

}
