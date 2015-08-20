package review3_loops;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoopsTests
{
    @Test
    public void testFactorial()
    {
        assertEquals("1 factorial", 1, Loops.factorial(1));
        assertEquals("5 factorial", 120, Loops.factorial(5));
        assertEquals("8 factorial", 40320, Loops.factorial(8));
        assertEquals("0 factorial", 1, Loops.factorial(0));
    }

    @Test
    public void testAlternate()
    {
        assertEquals("\"bar\"", "br", Loops.alternate("bar"));
        assertEquals("\"hello\"", "hlo", Loops.alternate("hello"));
        assertEquals("\"abc123\"", "ac2", Loops.alternate("abc123"));
        assertEquals("\"\" (blank astring)", "", Loops.alternate(""));
    }

    @Test
    public void testCollatzLength()
    {
        assertEquals("Length of sequence starting from 6", 9,
                Loops.findCollatzLength(6));
        assertEquals("Length of sequence starting from 11", 15,
                Loops.findCollatzLength(11));
        assertEquals("Length of sequence starting from 27", 112,
                Loops.findCollatzLength(27));
    }

    @Test
    public void testFindTriple()
    {
        assertEquals("The first triple in sequence {1, 2, 2, 2, 3}", 1,
                Loops.findTriple(new int[] { 1, 2, 2, 2, 3 }));
        assertEquals("The first triple in sequence {1, 2, 3, 2, 2, 2, 3, 3, 3}",
                3, Loops.findTriple(new int[] { 1, 2, 3, 2, 2, 2, 3, 3, 3 }));
        assertEquals("The first triple in sequence {1, 2, 3, 2, 2, 2}", 3,
                Loops.findTriple(new int[] { 1, 2, 3, 2, 2, 2 }));
        assertEquals("The first triple in sequence {1, 2, 3, 1, 2, 3, 1, 2, 3}",
                -1, Loops.findTriple(new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3 }));
    }

}
